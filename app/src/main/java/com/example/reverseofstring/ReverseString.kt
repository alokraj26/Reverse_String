package com.example.reverseofstring

fun main() {
    val str = "My Name is Alok Raj"
    println("Reverse of String ${reverse(str)}")
}

fun reverse(str: String): String {
    val chars = CharArray(str.length)
    str.indices.forEach {
        chars[str.length - it - 1] = str[it]
    }
    return String(chars)
}