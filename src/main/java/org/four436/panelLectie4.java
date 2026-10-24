package org.four436;

import javax.swing.*;

public class panelLectie4 extends JPanel {
    private JLabel title = new JLabel("Ecuația lui Einstein");
    private JLabel content = new JLabel("<html>Fotonul transferă electronului energia sa:\n" +
            "\n" +
            "ℎ\n" +
            "\uD835\uDF08\n" +
            "=\n" +
            "\uD835\uDC3F\n" +
            "extr\n" +
            "+\n" +
            "\uD835\uDC3E\n" +
            "max\n" +
            "\t\u200B\n" +
            "\n" +
            ".\n" +
            "Excesul devine energie cinetică a electronului.</html>");
    private JButton previosButton = new JButton("Anterior");
    private JButton nextButton = new JButton("Următor");
    public panelLectie4(){
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

        previosButton.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 24));
        previosButton.setBounds(200, 600, 200, 50);
        previosButton.addActionListener(new ButtonHandler());

        nextButton.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 24));
        nextButton.setBounds(680, 600, 200, 50);
        nextButton.addActionListener(new ButtonHandler());
    }

    private class ButtonHandler implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == previosButton) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelLectie4.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie3());
                frame.revalidate();
                frame.repaint();
            } else if (e.getSource() == nextButton) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelLectie4.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie5());
                frame.revalidate();
                frame.repaint();
            }
        }
    }
}
