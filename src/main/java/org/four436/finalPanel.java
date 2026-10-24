package org.four436;

import javax.swing.*;

public class finalPanel extends JPanel {

    private JLabel finalLabel = new JLabel("Ai terminat testul! Scor final: " + nota.notaFinala + "/10");
    private JButton homeButton = new JButton("Pagina de pornire");

    public finalPanel(){
        setupComponents();
        setLayout(null);
        add(finalLabel);
        add(homeButton);
    }

    private void setupComponents() {
        finalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        finalLabel.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 24));
        finalLabel.setBounds(0, 0, 1080, 150);

        homeButton.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        homeButton.setBounds(440, 300, 200, 50);
        homeButton.addActionListener(new homeButtonHandler());
    }

    private class homeButtonHandler implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(finalPanel.this);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new MainPanel());
            frame.revalidate();
            frame.repaint();
        }
    }

}
