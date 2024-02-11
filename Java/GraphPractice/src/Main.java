import graph.Graph;
import traversals.GraphTraversals;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Implementing new graph");
        Graph graph = new Graph();
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
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("These are the vertices: " + graph.getAdjacency().keySet().toString());
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Initializing graph traversal object");
        GraphTraversals graphTraversals = new GraphTraversals(graph);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Starting at this vertex: " + graphTraversals.getStartingVertex());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Depth first traversal: " + graphTraversals.getBreadthFirst().toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Breadth first traversal: " + graphTraversals.getDepthFirst().toString());
        System.out.println("--------------------------------------------------------------------------------------------");


    }
}