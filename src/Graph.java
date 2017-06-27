import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    ArrayList<Edge> edges;

    public Graph(){
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void createNode(char value){
        nodes.add(new Node(value));
    }

    public void createEdge(int weight, Node n1, Node n2){
        edges.add(new Edge(weight, n1, n2));
    }

    public Node getNode(char value){
        Node target = null;

        for (Node n : nodes){
            if (n.value == value){
                target = n;
            }
        }

        return target;
    }

    public ArrayList<Edge> getEdges(){
        return edges;
    }

}

class Edge implements Comparable<Edge>{

    int weight;
    Node n1;
    Node n2;

    Edge(int weight, Node n1, Node n2){
        this.weight = weight;
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

class Node {

    char value;

    Node(char value){
        this.value = value;
    }

}