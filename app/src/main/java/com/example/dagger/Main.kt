package com.example.dagger

fun main() {
    val appComponent: AppComponent = DaggerAppComponent.create()
    println(appComponent.computer)
}