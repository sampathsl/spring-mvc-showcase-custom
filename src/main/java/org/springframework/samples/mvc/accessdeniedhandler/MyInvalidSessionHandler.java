package org.springframework.samples.mvc.accessdeniedhandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.session.InvalidSessionStrategy;

public class MyInvalidSessionHandler implements InvalidSessionStrategy{

	@Override
	public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("Invalid Session Found!");
		response.sendRedirect("/error");
	}

}
