package main

fun main() {
    val likes = 1011

    val ending = if (likes == 0 || likes % 1000 == 0) {
        "человек"
    } else if (likes == 11 || likes % 100 == 11) {
        "людям"
    } else if (likes == 1 || likes % 10 == 1 || likes % 100 == 1) {
        "человеку"
    } else {
        "людям"
    }

    println("Ваш пост нравится $likes $ending")
}