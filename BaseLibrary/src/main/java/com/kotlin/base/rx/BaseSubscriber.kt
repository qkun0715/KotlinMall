package com.kotlin.base.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.reactivestreams.Subscriber


/**
 * Created by QKun on 2019/1/15.
 */
open class BaseSubscriber<T> :Observer<T>{
    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable) {
    }
}