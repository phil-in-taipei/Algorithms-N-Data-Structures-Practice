const Stack = require('./stack');

// approach with just an array
/*
function depthFirstTraversal(graph, startingVertex) {
    if (!graph.adjacencyList[startingVertex]) {
        return [];
    }

    const stack = new Stack();
    const result = [];

    stack.push(startingVertex);


    while (!stack.isEmpty()) {
        const currentVertex = stack.pop();
        if (result.indexOf(currentVertex) === -1) {
            result.push(currentVertex);
        }
        graph.adjacencyList[currentVertex].forEach((neighbor) => {
            if (result.indexOf(neighbor) === -1) {
                stack.push(neighbor);
            }
        });
    }

    return result;

}
*/

// 2nd approach with Map of results
function depthFirstTraversal(graph, startingVertex) {
    if (!graph.adjacencyList[startingVertex]) {
        return [];
    }

    const stack = new Stack();
    const alreadyVistedVertices = new Map();

    stack.push(startingVertex);

    while (!stack.isEmpty()) {
        const currentVertex = stack.pop();
        alreadyVistedVertices.set(currentVertex, true);

        graph.adjacencyList[currentVertex].forEach((neighboringVertex) => {
            if (!alreadyVistedVertices.get(neighboringVertex)) { // could also use 'has'
                //get returns undefined if key is not in the map
                stack.push(neighboringVertex);
            }
        });
    }

    return Array.from(alreadyVistedVertices.keys());

}

module.exports = depthFirstTraversal;
