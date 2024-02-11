package traversals;

import graph.Graph;

import java.util.*;

public class GraphTraversals {
    Graph graph;

    String startingVertex;

    public GraphTraversals(Graph graph) {
        this.graph = graph;
        ArrayList<String> keysAsArray = new ArrayList<String>(this.graph.getAdjacency().keySet());
        Random random = new Random();
        this.startingVertex = keysAsArray.get(random.nextInt(keysAsArray.size()));
    }

    public ArrayList<String> getBreadthFirst() {
        ArrayList<String> vertices = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(this.startingVertex);
        while(!queue.isEmpty()) {
            String vertex = queue.remove();
            if (!vertices.contains(vertex)) {
                vertices.add(vertex);
            }
            ArrayList<String> adjacentVertices = this.graph.getAdjacency().get(vertex);
            for (String adjVertex : adjacentVertices) {
                if (!vertices.contains(adjVertex)) {
                    queue.add(adjVertex);
                }
            }
        }
        return vertices;
    }

    public ArrayList<String> getDepthFirst() {
        ArrayList<String> vertices = new ArrayList<>();
        Stack<String> stack = new Stack<String>();
        stack.add(this.startingVertex);
        while(!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!vertices.contains(vertex)) {
                vertices.add(vertex);
            }
            ArrayList<String> adjacentVertices = this.graph.getAdjacency().get(vertex);
            for (String adjVertex : adjacentVertices) {
                if (!vertices.contains(adjVertex)) {
                    stack.push(adjVertex);
                }
            }
        }
        return vertices;
    }

    public String getStartingVertex() {
        return this.startingVertex;
    }
}
