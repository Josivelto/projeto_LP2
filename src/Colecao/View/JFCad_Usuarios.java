/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecao.View;

import javax.swing.JOptionPane;
import Colecao.Model.Usuario_c;
import Colecao.Data.Usuario_Data;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JFCad_Usuarios extends javax.swing.JFrame {
    private Usuario_c obj;
    private Usuario_Data DAO;
    private ArrayList<Usuario_c> listaDeUsuarios;
    private int acao;
    public JFCad_Usuarios(Usuario_c obj){ //aqui eu crio o metodo construtor e ja carrego o objeto, esse
        this();
        this.obj = obj; //aqui eu to carregando oo objeto que esta vindo por parametro da linha 21 e ja chamando metodona linha 25.
        try {
            editando_u();
        } catch (Exception ex) {
            Logger.getLogger(JFCad_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public JFCad_Usuarios() {
        initComponents();
        acao=0;
        obj = new Usuario_c();//construtor vazio
        listaDeUsuarios = new ArrayList<>();
        try {
            DAO =new Usuario_Data();
        } catch (Exception ex) {
            Logger.getLogger(JFCad_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLID = new javax.swing.JLabel();
        jLnome_u = new javax.swing.JLabel();
        jLsenha = new javax.swing.JLabel();
        jLfoco_u = new javax.swing.JLabel();
        jLemail_u = new javax.swing.JLabel();
        jLdata_inicio_u = new javax.swing.JLabel();
        jLID_Numero = new javax.swing.JLabel();
        jTnome_u = new javax.swing.JTextField();
        jTemail_u = new javax.swing.JTextField();
        jTdata_inicio_u = new javax.swing.JTextField();
        jBsalvar_u = new javax.swing.JButton();
        jBcomecar_cad_u = new javax.swing.JButton();
        jBsair_u = new javax.swing.JButton();
        jPsenha_u = new javax.swing.JPasswordField();
        jCfoco_u = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLID.setBackground(new java.awt.Color(0, 204, 255));
        jLID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLID.setText("ID");

        jLnome_u.setBackground(new java.awt.Color(0, 204, 255));
        jLnome_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLnome_u.setText("NOME");

        jLsenha.setBackground(new java.awt.Color(0, 204, 255));
        jLsenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLsenha.setText("SENHA");

        jLfoco_u.setBackground(new java.awt.Color(0, 204, 255));
        jLfoco_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLfoco_u.setText("FOCO");

        jLemail_u.setBackground(new java.awt.Color(0, 204, 255));
        jLemail_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLemail_u.setText("E-MAIL");

        jLdata_inicio_u.setBackground(new java.awt.Color(0, 204, 255));
        jLdata_inicio_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLdata_inicio_u.setText("DATA DE INICIO");

        jLID_Numero.setBackground(new java.awt.Color(0, 204, 255));
        jLID_Numero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLID_Numero.setText("0");

        jTnome_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTemail_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTdata_inicio_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jBsalvar_u.setBackground(new java.awt.Color(0, 0, 204));
        jBsalvar_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBsalvar_u.setForeground(new java.awt.Color(255, 255, 255));
        jBsalvar_u.setText("SALVAR");
        jBsalvar_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvar_uActionPerformed(evt);
            }
        });

        jBcomecar_cad_u.setBackground(new java.awt.Color(0, 204, 0));
        jBcomecar_cad_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBcomecar_cad_u.setForeground(new java.awt.Color(255, 255, 255));
        jBcomecar_cad_u.setText("COMEÇAR CADASTRO");
        jBcomecar_cad_u.setEnabled(false);
        jBcomecar_cad_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcomecar_cad_uActionPerformed(evt);
            }
        });

        jBsair_u.setBackground(new java.awt.Color(255, 0, 0));
        jBsair_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBsair_u.setForeground(new java.awt.Color(255, 255, 255));
        jBsair_u.setText("SAIR");
        jBsair_u.setEnabled(false);
        jBsair_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsair_uActionPerformed(evt);
            }
        });

        jPsenha_u.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPsenha_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPsenha_uActionPerformed(evt);
            }
        });

        jCfoco_u.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SUPER ESPORTIVOS ", "JDM", "MUSCLES CAR", "PICAPES", "VW", "CLASSICOS", "ELETRICOS", "NACIONAIS", "CUSTOM" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLID)
                                .addGap(83, 83, 83)
                                .addComponent(jLID_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLnome_u)
                                    .addComponent(jLsenha)
                                    .addComponent(jLfoco_u)
                                    .addComponent(jLemail_u)
                                    .addComponent(jLdata_inicio_u))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTdata_inicio_u)
                                    .addComponent(jTemail_u)
                                    .addComponent(jPsenha_u)
                                    .addComponent(jTnome_u)
                                    .addComponent(jCfoco_u, 0, 315, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBsalvar_u)
                        .addGap(139, 139, 139)
                        .addComponent(jBcomecar_cad_u)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jBsair_u)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jLID_Numero))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome_u)
                    .addComponent(jTnome_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsenha)
                    .addComponent(jPsenha_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLfoco_u)
                    .addComponent(jCfoco_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLemail_u)
                    .addComponent(jTemail_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdata_inicio_u)
                    .addComponent(jTdata_inicio_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar_u)
                    .addComponent(jBcomecar_cad_u)
                    .addComponent(jBsair_u))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcomecar_cad_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcomecar_cad_uActionPerformed
        new JFTabela_colecao(obj).setVisible(true);   
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jBcomecar_cad_uActionPerformed

    private void jPsenha_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPsenha_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPsenha_uActionPerformed

    private void jBsalvar_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvar_uActionPerformed
        try{
            if (validarCampos_u()) {
                if(preencherObj()){
                    if(acao==0){
                        if(DAO.incluir(obj)){
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso, comece ja cadastrando suas miniaturas!",
                                        "Meu sistema", JOptionPane.INFORMATION_MESSAGE); 
                        inativar_campos();
                        
                        }
                    }//fim do if acao =0
                    if(acao==1){
                        if(DAO.editar(obj)){
                        JOptionPane.showMessageDialog(this, "Editado com sucesso, cadastre mais miniaturas!",
                                        "Meu sistema", JOptionPane.INFORMATION_MESSAGE); 
                        inativar_campos();
                        
                        }
                    }//fim do if acao =1
                }
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(this, "Erro ao salvar"+ erro.getMessage(), "Sistema",JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_jBsalvar_uActionPerformed

    private void jBsair_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsair_uActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente sair?")==JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_jBsair_uActionPerformed

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
            java.util.logging.Logger.getLogger(JFCad_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCad_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCad_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCad_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCad_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcomecar_cad_u;
    private javax.swing.JButton jBsair_u;
    private javax.swing.JButton jBsalvar_u;
    private javax.swing.JComboBox<String> jCfoco_u;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLID_Numero;
    private javax.swing.JLabel jLdata_inicio_u;
    private javax.swing.JLabel jLemail_u;
    private javax.swing.JLabel jLfoco_u;
    private javax.swing.JLabel jLnome_u;
    private javax.swing.JLabel jLsenha;
    private javax.swing.JPasswordField jPsenha_u;
    private javax.swing.JTextField jTdata_inicio_u;
    private javax.swing.JTextField jTemail_u;
    private javax.swing.JTextField jTnome_u;
    // End of variables declaration//GEN-END:variables
    private boolean validarCampos_u() {
        String msg = "";//varavel com funcao de soma, onde a cada if algo novo pode ser adicionado
        if (jTnome_u.getText().length() < 3 || jTnome_u.getText().length() > 100) {
            msg += "\nSeu nome deve conter entre 3 e 100 caracteres";
        }
        if (jTemail_u.getText().length() < 5 || jTemail_u.getText().length() > 50) {
            msg += "\nSeu e-mail deve conter entre 5 e 50 caracteres";
        } else if (!jTemail_u.getText().contains("@")
                && !jTemail_u.getText().contains(".")) {
            msg += "\nO e-mail é inválido, verifique se ha '@' e/ou '.'";
        }
        if (jPsenha_u.getText().length() < 5 || jPsenha_u.getText().length() > 20) {
            msg += "\nSua senha deve conter entre 5 e 20 caracteres";
        }
        if (jCfoco_u.getSelectedIndex() == 0) {
            msg += "\nSelecione o principal foco de sua coleção";
        }
        if (msg.isEmpty()) {
            return true;//funcao.isempty serve para contar se o numero de caracteres é = 0(lengty()==0), //
        } //ou seja, se esssa variavel msg esta vazia
        else {
            JOptionPane.showMessageDialog(this, "Os campos abaixo precisam de atenção:"
                    + msg, "Atenção", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    private void inativar_campos(){
       jTnome_u.setText("");
       jTdata_inicio_u.setText("");
       jTemail_u.setText("");
       jPsenha_u.setText("");
       jCfoco_u.setSelectedIndex(0);
       jTnome_u.setEnabled(false);
       jTdata_inicio_u.setEnabled(false);
       jTemail_u.setEnabled(false);
       jPsenha_u.setEnabled(false);
       jCfoco_u.setEnabled(false);
       jBsalvar_u.setEnabled(false);
       jBsair_u.setEnabled(true);
       jBcomecar_cad_u.setEnabled(true);
    }
    
    private boolean preencherObj() throws Exception{
        obj.setData_inicio(jTdata_inicio_u.getText());
        obj.setEmail(jTemail_u.getText());
        obj.setFoco(jCfoco_u.getSelectedIndex());
        obj.setIdc(Integer.parseInt(jLID_Numero.getText()));
        obj.setNome(jTnome_u.getText());
        obj.setSenha(jPsenha_u.getText());
        
        return true;
    }
    private void editando_u() throws Exception{
        acao=1;
        jTdata_inicio_u.setText(obj.getData_inicio());
        jTemail_u.setText(obj.getEmail());
        jTnome_u.setText(obj.getNome());
        jLID_Numero.setText(""+obj.getIdc());
        jPsenha_u.setText(obj.getSenha());
        jCfoco_u.setSelectedIndex(obj.getFoco());
    }
}