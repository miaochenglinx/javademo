import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils
import kotlinx.coroutines.*
import java.util.*
import java.util.concurrent.CompletableFuture

suspend fun main() {

    // Thread.sleep(1000)
val map = mutableMapOf(
    Pair("k1","v1"),
    Pair("k2","v2"),
    Pair("k3","v3"),
    Pair("k4","v4")
)
    println(filter(map))

}

fun filter(map: MutableMap<String,String>): Map<String, String> {
    return map.filterNot { arrayOf("k1","k2").contains(it.key) }

}

fun unitKey(anchor:String,vararg  keys:String): Boolean {
    keys.forEach {
        if (anchor == it){
            return true
        }
    }
    return false

}

fun getData():Int{
    return 2;
}

fun notRight(): Boolean {
    return false;
}

