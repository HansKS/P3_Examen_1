/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Nodo;

/**
 *
 * @author SRVAdmin
 */
public class AdmLista {
    private Lista lista;

    

    public AdmLista() {
        this.lista = new Lista();
    }
    
    public void intercambio (int pos1, int pos2){
    pos1 = pos1-1;
    pos2 = pos2-1;
    lista.intercambio(pos1, pos2); 
    }
    
    public int cuantosRepetidos(){
    int num = lista.cuantosRepetidos();
    return num;
    }
    
    public void elimRepetidos(){
    
    lista.elimRepetidos();
    }
    
    public boolean agregar(String valor)
    {
        int val=Integer.parseInt(valor);
        boolean resultado= lista.agregarAlInicio(val);     
        
        return resultado;
    }
    
    public boolean agregarfinal(String valor)
    {
        int val=Integer.parseInt(valor);
        boolean resultado= lista.agregarAlFinal(val);     
        
        return resultado;
    }
    public Nodo getLista()
    {
        return lista.getLista();
    }
    
    
}
