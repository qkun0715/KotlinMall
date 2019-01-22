package com.kotlin.user.presenter

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.LoginBean
import com.kotlin.user.presenter.view.LoginView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginPresenter : BasePresenter<LoginView>() {


    fun register(username: String, password: String) {

        RetrofitFactory.instance.create(UserApi::class.java)
            .login(username, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mView.onLoginResult(it.data)
            })


    }
}