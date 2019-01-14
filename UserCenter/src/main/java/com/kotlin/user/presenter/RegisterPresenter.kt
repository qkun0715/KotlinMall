package com.kotlin.user.presenter

import android.annotation.SuppressLint
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class RegisterPresenter:BasePresenter<RegisterView>() {

    @SuppressLint("CheckResult")
    fun register(mobile:String, verifyCode: String, pwd:String){
        //业务逻辑
        val userService = UserServiceImpl()
            userService.register(mobile,verifyCode,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<Boolean> {
                    override fun onComplete() {
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }

                    override fun onError(e: Throwable) {
                    }

                })


    }
}