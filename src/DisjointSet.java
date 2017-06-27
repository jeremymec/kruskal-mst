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
        if (n.parent.equals(n)){
            return n;
        }
        return find(n.parent);
    }

    public void union(Node n1, Node n2){
        Node n1Root = find(n1);
        Node n2Root = find(n2);

        if (n1Root.equals(n2Root)){
            return;
        }

        n1Root.parent = n2Root;
        nodes.remove(n1);
    }

}
