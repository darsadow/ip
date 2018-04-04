package com.dariuszsadowski.ip

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IpApplication

fun main(args: Array<String>) {
    runApplication<IpApplication>(*args)
}
