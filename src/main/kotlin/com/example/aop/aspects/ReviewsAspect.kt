package com.example.aop.aspects

import org.aspectj.lang.annotation.*
import org.springframework.stereotype.Component

const val funcTrigger = "execution(* com.example.aop.sevice.ReviewsService.updateReviews(..))"

@Aspect
@Component
class ReviewsAspect {

    @Before(funcTrigger)
    fun before() {
    }

    @After(funcTrigger)
    fun after() {
    }

    @AfterReturning(funcTrigger)
    fun afterReturn() {
    }

    @AfterThrowing(funcTrigger)
    fun afterThrow() {
    }

}