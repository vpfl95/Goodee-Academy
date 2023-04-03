package com.iu.home.member.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import com.iu.home.member.MemberVO;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class LogoutCustom implements LogoutHandler{

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
		// TODO Auto-generated method stub
		log.info("========== Logout Handler ==============");
		//1. 일반 로그인 Or Social로그인 인지
		log.info("Auth => {}", authentication);
		
		
		
//		if(social!=null && social.equals("kakao")) {
//			
//		}else if(social!=null && social.equals("google")) {
//			
//		}else {
//			
//		}
		
		request.getSession().invalidate();
		
	}

}
