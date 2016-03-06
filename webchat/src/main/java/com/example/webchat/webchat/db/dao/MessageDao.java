package webchat.db.dao;

import webchat.db.bean.MessageBean;

public interface MessageDao {
    // チャットでの発言を保存します.
    public void save(MessageBean message);

    // チャットでの発言データを返します.
    public MessageBean[] getAll();
}
