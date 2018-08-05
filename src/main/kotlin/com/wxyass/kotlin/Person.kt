package com.wxyass.kotlin

/**
 * Created by benny on 4/3/17.
 */

// 定义一个抽象类 构造方法参数用open修饰表示可重写
abstract class Person(open val age: Int){
    // 定义一个抽象方法
    abstract fun work()
}

// 子类继承父类
class Doctor(age: Int): Person(age){
    // 如果继承的是抽象类,必须重写所有的抽象方法
    override fun work() {
        println("我是医生，我在给病人看病")
    }
}

// 子类继承父类
class MaNong(age: Int): Person(age){

    // 重写参数值
    override val age: Int
        get() = 0

    override fun work() {
        println("我是码农，我在写代码")
    }
}

fun main(args: Array<String>) {
    val person: Person = MaNong(23)
    person.work()
    println(person.age)

    val person2 : Person = Doctor(24)
    person2.work()
    println(person2.age)
}