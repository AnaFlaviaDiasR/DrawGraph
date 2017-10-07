/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 * Implementacao de um grafo usando matriz de adjacencia
 * @author Alexandre Velloso
 */
public class AdjacentMatrix extends Graph{
    
    int [] graph;
    
    public AdjacentMatrix( int numVertex ){
        
        graph = new int[ numVertex*numVertex ];
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
