package com.example.aop.sevice

import org.springframework.stereotype.Service

@Service
class ReviewsService(private val repo: ReviewsRepository ) {

    fun updateReviews() {
        repo.update()
    }
}