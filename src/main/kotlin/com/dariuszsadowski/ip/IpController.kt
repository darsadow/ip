package com.dariuszsadowski.ip

import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class IpController {

    @GetMapping("/")
    fun getIp(request: ServerHttpRequest) : Mono<IpModel> {
        return Mono.just(IpModel(
                request.remoteAddress!!.address.toString(),
                request.remoteAddress!!.hostString
        ))
    }
}

data class IpModel(val ip: String, val host: String)
