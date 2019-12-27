import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import java.util.Stack;
import java.util.ArrayList;

public class RecorrerArbol extends GramaticaFibParserBaseListener {

    ArrayList<String> buffer  = new ArrayList<>();
    String path = "";
    
    int resultadoFuncion = 0;
    int resultadoTotal = 0;
    int llamada_funcion = 0;
    int parametro =0;
    int variable_declarada = 0;
    int bucle_bifurc = 0;
    int parametro_cab = 0;
    int numFunciones = 0;

    ArrayList<String> datos = new ArrayList<>();


    public ArrayList<String> getDatos(){
        return this.datos;
    }
    public int getResultadoTotal(){
        return this.resultadoTotal;
    }
    public int getNumFunciones(){
        return this.numFunciones;
    }
    
    @Override public void enterEveryRule(ParserRuleContext ctx) 
    {       
        String aux=GramaticaFibParser.ruleNames[ctx.getRuleIndex()].toString();
        buffer.add(aux);
        
        path = "";

        for(int i = 0; i < buffer.size();i++)
        {
            path = path.concat("/").concat(buffer.get(i)); 
           
        }

        if(aux.equals("llamada_funcion")){

            llamada_funcion++;
            resultadoFuncion+=2;  

        }
        else if(aux.equals("parametro")){
            parametro++;
            resultadoFuncion+=1;
        } 
        else if (aux.equals("funcion_sistema") || aux.equals("funcion_conif")){

            System.out.println(" Puntuacion = al cuadrado");

        }
        else if (aux.equals("parametro_cab")){
            parametro_cab++;
            parametro+=2;
            resultadoFuncion+=2;

        }
        else if(aux.equals("mul") | aux.equals("div") | aux.equals("suma") | aux.equals("resta")){
            resultadoFuncion+=1;
        }
        else if(aux.equals("variable_declaracion")){
            variable_declarada++;
            resultadoFuncion+=1;
        }
        if(aux.equals("funcion")){
            resultadoTotal +=resultadoFuncion;
            numFunciones++;
        }

        System.out.println(path);
     }
	
    @Override public void exitEveryRule(ParserRuleContext ctx) 
    {
        buffer.remove(buffer.size()-1);
        path = "";
        for(int i = 0; i<buffer.size()-1;i++)
        {
            path = path.concat("/").concat(buffer.get(i));
            
        }
        System.out.println("SAAAAALGOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
     }
	
    @Override 
    public void visitTerminal(TerminalNode node)
     {
        path =path.concat(":").concat(node.getSymbol().getText());
        if(path.contains("nombre_fun_pers")){
            datos.add(node.getSymbol().getText());

        }
        if (path.contains("tipo_fun")){
            datos.add(node.getSymbol().getText());
        }
        if(path.contains("funcion/cuerpo_funcion_pers/fin_cuerpo:end")){
            datos.add(Integer.toString(resultadoFuncion));
            datos.add(Integer.toString(variable_declarada));
            datos.add(Integer.toString(bucle_bifurc));
            datos.add(Integer.toString(parametro_cab));
            datos.add(Integer.toString(llamada_funcion));
            datos.add(Integer.toString(parametro));
            
            
            resultadoFuncion = 0;
            llamada_funcion = 0;
            parametro =0;
            variable_declarada = 0;
            bucle_bifurc = 0;
            parametro_cab = 0;
        }
        System.out.println(path);
      }
	
    @Override 
    public void visitErrorNode(ErrorNode node) {

            System.out.println("Error ");
     }
}
