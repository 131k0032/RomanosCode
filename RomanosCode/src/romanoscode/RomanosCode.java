
package romanoscode;

import java.util.Scanner;

/**
 *
 * @author Trainer
 */
public class RomanosCode {

    public static void main(String[] args) {
        
/*==========================================
=            De numero a romano            =
==========================================*/


    Scanner escriba=new Scanner(System.in);
    //Valores
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String Mil[]={"", "M", "MM","MMM"};
      //Rango
      System.out.println("Ingresa numero entre 1 y 1000");
      int numero = escriba.nextInt();
      //Modulos
      int u=numero%10;
      int d=(numero/10)%10;
      int c=(numero/100)%10;
      int m=numero/1000;
      
      //Verificar rango
      if(numero>=1 && numero<=1000){         
          System.out.println(Mil[m]+Centena[c]+Decena[d]+Unidad[u]);
      }else{
          System.out.println("Rango de 1 a 1000 permitidos");                             
      }  
        


/*=====  End of De numero a romano  ======*/

      
//     String cadena;   
//     Scanner entrada=new Scanner(System.in);
//                 
//        System.out.println("InumeroGRESE Unumero CÓDIGO ROMAnumeroO:");
//        cadena=entrada.nextLine();
//                      
//        String [ ] caracter = cadena.split("\\ ");
//        int i=0;
//        int I=1;
//        int V=5;
//        int X=10;
//        int L=50;
//        int C=100;
//        int D=500;
//        int M=1000;
//        while(i <= caracter.length-1){
//            
//            if (caracter[i].equals("I")){
//                 System.out.print(I);
//             }else if(caracter[i].equals("II")){
//                 System.out.print(I+I);
//             }else if(caracter[i].equals("III")){
//                 System.out.print(I+I+I);
//             }else if(caracter[i].equals("IIII")){
//                 System.out.print(I+I+I+I);
//             }else if(caracter[i].equals("IV")){
//                 System.out.print(V-I);
//             }else if(caracter[i].equals("V")){
//                 System.out.print(V);
//             }else if(caracter[i].equals("VI")){
//                 System.out.print(V+I);
//             } else if(caracter[i].equals("VII")){
//                 System.out.print(V+I+I);
//             } else if(caracter[i].equals("V")){
//                 System.out.print(V-I);
//             } 
//
//             i++;
//        }



/*==========================================
=            De romano a numero            =
==========================================*/
//Lectura de datos
Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese número romano: ");

        String texto = entrada.nextLine();

   //Array en romanos y valores respectivos
       int valores[] = {0,1,5,10,50,100,500,1000};            
       char romanos[]= {' ','I','V','X','L','C','D','M'}; 

       

        int anterior = 0;

        int suma = 0;

        char letra = ' ';
//Recorriendo el texto ingresado
        for(int i = 0; i < texto.length(); i++){

                letra = texto.charAt(i);
                //Recorriendo array de los núeros romanos
                for(int j = 0; j < romanos.length; j++){
                    
                    if(letra == romanos[j]){

                                suma = suma + valores [j]; 

                            if( anterior < valores[j]){ 

                                    suma = suma - anterior*2 ; 

                                    anterior = valores[j];

                            }else {

                        anterior = valores[j];

 }

                    }              

                }

        }

        System.out.print(suma);  

/*=====  End of De romano a numero  ======*/
  
      
       
    }
    
}
