package webapp.struts.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import webchat.db.bean.MessageBean;
import webchat.db.dao.MessageDao;
import webchat.db.dao.impl.MessageDaoOnMemoryImpl;


public class SaveMessageAction {
    public ActionForward execute(
            ActionMapping mapping, ActionForm actionForm,
            HttpServletRequest request, HttpServletResponse response)
    {
        DynaActionForm form = (DynaActionForm)actionForm;
        Date       date       = new Date();
        String     name       = form.getString("name");
        String     message    = form.getString("message");
        MessageDao messageDao = MessageDaoOnMemoryImpl.getInstance();
        messageDao.save(new MessageBean(date, name, message));

        // 発言フォームの「名前」の値はそのまま残し, 「メッセージ」の値はクリアする.
        form.set("message", "");

        return mapping.findForward("success");
    }
}
