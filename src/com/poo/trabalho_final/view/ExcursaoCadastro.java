/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poo.trabalho_final.view;

import com.poo.trabalho_final.controller.FileHandler;
import com.poo.trabalho_final.controller.SingleRootFileSystemView;
import com.poo.trabalho_final.model.Destino;
import com.poo.trabalho_final.model.Excursao;
import com.poo.trabalho_final.model.Submarino;
import com.poo.trabalho_final.model.Tripulante;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Computacao
 */
public class ExcursaoCadastro extends javax.swing.JFrame {
    private final Excursao excursao;

    /**
     * Creates new form ExcursaoCadastro
     */
    public ExcursaoCadastro() {
        initComponents();
        this.excursao = new Excursao();
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
        btnSelecionarSubmarino = new javax.swing.JButton();
        lbSubmarinoEscolhido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSelecionarTripulantes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ftxPartida = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSelecionarDestino = new javax.swing.JButton();
        lbDestinoEscolhido = new javax.swing.JLabel();
        btnCadastrarExcursao = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbTripulantesEscolhidos = new javax.swing.JLabel();

        jLabel1.setText("Submarino");

        btnSelecionarSubmarino.setText("Selecionar");
        btnSelecionarSubmarino.setEnabled(false);
        btnSelecionarSubmarino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarSubmarinoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tripulantes");

        btnSelecionarTripulantes.setText("Selecionar");
        btnSelecionarTripulantes.setEnabled(false);
        btnSelecionarTripulantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarTripulantesActionPerformed(evt);
            }
        });

        jLabel3.setText("Partida");

        try {
            ftxPartida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setLabelFor(btnSelecionarDestino);
        jLabel4.setText("Destino");

        btnSelecionarDestino.setText("Selecionar");
        btnSelecionarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarDestinoActionPerformed(evt);
            }
        });

        btnCadastrarExcursao.setText("Confirmar");
        btnCadastrarExcursao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarExcursaoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        lbTripulantesEscolhidos.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(96, 96, 96)
                                .addComponent(btnSelecionarSubmarino))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSelecionarDestino)
                                    .addComponent(btnSelecionarTripulantes))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbSubmarinoEscolhido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDestinoEscolhido, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addComponent(lbTripulantesEscolhidos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(96, 96, 96)
                        .addComponent(ftxPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnCadastrarExcursao)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSelecionarDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(lbDestinoEscolhido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnSelecionarSubmarino))
                    .addComponent(lbSubmarinoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSelecionarTripulantes)
                    .addComponent(lbTripulantesEscolhidos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftxPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnCadastrarExcursao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarDestinoActionPerformed
        FileHandler<Destino> fileHandler = new FileHandler();
        
        File root = new File("./data/destinos");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.setDialogTitle("Selecionar:");
        
        int userSelection = fileChooser.showOpenDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToRead = fileChooser.getSelectedFile();
            
            try {
                this.excursao.setDestino(fileHandler.read(fileToRead.getAbsolutePath()));
                lbDestinoEscolhido.setText(this.excursao.getDestino().getNome());
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExcursaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        btnSelecionarSubmarino.setEnabled(true);
    }//GEN-LAST:event_btnSelecionarDestinoActionPerformed

    private void btnSelecionarSubmarinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarSubmarinoActionPerformed
        FileHandler<Submarino> fileHandler = new FileHandler();
        
        File root = new File("./data/embarcacoes");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.setDialogTitle("Selecionar:");
        
        int userSelection = fileChooser.showOpenDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToRead = fileChooser.getSelectedFile();
            
            try {
                this.excursao.setSubmarino(fileHandler.read(fileToRead.getAbsolutePath()));
                lbSubmarinoEscolhido.setText(this.excursao.getSubmarino().getNome());
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExcursaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        btnSelecionarTripulantes.setEnabled(true);
    }//GEN-LAST:event_btnSelecionarSubmarinoActionPerformed

    private void btnSelecionarTripulantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarTripulantesActionPerformed
        FileHandler<Tripulante> fileHandler = new FileHandler();
        
        File root = new File("./data/tripulantes");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.setDialogTitle("Selecionar:");
        fileChooser.setMultiSelectionEnabled(true);
        
        int userSelection = fileChooser.showOpenDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File[] filesToRead = fileChooser.getSelectedFiles();
            
            if (filesToRead.length > this.excursao.getSubmarino().getCapacidade()) {
                JOptionPane.showMessageDialog(this, "A quantidade de passageiros escolhidos excedem a capacidade da embarcação.\nCapacidade: " + this.excursao.getSubmarino().getCapacidade() + ".\nSelecione novamente.", "Capacidade máxima excedida", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            Tripulante aux[] = new Tripulante[this.excursao.getSubmarino().getCapacidade()]; 

            int counter = 0;
            for (File fileToRead : filesToRead) {
                try {
                    aux[counter] = fileHandler.read(fileToRead.getAbsolutePath());
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ExcursaoCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
                counter++;
            }
            
            this.excursao.setTripulantes(aux);
            
            String htmlTripulantesEscolhidos = "<html><ul>";
            for (Tripulante t : this.excursao.getTripulantes()) {
                if (t == null) break;
                htmlTripulantesEscolhidos += ("<li>" + t.getNome() + "</li>");
            }
            lbTripulantesEscolhidos.setText(htmlTripulantesEscolhidos);
            
        }
    }//GEN-LAST:event_btnSelecionarTripulantesActionPerformed

    private void btnCadastrarExcursaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarExcursaoActionPerformed
        this.excursao.setPartida(ftxPartida.getText());
        
        FileHandler<Excursao> fileHandler = new FileHandler();
        
        File root = new File("./data/excursoes");
        root.mkdir();
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.setDialogTitle("Salvar como:");
        
        int userSelection = fileChooser.showSaveDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            
            try {
                fileHandler.save(fileToSave.getAbsolutePath(), this.excursao);
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCadastrarExcursaoActionPerformed

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
            java.util.logging.Logger.getLogger(ExcursaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcursaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcursaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcursaoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcursaoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarExcursao;
    private javax.swing.JButton btnSelecionarDestino;
    private javax.swing.JButton btnSelecionarSubmarino;
    private javax.swing.JButton btnSelecionarTripulantes;
    private javax.swing.JFormattedTextField ftxPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbDestinoEscolhido;
    private javax.swing.JLabel lbSubmarinoEscolhido;
    private javax.swing.JLabel lbTripulantesEscolhidos;
    // End of variables declaration//GEN-END:variables
}
