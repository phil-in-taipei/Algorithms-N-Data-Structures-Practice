
class Graph:

    def __init__(self):
        self.adjacencyListDict = {}

    def add_vertex(self, vertex):
        self.adjacencyListDict[vertex] = []

    def add_edge(self, vertex1, vertex2):
        self.adjacencyListDict[vertex1].append(vertex2)
        self.adjacencyListDict[vertex2].append(vertex1)

    def remove_edge(self, vertex1, vertex2):
        self.adjacencyListDict[vertex1] = filter(
            lambda item: item != vertex2, self.adjacencyListDict[vertex1]
        )
        self.adjacencyListDict[vertex2] = filter(
            lambda item: item != vertex1, self.adjacencyListDict[vertex2]
        )

    def remove_vertex(self, vertex):
        while len(self.adjacencyListDict[vertex]) > 0:
            adjacent_vertex = self.adjacencyListDict[vertex].pop()
            self.adjacencyListDict[adjacent_vertex] = filter(
                lambda item: item != vertex, self.adjacencyListDict[adjacent_vertex]
            )
        del self.adjacencyListDict[vertex]

