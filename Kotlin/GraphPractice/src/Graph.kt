class Graph {

    private val adjacency = hashMapOf<String, ArrayList<String>>()

    fun addVertex(vertex : String) {
        adjacency[vertex] = ArrayList()
    }

    fun addEdge(vertex1: String, vertex2: String) {
        if (adjacency.containsKey(vertex1) && adjacency.containsKey(vertex2)) {
            adjacency[vertex1]?.add(vertex2)
            adjacency[vertex2]?.add(vertex1)
        }
    }

    fun getAdjacency(): HashMap<String, ArrayList<String>> {
        return adjacency
    }

    fun removeEdge(vertex1: String, vertex2: String) {
        if (adjacency.containsKey(vertex1) && adjacency.containsKey(vertex2)) {
            adjacency[vertex1]?.remove(vertex2)
            adjacency[vertex2]?.remove(vertex1)
        }
    }

    fun removeVertex(vertex: String) {
        val vertexAdjacencies = adjacency[vertex]!!
        while (vertexAdjacencies.isNotEmpty()) {
            val adjacentVertex = vertexAdjacencies[0]
            vertexAdjacencies.removeAt(0)
            adjacency[adjacentVertex]?.remove(vertex)
        }
        adjacency.remove(vertex)
    }
}