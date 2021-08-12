package com.example.aop.sevice

import org.springframework.stereotype.Service

@Service
class ReviewsRepository {

    fun update() {
        Thread.sleep(1000)
        println("Repo: Reviews has been updated")

//        throw Exception("Something bad happened")
    }
}