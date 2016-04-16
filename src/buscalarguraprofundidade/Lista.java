/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalarguraprofundidade;

import java.util.ArrayList;

/**
 *
 * @author victor.rolival
 */
public class Lista {
    
    ArrayList<Integer> dados = new  ArrayList<Integer>();
    
    public void inserir(int valor){
        dados.add(new Integer (valor));
    }
    public void remover(int ind){
        dados.remove(ind);
    }
    public int get(int ind){
        return dados.get(ind);
    }
    public int tamanho (int tamanho){
        return dados.size();
    }
    
}
