package com.poo.trabalho_final.view;

import com.poo.trabalho_final.controller.SingleRootFileSystemView;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class Home {
    public static void main(String args[]) {
        File root = new File(".");
        FileSystemView fsv = new SingleRootFileSystemView(root); 
        JFileChooser fileChooser = new JFileChooser(root, fsv);
        fileChooser.getActionMap().get("New Folder").setEnabled(false);
        fileChooser.showOpenDialog(fileChooser);
    }
}
