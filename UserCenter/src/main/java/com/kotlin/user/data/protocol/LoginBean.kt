package com.kotlin.user.data.protocol

/**
 * Created by QKun on 2019/1/21.
 */
data class LoginBean(
    val collectIds: List<Any>, val email: String, val icon: String,
    val id: Int, val password: String, val type: Int, val username: String,
    val token: String, val chapterTops: List<Any>
) {
}