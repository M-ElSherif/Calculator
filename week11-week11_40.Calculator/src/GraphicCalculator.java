

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300, 200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField output = new JTextField("0");
        output.setEnabled(false);   // sets text field so it only shows output (no modification)
        container.add(output);
        JTextField input = new JTextField();
        container.add(input);
        MenuPanel buttons = new MenuPanel(output, input);
        container.add(buttons);
    }

    public JFrame getFrame() {
        return frame;
    }
}
