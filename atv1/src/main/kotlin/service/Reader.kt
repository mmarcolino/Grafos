package service
import java.io.File

class Reader {
    fun readFile(path:String): MutableList<String>{
        var inputs: MutableList<String> = mutableListOf()
        File(path).forEachLine { inputs.add(it.trim())}
        inputs.removeAt(0)
        return inputs
    }
    fun procuraPredecessores(n: Int, grafo: List<List<String>>): List<Int>{
        var predecessores: MutableList<Int> = mutableListOf()
        for(vertice in grafo){
            for (p in vertice){
                if (p.toInt() == n){
                    predecessores.add(grafo.indexOf(vertice) + 1)
                }
            }
        }
        return predecessores
    }

}