import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            LoginForm loginWindow = new LoginForm();
            loginWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            loginWindow.setVisible(true);
        });
    }
}
