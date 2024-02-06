from queue import LifoQueue, Queue


class GraphTraversals:
    def __init__(self, graph, starting_vertex):
        self.graph = graph
        self.starting_vertex = starting_vertex

    def get_depth_first(self):
        vertices_in_graph = []
        if self.starting_vertex is None:
            return vertices_in_graph
        stack = LifoQueue(maxsize=20)
        stack.put(self.starting_vertex)
        while not stack.empty():
            current_vertex = stack.get()
            if current_vertex not in vertices_in_graph:
                vertices_in_graph.append(current_vertex)
            for adjacent_vertex in self.graph.adjacencyListDict[current_vertex]:
                if adjacent_vertex not in vertices_in_graph:
                    stack.put(adjacent_vertex)
        return vertices_in_graph

    def get_breadth_first(self):
        vertices_in_graph = set()
        if self.starting_vertex is None:
            return list(vertices_in_graph)
        queue = Queue(20)
        queue.put(self.starting_vertex)
        while not queue.empty():
            current_vertex = queue.get()
            vertices_in_graph.add(current_vertex)
            for adjacent_vertex in self.graph.adjacencyListDict[current_vertex]:
                if adjacent_vertex not in vertices_in_graph:
                    queue.put(adjacent_vertex)
        return list(vertices_in_graph)
