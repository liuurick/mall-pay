package com.liuurick.mall;

import com.liuurick.mall.consts.MallConst;
import com.liuurick.mall.exception.UserLoginException;
import com.liuurick.mall.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author liubin
 */
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

	/**
	 * true表示继续流程，false表示中断
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.info("preHandle...");
		User user = (User) request.getSession().getAttribute(MallConst.CURRENT_USER);
		if (user == null) {
			log.info("user=null");
			throw new UserLoginException();
		}
		return true;
	}
}
