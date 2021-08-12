package com.example.aop.sevice

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class HelloCommandLinerRunner(
    private val reviewsService: ReviewsService
): CommandLineRunner {

    override fun run(vararg args: String?) {
        println("****************** Hello Qualas!! ***********************")
        reviewsService.updateReviews()
    }
}