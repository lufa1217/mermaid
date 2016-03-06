package webchat.db.bean;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


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
