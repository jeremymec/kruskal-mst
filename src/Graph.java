import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    ArrayList<Edge> edges;

    public Graph(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

}

class Edge {

    int weight;
    Node n1;
    Node n2;

    public Edge(int weight, Node n1, Node n2){
        this.weight = weight;
        this.n1 = n1;
        this.n2 = n2;
    }

}

class Node {

    char value;

    public Node(char value){
        this.value = value;
    }

}