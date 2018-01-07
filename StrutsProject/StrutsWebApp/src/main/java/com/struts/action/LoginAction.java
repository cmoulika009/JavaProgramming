package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.struts.form.LoginForm;

//As in Struts it perform some action we name it as LoginAction that extends Action
public class LoginAction extends Action {

	// use default execute method
	// this is executed every time it is called from front-end

	/*
	 * In struts instead of using HTTPRequest object to get data we use FormBean
	 * to get the data from JSP to Servlet.
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Struts example");
		LoginForm lg = (LoginForm) form;
		System.out.println(lg.getUsername() + " " + lg.getPassword());

		ActionMessages msg = new ActionMessages();

		// check condition and forward the response to sturts-config.xml to
		// proceed further
		if (lg.getUsername().equals("moulika") && lg.getPassword().equals("moulika")) {
			return mapping.findForward("success");
		} 
		
		//the error message during validation at server side is handled using ActionMessage
		//and save the errors using saveErrors() method.
		else {
			msg.add("validations", new ActionMessage("login.failed"));
			saveErrors(request, msg);
			return mapping.findForward("failure");
		}

	}
}
