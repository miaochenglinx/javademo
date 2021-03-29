import kotlinx.coroutines.*
import kotlin.math.log

suspend fun main() {
   println(1)
    val job = GlobalScope.launch (start = CoroutineStart.ATOMIC){
        delay(100)
        println(2)
        delay(1000)
        println(3)
    }

    job.cancel()
    println(4)
    job.join()


}

suspend fun getResult(): String {
    delay(3000)
    return "I am result"
}