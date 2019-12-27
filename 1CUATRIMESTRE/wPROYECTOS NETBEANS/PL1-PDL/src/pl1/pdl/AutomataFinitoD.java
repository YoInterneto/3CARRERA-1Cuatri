/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1.pdl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alberto
 */
public class AutomataFinitoD {
    
    private ArrayList<Character> alfabeto;
    private ArrayList<Integer> estados;
    private ArrayList<Integer> estadosF;
    
    private HashMap<Integer,HashMap<Character,Integer>> matriz;
    
    private Integer estadoI;
    
    private String ruta;
    
    private FileWriter fw;

    public AutomataFinitoD() throws IOException{
        
        this.ruta = "./aaSOLUCION.txt";
        
        this.fw = new FileWriter(ruta);
        
        this.alfabeto = new ArrayList<>();
        this.estados = new ArrayList<>();
        this.estadosF = new ArrayList<>();
        
        this.matriz = new HashMap<>();
    }
    
    public void cargarAlfabeto() {
        for(int i = 0; i < 26; i++){
            alfabeto.add((Character)(char)((int)'a' + i));
        }
        
        for(int i = 0; i < 10; i++){
            alfabeto.add((Character)(char)((int)'0' + i));
        }
        
        alfabeto.add((Character)(char)((int)32));
        
        System.out.println("ALFABETO -> "+alfabeto.toString());

    }
    
    public void cargarEstados(Integer numero) {
        for(int i = 0; i <= numero; i++){
            estados.add(i);
        }
        System.out.println("ESTADOS -> "+estados.toString());
    }
    
    public void establecerQf(Integer finales[]) {
        for(int i = 0; i < finales.length; i++){
            estadosF.add(finales[i]);
        }
        System.out.println("FINALES -> "+estadosF.toString());
    }
    
    public void establecerQi(Integer inicial) {
        estadoI = inicial;
        System.out.println("INCIAL -> "+estadoI);
    }
    
    public void inicializarMatriz(Integer numEstados) {
        for(int i=0;i<=numEstados;i++){
            matriz.put(i, new HashMap<>());
        }
    }
    
    public void cargarMatriz(){
        
        this.matriz.get(0).put('a',2);	this.matriz.get(0).put('b',3);	this.matriz.get(0).put('c',1);
        this.matriz.get(1).put('a',4);	this.matriz.get(1).put('b',-1);	this.matriz.get(1).put('c',-1);
        this.matriz.get(2).put('a',2);	this.matriz.get(2).put('b',3);	this.matriz.get(2).put('c',-1);
        this.matriz.get(3).put('a',-1);	this.matriz.get(3).put('b',-1);	this.matriz.get(3).put('c',-1);
        this.matriz.get(4).put('a',5);	this.matriz.get(4).put('b',-1);	this.matriz.get(4).put('c',-1);
        this.matriz.get(5).put('a',5);	this.matriz.get(5).put('b',-1);	this.matriz.get(5).put('c',-1);

    }
    
    public Integer siguienteEstado(Integer estado, Character caracter) {
        return matriz.get(estado).get(caracter);
    }
    
    public Boolean esFinal(Integer estado) {
        return estadosF.contains(estado);
    }
    
    public void imprimir(){
        escribir("MATRIZ");
        for(int i=0; i<estados.size(); i++){
            System.out.println(matriz.get(i).toString());
            escribir(matriz.get(i).toString());
            
        }
        escribir("  ");
    }
    
    public void escribir(String cadena){
        try{
            fw.write(cadena+"\n");
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    
    //TODOS LOS METODOS GETTERS NECESARIOS PARA LA CORRECTA EJECUCIÓN DEL 
    //PROGRAMA
    public ArrayList<Character> getAlfabeto() {
        return alfabeto;
    }

    public ArrayList<Integer> getEstados() {
        return estados;
    }

    public HashMap<Integer, HashMap<Character, Integer>> getMatrizEstados() {
        return matriz;
    }

    public Integer getEstadoInicial() {
        return estadoI;
    }

    public FileWriter getFw() {
        return fw;
    }
    
}
