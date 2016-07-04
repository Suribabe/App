package com.pb.web.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.pb.entity.Account;

public class SignController extends AbstractController{
	private String success;

	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		String accountNo=arg0.getParameter("accountNo");
		String password=arg0.getParameter("password");				
		Map<String ,Object> model=new HashMap<String,Object>();
		if(accountNo!=null&&password!=null) {
			Account account=new Account();
			account.setCardNo(accountNo);
			account.setPassword(password);
			model.put("account", account);
			return new ModelAndView(getSuccess(), model);
		}else{
			return null;
		}
	}
	
	
}
