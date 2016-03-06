package webchat.db.bean;

public interface MessageDao {
    // チャットでの発言を保存します.
    public void save(MessageBean message);

    // チャットでの発言データを返します.
    public MessageBean[] getAll();
}
