/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mariusz
 */
public class FundsPanel extends JFrame {
    public FundsPanel() {
        initUI();
    }

    private void initUI() {
        setTitle("OKNO TESTOWE");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JButton sellButton = new JButton("SPRZEDAJ");
        JButton buyButton = new JButton("KUP");
        
        doSell(sellButton);
        doBuy(buyButton);
        
        // lewy , górny , prawy, dolny)
        sellButton.setBounds(0, 0, 150, 25);
        buyButton.setBounds(0, 25, 150, 25);
        
        add(sellButton);
        add(buyButton);
    }

    private void doBuy(JButton buyButton) {
        buyButton.setToolTipText("");
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operation.buy();
            }
        });
    }

    private void doSell(JButton sellButton) {
        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Operation.sell();
            }
        });
    }
}
