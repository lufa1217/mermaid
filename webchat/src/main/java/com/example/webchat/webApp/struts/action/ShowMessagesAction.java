package webApp.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import webchat.db.dao.MessageDao;
import webchat.db.dao.impl.MessageDaoOnMemoryImpl;

public class ShowMessagesAction {
    public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)
    {
        MessageDao messageDao = MessageDaoOnMemoryImpl.getInstance();
        request.setAttribute("messages", messageDao.getAll());
        return mapping.findForward("success");
    }
}
