
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author thesh
 */
public class MenuPanel extends JPanel {

    private JTextField output;
    private JTextField input;
    private JButton addButton;
    private JButton subtractButton;
    private JButton zeroButton;

    public MenuPanel(JTextField output, JTextField input) {
        super(new GridLayout(1, 3));
        this.output = output;
        this.input = input;
        this.addButton = new JButton("+");
        this.subtractButton = new JButton("-");
        this.zeroButton = new JButton("Z");
        this.zeroButton.setEnabled(false);
        this.createComponents();
    }

    private void createComponents() {
        // create the buttons on the panel
        this.add(addButton);
        this.add(subtractButton);
        this.add(zeroButton);
        // create a new instance of our actionListener and add it to the calculator buttons
        EventListener e = new EventListener(output, input, zeroButton, addButton, subtractButton);
        this.addButton.addActionListener(e);
        this.subtractButton.addActionListener(e);
        this.zeroButton.addActionListener(e);

    }
}
