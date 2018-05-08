package com.boot.bootdemo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggerService {

    final static Logger logger = LoggerFactory.getLogger(LoggerService.class);

    @Pointcut("execution(* com.boot.bootdemo.service..*.*(..))")
    public void performance() {
    }

    @Around(value = "performance()")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {

        long begin = System.currentTimeMillis();
        Object result = "";

        try {

            result = joinPoint.proceed();
        } catch (Exception e) {

            logger.error("错误信息：{}", e.getMessage());
        } finally {

            long took = (System.currentTimeMillis() - begin) / 1000;

            logger.error("Service 执行时间为{}秒", took);
        }


        return result;
    }


}
