package br.com.forumbe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForumBeApplication

fun main(args: Array<String>) {
	runApplication<ForumBeApplication>(*args)
}
