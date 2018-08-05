package com.wxyass.kotlin.objects


/**
 * Created by benny on 4/3/17.
 */

class Driver

// 定义接口 是否有外接硬盘插入
interface OnExternalDriverMountListener{
    fun onMount(driver: Driver)

    fun onUnmount(driver: Driver)
}

// 定义抽象父类
abstract class Player

// 音乐播放器 继承父类,实现接口
object MusicPlayer: Player(), OnExternalDriverMountListener{
    override fun onMount(driver: Driver) {

    }

    override fun onUnmount(driver: Driver) {

    }

    // 成员变量
    val state : Int = 0

    // 成员方法
    fun play(url : String){

    }

    // 成员方法
    fun stop(){

    }
}