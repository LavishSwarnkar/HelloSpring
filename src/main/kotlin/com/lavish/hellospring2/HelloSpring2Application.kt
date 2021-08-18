package com.lavish.hellospring2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSpring2Application

fun main(args: Array<String>) {
	runApplication<HelloSpring2Application>(*args)
}
