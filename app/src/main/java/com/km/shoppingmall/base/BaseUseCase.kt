package com.km.shoppingmall.base

/* TODO: 제네릭을 out 으로 해야될지도..? */
sealed class Result<T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Error<T>(val error: Throwable) : Result<T>()
}

abstract class BaseUseCase {
    protected inline fun <T> execute(block: () -> T): Result<T> = runCatching {
        Result.Success(block())
    }.getOrElse {
        /* TODO: Success, Error 를 나눠서 관리해야하는 함수가 생기면 그때 printStackTrace 를 이동한다. */
        it.printStackTrace()
        Result.Error(it)
    }
}
