
package gui;

import dominio.ControleMissoes;
import dominio.Missao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @author alexa
 */
public class TelaCadastroMissoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroMissoes
     */
    
    private String nomeAntes;
    
    private ControleMissoes controleMissoes; 
    
    public TelaCadastroMissoes(ControleMissoes controleMissoes) {
        initComponents();
        this.controleMissoes = controleMissoes;
        this.nomeAntes = "";
    }

    /**
    *
    * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
    */
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelTituloMissao = new javax.swing.JLabel();
        textTituloMissao = new javax.swing.JTextField();
        labelDescricaoMissao = new javax.swing.JLabel();
        lavelRankMissao = new javax.swing.JLabel();
        textRankMissao = new javax.swing.JTextField();
        cadastrarMissao = new javax.swing.JButton();
        consultarMissao = new javax.swing.JButton();
        removerMissao = new javax.swing.JButton();
        editarMissao = new javax.swing.JButton();
        limparMissao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricaoMissao = new javax.swing.JTextArea();

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Nome da missão: ");

        jButton1.setText("Cadastrar");

        setTitle("Cadastro Missões");

        labelTituloMissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelTituloMissao.setText("Título da missão: ");

        labelDescricaoMissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelDescricaoMissao.setText("Descrição da missão: ");

        lavelRankMissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lavelRankMissao.setText("Rank da missão:");

        cadastrarMissao.setText("Cadastrar");
        cadastrarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarMissaoEvt(evt);
            }
        });

        consultarMissao.setText("Consultar");
        consultarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMissaoEvt(evt);
            }
        });

        removerMissao.setText("Remover");
        removerMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMissaoEvt(evt);
            }
        });

        editarMissao.setText("Editar");
        editarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMissaoEvt(evt);
            }
        });

        limparMissao.setText("Limpar");
        limparMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparMissaoEvt(evt);
            }
        });

        jLabel1.setText("Ranks possíveis: S , A , B , C , D");

        textDescricaoMissao.setColumns(20);
        textDescricaoMissao.setLineWrap(true);
        textDescricaoMissao.setRows(5);
        jScrollPane1.setViewportView(textDescricaoMissao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTituloMissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lavelRankMissao)
                            .addComponent(labelDescricaoMissao)
                            .addComponent(textTituloMissao)
                            .addComponent(textRankMissao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cadastrarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(limparMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(removerMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelDescricaoMissao, labelTituloMissao, lavelRankMissao});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloMissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTituloMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescricaoMissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removerMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lavelRankMissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRankMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void limparTela(){
        this.textTituloMissao.setText("");
        this.textDescricaoMissao.setText("");
        this.textRankMissao.setText("");
    }
    
    private void cadastarMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarMissaoEvt
        //Cadastra a nova missão
        if(controleMissoes.adicionaMissao(this.textTituloMissao.getText(),this.textDescricaoMissao.getText(),this.textRankMissao.getText())){
            JOptionPane.showMessageDialog(this, "Missão incluída com sucesso!", "Inclusão sucedida", JOptionPane.INFORMATION_MESSAGE);
            limparTela();
        }else
            JOptionPane.showMessageDialog(this, "Ausência ou erro nos dados!", "Falha na inclusão", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_cadastarMissaoEvt

    private void consultarMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMissaoEvt
        
        String campos[] = null;
        if(!this.textTituloMissao.getText().equals("")){
            campos = this.controleMissoes.consultarMissao(this.textTituloMissao.getText());
            nomeAntes = this.textTituloMissao.getText();
        }
        
        if(campos!=null){
            this.textTituloMissao.setText(campos[0]);
            this.textDescricaoMissao.setText(campos[1]);
            this.textRankMissao.setText(campos[2]);
        }else{
           JOptionPane.showMessageDialog(this, " Missão não encontrada !", "Aviso", JOptionPane.ERROR_MESSAGE);
           limparTela();
        }
        
    }//GEN-LAST:event_consultarMissaoEvt

    private void removerMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMissaoEvt
        if(this.controleMissoes.removerMissao(this.textTituloMissao.getText())){
            JOptionPane.showMessageDialog(this, "Missão removida com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limparTela();
        }else{
            JOptionPane.showMessageDialog(this, " Não existe essa Missão!", "Informação", JOptionPane.INFORMATION_MESSAGE); 
            limparTela();
        }
    }//GEN-LAST:event_removerMissaoEvt

    private void editarMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMissaoEvt
        String []camposNinja = new String[3];
        if(!this.textTituloMissao.getText().equals("")){
            camposNinja[0] = this.textTituloMissao.getText();
            camposNinja[1] = this.textDescricaoMissao.getText();
            camposNinja[2] = this.textRankMissao.getText();
            if(this.controleMissoes.editarMissao(camposNinja)){
                JOptionPane.showMessageDialog(this, "Missão Editada com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                limparTela();
            }else{
                JOptionPane.showMessageDialog(this, "Dados incoerentes para a edição!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }  
        }else{
            JOptionPane.showMessageDialog(this, "Digite o nome da missão!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_editarMissaoEvt

    private void limparMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparMissaoEvt
        limparTela();
    }//GEN-LAST:event_limparMissaoEvt


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarMissao;
    private javax.swing.JButton consultarMissao;
    private javax.swing.JButton editarMissao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelDescricaoMissao;
    private javax.swing.JLabel labelTituloMissao;
    private javax.swing.JLabel lavelRankMissao;
    private javax.swing.JButton limparMissao;
    private javax.swing.JButton removerMissao;
    private javax.swing.JTextArea textDescricaoMissao;
    private javax.swing.JTextField textRankMissao;
    private javax.swing.JTextField textTituloMissao;
    // End of variables declaration//GEN-END:variables
}
