package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*

/**
 * Created by QKun on 2019/1/15.
 */
fun <T> Observable<T>.excute(subscriber: BaseSubscriber<T>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(subscriber)
}