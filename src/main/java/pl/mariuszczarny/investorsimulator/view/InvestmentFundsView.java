/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.mariuszczarny.investorsimulator.view;

import javax.swing.*;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;
import pl.mariuszczarny.investorsimulator.model.InvestFundTypeEnum;
import pl.mariuszczarny.investorsimulator.model.dto.InvestmentFundsModel;
import pl.mariuszczarny.investorsimulator.util.ToolTipContants;
import pl.mariuszczarny.investorsimulator.util.ViewConstants;
/**
 *
 * @author mariusz
 */
public class InvestmentFundsView extends JPanel {
    private InvestmentFundsModel model;
    private JComboBox investFundComboBox;
    private JButton sellButton;
    private JButton buyButton;
    private JPanel mainPanel;
    private JSpinner unitSpinner;
    private JTextField amountTextfield;
    
    public InvestmentFundsView(InvestmentFundsModel model) {
        this.model = model;
    }
    
    public JPanel buildPanel() {
        FormLayout layout = new FormLayout(
                "right:max(40dlu;pref), 3dlu, 70dlu, 7dlu, "
              + "right:max(40dlu;pref), 3dlu, 70dlu",
                "");
        DefaultFormBuilder builder = new DefaultFormBuilder(layout);
        builder.setDefaultDialogBorder();

        builder.appendSeparator("Separator");

        builder.append("Button1", getSellButton());
        builder.nextLine();

        builder.append("Button2",   getBuyButton());          
        builder.append("Combobox", getFundTypesComboBox());
        builder.append("Spinner", getUnitSpinner());
        builder.append("Konto", getAmountTextfield());

        return builder.getPanel();
    }

    public JButton getSellButton() {
        if (sellButton == null) {
            sellButton = new JButton(ViewConstants.SELL_BUTTON.getValue());
            sellButton.setToolTipText(ToolTipContants.SELL_BUTTON_TIP.getValue());
        }
        return sellButton;
    }

    public JButton getBuyButton() {
        if (buyButton == null) {
            buyButton = new JButton(ViewConstants.BUY_BUTTON.getValue());
            buyButton.setToolTipText(ToolTipContants.BUY_BUTTON_TIP.getValue());
        }
        return buyButton;
    }

    public JComboBox getFundTypesComboBox() {
        if (investFundComboBox == null) {
            investFundComboBox = new JComboBox(fillInvestFundComboBox());
            investFundComboBox.setSize(100, 20);
        }
        return investFundComboBox;
    }

    public JSpinner getUnitSpinner() {
        if (unitSpinner == null) {
            unitSpinner = new JSpinner(getModel().getSpinnerNumberModel());
        }
        return unitSpinner;
    }

    public JTextField getAmountTextfield() {
        if (amountTextfield == null) {
            amountTextfield = new JTextField(getModel().getAmountModel(), "1000", 1);
        }
        return amountTextfield;
    }

    private static InvestFundTypeEnum[] fillInvestFundComboBox() {
        return InvestFundTypeEnum.values();
    }

    public InvestmentFundsModel getModel() {
        return model;
    }

    public void setModel(InvestmentFundsModel model) {
        this.model = model;
    }
}
