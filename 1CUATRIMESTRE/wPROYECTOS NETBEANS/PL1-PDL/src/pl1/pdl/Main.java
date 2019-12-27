/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1.pdl;

import java.io.IOException;

/**
 *
 * @author Alberto
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Integer estados = 5; //Cambiar
        Integer inicial = 0; //Cambiar
        Integer finales[] = {3,4,5}; //Cambiar
        
        String cadena[] = {"b","ab","aba","aaaaabcaa","caa"}; //Cambiar
        
        int cuantasCadenas = 2000; //Cambiar
        int longitudCadena = 15; //Cambiar
        int iteraciones = 2000; //Cambiar
        
        
        AutomataFinitoD automata = new AutomataFinitoD();
        automata.cargarAlfabeto();
        automata.cargarEstados(estados);
        automata.establecerQi(inicial);
        automata.establecerQf(finales);
        automata.inicializarMatriz(estados);
        automata.cargarMatriz();
        automata.imprimir();
        
        MaquinaEstados maquina = new MaquinaEstados(automata);
        automata.escribir("COMPROBACION CADENAS");
        for(String cadena1 : cadena){
            System.out.println("Cadena ("+cadena1+")" + " -> " + maquina.comprobarCadena(cadena1));
            automata.escribir("Cadena ("+cadena1+")" + " -> " + maquina.comprobarCadena(cadena1));
        }
        automata.escribir("  ");
        maquina.generarListaCadenas(iteraciones, longitudCadena);
        maquina.imprimirCadenas(cuantasCadenas);
        
        automata.getFw().close();
    }
    
}
