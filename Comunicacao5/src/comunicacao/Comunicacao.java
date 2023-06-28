/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comunicacao;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Afonso
 */
public class Comunicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        String mensagem="11101";
       System.out.println("digite a mensagem a ser entregue: ");
        mensagem = sc.nextLine();
       // System.out.println(mensagem);
        
       
       
       
       
       
       /*  passando a mensagem para vetor de char*/
       char[] ch = new char[mensagem.length()];
        
        for (int i = 0; i < mensagem.length(); i++) {
            ch[i] = ch[i] = mensagem.charAt(i);
        }
        /* teste impressao do vetor de char 
        for (char c : ch) {
            System.out.println(c+" "+(int)c);
        }*/
        
        //inicializando vetor inteiro e vetor cript
        int vetorbinario[] = new int[mensagem.length() * 8];
       int vetorcp[] = new int[mensagem.length() * 8];
      
       
       //iniciando vetor binario com 0s 
       for (int i = 0; i < mensagem.length() * 8; i++) {
            vetorbinario[i] =0;
        }
   
       
       //algoritmo 
       int d;
       int indicador = 7;
       
       
       for(int j=0;j< mensagem.length();j++){
           
           d = (int)ch[j];
           
           
           while(d>=1){
            vetorbinario[indicador]= d%2;
           /* System.out.print("Valor d: "+d);
            System.out.print(" Valor resto: "+d%2);
            System.out.print(" indice do vetor: "+indicador);
            System.out.println();*/
            d=d/2;
            indicador = indicador - 1;
               
           }
           indicador = 7 + 8*(j+1);
       }
        
        //*impressao do vetor binario para conferir
        for (int i = 0; i < mensagem.length() * 8; i++) {
           if(i%8==0){
                System.out.print(" ");
            } 
           System.out.print(vetorbinario[i]);
             
        }
        
        
        // CRIPTOGRAFIA
            for (int i = 0; i < mensagem.length() * 8; i++) {
           
            if(i%2==0){
                if(vetorbinario[i]==1){
                 vetorbinario[i]=0;
                }else{
                vetorbinario[i]=1;
                }
            }
           
             
        }
        
            // impressao confere cript
        System.out.println();
         for (int i = 0; i < mensagem.length() * 8; i++) {
           if(i%8==0){
                System.out.print(" ");
            } 
           System.out.print(vetorbinario[i]);
             
        }
        
        // preparando o criptografado pra enviar 
          char[] temp = new char[mensagem.length()*8];
        for (int i = 0; i < mensagem.length() * 8; i++) {
           if(vetorbinario[i]== 0){
            temp[i]=48;
           }
           else{
           temp[i]=49;
           }
        }
        String b = String.copyValueOf(temp);
        
       // System.out.println();
       // System.out.println("valor de b: "+ b);
        
        try{
        //socket client
        
        
        // declarando e criando o socket com recurso desejado na porta
        Socket cliente = new Socket("127.0.0.1", 13189);
        System.out.println("Cliente iniciado");
        //declarando fluxo de dados de saida
        // objeto ps do tipo( fluxo de dados) printStream instanciado com a saida do cliente cliente.getoutput 
        
        PrintStream ps = new PrintStream(cliente.getOutputStream());
        ps.println(b);
        
        cliente.close();
        System.out.println("Cliente finalizado");
        }catch (Exception e){
            System.out.println("erro durante a conexão");
        }
        
        
        
        
        
    }
    
}
