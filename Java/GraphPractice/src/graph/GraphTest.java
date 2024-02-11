package graph;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    Graph testGraph;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testGraph = new Graph();
        testGraph.addVertex("vertex1");
        testGraph.addVertex("vertex2");
    }

    @org.junit.jupiter.api.Test
    void addVertex() {
        assertTrue(testGraph.getAdjacency().containsKey("vertex1"));
        assertTrue(testGraph.getAdjacency().containsKey("vertex2"));
    }

    @org.junit.jupiter.api.Test
    void addEdge() {
        this.testGraph.addEdge("vertex1", "vertex2");
        assertTrue(testGraph.getAdjacency().get("vertex1").contains("vertex2"));
        assertTrue(testGraph.getAdjacency().get("vertex2").contains("vertex1"));
    }

    @org.junit.jupiter.api.Test
    void removeEdge() {
        this.testGraph.addEdge("vertex1", "vertex2");
        assertTrue(testGraph.getAdjacency().get("vertex1").contains("vertex2"));
        assertTrue(testGraph.getAdjacency().get("vertex2").contains("vertex1"));
        this.testGraph.removeEdge("vertex1", "vertex2");
        assertFalse(testGraph.getAdjacency().get("vertex1").contains("vertex2"));
        assertFalse(testGraph.getAdjacency().get("vertex2").contains("vertex1"));
    }

    @org.junit.jupiter.api.Test
    void removeVertex() {
        this.testGraph.addEdge("vertex1", "vertex2");
        assertTrue(testGraph.getAdjacency().get("vertex1").contains("vertex2"));
        assertTrue(testGraph.getAdjacency().get("vertex2").contains("vertex1"));
        this.testGraph.removeVertex("vertex2");
        assertFalse(testGraph.getAdjacency().get("vertex1").contains("vertex2"));
        assertFalse(testGraph.getAdjacency().containsKey("vertex2"));
    }
}