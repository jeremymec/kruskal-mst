import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        Graph g = new Graph();

        g.createNode('a');
        g.createNode('b');
        g.createNode('c');
        g.createNode('d');
        g.createNode('e');
        g.createNode('f');

        g.createEdge(4, g.getNode('f'), g.getNode('e'));
        g.createEdge(2, g.getNode('d'), g.getNode('e'));
        g.createEdge(3, g.getNode('d'), g.getNode('c'));
        g.createEdge(6, g.getNode('b'), g.getNode('c'));
        g.createEdge(1, g.getNode('c'), g.getNode('f'));
        g.createEdge(4, g.getNode('b'), g.getNode('a'));
        g.createEdge(5, g.getNode('f'), g.getNode('b'));
        g.createEdge(2, g.getNode('a'), g.getNode('f'));

        kruskal(g);

    }

    public static void kruskal(Graph g){

        ArrayList<Edge> mst = new ArrayList<>();

        ArrayList<Edge> edges = g.getEdges();
        Collections.sort(edges);

        DisjointSet ds = new DisjointSet(g.nodes);

        for (Edge e : edges){
            Node n1 = e.n1;
            Node n2 = e.n2;

            if (!(ds.find(n1).equals(ds.find(n2)))){
                mst.add(e);
                ds.union(n1, n2);
            }
        }

    }
}
