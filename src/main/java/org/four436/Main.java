package org.four436;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JFrame {
    JPanel mainPanel = new MainPanel();
    public Main(){
        setSize(1080,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Elemente de fizică cuantică");
        setVisible(true);
        setResizable(false);
        add(mainPanel);
        setIconImage(new ImageIcon("org/four436/icon.png").getImage());
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        JFrame frame = new Main();
    }
}
