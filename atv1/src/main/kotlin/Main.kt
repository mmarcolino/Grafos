import model.Grafo
import service.Reader

fun main(args: Array<String>) {
    //Lê o arquivo e transforma em uma lista de string, contendo cada linha
    val lista: List<String> = Reader().readFile("C:\\Users\\matheuselm\\Downloads\\graph-test-100.txt")
    //cria um grafo direcionado, mapeando os vertices pelas relações de suceções
    val grafo = Grafo().toList(lista)
    //Lê o input do número
    print("Insira um número dentre o número total de vertices don arquivo desejado: ")
    val numINput = readLine()?.toInt()
    //Printando
    println("Número inserido: $numINput")
    println("Grau de saída: ${grafo[numINput!! -1].size}")
    println("Grau de entrada: ${Reader().procuraPredecessores(numINput, grafo).size}")
    println("Sucessores: ${grafo[numINput!! -1]}")
    println("Predecessores: ${Reader().procuraPredecessores(numINput, grafo)}")
}