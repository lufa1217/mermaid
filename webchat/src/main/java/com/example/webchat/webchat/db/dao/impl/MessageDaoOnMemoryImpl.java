package com.example.webchat.webchat.db.dao.impl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.example.webchat.webchat.db.bean.MessageBean;
import com.example.webchat.webchat.db.dao.MessageDao;


public class MessageDaoOnMemoryImpl implements MessageDao {
	private static final MessageDaoOnMemoryImpl instance = new MessageDaoOnMemoryImpl();

	public static MessageDaoOnMemoryImpl getInstance(){
		return instance;
	}

	private List<MessageBean>  messages = Collections.synchronizedList(new LinkedList<MessageBean>());

	private MessageDaoOnMemoryImpl(){

	}

	public void save(MessageBean message){
		messages.add(0,message);

	}

    public MessageBean[] getAll()
    {
//        return messages.toArray(new MessageBean[messages.size()]);
    	return messages.toArray(new MessageBean[messages.size()]);
    }

}
