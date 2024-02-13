fun main() {
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing new graph")
    val graph = Graph()
    graph.addVertex("A")
    graph.addVertex("B")
    graph.addVertex("C")
    graph.addVertex("D")
    graph.addVertex("E")
    graph.addVertex("F")
    graph.addVertex("G")

    graph.addEdge("A", "B")
    graph.addEdge("A", "C")
    graph.addEdge("B", "D")
    graph.addEdge("C", "E")
    graph.addEdge("D", "E")
    graph.addEdge("D", "F")
    graph.addEdge("E", "G")
    graph.addEdge("F", "G")
    println("-----------------------------------------------------------------------------------------------------------")

    println("These are the vertices: " + graph.getAdjacency().keys)
    println("-----------------------------------------------------------------------------------------------------------")
    println("Depth first traversal: " + depthFirstTraversal(graph=graph, startingVertex = "C").toString());
    println("-----------------------------------------------------------------------------------------------------------")
    println("Breadth first traversal: " + breadthFirstTraversal(graph=graph, startingVertex = "C").toString());


    println("-----------------------------------------------------------------------------------------------------------")


    println("-----------------------------------------------------------------------------------------------------------")

}