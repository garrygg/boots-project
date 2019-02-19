package gg.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
	
	private static final Logger log = 
			LoggerFactory.getLogger(LogAspect.class);
	
	@Pointcut("execution(public * gg.service..*.*(..))")
	public void pointcut(){}
	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		log.info("{} -- {}: args:{}",LogAspect.class.getSimpleName(), 
				pjp.getSignature().toShortString(),pjp.getArgs());
		Object result = pjp.proceed();
		log.info("result: {}",result.toString());
		return result;
	}
}
