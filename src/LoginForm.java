import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Sun Jan 14 13:55:37 CET 2018
 */



/**
 * @author Jakub Mitulski
 */
public class LoginForm extends JFrame {
    public LoginForm() {
        initComponents();
    }

    private void okButtonMouseClicked(MouseEvent e) {
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        if (UserController.authenticated(username, password)){
            setVisible(false);
            ContentWindow contentWindow = new ContentWindow();
            contentWindow.setVisible(true);
            contentWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            contentWindow.setTitle("Welcome " + username + ", your orders are below:");
        } else {
            errorLabel.setText("Bad username or password");
        }
    }

    private void okButtonKeyPressed(KeyEvent e) {
        okButtonMouseClicked(null);
    }

    private void cancelButtonMouseClicked(MouseEvent e) {
        //setVisible(false); //wylaczy tylko widocznosc, ale apka caly czas dziala
        //System.exit(0); //ubija apke
        dispose();  //dedykowana metoda zamkniecia apki
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jakub Mitulski
        ResourceBundle bundle = ResourceBundle.getBundle("resource");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        usernameTextField = new JTextField();
        label2 = new JLabel();
        passwordTextField = new JPasswordField();
        errorLabel = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        helpButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.createEmptyBorder("7dlu, 7dlu, 7dlu, 7dlu"));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new FormLayout(
                    "default, $lcgap, 38dlu, $lcgap, 95dlu",
                    "4*(default, $lgap), default"));

                //---- label1 ----
                label1.setText(bundle.getString("LoginForm.label1.text"));
                contentPanel.add(label1, CC.xy(3, 3));
                contentPanel.add(usernameTextField, CC.xy(5, 3));

                //---- label2 ----
                label2.setText(bundle.getString("LoginForm.label2.text"));
                contentPanel.add(label2, CC.xy(3, 5));
                contentPanel.add(passwordTextField, CC.xy(5, 5));

                //---- errorLabel ----
                errorLabel.setText(bundle.getString("LoginForm.errorLabel.text"));
                contentPanel.add(errorLabel, CC.xy(5, 9));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(Borders.createEmptyBorder("5dlu, 0dlu, 0dlu, 0dlu"));
                buttonBar.setLayout(new FormLayout(
                    "$glue, 2*($button, $rgap), $button",
                    "pref"));

                //---- okButton ----
                okButton.setText(bundle.getString("LoginForm.okButton.text"));
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        okButtonMouseClicked(e);
                    }
                });
                okButton.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        okButtonKeyPressed(e);
                    }
                });
                buttonBar.add(okButton, CC.xy(2, 1));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("LoginForm.cancelButton.text"));
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        cancelButtonMouseClicked(e);
                    }
                });
                buttonBar.add(cancelButton, CC.xy(4, 1));

                //---- helpButton ----
                helpButton.setText(bundle.getString("LoginForm.helpButton.text"));
                buttonBar.add(helpButton, CC.xy(6, 1));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(520, 400);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jakub Mitulski
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField usernameTextField;
    private JLabel label2;
    private JPasswordField passwordTextField;
    private JLabel errorLabel;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JButton helpButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
