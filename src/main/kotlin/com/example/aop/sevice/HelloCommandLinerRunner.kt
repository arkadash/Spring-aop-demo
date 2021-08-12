package com.example.aop.sevice

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Role
import org.springframework.stereotype.Component

@Component
class HelloCommandLinerRunner(
): CommandLineRunner {

    override fun run(vararg args: String?) {
        println("****************** Hello Qualas!! ***********************");
    }
}