import java.io.*;
import java.util.ArrayList;

public class CrearHTML
{

    
    public void crear(int tot,int cantidad, ArrayList<String> datos){

        String ruta = "./";
        File archivo = new File(ruta);
        BufferedWriter bw;
        String titulo ="<div><head>"+"<title>Practica 3 procesadores</title></head><body><h1> Practica 3 </h1>";
        
        try{
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(titulo);
            bw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i<cantidad; i++){
            
            String cad = "";
            char c = 64;
            int v = Integer.parseInt(datos.get(5+8*i));
            for (int k = 0; k<v; k++){
                c ++;
                cad = cad.concat(Character.toString(c)).concat(","); 

            }
            String html = "<hr> <h2> "+ datos.get(8*i) +"("+ cad +"): "+ datos.get(1+8*i)+"</h2>"+
            "<p>Resultados de la funcion.<br>Veamos que opodemos escribir aqui "+
            "</p><p> <strong><ul> <li>Complejidad ciclomatica V(G): 8 </li>"+
                "<li>Puntos funcion: "+datos.get(2+8*i) +" </li>"+
                "<li>Resumen: <ul>"+
                    "<li>Variables declaradas:  " + datos.get(3+8*i) +  " </li>"+
                    "<li>Lineas de codigo efectivas: ASD </li>"+
                    "<li>Número de parametros esperados: " + datos.get(5+8*i)+ " </li>"+
                    "<li>Número de llamadas a funciones: "+datos.get(6+8*i)+" </li></ul>"+
                "</li><li>Grafico de complejidad ciclomatica:</li></ul></strong>"+
            "<br><img src=gay.png width=400 height=341 title=Un pato gay.> </p>"+
            "<br> <h2> Invocacion </h2><p> "+
            "<ul><li>Java analizador fichero.prog nombrefuncion nombrefuicheroinforme </li>"+
            "</ul> </p></body></div>";

            try{
                bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile(),true));
                
                bw.write(html);
                bw.close();
                
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
        
    }

}
    
