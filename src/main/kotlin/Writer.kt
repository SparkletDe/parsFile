import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main(){
    var path=Paths.get("C:\\Users\\mine_\\IdeaProjects\\parsFile\\src\\main\\resources\\text2.txt")



    while (true){
        println("Введите данный для записи")
        var text = readln() +"\n"

        try {
            Files.writeString(path, text, StandardOpenOption.CREATE, StandardOpenOption.APPEND)
        }catch (e:IOException){
            println("не верно указан путь")
        }

    }

}