import model.Grafo
import service.Reader

fun main(args: Array<String>) {
    val lista: List<String> = Reader().readFile("C:\\Users\\matheuselm\\Downloads\\graph-test-100.txt")
    val grafo = Grafo().toList(lista)
    println(Reader().procuraPredecessores(1, grafo))
}