package com.wxyass.kotlin

/**
 * Created by benny on 4/3/17.
 */
class House

class Flower

class Countyard{
    // private 类私有,只能在这个类中调用,在其他地方不可调用
    private val house: House = House()
    private val flower: Flower = Flower()
}

class ForbiddenCity{
    // internal 模块内可用,只在当前Module中可用
    internal val houses = arrayOf(House(), House())
    // 默认public  任何地方都可调用
    val flowers = arrayOf(Flower(), Flower())
}

fun main(args: Array<String>) {
    val countyard = Countyard()
    val fc = ForbiddenCity()
    println(fc.flowers)
}