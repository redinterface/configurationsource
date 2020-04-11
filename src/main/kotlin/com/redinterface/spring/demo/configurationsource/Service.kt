package com.redinterface.spring.demo.configurationsource

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

interface Service {

    abstract val name: String
}

@Component
class ServiceImpl(val properties: Properties): Service {
    override val name: String
        get() = this.properties.name
}

@Component
@ConfigurationProperties(prefix="redinterface")
class Properties {
    lateinit var name: String
}