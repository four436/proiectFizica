package org.four436;

import javax.swing.*;

public class panelLectie5 extends JPanel {
    private JLabel title = new JLabel("Tensiunea de stopare");
    private JLabel content = new JLabel("<html>Electronii sunt opriți de tensiunea \n" +
            "\uD835\uDC48\n" +
            "0\n" +
            "\t\u200B\n" +
            "\n" +
            ", care fixează energia maximă:\n" +
            "\n" +
            "\uD835\uDC3E\n" +
            "max\n" +
            "\u2061\n" +
            "=\n" +
            "\uD835\uDC52\n" +
            "\uD835\uDC48\n" +
            "0\n" +
            "\t\u200B\n" +
            "\n" +
            ".\n" +
            "Măsurarea lui \n" +
            "\uD835\uDC48\n" +
            "0\n" +
            "\t\u200B\n" +
            "\n" +
            " confirmă modelul cuantic.</html>");
    private JButton previosButton = new JButton("Anterior");
    private JButton nextButton = new JButton("Următor");
    public panelLectie5(){
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelLectie5.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie4());
                frame.revalidate();
                frame.repaint();
            } else if (e.getSource() == nextButton) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelLectie5.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelLectie6());
                frame.revalidate();
                frame.repaint();
            }
        }
    }
}
