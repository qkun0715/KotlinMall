package com.kotlin.user.ui

import android.os.Bundle
import com.kotlin.base.ui.activity.BaseActivity
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.data.protocol.LoginBean
import com.kotlin.user.presenter.LoginPresenter
import com.kotlin.user.presenter.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast

/**
 * Created by QKun on 2019/1/21.
 */
class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {
    override fun onLoginResult(bean: LoginBean) {
        toast(bean.username)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mPresenter = LoginPresenter()
        mPresenter.mView = this

        mLoginBtn.setOnClickListener {
            mPresenter.register("juan_0821", "123456")
        }


    }
}