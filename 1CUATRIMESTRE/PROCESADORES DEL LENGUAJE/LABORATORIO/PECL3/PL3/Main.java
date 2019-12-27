import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.bind.Marshaller.Listener;


public class Main{

    public static void main(String[] args) throws Exception{

        String inputFile = null;
        if(args.length>0) inputFile = args[0];
        InputStream is = System.in;
        if(inputFile != null)
        {
            is = new FileInputStream(inputFile);   
        }

        CharStream input = CharStreams.fromStream(is);
        GramaticaFibLexer lexer = new GramaticaFibLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticaFibParser parser = new GramaticaFibParser(tokens);

        parser.setBuildParseTree(true);
        ParseTree tree = parser.init();

        RecorrerArbol listener = new RecorrerArbol();

        ParseTreeWalker walker = new ParseTreeWalker();

        //Recorremos el arbol
        walker.walk(listener,tree);
       
        int cantidad = listener.getNumFunciones();
        ArrayList<String> a =listener.getDatos();

        CrearHTML p = new CrearHTML();
        
        p.crear(listener.getResultadoTotal(),cantidad,a);
        
    }
}
