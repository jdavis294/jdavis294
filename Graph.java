import java.util.LinkedList;
public class Graph {
     static int numVertices;
    static LinkedList<Integer>[] adjacencyList;

    Graph(int n) {

        numVertices = n;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++)

            adjacencyList[i] = new LinkedList<Integer>();

    }

    void addEdge(Integer src, Integer des) {

        this.adjacencyList[src].add(des);
    }

    void printGraph() {

        for (int i = 0; i < this.numVertices; i++) {
            //System.out.println("Adjacency list of vertex : " + i);
            System.out.print("" + i + " : ");
            int j = 0;

            for (; j < this.adjacencyList[i].size() - 1; j++) {

                System.out.print(this.adjacencyList[i].get(j));

                System.out.print(" --> ");
            }

            if (j == adjacencyList[i].size() - 1)

                System.out.println(this.adjacencyList[i].get(j));
            else System.out.println();

        }

    }

    public static Integer[][] generateAdjMatrix() {

        Integer[][] adjacencyMatrix=null;

        adjacencyMatrix = new Integer[numVertices][numVertices];
        for(int i=0; i<adjacencyMatrix.length; i++){

            for(int j=0;j<adjacencyMatrix[i].length; j++){

                adjacencyMatrix[i][j] = 0;
            }

        }
        for(int i=0; i<numVertices; i++){

            for(int j=0;j<adjacencyList[i].size(); j++){

                adjacencyMatrix[i][adjacencyList[i].get(j)] = 1;

            }

        }

        return adjacencyMatrix;


    }
    public static void printMatrix(Integer[][] adjMatrix){

        for(int i=0; i<adjMatrix.length; i++){
            for(int j=0;j<adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Create a graph of 5 vertices
        Graph g2 = new Graph(5);
        g2.addEdge(0, 1);
        g2.addEdge(0, 4);
        g2.addEdge(0, 3);
        g2.addEdge(2, 0);
        g2.addEdge(3, 2);
        g2.addEdge(4, 3);
        g2.addEdge(4, 1);
        g2.printGraph();



        Integer[][] adjMatrix = generateAdjMatrix();

        printMatrix(adjMatrix);

/* Should print the following Matrix
01011
00000
10000
00100
01010
*/

    }

}

