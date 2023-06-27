/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.trabalho_final.view;

import com.poo.trabalho_final.controller.SingleRootFileSystemView;
import java.io.File;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Pedro Lucas
 */
public class Home {
    public static void main(String args[]) {
        File root = new File(".");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        /*fileChooser.removeChoosableFileFilter(fileChooser.getAcceptAllFileFilter());
        fileChooser.addChoosableFileFilter( new FileFilter()
        {
        @Override
        public boolean accept(File f)
        {
        return ! f.isDirectory();
        }
        
        @Override
        public String getDescription()
        {
        return "Files only";
        }
        });*/
        fileChooser.showOpenDialog(fileChooser);
    }
}
