package br.tec.escritorio.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EscritorioApiApplication

fun main(args: Array<String>) {
	runApplication<EscritorioApiApplication>(*args)
}
