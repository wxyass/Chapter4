package com.wxyass.kotlin.dataclass

import com.wxyass.kotlin.annotations.PoKo

/**
 * 数据类
 * Created by wxyass on 2/6/18.
 */
@PoKo
data class Country(val id: Int, val name: String)

class ComponentX{
    operator fun component1(): String{
        return "您好，我是"
    }

    operator fun component2(): Int{
        return 1
    }

    operator fun component3(): Int{
        return 1
    }

    operator fun component4(): Int{
        return 0
    }
}

fun main(args: Array<String>) {
    val china = Country(0, "中国")
    println(china)
    println(china.component1())
    println(china.component2())
    val (id, name) = china
    println(id)
    println(name)

    val componentX = ComponentX()
    val (a, b, c, d) = componentX
    println("$a $b$c$d")
}