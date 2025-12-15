package com.test.cmp_bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform