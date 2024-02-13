import org.junit.jupiter.api.Assertions.*

class BreadthFirstTraversalKtTest {

    private val graph = Graph()

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
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
    }

    @org.junit.jupiter.api.Test
    fun breadthFirstTraversal() {
        assertEquals(
            breadthFirstTraversal(graph, "C").toString(),
            "[C, E, G, F, D, B, A]"
        )
    }
}