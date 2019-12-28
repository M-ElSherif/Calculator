
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author thesh
 */
public class EventListener implements ActionListener {

    private JTextField output;  // output text field
    private JTextField input;   // input text field
    private JButton plusButton; // addition button
    private JButton minusButton;    // subtraction button
    private JButton zeroButton;     // reset button
    private BasicCalculator calc;   // new instance of calculator class

    public EventListener(JTextField output, JTextField input, JButton zeroButton, JButton plusButton, JButton minusButton) {
        this.output = output;
        this.input = input;
        this.zeroButton = zeroButton;
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.calc = new BasicCalculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int value = 0;
        try {
            value = Integer.parseInt(this.input.getText());
        }
        catch (Exception e) {
        }
        Object source = ae.getSource();     // retrieve button pressed
        // based on button pressed, perform corresponding calculation
        if (source.equals(this.plusButton)) {
            this.calc.add(value);
        }
        else if (source.equals(this.minusButton)) {
            this.calc.subtract(value);
        }
        else if (source.equals(this.zeroButton)) {
            this.calc.zero();
        }
        this.input.setText("");     // clear input field
        int result = this.calc.getValue();
        this.output.setText(this.calc.getValue() + "");     // set output field to new calculated result
        // zero button to be disabled if output is zero
        if (result == 0) {
            this.zeroButton.setEnabled(false);
        }
        else {
            this.zeroButton.setEnabled(true);
        }
    }
}
