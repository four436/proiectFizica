package org.four436;

import javax.swing.*;
import java.awt.*;

public class panelTest7 extends JPanel {
    private  JLabel testLabel = new JLabel("7. Ce demonstrează efectul Compton?");
    private JRadioButton option1 = new JRadioButton("A. Fotonii au masă mare");
    private JRadioButton option2 = new JRadioButton("B. Lumina este doar undă");
    private JRadioButton option3 = new JRadioButton("C. Natura corpusculară a radiației");
    private JRadioButton option4 = new JRadioButton("D. Lumina nu poate interacționa cu electronii");
    private ButtonGroup optionsGroup = new ButtonGroup();
    private JButton nextButton = new JButton("Următoarea întrebare");

    public panelTest7(){
        setLayout(null);
        setupComponents();
        add(testLabel);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
    }

    private void setupComponents() {
        testLabel.setHorizontalAlignment(SwingConstants.CENTER);
        testLabel.setFont(new java.awt.Font("Serif", java.awt.Font.BOLD, 24));
        testLabel.setBounds(0, 0, 1080, 150);

        option1.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        option1.setBounds(100, 200, 900, 40);

        option2.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        option2.setBounds(100, 250, 900, 40);

        option3.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        option3.setBounds(100, 300, 900, 40);

        option4.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 20));
        option4.setBounds(100, 350, 900, 40);
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);
        option1.addActionListener(new radioButtonHandler());
        option2.addActionListener(new radioButtonHandler());
        option3.addActionListener(new radioButtonHandler());
        option4.addActionListener(new radioButtonHandler());
    }
    private class radioButtonHandler implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == option3) {
                nota.notaFinala++;
            }
            nextQuestion();
        }
    }

    private void nextQuestion() {
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
        option1.setBackground(Color.red);
        option2.setBackground(Color.red);
        option3.setBackground(Color.green);
        option4.setBackground(Color.red);
        add(nextButton);
        nextButton.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 24));
        nextButton.setBounds( 440,500,250,50);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panelTest7.this);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new panelTest8());
                frame.revalidate();
                frame.repaint();
            }
        });
        revalidate();
        repaint();
    }
}
