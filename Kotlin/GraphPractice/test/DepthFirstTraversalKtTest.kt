import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DepthFirstTraversalKtTest {

    private val graph = Graph()

    @BeforeEach
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

    @Test
    fun depthFirstTraversal() {
        assertEquals(
            depthFirstTraversal(graph, "C").toString(),
            "[C, A, E, B, D, G, F]"
        )
    }
}