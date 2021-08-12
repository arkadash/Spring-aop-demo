package com.example.aop.aspects

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.*
import org.springframework.stereotype.Component

const val funcTrigger = "execution(* com.example.aop.sevice.ReviewsService.updateReviews(..))"

@Aspect
@Component
class ReviewsAspect {

    @Before(funcTrigger)
    fun before(joinPoint: JoinPoint) {
        println("${joinPoint.signature.name}:: Send monitor - update reviews has been called")
    }

    @After(funcTrigger)
    fun after() {

    }

    @AfterReturning(funcTrigger)
    fun afterReturn(joinPoint: JoinPoint) {
        println("${joinPoint.signature.name}::Send monitor - update reviews Successfully finished")
    }

    @AfterThrowing(pointcut = funcTrigger, throwing = "error")
    fun afterThrow(joinPoint: JoinPoint, error: Throwable) {
        println("Send monitor - update reviews failed")
        println("${joinPoint.signature.name}:: Fail Error: ${error.message}, Params: ${joinPoint.args}")
    }
}