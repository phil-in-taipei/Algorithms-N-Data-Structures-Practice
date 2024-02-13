import kotlin.collections.ArrayList

fun breadthFirstTraversal(graph: Graph, startingVertex: String): ArrayList<String> {
    val vertices = arrayListOf<String>()
    val queue = ArrayDeque<String>()
    queue.addFirst(startingVertex)
    while(!queue.isEmpty()) {
        val vertex: String = queue.removeLast()
        if (!vertices.contains(vertex)) {
            vertices.add(vertex)
        }
        val adjacentVertices: ArrayList<String>? = graph.getAdjacency()[vertex]
        if (adjacentVertices != null) {
            for (adjVertex in adjacentVertices) {
                if (!vertices.contains(adjVertex)) {
                    queue.add(adjVertex)
                }
            }
        }
    }
    return vertices
}