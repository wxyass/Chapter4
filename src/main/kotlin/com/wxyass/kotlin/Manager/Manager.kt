package com.wxyass.kotlin.Manager


/**
 * Created by benny on 4/3/17.
 */
// 普通经理, 实现接口(用冒号)
class Manager: Driver, Writer {
    override fun write() {

    }

    override fun drive() {

    }
}

// 资深经理  使用接口代理
class SeniorManager(val driver: Driver, val writer: Writer): Driver by driver, Writer by writer

// 死机   接口代理
class CarDriver: Driver {
    override fun drive() {
        println("开车呢")
    }
}

// 秘书  接口代理
class PPTWriter: Writer {
    override fun write() {
        println("做PPT呢")
    }

}

// 接口: 开车
interface Driver{
    fun drive()
}

// 接口: 写作
interface Writer{
    fun write()
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val seniorManager = SeniorManager(driver, writer)
    seniorManager.drive()
    seniorManager.write()
}