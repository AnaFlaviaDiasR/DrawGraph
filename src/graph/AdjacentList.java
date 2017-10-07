package graph;

import java.util.ArrayList;

class Vertex{
    ArrayList<Integer> Edges;
}

/**
 * Implementacao de um grafo usando lista de adjacencia
 * @author Alexandre Velloso
 */
public class AdjacentList implements Graph{
    
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
}
