package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.LoginBean
import com.kotlin.user.data.protocol.RegisterReq
import io.reactivex.Observable

/**
 * Created by QKun on 2019/1/15.  传说中model层
 */
class UserRepository {
    /**
     * 注册用户名
     */
    fun register(username: String, password: String, repassword: String): Observable<BaseResp<LoginBean>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
            .register(username, password, repassword)

    }
}