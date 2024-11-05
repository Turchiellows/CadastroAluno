package visao;


public class FrmPrincipal extends javax.swing.JFrame {


   public FrmPrincipal() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jMenuItem1 = new javax.swing.JMenuItem();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenuArquivo = new javax.swing.JMenu();
      jMenuItemNovoAluno = new javax.swing.JMenuItem();
      jMenuItemGerenciarAluno = new javax.swing.JMenuItem();
      jMenuItemSair = new javax.swing.JMenuItem();
      jMenuSobre = new javax.swing.JMenu();

      jMenuItem1.setText("jMenuItem1");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Cadastro de alunos");

      jMenuArquivo.setText("Arquivos");

      jMenuItemNovoAluno.setText("Cadastrar alunos");
      jMenuItemNovoAluno.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemNovoAlunoActionPerformed(evt);
         }
      });
      jMenuArquivo.add(jMenuItemNovoAluno);

      jMenuItemGerenciarAluno.setText("Gerenciar alunos");
      jMenuItemGerenciarAluno.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemGerenciarAlunoActionPerformed(evt);
         }
      });
      jMenuArquivo.add(jMenuItemGerenciarAluno);

      jMenuItemSair.setText("Sair");
      jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemSairActionPerformed(evt);
         }
      });
      jMenuArquivo.add(jMenuItemSair);

      jMenuBar1.add(jMenuArquivo);

      jMenuSobre.setText("Sobre");
      jMenuBar1.add(jMenuSobre);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 800, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 477, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
     System.exit(0);
   }//GEN-LAST:event_jMenuItemSairActionPerformed

   private void jMenuItemNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoAlunoActionPerformed
     FrmCadastroAluno novo = new FrmCadastroAluno();
     novo.setVisible(true);
     novo.setLocationRelativeTo(null);
   }//GEN-LAST:event_jMenuItemNovoAlunoActionPerformed

   private void jMenuItemGerenciarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarAlunoActionPerformed
     FrmGerenciaAluno todos = new FrmGerenciaAluno();
     todos.setVisible(true);
     todos.setLocationRelativeTo(null);
   }//GEN-LAST:event_jMenuItemGerenciarAlunoActionPerformed


   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FrmPrincipal().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenu jMenuArquivo;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JMenuItem jMenuItemGerenciarAluno;
   private javax.swing.JMenuItem jMenuItemNovoAluno;
   private javax.swing.JMenuItem jMenuItemSair;
   private javax.swing.JMenu jMenuSobre;
   // End of variables declaration//GEN-END:variables
}
