import java.util.ArrayList;
import java.util.HashMap;

public class DisjointSet {

    ArrayList<Node> nodes;

    public DisjointSet(ArrayList<Node> nodes){
        this.nodes = nodes;

        for (Node n: nodes){
            n.parent = n;
        }

    }

    public Node find(Node n){
        if (n.parent == n){
            return n;
        }
        return find(n.parent);
    }

    public void union(Node n1, Node n2){
        n1.parent = n2;
        nodes.remove(n1);
    }

}
