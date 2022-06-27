class Graph:
    def __init__(self,V): # Constructor
        self.V = V # No. of vertices
        self.adj = [[] for i in range(V + 1)] # adjacency lists
    def addEdge(self,v, w): # to add an edge to graph
        self.adj[v].append(w) # Add w to the list of v.
# Python program to print DFS traversal for complete graph
from collections import defaultdict

# This class represents a directed graph using adjacency
# list representation



# A function used by DFS
def DFSUtil(self, v, visited):

    # Mark the current node as visited and print it
    visited[v]= True
    print (v)

    # Recur for all the vertices adjacent to
    # this vertex
    for i in self.graph[v]:
        if visited[i] == False:
            self.DFSUtil(i, visited)


# The function to do DFS traversal. It uses
# recursive DFSUtil()
def DFS(self):
    V = len(self.graph) #total vertices

    # Mark all the vertices as not visited
    visited =[False]*(V)

    # Call the recursive helper function to print
    # DFS traversal starting from all vertices one
    # by one
    for i in range(V):
        if visited[i] == False:
            self.DFSUtil(i, visited)

def main():
    # Driver code
    # Create a graph given in the above diagram
    
    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 3)

    print
    "Following is Depth First Traversal"
    g.DFS()
if __name__ == '__main__':
    main()


# This code is contributed by Neelam Yadav
