package com.kotlin.base.data.protocol

/**
 * Created by QKun on 2019/1/15.
 * 请求响应的基础类
 */
open class BaseResp<out T>(val errorCode: Int, val errorMsg: String, val data: T)