/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalarguraprofundidade;
import buscalarguraprofundidade.Grafos;
/**
 *
 * @author Matheus
 */
public class BuscaLargura {
    private Lista [] p;
    private Lista [] v;
    private FilaDinamica fila = new FilaDinamica();
    
    
    
    
    BuscaLargura(){
        this.p = new Lista[Integer.MAX_VALUE];
        for(int i=0; i<p.length;i++){
            p[i] = new Lista();
        }
        
        this.v = new Lista[Integer.MAX_VALUE];
        for(int i=0; i<v.length;i++){
            v[i] = new Lista();
        }
    }
    
    public void buscar(int vertice){
        fila.Push(vertice);
        while (fila.Vazia() == false){
            fila.Pop();
            v[0].inserir(vertice);
            
            
        }
    }
    
    
}
