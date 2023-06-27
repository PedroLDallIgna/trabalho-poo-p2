/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poo.trabalho_final.view;

import com.poo.trabalho_final.controller.SingleRootFileSystemView;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Computacao
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuTripulante = new javax.swing.JMenu();
        mItemTripulanteCadastro = new javax.swing.JMenuItem();
        mItemTripulanteExclusao = new javax.swing.JMenuItem();
        menuEmbarcacao = new javax.swing.JMenu();
        subMenuSubmarino = new javax.swing.JMenu();
        mItemSubmarinoCadastro = new javax.swing.JMenuItem();
        mItemSubmarinoExclusao = new javax.swing.JMenuItem();
        menuExcursao = new javax.swing.JMenu();
        mItemExcursaoCadastro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuTripulante.setText("Tripulante");

        mItemTripulanteCadastro.setText("Cadastrar");
        mItemTripulanteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemTripulanteCadastroActionPerformed(evt);
            }
        });
        menuTripulante.add(mItemTripulanteCadastro);

        mItemTripulanteExclusao.setText("Excluir");
        mItemTripulanteExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemTripulanteExclusaoActionPerformed(evt);
            }
        });
        menuTripulante.add(mItemTripulanteExclusao);

        jMenuBar1.add(menuTripulante);

        menuEmbarcacao.setText("Embarcação");

        subMenuSubmarino.setText("Submarino");

        mItemSubmarinoCadastro.setText("Cadastrar");
        mItemSubmarinoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSubmarinoCadastroActionPerformed(evt);
            }
        });
        subMenuSubmarino.add(mItemSubmarinoCadastro);

        mItemSubmarinoExclusao.setText("Excluir");
        mItemSubmarinoExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSubmarinoExclusaoActionPerformed(evt);
            }
        });
        subMenuSubmarino.add(mItemSubmarinoExclusao);

        menuEmbarcacao.add(subMenuSubmarino);

        jMenuBar1.add(menuEmbarcacao);

        menuExcursao.setText("Excursão");

        mItemExcursaoCadastro.setText("Cadastrar");
        menuExcursao.add(mItemExcursaoCadastro);

        jMenuBar1.add(menuExcursao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemTripulanteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemTripulanteCadastroActionPerformed
        TripulanteCadastro tripulanteCadastro = new TripulanteCadastro();
        tripulanteCadastro.setVisible(true);
    }//GEN-LAST:event_mItemTripulanteCadastroActionPerformed

    private void mItemTripulanteExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemTripulanteExclusaoActionPerformed
        File root = new File("./data/tripulantes");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.setDialogType(JFileChooser.CUSTOM_DIALOG);
        fileChooser.setDialogTitle("Selecione o arquivo");
        
        int opt = fileChooser.showDialog(this, "Delete");
        if (opt == JFileChooser.APPROVE_OPTION) {
            int confirm = JOptionPane.showConfirmDialog(fileChooser, "Confirmar exclusão?");
            if (confirm == JOptionPane.YES_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                selectedFile.delete();
            }
        }
    }//GEN-LAST:event_mItemTripulanteExclusaoActionPerformed

    private void mItemSubmarinoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSubmarinoCadastroActionPerformed
        SubmarinoCadastro submarinoCadastro = new SubmarinoCadastro();
        submarinoCadastro.setVisible(true);
    }//GEN-LAST:event_mItemSubmarinoCadastroActionPerformed

    private void mItemSubmarinoExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSubmarinoExclusaoActionPerformed
        File root = new File("./data/embarcacoes");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.setDialogType(JFileChooser.CUSTOM_DIALOG);
        fileChooser.setDialogTitle("Selecione o arquivo");
        
        int opt = fileChooser.showDialog(this, "Delete");
        if (opt == JFileChooser.APPROVE_OPTION) {
            int confirm = JOptionPane.showConfirmDialog(fileChooser, "Confirmar exclusão?");
            if (confirm == JOptionPane.YES_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                selectedFile.delete();
            }
        }
    }//GEN-LAST:event_mItemSubmarinoExclusaoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mItemExcursaoCadastro;
    private javax.swing.JMenuItem mItemSubmarinoCadastro;
    private javax.swing.JMenuItem mItemSubmarinoExclusao;
    private javax.swing.JMenuItem mItemTripulanteCadastro;
    private javax.swing.JMenuItem mItemTripulanteExclusao;
    private javax.swing.JMenu menuEmbarcacao;
    private javax.swing.JMenu menuExcursao;
    private javax.swing.JMenu menuTripulante;
    private javax.swing.JMenu subMenuSubmarino;
    // End of variables declaration//GEN-END:variables
}
