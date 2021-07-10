package rxjava

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers
import log


fun main() {
    Observable.create<Int> {
        for (i in 0..10){
            log(i)
            it.onNext(i)

        }
    }.subscribeOn(Schedulers.io())
       /* .observeOn(Schedulers.newThread())*/
        .subscribe {
            log("onNext--$it")
        }
    Thread.sleep(1000)
}