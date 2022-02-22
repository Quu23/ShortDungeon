package chara;

//全てのアイテム・キャラクターはこのインターフェイスを実装する
public interface Entity {
    static int NULL=742;//数値用null
    int getId();        // そのエンティティの固有IDを返す。しかしオーバーライドするときに値も書く必要がある。
    String getName();   // そのエンティティの名前を返す。しかしオーバーライドするときに値も書く必要がある。
    
}
