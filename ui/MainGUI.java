
public class MainGUI {
    private JFrame frame;

    public SwingTest() {
        frame = new JFrame("Visual Bookz");
    }

    private void display() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingTest test = new SwingTest();
        test.display();
    }
}
