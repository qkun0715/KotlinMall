package com.kotlin.user.presenter

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.presenter.view.RegisterView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RegisterPresenter : BasePresenter<RegisterView>() {



    fun register(username: String, password: String, repassword: String) {
        //业务逻辑



        RetrofitFactory.instance.create(UserApi::class.java)
            .register(username, password, repassword)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                if (it.errorCode!=0){

                }else{
                    mView.onRegisterResult(it.data)
                }

            }

    }
}