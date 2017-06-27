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

    }

    public void kruskal(Graph g){

        ArrayList<Edge> mst = new ArrayList<>();

        ArrayList<Edge> edges = g.getEdges();
        Collections.sort(edges);


    }
}
