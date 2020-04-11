package com.redinterface.spring.demo.configurationsource

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigurationsourceApplication(val service: Service) : ApplicationRunner {


	override fun run(args: ApplicationArguments?) {
		println(service.name)

	}

}
fun main(args: Array<String>) {
	runApplication<ConfigurationsourceApplication>(*args)
}

