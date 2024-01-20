class Graph {
    constructor() {
        this.adjacencyList = {};
    }

    addVertex(vertex) {
        this.adjacencyList[vertex] = [];
    }

    addEdge(vertex1, vertex2) {
        this.adjacencyList[vertex2].push(vertex1);
        this.adjacencyList[vertex1].push(vertex2);
    }

    removeEdge(vertex1, vertex2) {
        this.adjacencyList[vertex2] = this.adjacencyList[vertex2].filter(
            (v) => v !== vertex1);
        this.adjacencyList[vertex1] = this.adjacencyList[vertex1].filter(
            (v) => v !== vertex2);
    }

    removeVertex(vertex) {
        while (this.adjacencyList[vertex].length) {
            const adjacentVertex = this.adjacencyList[vertex].pop();
            this.removeEdge(vertex, adjacentVertex);
          }
        delete this.adjacencyList[vertex];
    }


}

// Example Adjacency List
// {
//   'A': ['B', 'C'],
//   'B': ['A', 'D'],
//   'C': ['A', 'D'],
//   'D': ['B', 'C']
// };

module.exports = Graph;
