package com.soyaaroncervantes.platziconf.network

import java.lang.Exception

interface Callback<T> {
    fun onSuccess( result: T )
    fun onFailed( exception: Exception )
}