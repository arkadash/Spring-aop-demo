package com.example.aop.aspects

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.*
import org.springframework.stereotype.Component

@Aspect
@Component
class ReviewsAspect {

    @Before("@annotation(LoggerExecution)")
    fun before(joinPoint: JoinPoint) {
        println("${joinPoint.signature.name}:: Send monitor - update reviews has been called")
    }

    @After("@annotation(LoggerExecution)\"")
    fun after() {

    }

    @AfterReturning("@annotation(LoggerExecution)")
    fun afterReturn(joinPoint: JoinPoint) {
        println("${joinPoint.signature.name}::Send monitor - update reviews Successfully finished")
    }

    @AfterThrowing(pointcut = "@annotation(LoggerExecution)", throwing = "error")
    fun afterThrow(joinPoint: JoinPoint, error: Throwable) {
        println("Send monitor - update reviews failed")
        println("${joinPoint.signature.name}:: Fail Error: ${error.message}, Params: ${joinPoint.args}")
    }
    
    @Around("@annotation(TimerExecution)")
    fun around(joinPoint: ProceedingJoinPoint): Any? {
        val start = System.currentTimeMillis()

        val proceed = joinPoint.proceed()

        println("${joinPoint.signature.name}:: Send tracking event: total time ${System.currentTimeMillis() - start}")
        return proceed
    }
}