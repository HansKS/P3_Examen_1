/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;

/**
 *
 * @author ADMIN
 */
public class Valor {
    
    private ArrayList<Integer> Valor; 

    public ArrayList getValor() {
        return Valor;
    }

    public void setValor(ArrayList Valor) {
        this.Valor = Valor;
    }
    
        public static boolean esNumero (String valor){
        try{
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e){
        return false;
        }
    }
        
       public static void CargarLista(FrmLista Formulario, ArrayList L) {
        DefaultListModel modelo = new DefaultListModel();
        for(int i=0;i<L.size();i++){
        modelo.addElement(L.get(i));
        }
        Formulario.Lista.setModel(modelo);  
    }
       
       public static void intercambio (int p1, int p2, ArrayList L){
           p1=p1-1;
           p2=p2-1;
           int num1,num2;
           num1 = (Integer) L.get(p1);
           num2 = (Integer) L.get(p2);
           
           L.set(p1,num2);
           L.set(p2,num1);
       }
       
       public static int apariciones (int num, ArrayList L){
           int contador=0;
           for(int i=0;i<L.size();i++){
           if(num==(Integer)L.get(i)){
               contador++;
           }
           }
           return contador; 
       }
       
       public static void elimRepetidos (ArrayList L){
           
           Set<ArrayList> hashSet = new HashSet<>(L);
           L.clear();
           L.addAll(hashSet);
        
       }


    
}
