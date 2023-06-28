/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import comunicacao.TelaServidor;
/**
 *
 * @author Afonso
 */
public class Servidor {
    
    public static void main(String[] args) {
       
       String captura =null;
      
       try{
        //socket client
        ServerSocket servidor = new ServerSocket( 13200);
        System.out.println("servidor iniciado...");
        
       
        Socket cliente = servidor.accept();
       // imprime qual cliente esta conectado
        System.out.println("cliente conectado" + cliente.getInetAddress());
        
        InputStreamReader fluxoDados = new InputStreamReader(cliente.getInputStream());
        BufferedReader dado = new BufferedReader(fluxoDados);
        //System.out.println(dado.readLine());
        captura = dado.readLine();
        System.out.println("captura: "+captura);
     cliente.close();
       
        
   
        }catch (Exception e){
            System.out.println("erro ");
        }
        TelaServidor telaServ = new TelaServidor();
        telaServ.setVisible(true);
       telaServ.txtCodificado.setText(captura);
       //telaServ.txtRecebido.setText(captura);
       
       
    }
    
    
}
