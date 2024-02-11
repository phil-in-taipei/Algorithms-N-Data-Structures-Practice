package traversals;

import graph.Graph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GraphTraversalsTest {

    Graph graph = new Graph();

    GraphTraversals graphTraversals;

    ArrayList<String> vertices = new ArrayList<String>(List.of(new String[]{"A", "B", "C", "D", "E", "F", "G"}));

    @BeforeEach
    void setUp() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("D", "E");
        graph.addEdge("D", "F");
        graph.addEdge("E", "G");
        graph.addEdge("F", "G");

        this.graphTraversals = new GraphTraversals(graph);
    }

    @Test
    void getBreadthFirst() {
        ArrayList<String> result = (ArrayList<String>) this.graphTraversals
                .getBreadthFirst()
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
        assertEquals(result, this.vertices);
    }

    @Test
    void getDepthFirst() {
        ArrayList<String> result = (ArrayList<String>) this.graphTraversals
                .getDepthFirst()
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
        assertEquals(result, this.vertices);
    }

    @Test
    void getStartingVertex() {
        assertTrue(this.vertices.contains(this.graphTraversals.getStartingVertex()));
    }
}