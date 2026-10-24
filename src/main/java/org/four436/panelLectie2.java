package org.four436;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panelLectie2 extends JPanel {
    private JLabel title = new JLabel("Energia fotonului");
    private JLabel content = new JLabel("<html>Lumina este formată din fotoni, fiecare având energia \n" +
            "\uD835\uDC38\n" +
            "=\n" +
            "ℎ\n" +
            "\uD835\uDF08\n" +
            ". Energia crește odată cu frecvența radiației, nu cu intensitatea.</html> ");
    private JButton previosButton = new JButton("Anterior");
    private JButton nextButton = new JButton("Următor");
    public panelLectie2(){
        setupComponents();
        setLayout(null);
        add(title);
        add(content);
        add(previosButton);
        add(nextButton);
    }

    private void setupComponents() {
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 36));
        title.setBounds(0, 0, 1080, 150);

        content.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 24));
        content.setBounds(100, 200, 880, 400);

        nextButton.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 24));
        nextButton.setBounds(680, 600, 200, 50);
        nextButton.addActionListener(new ButtonHandler());


        previosButton.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 24));
        previosButton.setBounds(200, 600, 200, 50);
        previosButton.addActionListener(new ButtonHandler());
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == previosButton){
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelLectie2.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie1());
                frame.revalidate();
                frame.repaint();
            }else if(e.getSource() == nextButton){
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelLectie2.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie3());
                frame.revalidate();
                frame.repaint();
            }
        }
    }
}
