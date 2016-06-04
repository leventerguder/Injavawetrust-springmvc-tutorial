package _11.audit.interceptor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuditingInterceptor extends HandlerInterceptorAdapter {

	Logger logger = Logger.getLogger("auditLogger");
	private String user;
	private String productId;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object handler) throws Exception {

		if (request.getRequestURI().endsWith("products/add")) {

			if (request.getMethod().equals("GET")) {
				//
				logger.info("preHandle : GET request");
			}

			if (request.getMethod().equals("POST")) {
				user = request.getRemoteHost();
				productId = request.getParameter("productId");
				//
				logger.info("preHandle : POST request");
			}
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception arg3)
			throws Exception {
		// urun ekledikten sonra redirect islemi sonrasinda HTTP 302 POST
		// request olusur.
		if (request.getRequestURI().endsWith("products/add") && response.getStatus() == 302) {
			logger.info(String.format("A New product[%s] Added by %s on %s", productId, user, getCurrentTime()));
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		if (request.getRequestURI().endsWith("products/add")) {

			if (request.getMethod().equals("GET")) {
				//
				logger.info("postHandle : GET request");
			}

			if (request.getMethod().equals("POST")) {
				logger.info("postHandle : POST request");
			}
		}

	}

	private String getCurrentTime() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		return formatter.format(calendar.getTime());
	}

}
