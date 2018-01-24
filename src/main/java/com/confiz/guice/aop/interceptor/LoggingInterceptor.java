package com.confiz.guice.aop.interceptor;

import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;

public class LoggingInterceptor implements MethodInterceptor {
	 
    @Inject
    Logger logger;
 
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] objectArray = invocation.getArguments();
        int i = 0;
        for (Object object : objectArray) {
            logger.info("Sending message: " + object.toString());
        }
        return invocation.proceed();
    }
}