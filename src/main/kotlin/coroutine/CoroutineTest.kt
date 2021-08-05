import javafx.application.Application.launch
import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope.coroutineContext
import javax.xml.bind.JAXBElement
import kotlin.coroutines.*
import kotlin.math.log

fun main() {
    val coroutineExceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        log("zai handler zhong $throwable")
    }
    val topScope = CoroutineScope(Job())
    topScope.launch {
        try {
            withContext(Dispatchers.IO){
                val i = test(this+Dispatchers.IO)
            }
        } catch (e: Exception) {
            log(e)
        }
        log("muyou")


    }





    Thread.sleep(1000)
    log("jeshula")
}

 fun test(scope: CoroutineScope): Int {

        throw Exception("lallala")
        log("hahahhahahah")
        return 1

}

fun getData(): Int {
    Thread.sleep(300)
    throw java.lang.Exception("lalal")
    return 1
}

private suspend fun exceptionTest() {
    println(1)
    try {
        coroutineScope {
            println("2")
            launch {
                println(3)
                launch {
                    println(4)
                    delay(300)
                    throw Exception("I am from haha")
                }
                println(5)
            }

            println(6)
            val job = launch {
                println(7)
                delay(1000)
            }

            try {
                println(8)
                job.join()
                println(9)
            } catch (e: Exception) {
                println("10 $e")
            }
        }

    } catch (e: Exception) {
        println("12 $e")
    }

    println(13)
}


suspend fun getResult(): String {
    delay(3000)
    return "I am result"
}

