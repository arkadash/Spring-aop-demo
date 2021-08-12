package com.example.aop.sevice

import org.springframework.stereotype.Service

@Service
class ReviewsService(private val repo: ReviewsRepository ) {

    fun updateReviews() {
        println("Send monitor - update reviews has been called")

        try {
            val start = System.currentTimeMillis()

            repo.update()

            println("Send tracking event: total time ${System.currentTimeMillis() - start}")

            println("Send monitor - update reviews Successfully finished")

        } catch(error: Throwable) {
            println("Send monitor - update reviews failed ${error.message}")
        }
    }
}