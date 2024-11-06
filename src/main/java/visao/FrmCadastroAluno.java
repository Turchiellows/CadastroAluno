package visao;

import javax.swing.JOptionPane;
import modelo.Aluno;

public class FrmCadastroAluno extends javax.swing.JFrame {

   // 
   private Aluno objetoaluno;

   public FrmCadastroAluno() {
      initComponents();

      // CARREGANDO O OBJETO ALUNO
      this.objetoaluno = new Aluno();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      JTFNome = new javax.swing.JTextField();
      JTFIdade = new javax.swing.JTextField();
      JTFCurso = new javax.swing.JTextField();
      JTFFase = new javax.swing.JTextField();
      JBCadastrar = new javax.swing.JButton();
      JBCancelar = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Cadastrar Aluno");

      jLabel1.setText("Nome");

      jLabel2.setText("Idade");

      jLabel3.setText("Curso");

      jLabel4.setText("Fase");

      JBCadastrar.setText("Cadastrar");
      JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            JBCadastrarActionPerformed(evt);
         }
      });

      JBCancelar.setText("Cancelar");
      JBCancelar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            JBCancelarActionPerformed(evt);
         }
      });

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
      jLabel5.setText("Cadastro de alunos");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                     .addGap(22, 22, 22)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel3)
                           .addComponent(jLabel2)
                           .addComponent(jLabel1))
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                           .addGap(2, 2, 2)
                           .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addGroup(layout.createSequentialGroup()
                     .addContainerGap()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGap(308, 308, 308)))
               .addGroup(layout.createSequentialGroup()
                  .addGap(89, 89, 89)
                  .addComponent(JBCadastrar)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(JBCancelar)))
            .addContainerGap(326, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jLabel5)
            .addGap(26, 26, 26)
            .addComponent(jLabel1)
            .addGap(2, 2, 2)
            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel2)
            .addGap(11, 11, 11)
            .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addGap(5, 5, 5)
            .addComponent(JTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(JBCadastrar)
               .addComponent(JBCancelar))
            .addContainerGap(135, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
//      JTFNome.setText("");
//      JTFCurso.setText("");
//      JTFFase.setText("");
//      JTFIdade.setText("");
      this.dispose();
   }//GEN-LAST:event_JBCancelarActionPerformed

   private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
      try {
// recebendo e validando dados da interface gráfica.
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
// envia os dados para o Controlador cadastrar
         if (this.objetoaluno.insertAlunoBD(nome, idade, curso, fase)) {
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!");
// limpa campos da interface
            this.JTFNome.setText("");
            this.JTFIdade.setText("");
            this.JTFCurso.setText("");
            this.JTFFase.setText("");
         }
//Exibie no console o aluno cadastrado
         System.out.println(this.objetoaluno.getMinhaLista().toString());
      } catch (Mensagem erro) {
         JOptionPane.showMessageDialog(null, erro.getMessage());
      } catch (NumberFormatException erro2) {
         JOptionPane.showMessageDialog(null, "Informe um número válido.");
      }

   }//GEN-LAST:event_JBCadastrarActionPerformed

   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FrmCadastroAluno().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton JBCadastrar;
   private javax.swing.JButton JBCancelar;
   private javax.swing.JTextField JTFCurso;
   private javax.swing.JTextField JTFFase;
   private javax.swing.JTextField JTFIdade;
   private javax.swing.JTextField JTFNome;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   // End of variables declaration//GEN-END:variables
}
