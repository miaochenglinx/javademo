package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

val flow = flow<Int> {
    repeat(100) {
        delay(100)
        emit(it)
    }
}
suspend fun main() {
    GlobalScope.launch {
        flow.map { it.toString() }.
        sample(1000)
            .catch { emit("123") }
            .collect{
            println(it)
        }

    }.join()


}