package com.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

//Acts as a model
//Not POJO Class but requires additional functionality
//When extends ActionForm get features of model

/*
 * One of the advantage of struts framework is that before calling LoginAction
 * all the required validations can be performed in LoginForm. Such that
 * it separates the validation logic from Action.
 */

public class LoginForm extends ActionForm {

	private String username;
	private String password;

	/*
	 * validate is predefined Struts method to handle error messages with return
	 * type ActionErrors here we can check all the required validations and
	 * provide required ActionMessage stored in Properties file. The location of
	 * properties file is maintained in struts-config.xml
	 */
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors_msg = new ActionErrors();

		if (getUsername() == null || ("".equals(getUsername()))) {
			errors_msg.add("common.name.err", new ActionMessage("error.name.required"));
		}

		if (getPassword() == null || ("".equals(getPassword()))) {
			errors_msg.add("common.password.err", new ActionMessage("error.password.required"));
		}

		System.out.println(errors_msg);
		return errors_msg;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
