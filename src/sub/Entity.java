package sub;

//全てのアイテム・キャラクターはこのインターフェイスを実装する
public interface Entity {
    
    int getId();// そのエンティティの固有IDを返す。しかしオーバーライドするときに値も書く必要がある。
}
