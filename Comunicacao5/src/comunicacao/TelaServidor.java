/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package comunicacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Afonso
 */
public class TelaServidor extends javax.swing.JFrame {

    /**
     * Creates new form TelaServidor
     */
   
    public TelaServidor() {
        initComponents();
        
        
      
        
        
         
         
       
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDescripto = new javax.swing.JButton();
        btnTraducao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRecebido = new java.awt.TextArea();
        txtDescripto = new java.awt.TextArea();
        txtMensagemFinal = new java.awt.TextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDecoder = new javax.swing.JButton();
        txtCodificado = new java.awt.TextArea();
        txtOnda = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comunicador UTFPR Receiver");

        jLabel3.setText("codigo descriptografado");

        jLabel4.setText("Binário Recebido (cifrado)");

        btnDescripto.setText("descriptografar");
        btnDescripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescriptoActionPerformed(evt);
            }
        });

        btnTraducao.setText("Tradução");
        btnTraducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Mensagem Final");

        jLabel2.setText("Formato de onda recebido");

        jLabel5.setText("codificação de linha recebida");

        btnDecoder.setText("Descodificar");
        btnDecoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecoderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(txtCodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOnda, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripto, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMensagemFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTraducao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescripto)
                    .addComponent(btnDecoder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnDecoder))
                            .addComponent(txtCodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(txtOnda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnDescripto)
                        .addGap(100, 100, 100)
                        .addComponent(btnTraducao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtDescripto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtMensagemFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescriptoActionPerformed
        String mesagemRecebida = txtRecebido.getText();
        
        char[] ch2 = new char[mesagemRecebida.length()];
        
       for (int i = 0; i < mesagemRecebida.length(); i++) {
            ch2[i] = mesagemRecebida.charAt(i);
        }
        int vetorbinario[] = new int[mesagemRecebida.length() ];
       int vetorcp[] = new int[mesagemRecebida.length() ];
       
       for (int i = 0; i < mesagemRecebida.length(); i++) {
         vetorcp[i]=0;
                 vetorbinario[i]=0;
        }
       
       
       
       
 
         //char[] temp = new char[mesagemRecebida.length()*8];
        for (int i = 0; i < mesagemRecebida.length(); i++) {
           if(ch2[i]== 48){
            vetorcp[i]=0;
           }
           else{
           vetorcp[i]=1;
           }
        }
       //impressao ventor criptografado para conferir 
        for (int i = 0; i < mesagemRecebida.length(); i++) {
           if(i%8==0){
                System.out.print(" ");
            } 
           System.out.print(vetorcp[i]);
             
        }
        // CRIPTOGRAFIA
            for (int i = 0; i < mesagemRecebida.length() ; i++) {
           
            if(i%2==0){
                if(vetorcp[i]==1){
                 vetorbinario[i]=0;
                }else{
                vetorbinario[i]=1;
                }
            }else{
            vetorbinario[i]=vetorcp[i];
            }
           
             
        }
            //conferir vetor binario impressao 
            System.out.println();
        for (int i = 0; i < mesagemRecebida.length(); i++) {
           if(i%8==0){
                System.out.print(" ");
            } 
           System.out.print(vetorbinario[i]);
             
        }
        
        for (int i = 0; i < mesagemRecebida.length(); i++) {
           if(vetorbinario[i]== 0){
           ch2[i]=48;
           }
           else{
           ch2[i]=49;
           }
        }
       String b = String.copyValueOf(ch2);
        
        txtDescripto.setText(b);
        
        
    }//GEN-LAST:event_btnDescriptoActionPerformed

    private void btnTraducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraducaoActionPerformed
        String mensagemCripto = txtDescripto.getText();
         char[] ch2 = new char[mensagemCripto.length()];
        
         for (int i = 0; i < mensagemCripto.length(); i++) {
            ch2[i] = mensagemCripto.charAt(i);
        }
        int vetorbinario[] = new int[mensagemCripto.length() ];
         for (int i = 0; i < mensagemCripto.length(); i++) {
           if(ch2[i]== 48){
           vetorbinario[i]=0;
           }
           else{
           vetorbinario[i]=1;
           }
        }
         
         int tamPeq = mensagemCripto.length();
         
        char[] ch3 = new char[tamPeq/8];
        double soma=0;
        int soma2=0;
        int cont=7;
        int i=0;
        for(int j = 0 ;j < (tamPeq/8);j++){
        soma=0;
        soma2=0;
            
         for(i=j*8 ;i<(j+1)*8;i++){
           if(vetorbinario[i]==1){
             soma = soma + (Math.pow(2,cont));
             
             
           }
           System.out.print("valor de i "+i+ "   valor de j "+j +"    valor em soma "+soma);
           cont--;
         }
         System.out.println();
          cont=7;
         soma2=(int)soma;  
            ch3[j]=(char)soma2;
            
        }
        
        String t = String.copyValueOf(ch3); 
         
         for (int l = 0; l < tamPeq/8; l++) {
           
           System.out.print(ch3[l]);
             
        }
         
         
        txtMensagemFinal.setText(t);
        
        
        
        
    }//GEN-LAST:event_btnTraducaoActionPerformed

    private void btnDecoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecoderActionPerformed
        
        String codificado = txtCodificado.getText();
        char[] vetor_inicio = new char[codificado.length()];
        int tamanho = codificado.length();
        
        
        
        for (int i = 0; i < tamanho; i++) {
            vetor_inicio[i] = vetor_inicio[i] = codificado.charAt(i);
        }
        
         
        char[] vetorOnda = new char[codificado.length()];
        
        for (int i = 0; i < tamanho; i++) {
        if (vetor_inicio[i] == '0') {
            vetorOnda[i] ='_';
        } else if (vetor_inicio[i] == '1') {
            vetorOnda[i]='-';
        } else {
            vetorOnda[i]=' ';
        }
    }
        
         String ondaRecebida= String.copyValueOf(vetorOnda);
        txtOnda.setText(ondaRecebida);
        
        
        
        
        
        
        
        
        char[] vetor_fim = new char[tamanho];
        
         
         
         int polaridade = 1;
    char sinal_anterior = '1';
  
    

    for (int i = 0; i < tamanho; i++) {
        vetor_fim[i] = '1';
        }


     //printf("Aqui jas o vetor decodificado: ");
     for (int i = 0; i < tamanho; i++) {

      if (vetor_inicio[i] != '0'){

            if (vetor_inicio[i] == sinal_anterior){ //VIOLAÇÃO
                if (vetor_inicio[i-1] == '0' && vetor_inicio[i-2] == '0' && vetor_inicio[i-3] == '0'){
                vetor_fim[i] = '0';

            }
            else{
                vetor_fim[i] = '0';
                vetor_fim[i-3] = '0';
                }
            }
        sinal_anterior = vetor_inicio[i];
      }

        if(vetor_inicio[i] == '0'){
        vetor_fim[i] = '0';
      }

     }
     
     
     
     
     
     
        String decode = String.copyValueOf(vetor_fim);
        txtRecebido.setText(decode);
        
    }//GEN-LAST:event_btnDecoderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecoder;
    private javax.swing.JButton btnDescripto;
    private javax.swing.JButton btnTraducao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public java.awt.TextArea txtCodificado;
    private java.awt.TextArea txtDescripto;
    private java.awt.TextArea txtMensagemFinal;
    public java.awt.TextArea txtOnda;
    public java.awt.TextArea txtRecebido;
    // End of variables declaration//GEN-END:variables
}
