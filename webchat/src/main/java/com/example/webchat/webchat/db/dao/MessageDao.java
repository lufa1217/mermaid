package com.example.webchat.webchat.db.dao;

import com.example.webchat.webchat.db.bean.MessageBean;

public interface MessageDao {
    // チャットでの発言を保存します.
    public void save(MessageBean message);

    // チャットでの発言データを返します.
    public MessageBean[] getAll();
}
