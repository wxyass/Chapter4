package com.wxyass.kotlin.conflict

/**
 * 当接口的签名一样(方法名一样,参数列表一样),返回值类型也一样的处理方法,使用super<类名>.方法名
 * Created by benny on 4/3/17.
 */
// 定义一个抽象父类
abstract class A{
    open fun x(): Int = 5
}

// 定义接口B
interface B{
    fun x(): Int = 1
}

// 定义皆苦C
interface C{
    fun x(): Int = 0
}

// D 继承类,实现接口
class D(var y: Int = 0): A(), B, C{

    override fun x(): Int {
        println("call x(): Int in D")
        if(y > 0){
            return y
        }else if(y < -200){
            return super<C>.x()
        }else if(y < -100){
            return super<B>.x()
        }else{
            return super<A>.x()
        }
    }
}

fun main(args: Array<String>) {
    println(D(3).x())
    println(D(-10).x())
    println(D(-110).x())
    println(D(-10000).x())
}