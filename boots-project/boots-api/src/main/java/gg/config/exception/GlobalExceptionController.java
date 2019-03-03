package gg.config.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionController {

	@ResponseBody
	@ExceptionHandler(Exception.class)
	public String handlerException(Exception e) {
		log.info("错误信息11: ", e);
		return "error";//返回error (json)
	}

}
