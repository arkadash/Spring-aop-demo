package com.example.aop.sevice

import org.springframework.stereotype.Service

@Service
class ReviewsService(private val repo: ReviewsRepository ) {

    fun updateReviews() {
        val start = System.currentTimeMillis()

        repo.update()

        println("Send tracking event: total time ${System.currentTimeMillis() - start}")
    }
}