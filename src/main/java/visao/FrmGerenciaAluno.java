
package visao;


public class FrmGerenciaAluno extends javax.swing.JFrame {


   public FrmGerenciaAluno() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
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

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Gerenciar alunos");

      jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
      jScrollPane1.setViewportView(jTable1);
      if (jTable1.getColumnModel().getColumnCount() > 0) {
         jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
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

      JBApagar.setText("Apagar");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(JTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                 .addComponent(jLabel3)
                                 .addComponent(jLabel2)
                                 .addComponent(jLabel1))
                              .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel4)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                 .addComponent(JTFCurso)
                                 .addComponent(JTFFase, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(27, 27, 27)
                  .addComponent(JBCancelar)
                  .addGap(18, 18, 18)
                  .addComponent(JBAlterar)
                  .addGap(18, 18, 18)
                  .addComponent(JBApagar)))
            .addContainerGap(19, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
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
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   // End of variables declaration//GEN-END:variables
}
