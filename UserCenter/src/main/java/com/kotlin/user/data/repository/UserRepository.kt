package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import io.reactivex.Observable

/**
 * Created by QKun on 2019/1/15.
 */
class UserRepository {

    fun register(mobile:String,pwd:String,verifyCode:String) :Observable<BaseResp<String>>{
       return RetrofitFactory.instance.create(UserApi::class.java)
            .register(RegisterReq(mobile,pwd,verifyCode))

    }
}