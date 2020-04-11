package com.redinterface.spring.demo.configurationsource

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ConfigurationsourceApplicationTests {

	@Autowired
	lateinit var  service: Service
	@Test
	fun contextLoads() {
	}

	@Test
	fun `name is read`(){
		assertThat(service.name).isEqualTo("red interface")
	}
}
