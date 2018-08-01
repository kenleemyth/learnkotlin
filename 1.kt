import java.io.File

fun main(args: Array<String>) {
    //println("hello word")
    writebook()
    readbook()
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