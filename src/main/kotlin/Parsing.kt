import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    var path =
        Paths.get("C:\\Users\\mine_\\IdeaProjects\\parsFile\\src\\main\\resources\\text.txt")

    var lines = Files.readAllLines(path) //получить лист из строк

    var stringBuilder = StringBuilder()//собрать текст, меньше памяти
    for (line in lines) {
        stringBuilder.append(line); //append то же самое как +=
    }

    var listSplit = stringBuilder.split('.') //разбид до знака .


    println("enter word for parsing")
    var userText=readln()



    for (s in listSplit) {
        if (s.trim().contains(userText))
            println(s.trim())
    }




}