import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

fun log(msg:Any?){
    println("${Thread.currentThread().name}--${System.currentTimeMillis().toTimes()}--${msg.toString()}")
}
fun longtoTimes(long: Long,pattern: String="HH-mm-ss-sss"): String {
    val sf = SimpleDateFormat(pattern)
    return sf.format(Date(long))
}

fun Long.toTimes(pattern: String="HH:mm:ss:sss"): String {
    return longtoTimes(this,pattern)
}