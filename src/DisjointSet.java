import java.util.ArrayList;
import java.util.HashMap;

public class DisjointSet {

    HashMap<Node,  Node> parent;

    public DisjointSet(ArrayList<Node> nodes){
        parent = new HashMap<Node, Node>();

        for (Node n: nodes){
            parent.put(n, n);
        }

    }

    public Node find(Node n){
        if (parent.get(n) == n){
            return n;
        }
        return find(parent.get(n));
    }

    public void union(Node n1, Node n2){
        parent.put(n1, n2);
    }

}
