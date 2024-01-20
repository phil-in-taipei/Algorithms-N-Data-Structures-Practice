const Stack = require('./stack');

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

module.exports = depthFirstTraversal;
