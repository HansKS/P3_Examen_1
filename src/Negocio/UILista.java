/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Nodo;
import Interfaz.FrmLista;
import javax.swing.JOptionPane;

/**
 *
 * @author SRVAdmin
 */
public class UILista {
    private AdmLista adm;   
   

    public UILista() {
        adm = new AdmLista();
    }
    
    public void elimRepetidos () {
    adm.elimRepetidos();
    }
    
    
    
    public void cuantosRepetidos(FrmLista Formulario){
        int num=adm.cuantosRepetidos();
      JOptionPane.showMessageDialog(null,"Hay "+num+" elementos repetidos!");
    }
    
    public void intercambio (FrmLista Formulario) {
    int valor1=0, valor2=0;
    while(valor1==valor2){
    valor1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la primera posicion."));
    valor2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la segunda posicion."));
    if(valor1 == valor2){
    JOptionPane.showMessageDialog(null,"No se puede ingresar la misma posicion!","Error",JOptionPane.ERROR_MESSAGE);
    }
    }
    adm.intercambio(valor1, valor2);
    }
    
    public void agregar(FrmLista Formulario)
    {
        String Valor=Formulario.TxtValor.getText(); 
        boolean resultado=adm.agregar(Valor);
        
        if(resultado)
        {
            JOptionPane.showMessageDialog(null,"Agregado al inicio correctamente", "Info",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Error al agregar al inicio ", "Info",JOptionPane.ERROR_MESSAGE);

        }
    } 
    public void agregarfinal(FrmLista Formulario){
        String Valor=Formulario.TxtValor.getText(); 
        boolean resultado=adm.agregarfinal(Valor);
        
        if(resultado)
        {
            JOptionPane.showMessageDialog(null,"Agregado al final correctamente", "Info",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Error al final agregar", "Info",JOptionPane.ERROR_MESSAGE);

        }
        
    }
   
    
    public Nodo getLista()
    {
        return adm.getLista();
    
    }
    
    
    
}
