const Queue = require('./queue');

// first approach with a Map
/*
function breadthFirstTraversal(graph, startingVertex) {
    if (!graph.adjacencyList[startingVertex]) {
        return [];
    }

    const queue = new Queue();
    const alreadyVistedVertices = new Map();

    queue.enqueue(startingVertex);

    while(!queue.isEmpty()) {
        const currentVertex = queue.dequeue();
        alreadyVistedVertices.set(currentVertex, true);

        graph.adjacencyList[currentVertex].forEach((neighboringVertex) => {
            if (!alreadyVistedVertices.get(neighboringVertex)) { // could also use 'has'
                //get returns undefined if key is not in the map
                queue.enqueue(neighboringVertex);
            }
        });
    }
    return Array.from(alreadyVistedVertices.keys());
}
*/

// second approach with a Set
function breadthFirstTraversal(graph, startingVertex) {
    if (!graph.adjacencyList[startingVertex]) {
        return [];
    }

    const queue = new Queue();
    const alreadyVistedVertices = new Set();

    queue.enqueue(startingVertex);

    while(!queue.isEmpty()) {
        const currentVertex = queue.dequeue();
        alreadyVistedVertices.add(currentVertex);

        graph.adjacencyList[currentVertex].forEach((neighboringVertex) => {
            if (!alreadyVistedVertices.has(neighboringVertex)) {
                queue.enqueue(neighboringVertex);
            }
        });
    }
    return Array.from(alreadyVistedVertices);
}


module.exports = breadthFirstTraversal;
