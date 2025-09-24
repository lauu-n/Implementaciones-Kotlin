fun main() 
{
    // Representación del grafo
    val graph = mapOf(
        "5" to listOf("3", "7"),
        "3" to listOf("2", "4"),
        "7" to listOf("8"),
        "2" to emptyList(),
        "4" to listOf("8"),
        "8" to emptyList()
    )

    dfsIterative(graph, "5")
}

fun dfsIterative(graph: Map<String, List<String>>, start: String) 
{
    val visited = mutableSetOf<String>()
    val stack = ArrayDeque<String>()  // pila 
    stack.add(start)

    println("DFS usando pila:")

    while (stack.isNotEmpty()) 
    {
        val node = stack.removeLast()  // sacar el último elemento 
        if (node !in visited) 
        {
            println(node)
            visited.add(node)
            // Agregar vecinos a la pila
            for (neighbour in graph[node]!!) 
            {
                stack.add(neighbour)
            }
        }
    }
}
