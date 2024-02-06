import pprint
from adjacency_matrix_graph.graph import Graph
from adjacency_matrix_graph.traversals import GraphTraversals


if __name__ == '__main__':
    print('------------------------------------------------------------------------------------------------------------')
    print("Implementing new graph object")
    graph = Graph()
    graph.add_vertex("Taipei")
    graph.add_vertex("Tainan")
    graph.add_vertex("Kaohsiung")
    graph.add_edge("Taipei", "Tainan")
    graph.add_edge("Taipei", "Kaohsiung")
    graph.add_edge("Tainan", "Kaohsiung")
    print('------------------------------------------------------------------------------------------------------------')
    pprint.pprint(graph.adjacencyListDict)
    print('------------------------------------------------------------------------------------------------------------')
    print("Initializing traversal objects")
    traversal_object = GraphTraversals(graph, "Taipei")
    depth_traversal_results = traversal_object.get_depth_first()
    print('------------------------------------------------------------------------------------------------------------')
    print("******Depth first traversal*****")
    print(depth_traversal_results)
    print('------------------------------------------------------------------------------------------------------------')
    breadth_traversal_results = traversal_object.get_breadth_first()
    print("******Breadth first traversal*****")
    print(breadth_traversal_results)
    print('------------------------------------------------------------------------------------------------------------')




