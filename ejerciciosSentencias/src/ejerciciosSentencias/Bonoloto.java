package ejerciciosSentencias;

import java.util.Random;
import java.util.Scanner;

public class Bonoloto{
    Scanner teclado = new Scanner(System.in);
    Random rnd = new Random();
    boolean compararListas(int boleto[],int ganadores[]){
        int kop=0,coinciden[] = new int[ganadores.length];
        for (int i= 0; i < boleto.length;i++){
            for (int j = 0; j < ganadores.length;j++){
                if(boleto[i]==ganadores[j]){
                    coinciden[  kop++]=boleto[i];
                    break;
                }
            }
        }
        if(kop>0){
             System.out.print("Has acertado "+kop+" números : ");
             for (int i =0 ;i<kop;i++){
                  System.out.print(coinciden[i]+" ");
             
             }
             return true;
        }else{
        	System.out.println("Prueba Otra vez!!");
        	System.out.println();
        	return false;
        }
    }
    void leerNumeros(int lista[]){
        int valor,kop=0;
        boolean salir = false;
        System.out.println("Escribe "+lista.length+" numeros para jugar a la Bonoloto!");
        do{
             System.out.print(": ");
            valor = teclado.nextInt();
            if(valor>=0 && valor<100){
                lista[kop++]=valor;
                if (kop>=lista.length)
                    salir = true;
            }
            else{
                System.out.println("El numero "+valor+" no esta entre los valor [ 0 - 99 ] escriba un numero valido");
            }
            
        }while (!salir);
    }
    void numerosGanadores(int lista []){
        int valor;
        for (int i=0;i<lista.length;i++){
            valor = (int)(rnd.nextDouble() * 100 + 0);
            lista[i]=valor;
        }
    }
    void miMain(){
        int lista[] = new int[6];
        int ganadores[] = new int [6];
       
        numerosGanadores(ganadores);
        do{
        	 leerNumeros(lista);
        }while(!compararListas(lista,ganadores));
        
        
    }
    public static void main(String[] args){
        Bonoloto programa = new Bonoloto();
        programa.miMain();
    }
    
}