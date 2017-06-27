import java.util.ArrayList;
import java.util.HashMap;

public class DisjointSet {

    // Pointer to the graph's nodes
    ArrayList<Node> nodes;

    /**
     * This is a helper class which allows a given ArrayList<Node> to be turned into a disjoint set
     * @param nodes The nodes which will make up the set
     */
    public DisjointSet(ArrayList<Node> nodes){
        this.nodes = nodes;

        // Iterates through nodes and makes every node it's own parent
        for (Node n: nodes){
            n.parent = n;
        }

    }

    public Node find(Node n){

        // If the node is it's own parent, the root has been found
        if (n.parent.equals(n)){
            return n;
        }

        // If not, recursively travel up the root
        return find(n.parent);
    }

    public void union(Node n1, Node n2){

        // Finds the two roots of the given nodes
        Node n1Root = find(n1);
        Node n2Root = find(n2);

        // If the roots are the same, do not merge
        if (n1Root.equals(n2Root)){
            return;
        }

        // Merge the roots together and remove the redundant node from the list
        n1Root.parent = n2Root;
        nodes.remove(n1);
    }

}
