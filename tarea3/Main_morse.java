/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Mark
 */
public class Main_morse {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         File file;
    BufferedReader buferRead;
    
    try {
    String linea ="", path ="";
    int contAux = 0;
    int columna = 0, fila = 0;
        
            String cad="";
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la Ruta");
        path= leer.nextLine();
    
    
        file = new File(path);
        
            buferRead = new BufferedReader(new FileReader(file));//leemos el archivo donde esta el arreglo
            while ((linea = buferRead.readLine()) != null) {//leemos cada linea del archivo
                
                cad=linea+cad;
                contAux++;
                
            }//end of while
            fila = contAux;

            contAux = 0;
            buferRead = new BufferedReader(new FileReader(file));
            while ((linea = buferRead.readLine()) != null) {
                
            }//end of while

     
        StringTokenizer tokens = new StringTokenizer(cad);
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }

        System.out.println("\n\n");
        String [ ] palabra = cad.split("\\ ");
        int j=0;
        while(j <= palabra.length-1){
          
               if (palabra[j].equals(".-"))
            {
                 System.out.print("A");

               } else if (palabra[j].equals("-..."))
            {
             System.out.print("B");
            }else if (palabra[j].equals("-.-."))
            {
            System.out.print("C");
            }
            else if (palabra[j].equals("-.."))
            {
            System.out.print("D");
            }
            else if (palabra[j].equals("."))
            {
            System.out.print("E");
            }
               else if (palabra[j].equals("..-."))
            {
            System.out.print("F");
            }
               else if (palabra[j].equals("--."))
            {
            System.out.print("G");
            }
               else if (palabra[j].equals("..."))
            {
            System.out.print("H");
            }
               else if (palabra[j].equals(".."))
            {
            System.out.print("I");
            }
               else if (palabra[j].equals(".---"))
            {
            System.out.print("J");
            }
               else if (palabra[j].equals("-.-"))
            {
            System.out.print("K");
            }
               else if (palabra[j].equals(".-.."))
            {
            System.out.print("L");
            }
               else if (palabra[j].equals("--"))
            {
            System.out.print("M");
            }
               else if (palabra[j].equals("-."))
            {
            System.out.print("N");
            }
               else if (palabra[j].equals("---"))
            {
            System.out.print("O");
            }
               else if (palabra[j].equals(".--."))
            {
            System.out.print("P");
            }
               else if (palabra[j].equals("--.-"))
            {
            System.out.print("Q");
            }
               else if (palabra[j].equals(".-."))
            {
            System.out.print("R");
            }
               else if (palabra[j].equals("..."))
            {
            System.out.print("S");
            }
               else if (palabra[j].equals("-"))
            {
            System.out.print("T");
            }
               else if (palabra[j].equals("..-"))
            {
            System.out.print("U");
            }
               else if (palabra[j].equals("...-"))
            {
            System.out.print("V");
            }
               else if (palabra[j].equals(".--"))
            {
            System.out.print("W");
            }
               else if (palabra[j].equals("-..-"))
            {
            System.out.print("X");
            }
               else if (palabra[j].equals("-.--"))
            {
            System.out.print("Y");
            }
               else if (palabra[j].equals("--.."))
            {
            System.out.print("Z");
            }

             j++;
        }
      } catch (Exception e) {
        }//final del catch
        

    }

}
