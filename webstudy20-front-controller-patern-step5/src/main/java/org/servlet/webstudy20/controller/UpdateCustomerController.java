package org.servlet.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy20.model.MockDAO;

public class UpdateCustomerController implements Controller {
	/*
	 * client로 부터 수정할 고객정보를 받아온다
	 * MockDAD의 updateCustomer() 를 호출헤 db에 업데이트 시킨다
	 * 리다이렉트 방식으로 update-result.jsp 를 클라이언트에게 응답한다
	 * 
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String customerInfo= request.getParameter("customerInfo");
		MockDAO.getInstance().updateCustomer(customerInfo);
		
		return "redirect:update-result.jsp";
	}

}
