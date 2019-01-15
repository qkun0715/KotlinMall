package com.kotlin.base.data.protocol

/**
 * Created by QKun on 2019/1/15.
 * 请求响应的基础类
 */
class BaseResp<T>(val status: Int, val message: String, val data: T)