package spring.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("returnValue: " + returnValue + ", method: " +method.getName());
    }
}
