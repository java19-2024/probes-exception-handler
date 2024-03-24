package telran.spring.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalWebExceptionHandler {
	static Logger log = LoggerFactory.getLogger(GlobalWebExceptionHandler.class);
	
	@ExceptionHandler(NotFoundException.class)
	ResponseEntity<String> notFoundHandler(NotFoundException e){
		String errMes = e.getMessage();
		log.error(errMes);
		return new ResponseEntity<String>(errMes, HttpStatus.NOT_FOUND);
	}
}
