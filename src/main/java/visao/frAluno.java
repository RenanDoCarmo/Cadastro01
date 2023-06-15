/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import com.jocile.cadastro6.entidades.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class frAluno extends javax.swing.JFrame {

    /**
     * Creates new form frAluno
     */
    private ArrayList<Aluno> lista;

    public frAluno() {
        initComponents();

        lista = new ArrayList<>();
        this.resetarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbMatricula = new javax.swing.JLabel();
        lbAnodIngresso = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtMatricula = new javax.swing.JTextField();
        edtAnoDeIngresso = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setText("Cadastro de Alunos");

        lbNome.setText("Nome");

        lbSexo.setText("Sexo");

        lbIdade.setText("Idade");

        lbMatricula.setText("Matricula");

        lbAnodIngresso.setText("Ano de Ingresso");

        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });
        edtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtNomeKeyReleased(evt);
            }
        });

        edtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtSexoKeyReleased(evt);
            }
        });

        edtIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtIdadeKeyReleased(evt);
            }
        });

        edtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtMatriculaKeyReleased(evt);
            }
        });

        edtAnoDeIngresso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtAnoDeIngressoKeyReleased(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbIdade)
                                            .addComponent(lbSexo))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbAnodIngresso)
                                            .addComponent(lbMatricula))))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtAnoDeIngresso)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btCancelar)
                    .addComponent(btEditar)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMatricula)
                    .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdade)
                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnodIngresso)
                    .addComponent(edtAnoDeIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        this.resetarCampos(true);
        edtNome.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Aluno a = new Aluno();
        int aux;
        a.setNome(edtNome.getText());
        a.setSexo(edtSexo.getText().charAt(0));
        String idadeLida = edtIdade.getText();
        if (!idadeLida.isEmpty()) {
            aux = Integer.parseInt(edtIdade.getText());
            a.setIdade(aux);
            a.setMatricula(edtMatricula.getText());
        } else {
            JOptionPane.showMessageDialog(this,
                    "Campo Idade obrigatório. ");
        }

        //SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        //Date ano = formato.parse(edtAnoDeIngresso.getText());
        aux = Integer.parseInt(edtAnoDeIngresso.getText());
        a.setAnoDeIngresso(aux);

        //Mostrando a lista de alunos
        this.lista.add(a);
        txtResultado.setText(this.mostrarLista());
        //txtResultado.setText(a.toString()); //mostrava o resultado
        this.resetarCampos(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    public String mostrarLista() {
        String listaCompleta = "";

        for (int i = 0; i <= lista.size() - 1; i++) {
            Aluno aux = lista.get(i);
            listaCompleta = listaCompleta + aux.toString();
        }
        return listaCompleta;
    }

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.resetarCampos(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomeKeyReleased
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
            edtSexo.requestFocus();
        }
    }//GEN-LAST:event_edtNomeKeyReleased

    private void edtSexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtSexoKeyReleased
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
            edtIdade.requestFocus();
        }
    }//GEN-LAST:event_edtSexoKeyReleased

    private void edtIdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtIdadeKeyReleased
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
            edtMatricula.requestFocus();
        }
    }//GEN-LAST:event_edtIdadeKeyReleased

    private void edtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtMatriculaKeyReleased
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
            edtAnoDeIngresso.requestFocus();
        }
    }//GEN-LAST:event_edtMatriculaKeyReleased

    private void edtAnoDeIngressoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtAnoDeIngressoKeyReleased
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
            btSalvar.requestFocus();
        }
    }//GEN-LAST:event_edtAnoDeIngressoKeyReleased

    private void resetarCampos(boolean flag) {
        edtNome.setEnabled(flag);
        edtSexo.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtMatricula.setEnabled(flag);
        edtAnoDeIngresso.setEnabled(flag);

        if (!flag) {
            edtNome.setText("");
            edtSexo.setText("");
            edtIdade.setText("");
            edtMatricula.setText("");
            edtAnoDeIngresso.setText("");
        }

    }

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
            java.util.logging.Logger.getLogger(frAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edtAnoDeIngresso;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtMatricula;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAnodIngresso;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
