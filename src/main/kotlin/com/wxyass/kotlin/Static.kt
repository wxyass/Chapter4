package com.wxyass.kotlin

/**
 * Created by benny on 4/4/17.
 */
fun main(args: Array<String>) {
    val latitude = Latitude.ofDouble(3.0)
    val latitude2 = Latitude.ofLatitude(latitude)

    println(Latitude.TAG)
}

// 纬度
class Latitude private constructor(val value: Double){
    // 这个类的伴生对象
    companion object{
        @JvmStatic // @JvmStatic 便于在java中调用
        fun ofDouble(double: Double): Latitude{
            return Latitude(double)
        }

        // 相当于java中静态方法
        fun ofLatitude(latitude: Latitude): Latitude{
            return Latitude(latitude.value)
        }

        @JvmField // @JvmField 便于在java中调用
        val TAG: String = "Latitude"
    }
}