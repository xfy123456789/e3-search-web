package cn.e3mall.search.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.apache.bcel.generic.RET;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/**
 * 全局异常处理器
 * <p>Title: GlobalExceptionResolver</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {
	private static Logger logger=LoggerFactory.getLogger(GlobalExceptionResolver.class);
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		exception.printStackTrace();
		logger.debug("测试输出日志");
		logger.info("系统异常发生了");
		logger.error("系统发生异常",exception);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("error/exception");
		return modelAndView;
	}

}
