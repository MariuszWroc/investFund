/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.view;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author mariusz
 */
public class MainFrame {
        public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                FundsPanel frame = new FundsPanel();
                frame.setVisible(true);
            }
        });
    }
}
