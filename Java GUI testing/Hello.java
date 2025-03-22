import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
