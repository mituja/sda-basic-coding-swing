import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Sun Jan 14 15:05:13 CET 2018
 */


/**
 * @author Jakub Mitulski
 */
public class ContentWindow extends JFrame {
    public ContentWindow() {
        initComponents();
    }

    private void loadButtonMouseClicked(MouseEvent e) {
        String col[] = {"ID", "Name", "Products"};
        DefaultTableModel defaultTableModel =
                new DefaultTableModel(col, 0);

        List<Order> orderList = OrderController.getData();
        orderList.forEach(order -> {
            Object[] o = {order.getNumber(), order.getName(), order.getProducts()};
            defaultTableModel.addRow(o);
        });
        table1.setModel(defaultTableModel);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jakub Mitulski
        ResourceBundle bundle = ResourceBundle.getBundle("resource");
        loadButton = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "default, $lcgap, default",
            "2*(default, $lgap), default"));

        //---- loadButton ----
        loadButton.setText(bundle.getString("contentWindow.loadButton.text"));
        loadButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadButtonMouseClicked(e);
            }
        });
        contentPane.add(loadButton, CC.xy(3, 1));

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {"", "", ""},
                    {null, null, null},
                },
                new String[] {
                    "Number", "Name", "Products"
                }
            ));
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, CC.xy(3, 5));
        setSize(400, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jakub Mitulski
    private JButton loadButton;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
