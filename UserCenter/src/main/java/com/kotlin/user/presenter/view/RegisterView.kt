package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView
import com.kotlin.user.data.protocol.LoginBean

/**
 * 用户注册 视图回调
 */
interface RegisterView : BaseView {

    fun onRegisterResult(bean:LoginBean)
}