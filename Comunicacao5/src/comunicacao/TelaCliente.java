/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package comunicacao;

import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Afonso
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensagemDigitada = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensagemBinario = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensagemEncriptada = new javax.swing.JTextArea();
        btnTransformar = new javax.swing.JButton();
        btnEncriptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCodificado = new javax.swing.JTextArea();
        btnCodificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOnda = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comunicador UTFPR Sender");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Entrada de dados para conexão");

        jLabel2.setText("Ip do servidor para conexão");

        TxtIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIPActionPerformed(evt);
            }
        });

        jLabel3.setText("porta");

        txtPorta.setColumns(10);
        txtPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortaActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel6.setText("Digite a mensagem para ser enviada");

        txtMensagemDigitada.setColumns(20);
        txtMensagemDigitada.setRows(5);
        jScrollPane1.setViewportView(txtMensagemDigitada);

        jLabel4.setText("Mensagem no formato binário");

        txtMensagemBinario.setColumns(20);
        txtMensagemBinario.setRows(5);
        jScrollPane2.setViewportView(txtMensagemBinario);

        jLabel5.setText("Mensagem Encriptada");

        txtMensagemEncriptada.setColumns(20);
        txtMensagemEncriptada.setRows(5);
        jScrollPane3.setViewportView(txtMensagemEncriptada);

        btnTransformar.setText("Transformar");
        btnTransformar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransformarActionPerformed(evt);
            }
        });

        btnEncriptar.setText("Encriptar");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });

        jLabel7.setText("Codificadahdb3");

        txtCodificado.setColumns(20);
        txtCodificado.setRows(5);
        jScrollPane4.setViewportView(txtCodificado);

        btnCodificar.setText("Codificar");
        btnCodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodificarActionPerformed(evt);
            }
        });

        jLabel8.setText("Formato de onda");

        txtOnda.setColumns(20);
        txtOnda.setRows(5);
        jScrollPane5.setViewportView(txtOnda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(btnEnviar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jScrollPane3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(137, 137, 137))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(130, 130, 130)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEncriptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTransformar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnCodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransformar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncriptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEnviar)))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIPActionPerformed

    private void txtPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        try{
        String ip =  TxtIP.getText();;
        String porta = txtPorta.getText();
       int p = Integer.parseInt(porta);
        Socket cliente = new Socket(ip, p);
        System.out.println("Cliente iniciado");
        String mensagem;
        
        
        
        mensagem = txtCodificado.getText();
        
        PrintStream ps = new PrintStream(cliente.getOutputStream());
        ps.println(mensagem);
        
        cliente.close();
        System.out.println("Cliente finalizado");
        }catch (Exception e){
            System.out.println("erro durante a conexão");
        }
        
        
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed
        String mensagemBinario = txtMensagemBinario.getText();
        char[] ch = new char[mensagemBinario.length()];
        
        for (int i = 0; i < mensagemBinario.length(); i++) {
            ch[i] = ch[i] = mensagemBinario.charAt(i);
        }
        int vetorbinario[] = new int[mensagemBinario.length()];
        for (int i = 0; i < mensagemBinario.length(); i++) {
           if(ch[i]== 48){
            vetorbinario[i]=0;
           }
           else{
           vetorbinario[i]=1;
           }
        }
        
        int vetorcp[] = new int[mensagemBinario.length()];
        
        for (int i = 0; i < mensagemBinario.length(); i++) {
         vetorcp[i]=0;
        }
        
        //criptografia
        for (int i = 0; i < mensagemBinario.length(); i++) {
           
            if(i%2==0){
                if(vetorbinario[i]==1){
                 vetorcp[i]=0;
                }else{
               vetorcp[i]=1;
                }
            }
            else{
            vetorcp[i]=vetorbinario[i];
            }
             
        }
        char[] ch2 = new char[mensagemBinario.length()];
        for (int i = 0; i < mensagemBinario.length(); i++) {
           if(vetorcp[i]== 0){
            ch2[i]=48;
           }
           else{
           ch2[i]=49;
           }
        }
        
        String r = String.copyValueOf(ch2);
        txtMensagemEncriptada.setText(r);
        
        
    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnTransformarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformarActionPerformed
         String mensagem = txtMensagemDigitada.getText();
        // inicializo vetor de char e completo ele com os caracteres da string digitada
        char[] ch = new char[mensagem.length()];
        
        for (int i = 0; i < mensagem.length(); i++) {
            ch[i] = ch[i] = mensagem.charAt(i);
        }
        
        //inicializando vetor inteiro 
        int vetorbinario[] = new int[mensagem.length()*8];
        //iniciando vetor binario com 0s 
       for (int i = 0; i < mensagem.length() * 8; i++) {
            vetorbinario[i] =0;
        }
       
       //Algoritmo que transforma char( inteiro) em binario
       int d;
       int indicador = 7;
       for(int j=0;j< mensagem.length();j++){
           
           d = (int)ch[j];
           
           
           while(d>=1){
            vetorbinario[indicador]= d%2;
           
            d=d/2;
            indicador = indicador - 1;
               
           }
           indicador = 7 + 8*(j+1);
       }
       
       //iniciando vetor de char do tamanho do vetor binario 
       char[] ch2 = new char[mensagem.length()*8];
       
       
        for (int i = 0; i < mensagem.length() *8; i++) {
           if(vetorbinario[i]== 0){
            ch2[i]=48;
           }
           else{
           ch2[i]=49;
           }
        }
        
        String b = String.copyValueOf(ch2);
        txtMensagemBinario.setText(b);
        
    }//GEN-LAST:event_btnTransformarActionPerformed

    private void btnCodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodificarActionPerformed
        
        String criptografado = txtMensagemEncriptada.getText();
        char[] buffer = new char[criptografado.length()];
        int tamanho = criptografado.length();
        
        for (int i = 0; i < tamanho; i++) {
            buffer[i] = buffer[i] = criptografado.charAt(i);
        }
        
         char[] vetor_final = new char[tamanho];
        
             int polaridade = 1;
    int par_ou_impar = 0;
    int zeros_consecutivos = 0;

    for (int i = 0; i < tamanho; i++) {

        if (buffer[i] == '0') {
            zeros_consecutivos++;
            vetor_final[i] = '0';

            if (zeros_consecutivos == 4) {  // Sequência de 4 zeros encontrada, faz a substituição



                if (par_ou_impar % 2 != 0) {


                        if(polaridade == 1){
                        vetor_final[i] = '+';

                        }
                        else if (polaridade == -1){
                        vetor_final[i] = '-';

                        }

                    vetor_final[i - 1] = '0';
                    vetor_final[i - 2] = '0';
                    vetor_final[i - 3] = '0';


                    polaridade = -polaridade;  // Inverte a polaridade para o próximo pulso não nulo
                    par_ou_impar++;
                }
                else
                {

                        if(polaridade == 1){
                        vetor_final[i] = '+';

                        }
                        else if (polaridade == -1){
                        vetor_final[i] = '-';

                        }

                    vetor_final[i - 1] = '0';
                    vetor_final[i - 2] = '0';
                    vetor_final[i - 3] = vetor_final[i];

                    polaridade =  polaridade;  // Inverte a polaridade para o próximo pulso não nulo
                }

                zeros_consecutivos = 0;  // Reinicia o contador

         }
        }
        else if (buffer[i] == '1') {

            if ( i == 0){
            vetor_final[0] = '+';
            polaridade = - polaridade;
            par_ou_impar++;
            }
            if ( i > 0) {           // Pulsos consecutivos "1" alternam entre +1 e -1
                if(polaridade == 1){
                vetor_final[i] = '+';
                polaridade = - polaridade;
                par_ou_impar++;
                }
                else if (polaridade == -1){
                vetor_final[i] = '-';
                 polaridade = - polaridade;
                 par_ou_impar++;
            }
            }

              // Inverte a polaridade para o próximo pulso não nulo
            zeros_consecutivos = 0;
        }


}
        String ty = String.copyValueOf(vetor_final);
        txtCodificado.setText(ty);
        
        char onda[] = new char[tamanho];
        /*for (int i = 0; i < tamanho; i++) {
            onda[i]=vetor_final[i];
            
        }*/
    for (int i = 0; i < tamanho; i++) {
        if (vetor_final[i] == '0') {
            onda[i]='_';
        } else if (vetor_final[i] == '1') {
            onda[i]='-';
        } else {
            onda[i]=' ';
        }
    }
        String ondaString = String.copyValueOf(onda);
        txtOnda.setText(ondaString);
        
    }//GEN-LAST:event_btnCodificarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField TxtIP;
    private javax.swing.JButton btnCodificar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnTransformar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txtCodificado;
    private javax.swing.JTextArea txtMensagemBinario;
    private javax.swing.JTextArea txtMensagemDigitada;
    private javax.swing.JTextArea txtMensagemEncriptada;
    private javax.swing.JTextArea txtOnda;
    public javax.swing.JTextField txtPorta;
    // End of variables declaration//GEN-END:variables
}
