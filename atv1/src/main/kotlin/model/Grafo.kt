package model
import java.util.regex.Pattern

class Grafo(){
    fun toList(vertices: List<String>): List<List<String>>{
        var result: MutableList<MutableList<String>> = mutableListOf()
        var sucessores: MutableList<String> = mutableListOf()
        var index: Int = 1
        for(i in vertices){
            val words = i.split(Pattern.compile("\\D+"))
            if (words[0].toInt() == index){
                sucessores.add(words[1].trim())
            }
            else{
                index ++
                result.add(sucessores)
                sucessores = mutableListOf()
                sucessores.add(words[1].trim())
            }
        }
        return result
    }
}