import java.util.*;

public class Graph_AdjList {
    
    /*
     * in this representation, we have a linkedlist where each element is a linkedlist of the node [index]
     */
    int vertex;
    LinkedList<Integer>list[];
    Queue<Integer> queue;

    /*
     * the constructor to initialize the object
     */
    Graph_AdjList(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];

        for(int i = 0;i < vertex;i++){
            list[i] = new LinkedList<Integer>();
        }
        queue = new LinkedList<Integer>();
    }

    /*
     * adding an edge to the graph
     */
    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        //list[source].add(destination);
    }

    /*
     * in BFS we use a Queue data structure which is an example of the First In, First Out
     */
    public void bfs(int n){
        boolean nodes[] = new boolean[vertex]; //creating an array showing which nodes are visited
        int a = 0; //initialising the integer a which will be used later
        nodes[n] = true; //we start with node N, so we mark it as true
        queue.add(n); //we add this node to the queue

        while(queue.size()>0){
            n = queue.poll(); // remove the top element of the queue
            System.out.print(n+" ");

            for(int i = 0;i < list[n].size();i++){
                //going through the adjacency list -- list[n] -- which has all the neighbors of node N
                a = list[n].get(i); //taking each neighbor of node N --say node A
                if(!nodes[a]){
                    //while node A is not yet visited
                    queue.add(a);
                    nodes[a] = true;
                }
            }
        }
    }

    /*
     * to implement dfs, we actually use a stack DS
     */
    public void dfs(int vertex){
        boolean nodes[] = new boolean[vertex];//array indicated which nodes are visited
        System.out.print(vertex+" ");

        Iterator<Integer> it = list[vertex].listIterator(); //taking the list of neighbors
        while(it.hasNext()){
            //while going through each neighbor, call dfs on that neighbor
            int n = it.next();
            if(!nodes[n]){
                dfs(n);
            }
        }
    }
    /*
     * method to show which vertices are connected
     */
    public void printGraph(){
        for(int i  = 0;i < vertex;i++){
            //if the adjacent list at index i is not empty, its size > 0
            if(list[i].size()>0){
                System.out.print("Vertex "+i+" is connected to: ");
                //printing the neighbors of vertex i
                for(int j = 0;j < list[i].size();j++){
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] aStrings){
        Graph_AdjList obj = new Graph_AdjList(4);
        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(3, 0);
        obj.addEdge(0, 3);

        obj.printGraph();
    }
}
