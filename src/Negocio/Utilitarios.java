/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Nodo;
import Interfaz.FrmLista;
import javax.swing.DefaultListModel;

/**
 *
 * @author Mario
 */
public class Utilitarios {
    
    public static void CargarLista(FrmLista Formulario,Nodo inicio) {
        DefaultListModel modelo = new DefaultListModel();
        
        
         // Verifica si la lista contiene elementoa.
        if (inicio != null) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                modelo.addElement(aux.getValor());
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        Formulario.Lista.setModel(modelo);       
               
        
    }
    
}
