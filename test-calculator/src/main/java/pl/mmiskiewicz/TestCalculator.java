package pl.mmiskiewicz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalculator {
    private JLabel screen;
    private boolean start;
    private String lastCommand;
    private double result;

    public TestCalculator(){
        start = true;
        lastCommand = "=";
        result = 0;
        JFrame frame = new JFrame();
        screen = new JLabel("0", JLabel.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(screen, BorderLayout.NORTH);
        frame.add(makeButtonsPanel(), BorderLayout.CENTER);

        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private JPanel makeButtonsPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            panel.add(addButton(button));
        }

        return panel;
    }

    private JButton addButton(String name) {
        JButton button = new JButton(name);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.addActionListener(calcListener);
        return button;
    }

    private final ActionListener calcListener = action -> {
        String value = ((JButton)action.getSource()).getText();
        if("/+-*=".contains(value)){
            calculate(value);
        }else {
            insertNumber(value);
        }
    };

    public void calculate(String value){
        double num = Double.parseDouble(screen.getText());
        if (lastCommand.equals("=")){
            result = num;
        }else if (lastCommand.equals("+")){
            result += num;
        }else if (lastCommand.equals("-")){
            result -= num;
        }else if (lastCommand.equals("*")){
            result *= num;
        }else if (lastCommand.equals("/")){
            result /= num;
        }
        screen.setText("" + result);
        lastCommand = value;
        start = true;
    }

    public void insertNumber(String value) {
        if (start) {
            screen.setText("");
            start = false;
        }
        screen.setText(screen.getText() + value);
    }
}
