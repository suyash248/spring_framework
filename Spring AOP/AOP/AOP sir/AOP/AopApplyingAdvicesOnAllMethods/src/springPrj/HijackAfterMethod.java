package springPrj;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethod implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)throws Throwable{
        System.out.println("Hijack After Method : After Method Hijacked !");
    }
}
