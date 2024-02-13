import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GraphTest {

    private val testGraph = Graph()

    @BeforeEach
    fun setUp() {
        testGraph.addVertex("vertex1")
        testGraph.addVertex("vertex2")
    }

    @Test
    fun addVertex() {
        assertTrue(testGraph.getAdjacency().containsKey("vertex1"));
        assertTrue(testGraph.getAdjacency().containsKey("vertex2"));
    }

    @Test
    fun addEdge() {
        testGraph.addEdge("vertex1", "vertex2");
        testGraph.getAdjacency()["vertex1"]?.let { assertTrue(it.contains("vertex2")) }
        testGraph.getAdjacency()["vertex2"]?.let { assertTrue(it.contains("vertex1")) }
    }

    @Test
    fun getAdjacency() {
        assertTrue(testGraph.getAdjacency().contains("vertex2"))
        assertTrue(testGraph.getAdjacency().contains("vertex1"))
    }

    @Test
    fun removeEdge() {
        testGraph.addEdge("vertex1", "vertex2");
        testGraph.getAdjacency()["vertex1"]?.let { assertTrue(it.contains("vertex2")) }
        testGraph.getAdjacency()["vertex2"]?.let { assertTrue(it.contains("vertex1")) }
        this.testGraph.removeEdge("vertex1", "vertex2");
        testGraph.getAdjacency()["vertex1"]?.let { assertFalse(it.contains("vertex2")) };
        testGraph.getAdjacency()["vertex2"]?.let { assertFalse(it.contains("vertex1")) };
    }

    @Test
    fun removeVertex() {
        testGraph.addEdge("vertex1", "vertex2");
        testGraph.getAdjacency()["vertex1"]?.let { assertTrue(it.contains("vertex2")) }
        testGraph.getAdjacency()["vertex2"]?.let { assertTrue(it.contains("vertex1")) }
        this.testGraph.removeVertex("vertex2");
        testGraph.getAdjacency()["vertex1"]?.let { assertFalse(it.contains("vertex2")) };
        assertFalse(testGraph.getAdjacency().containsKey("vertex2"));
    }
}