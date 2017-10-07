package graph;

import java.util.ArrayList;

class Vertex{
    ArrayList<Integer> Edges;
}

/**
 * Implementacao de um grafo usando lista de adjacencia
 * @author Alexandre Velloso
 */
public class AdjacentList extends Graph{
    
    private Vertex [] graph;
    
    public AdjacentList( int numVertices ){
        
        graph = new Vertex[ numVertices ];
    }

    @Override
    public void addVertex() {
        
    }

    @Override
    public void addEdge() {
        
    }

    @Override
    public void getDegree() {
        
    }

    @Override
    public void removeEdge() {
        
    }

    @Override
    public void removeVertex() {
        
    }
}
