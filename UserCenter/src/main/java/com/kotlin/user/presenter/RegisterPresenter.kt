package com.kotlin.user.presenter

import android.annotation.SuppressLint
import com.kotlin.base.ext.excute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class RegisterPresenter : BasePresenter<RegisterView>() {

    @SuppressLint("CheckResult")
    fun register(mobile: String, verifyCode: String, pwd: String) {
        //业务逻辑
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .excute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })


    }
}