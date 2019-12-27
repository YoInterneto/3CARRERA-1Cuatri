/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1.pdl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alberto
 */
public class MaquinaEstados {
    
    private AutomataFinitoD automata;
    private Integer estadoInicial;
    
    private HashMap <Integer, HashMap<Character, Integer>> matrizEstados = new HashMap<>();
    
    private ArrayList <Character> cadena = new ArrayList<>();
    private ArrayList <ArrayList <Character>> lista = new ArrayList<>();
    private ArrayList <Character> alfabeto = new ArrayList<>();
    
    public MaquinaEstados(AutomataFinitoD a) throws IOException{
        
        this.automata = new AutomataFinitoD();
        
        this.automata = a;
        this.estadoInicial = automata.getEstadoInicial();
        this.matrizEstados = automata.getMatrizEstados();
        
        matrizEstados.get(0).keySet().forEach((key) -> {
            alfabeto.add(key);
        });
    }
    
    public void aceptar(Character caracter) throws Exception{
        
        Integer estadoTmp = automata.siguienteEstado(estadoInicial, caracter);
        
        if(estadoTmp!=-1){
            estadoInicial = estadoTmp;
        }else{
            throw new Exception();
        }
    }
    
    public boolean esFinal(){
        return automata.esFinal(estadoInicial);
    }
    
    public boolean cadenaCorrecta(String cadena){
        
        boolean correcta = true;
        
        for(int i=0; i<cadena.length(); i++){
            if(!automata.getAlfabeto().contains(cadena.charAt(i))){
                correcta = false;
            }
        }
        return correcta;
    }
    
    public boolean comprobarCadena(String cadena){
        
        if(cadenaCorrecta(cadena)){
            try{
                this.estadoInicial = automata.getEstadoInicial();
                if(esFinal() && cadena.length() == 0){
                    return true;
                }else{
                    for(int i=0; i<cadena.length(); i++){
                        this.aceptar((Character)cadena.charAt(i));
                        if((esFinal())&&(i==cadena.length()-1)){
                            return true;
                        }
                    }
                }
                
            }catch(Exception e){
                
            }
        }else{
            return false;
        }
        
        return false;
    }
    
    
    public void caracterRandom(Character caracter){
        
        Integer temporal = automata.siguienteEstado(estadoInicial, caracter);
        Integer numero = (Integer) ((int)(Math.random() * alfabeto.size()));
        
        //Si no es null el siguiente estado mete la letra en la cadena
        if(temporal !=-1){
            estadoInicial = temporal;
            cadena.add(caracter);
            
        //Si es null el siguiente estado y ademas no es final prueba con
        //otra letra, es decir, otro camino
        }else{
            caracter = alfabeto.get(numero);
            if(!this.esFinal()){
                caracterRandom(caracter);
            }
        }
    }
    
    public void generarCadena(int longitud){
        
        int posicion = (int)(Math.random() * alfabeto.size());
        Character caracter = alfabeto.get(posicion);
        
        //Genera cadenas de x longitud las cuales se iran generando mediante
        //mediante caracteres random
        for(int i=0; i<longitud; i++){
            try{
                this.caracterRandom(caracter);
                caracter = (alfabeto.get((int) (Math.random() * alfabeto.size())));
            }catch(Exception e){
                
            }
        }
    }
    
    public void generarListaCadenas(int numero, int longitud){
        
        ArrayList<Character> cadenaAux = new ArrayList<>();
        
        for(int i=0; i<numero; i++){
            
            this.generarCadena(longitud);
            
            cadenaAux = (ArrayList<Character>) cadena.clone();
            estadoInicial = 0;
            
            //Si la lista no tiene la nueva cadena generada la inserta
            if(!lista.contains(cadenaAux)){
                String cadenaC = "";
                
                //Comprobamos que la cadena generada sea correcta
                for(int j=0; j<cadenaAux.size(); j++){
                    cadenaC += cadenaAux.get(j);
                }
                
                if(comprobarCadena(cadenaC)){
                    lista.add(cadenaAux);
                }
            }
            
            cadena.clear();
        }
    }
    
    public void imprimirCadenas(int cantidad){
        
        int iteracion;
        
        if(lista.size()<cantidad){
            iteracion = lista.size();
        }else{
            iteracion = cantidad;
        }
        
        automata.escribir("CADENAS GENERADAS");
        for(int i=0; i<iteracion; i++){
            String cadenaPrint = "";
            ArrayList<Character> a = lista.get(i);
            for(int j=0; j<a.size(); j++){
                cadenaPrint += a.get(j);
            }
            
            System.out.println("Cadena "+(i+1)+" -> "+cadenaPrint);
            automata.escribir("Cadena "+(i+1)+" -> "+cadenaPrint);
        }
    }
    
    
}
