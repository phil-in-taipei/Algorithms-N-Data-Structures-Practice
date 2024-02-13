import kotlin.collections.ArrayList

fun depthFirstTraversal(graph: Graph, startingVertex: String): ArrayList<String> {
    val vertices = arrayListOf<String>()
    val stack = ArrayDeque<String>()
    stack.addFirst(startingVertex)
    while(!stack.isEmpty()) {
        val vertex: String = stack.removeFirst()
        if (!vertices.contains(vertex)) {
            vertices.add(vertex)
        }
        val adjacentVertices: ArrayList<String>? = graph.getAdjacency()[vertex]
        if (adjacentVertices != null) {
            for (adjVertex in adjacentVertices) {
                if (!vertices.contains(adjVertex)) {
                    stack.add(adjVertex)
                }
            }
        }
    }
    return vertices
}