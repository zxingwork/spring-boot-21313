package org.zx.springboot21313.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class LogAspect {
    private Date dateStart;
    private Date dateEnd;

    @Pointcut("execution(* org.zx.springboot21313.*..*(..))")
    public void pc1(){}
    @Before(value = "pc1()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        dateStart = new Date();
        System.out.print(">>>["+sdf.format(dateStart)+"]"+"["+name+"方法开始执行]");
    }
    @After(value = "pc1()")
    public void after(JoinPoint jp){
        String name = jp.getSignature().getName();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        dateEnd = new Date();
        long dateSpend = dateEnd.getTime()-dateStart.getTime();
        System.out.println("["+name+"方法执行结束]"+"["+sdf.format(dateEnd)+"消耗时间："+dateSpend+"ms]");
    }

    @AfterReturning(value = "pc1()",returning = "result")
    public void afterReturning(JoinPoint jp, Object result){
        String name = jp.getSignature().getName();
        System.out.println("["+name+"方法返回值："+result+"]");
    }

    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e){
        String name = jp.getSignature().getName();
        System.out.println(name+"方法抛出异常了："+e.getMessage());
    }
    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        return pjp.proceed();
    }
}
