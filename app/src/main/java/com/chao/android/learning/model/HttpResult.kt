package com.chao.android.learning.model

class HttpResult<T> {
    var data: T? = null
    var errorMsg: String? = null
    var errorCode: Int = 0
}
