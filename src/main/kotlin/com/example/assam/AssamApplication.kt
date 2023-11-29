package com.example.assam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.Banner

@SpringBootApplication
class AssamApplication

fun main(args: Array<String>) {
    runApplication<AssamApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
