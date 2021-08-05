package rxjava

import io.reactivex.rxjava3.core.Observable
import log

fun main() {
    Observable.just(1,2,3)
        .flatMap {
            log("flatmap ;$it")
            return@flatMap Observable.just(it)
        }
        .blockingFirst()





}