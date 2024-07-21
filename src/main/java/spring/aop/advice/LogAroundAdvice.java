package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        long start = System.currentTimeMillis();

        Object result = methodInvocation.proceed();

        long end = System.currentTimeMillis();
        String message = (end-start) + "ms 시간이 걸렸습니다.";
        System.out.println(message);
        return result;
    }
}
