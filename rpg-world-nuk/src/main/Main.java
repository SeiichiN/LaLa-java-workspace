package main;

import java.util.Random;

import rpg.Place;
import rpg.character.Hero;
import rpg.character.Item;
import rpg.character.Sword;
import rpg.monster.DeathBat;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

/**
 * ゲームの管理運営をするクラス・ゲームマネージャー
 */
public class Main {
	// この配列はprivateなので、このMainクラスの中でのみすべてのメソッドからアクセス可能である。
	private static Place[][] places = new Place[Const.Y_SIZE][Const.X_SIZE];  // 配列の作成

	public static void main(String[] args) {
		setup();                                             // 5x5のplacesの初期化
		setObj(new Matango('A'));                            // モンスターのplacesへの配置
		setObj(new Goblin());
		setObj(new DeathBat());
		setObj(new Sword("炎の剣", 20));
		Hero h = new Hero("ミナト");                         // プレーヤーの配置
		System.out.println(h.getLocaton());                  // プレーヤーの位置の表示
		
		while (h.isLife()) {                                 // プレーヤーのhpがある間は繰り返す
			h.move();                                        // プレーヤーの移動
			System.out.println(h.getLocaton());
			h.look(places);                                  // 移動した場所を見る
			String info = h.lookFor(places);                 // その場所のオブジェクトを取得する
			if (info != null) {                              // オブジェクトがnullでなければ
				if (info.equals("monster")) {                // オブジェクトがモンスターならば
					fightMonster(h);                         // モンスターと戦う(逃げることも可能)
				}
				if (info.equals("item")) {                    // オブジェクトがアイテムならば
					takeItem(h);                             // アイテムを拾う(拾わないことも可能)
				}
			}
			if (isEnd()) {                                     // 終了チェック
				break;
			}
		}
	}
	
	public static void setup() {
		for (int y = 0; y < places.length; y++) {
			for (int x = 0; x < places.length; x++) {
				places[y][x] = new Place();                     // Placeインスタンスを生成する
				places[y][x].setScene(Message.NOTHING);         // その場所の説明をセットする
			}
		}
	}

	private static void removeObj(int x, int y) {
		places[y][x].setObj(null);
		places[y][x].setScene(Message.NOTHING);
		
	}
	
	private static void fightMonster(Hero h) {
		if (h.isFight()) {                       // ユーザーが戦うを選択すれば
			Monster m = h.getMonster(places);    // オブジェクトをモンスターにもどす
			h.fight(m);                          // 戦いの叙述
			if (m.getHp() <= 0) {                // もしモンスターのHPがなくなれば 
				removeObj(h.getX(), h.getY());   // オブジェクト(モンスター)をその場所から削除
			}
		}
	}
	
	private static void takeItem(Hero h) {
		if (h.isTake()) {                         // ユーザーが拾うを選択すれば
			Item item = h.getItem(places);        // オブジェクトをアイテムにもどす
			if (item instanceof Sword) {          // アイテムが剣ならば
				Sword sword = (Sword) item;       // アイテムを剣にもどす
				h.setSword(sword);                // ヒーローは剣を持つ
				removeObj(h.getX(), h.getY());    // オブジェクト(剣)をその場所から削除
			}
		}
	}
	
	private static boolean isEnd() {
		if (countNumOfMonster() == 0) {
			System.out.println(Message.END_MESSAGE);
			System.out.println(Message.GAMEOVER);
			return true;
		}
		return false;
	}
	
	private static int countNumOfMonster() {
		int count = 0;                                   // モンスターの数
		for (int y = 0; y < Const.Y_SIZE; y++) {
			for (int x = 0; x < Const.X_SIZE; x++) {
				if (places[y][x].getObj() != null) {     // その場所にオブジェクトがあれば
					Object obj = places[y][x].getObj();  // その場所のオブジェクトを取得
					if (obj instanceof Monster) {        // そのオブジェクトがモンスター型であれば
						count++;                         // カウントをプラス
					}
				}
			}
		}
		return count;
	}
	
	public static void setObj(Object obj) {
		int x, y;                                                     // x座標、y座標
		do {
			x = new Random().nextInt(Const.X_SIZE);                   // xをランダムに決める
			y = new Random().nextInt(Const.Y_SIZE);                   // yをランダムに決める
		} while (places[y][x].getObj() != null);                      // その場所にすでにオブジェクトがあれば
		                                                              // もう一度やり直す
		places[y][x].setObj(obj);                                     // その場所にオブジェクトを配置
		if (obj instanceof Monster) {                                 // そのオブジェクトがモンスターならば
			Monster m = (Monster) obj;                                // モンスターにもどす
			places[y][x].setScene(m.getType() + "がいる!");           // m.getType() は、「ゴブリン」「地獄コウモリ」などの文字列
		} else if (obj instanceof Item) {                             // そのオブジェクトがアイテムならば
			Item item = (Item) obj;                                   // アイテムにもどす
			places[y][x].setScene(item.getName() + "が落ちている");   // アイテムの名前をその場所にsetScene()する
		}
	}
}
