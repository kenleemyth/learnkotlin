import java.io.File
import java.net.URL

fun main(args: Array<String>) {
    //println("hello word")
    //writebook()
    //readbook()
    web()
}

fun readbook(){
    val filename="test.txt"
    var file=File(filename)
    var con=file.readText()
    println(con)
}

fun writebook(){
    var filename="test.txt"
    var file=File(filename)
   file.writeText("bbbbbb\n")
   //file.appendBytes(byteArrayOf(93, 85, 74, 93))
    file.appendText("吼啊")
}

fun web(){
    val baidu = URL("https://www.quguoyun.cn")
    val contents = baidu.readText()
    println(contents)
}