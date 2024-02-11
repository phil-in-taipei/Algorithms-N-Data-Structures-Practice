package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Graph {
    Map<String, ArrayList<String>> adjacency;


    public Graph() {
        this.adjacency = new HashMap<String, ArrayList<String>>();
    }

    public void addVertex(String vertex) {
        this.adjacency.put(vertex, new ArrayList<String>());
    }

    public void addEdge(String vertex1, String vertex2) {
        if (this.adjacency.containsKey(vertex1) && this.adjacency.containsKey(vertex2)) {
            ArrayList<String> vertex1Adjacencies =  this.adjacency.get(vertex1);
            vertex1Adjacencies.add(vertex2);
            this.adjacency.put(vertex1, vertex1Adjacencies);
            ArrayList<String> vertex2Adjacencies =  this.adjacency.get(vertex2);
            vertex2Adjacencies.add(vertex1);
            this.adjacency.put(vertex2, vertex2Adjacencies);
        }
    }

    public void removeEdge(String vertex1, String vertex2) {
        ArrayList<String> vertex1Adjacencies =  (ArrayList<String>) this.adjacency.get(vertex1)
                .stream()
                .filter(v -> !v.equals(vertex2))
                .collect(Collectors.toList());
        this.adjacency.put(vertex1, vertex1Adjacencies);
        ArrayList<String> vertex2Adjacencies =  (ArrayList<String>) this.adjacency.get(vertex2)
                .stream()
                .filter(v -> !v.equals(vertex1))
                .collect(Collectors.toList());
        this.adjacency.put(vertex2, vertex2Adjacencies);
    }

    public void removeVertex(String vertex) {
        ArrayList<String> vertexAdjacencies =  this.adjacency.get(vertex);
        while (!vertexAdjacencies.isEmpty()) {
            String adjacentVertex = vertexAdjacencies.get(0);
            vertexAdjacencies.remove(0);
            ArrayList<String> adjacentVertexAdjacencies = (ArrayList<String>) this.adjacency.get(adjacentVertex)
                    .stream()
                    .filter(v -> !v.equals(vertex))
                    .collect(Collectors.toList());
            this.adjacency.put(adjacentVertex, adjacentVertexAdjacencies);
        }
        this.adjacency.remove(vertex);
    }

    public Map<String, ArrayList<String>> getAdjacency() {
        return adjacency;
    }
}
