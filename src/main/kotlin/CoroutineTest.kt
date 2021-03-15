import kotlinx.coroutines.*

fun main() {
    val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        run {
            println("I am exceptionHandler->" + throwable)
        }
    }
    val pJob = GlobalScope.async() {
        val cJOb=  launch() {
            delay(300)
            println("child job dangdang")
            // throw Exception("I am from child job")
        }

        delay(200)
        println("parent job completed")
    }

    pJob.await()

    println("lalalalala")


}