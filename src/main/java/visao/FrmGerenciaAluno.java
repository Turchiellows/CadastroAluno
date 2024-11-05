package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;

public class FrmGerenciaAluno extends javax.swing.JFrame {

   private Aluno objetoaluno;

   public FrmGerenciaAluno() {
      initComponents();

      // CARREGANDO O OBJETO ALUNO
      this.objetoaluno = new Aluno();
   }

   public void carregaTabela() {
      DefaultTableModel modelo = (DefaultTableModel) this.JTableAlunos.getModel();
      modelo.setNumRows(0); //Posiciona na primeira linha da tabela

      //Carrega a lista de objetos aluno
      ArrayList<Aluno> minhaLista = objetoaluno.getMinhaLista();
      for (Aluno a : minhaLista) {
         modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getIdade(),
            a.getCurso(),
            a.getFase()
         });
      }
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      JTableAlunos = new javax.swing.JTable();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      JTFNome = new javax.swing.JTextField();
      JTFIdade = new javax.swing.JTextField();
      JTFCurso = new javax.swing.JTextField();
      JTFFase = new javax.swing.JTextField();
      JBCancelar = new javax.swing.JButton();
      JBAlterar = new javax.swing.JButton();
      JBApagar = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Gerenciar alunos");

      JTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
         },
         new String [] {
            "ID", "Nome", "Idade", "Curso", "Fase"
         }
      ));
      jScrollPane1.setViewportView(JTableAlunos);
      if (JTableAlunos.getColumnModel().getColumnCount() > 0) {
         JTableAlunos.getColumnModel().getColumn(0).setMaxWidth(30);
      }

      jLabel1.setText("Nome");

      jLabel2.setText("Idade");

      jLabel3.setText("Curso");

      jLabel4.setText("Fase");

      JBCancelar.setText("Cancelar");
      JBCancelar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            JBCancelarActionPerformed(evt);
         }
      });

      JBAlterar.setText("Alterar");
      JBAlterar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            JBAlterarActionPerformed(evt);
         }
      });

      JBApagar.setText("Apagar");

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
      jLabel5.setText("Gerenciamento de alunos");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 19, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addGap(14, 14, 14))
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addGap(8, 8, 8)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGap(262, 262, 262))
                  .addGroup(layout.createSequentialGroup()
                     .addContainerGap()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel3)
                           .addComponent(jLabel2)
                           .addComponent(jLabel1))
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(27, 27, 27)
                  .addComponent(JBCancelar)
                  .addGap(18, 18, 18)
                  .addComponent(JBAlterar)
                  .addGap(18, 18, 18)
                  .addComponent(JBApagar))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1)
            .addGap(2, 2, 2)
            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(11, 11, 11)
            .addComponent(jLabel3)
            .addGap(5, 5, 5)
            .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(JBCancelar)
               .addComponent(JBAlterar)
               .addComponent(JBApagar))
            .addContainerGap(44, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
      this.dispose();
   }//GEN-LAST:event_JBCancelarActionPerformed

   private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
      try {
// recebendo e validando dados da interface gráfica.
         int id = 0;
         String nome = "";
         int idade = 0;
         String curso = "";
         int fase = 0;
         if (this.JTFNome.getText().length() < 2) {
            throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
         } else {
            nome = this.JTFNome.getText();
         }
         if (this.JTFIdade.getText().length() <= 0) {
            throw new Mensagem("Idade deve ser número e maior que zero.");
         } else {
            idade = Integer.parseInt(this.JTFIdade.getText());
         }
         if (this.JTFCurso.getText().length() < 2) {
            throw new Mensagem("Curso deve conter ao menos 2 caracteres.");
         } else {
            curso = this.JTFCurso.getText();
         }

         if (this.JTFFase.getText().length() <= 0) {
            throw new Mensagem("Fase deve ser número e maior que zero.");
         } else {
            fase = Integer.parseInt(this.JTFFase.getText());
         }
         if (this.JTableAlunos.getSelectedRow() == -1) {
            throw new Mensagem("Primeiro Selecione um Aluno para Alterar");
         } else {
            id = Integer.parseInt(this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 0).toString());
         }
// envia os dados para o Aluno processar
         if (this.objetoaluno.updateAlunoBD(id, nome, idade, curso, fase)) {
// limpa os campos
            this.JTFNome.setText("");
            this.JTFIdade.setText("");
            this.JTFCurso.setText("");
            this.JTFFase.setText("");
            JOptionPane.showMessageDialog(rootPane, "Aluno Alterado com Sucesso!");
         }
//Exibe no console o aluno cadastrado
         System.out.println(this.objetoaluno.getMinhaLista().toString());
      } catch (Mensagem erro) {
         JOptionPane.showMessageDialog(null, erro.getMessage());
      } catch (NumberFormatException erro2) {
         JOptionPane.showMessageDialog(null, "Informe um número válido.");
      } finally {
// atualiza a tabela.
         carregaTabela();
      }
   }//GEN-LAST:event_JBAlterarActionPerformed

   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FrmGerenciaAluno().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton JBAlterar;
   private javax.swing.JButton JBApagar;
   private javax.swing.JButton JBCancelar;
   private javax.swing.JTextField JTFCurso;
   private javax.swing.JTextField JTFFase;
   private javax.swing.JTextField JTFIdade;
   private javax.swing.JTextField JTFNome;
   private javax.swing.JTable JTableAlunos;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JScrollPane jScrollPane1;
   // End of variables declaration//GEN-END:variables
}
