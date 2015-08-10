/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pl.mariuszczarny.investorsimulator.controller.InvestmentFundsController;

/**
 *
 * @author mariusz
 */
public class MainFrame {
    private static InvestmentFundsController controller;
    
    	public static InvestmentFundsController getController() {
		if (controller==null){
			controller= new InvestmentFundsController();

		}
		return controller;
	}

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setTitle("OKNO TESTOWE");
                frame.setSize(300, 250);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = getController().getView().buildPanel();
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
