package org.four436;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private JLabel title = new JLabel("Elemente de fizică cuantică");
    private JButton lectieButton = new JButton("Lecție");
    private JButton testButton = new JButton("Test");


    public MainPanel(){
        setLayout(null);
        setupComponents();
        add(title);
        add(lectieButton);
        add(testButton);
    }

    private void setupComponents() {
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 36));
        title.setBounds( 0,0,1080,150);

        lectieButton.setFont(new Font("Serif", Font.PLAIN, 24));
        lectieButton.setBounds( 440,300,200,50);
        lectieButton.addActionListener(new ButtonHandler());


        testButton.setFont(new Font("Serif", Font.PLAIN, 24));
        testButton.setBounds( 440,400,200,50);
        testButton.addActionListener(new ButtonHandler());
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource() == lectieButton){
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MainPanel.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie1());
                frame.revalidate();
                frame.repaint();
            }else if(e.getSource() == testButton){
                nota.notaFinala = 1;
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MainPanel.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelTest1());
                frame.revalidate();
                frame.repaint();
            }
        }

    }

}
