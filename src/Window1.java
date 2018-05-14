import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Sun Jan 14 12:36:50 CET 2018
 */



/**
 * @author unknown
 */
public class Window1 extends JFrame {
    public Window1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jakub Mitulski
        ResourceBundle bundle = ResourceBundle.getBundle("resource");
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FormLayout(
            "4*(default, $lcgap), default",
            "4*(default, $lgap), default"));

        //---- label1 ----
        label1.setText(bundle.getString("Window1.label1.text"));
        contentPane.add(label1, CC.xy(9, 9));
        setSize(510, 380);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jakub Mitulski
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
