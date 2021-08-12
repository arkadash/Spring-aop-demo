package com.example.aop.sevice

import com.example.aop.aspects.LoggerExecution
import com.example.aop.aspects.TimerExecution
import org.springframework.stereotype.Service

@Service
class ReviewsService(private val repo: ReviewsRepository ) {

    @LoggerExecution
    @TimerExecution
    fun updateReviews() {
        repo.update()
    }
}