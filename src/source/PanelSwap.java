/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelSwap extends JPanel implements ActionListener {

    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();

    public PanelSwap() {
        super(new BorderLayout());
        firstPanel.setBackground(Color.RED);

        secondPanel.setBackground(Color.YELLOW);

        JButton swap1 = new JButton("SwapToYellow");
        swap1.addActionListener(this);

        JButton swap2 = new JButton("SwapToRed");
        swap2.addActionListener(this);

        firstPanel.add(swap1);
        secondPanel.add(swap2);

        add(firstPanel);
    }

    /** Listens to the buttons and perform the swap. */
    public void actionPerformed(ActionEvent e) {

        for (Component component : getComponents())
            if (firstPanel == component) {
                remove(firstPanel);
                add(secondPanel);

            } else {
                remove(secondPanel);
                add(firstPanel);
            }

        repaint();
        revalidate();
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("PanelSwap");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the content pane.
        JComponent newContentPane = new PanelSwap();
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}