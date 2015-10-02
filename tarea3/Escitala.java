package tarea3; 
 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
public class Escitala { 
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     
    //Numero de caras de la escilata 
    private static int n = 0; 
    private static int alto = 0; 
     
    public static void main(String[] args){ 
        System.out.println("Introduce el texto a codificar."); 
        try { 
            String entrada = br.readLine(); 
            System.out.println("Texto introducido: "+entrada); 
            System.out.println("Introduce el numero de caras de la escilara. (Numero entero)"); 
            n = Integer.parseInt(br.readLine()); 
            System.out.println("Caras de la Escilata: "+n); 
            calculaAlto(entrada,n); 
            String entradacodificada = codEscilataEspartana(entrada); 
            System.out.println("Texto codificado: "+entradacodificada); 
            System.out.println("Texto descodificado: "+descoEscilataEspartana(entradacodificada)); 
        } catch (IOException e) { 
            System.out.println("No has introducido un numero valido"); 
        } 
    } 
     
    private static void calculaAlto(String texto, int caras){ 
        if(texto.length()%caras == 0) 
            alto = texto.length()/caras; 
        else 
            alto = (texto.length()/caras)+1; 
    } 
     
    private static String codEscilataEspartana(String entrada){ 
         
        char[][] arrayCod = new char[n][alto]; 
         
        //Rellena el array que codifica 
        int cont = 0; 
        for(int i = 0;i<alto;i++){ 
            for(int j = 0;j< n;j++,cont++){ 
                if(cont >= entrada.length()) 
                    arrayCod[j][i] = ' '; 
                else 
                    arrayCod[j][i] = entrada.charAt(cont); 
            } 
        } 
         
        //Lee el array codificado para devolverlo como String 
        String salida = ""; 
        for(int i = 0;i<n;i++){ 
            for(int j = 0;j< alto;j++){ 
                salida += arrayCod[i][j]; 
            } 
        } 
    return salida; 
    } 
     
    private static String descoEscilataEspartana(String entrada){ 
        char[][] arrayDesc = new char[alto][n]; 
        int cont = 0; 
        //Rellena el array que descodifica 
        for(int i = 0;i< n;i++) 
            for(int j = 0;j< alto;j++,cont++){ 
                arrayDesc[j][i] = entrada.charAt(cont); 
            } 
         
        //Lee el array descodificado 
        String salida = ""; 
        for(int i = 0;i<alto;i++) 
            for(int j = 0;j< n;j++){ 
                salida += arrayDesc[i][j]; 
            } 
         
        return salida; 
    } 
}