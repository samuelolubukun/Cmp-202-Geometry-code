package Ui;
import oop.Geometry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUi {
    JFrame frame = new JFrame("Geometry");
    JButton areaOfSqBtn = new JButton("Area of square:");
    JButton areaOfTriangle = new JButton("Area of triangle");
    JButton areaOfRectangle = new JButton("Area of rectangle");

    public void mainUI() {
        areaOfSqBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawAreaOfSquareUI();
            }
        });

        areaOfTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawAreaOfTriangleUI();
            }
        });
        frame.add(areaOfSqBtn);
        frame.add(areaOfTriangle);
        frame.add(areaOfRectangle);
        frame.setSize(150, 200);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);
    }


    JFrame areaOfSquareFrame = new JFrame("Area of square");
    JTextField enterLengthOfSquare = new JTextField();

    JButton calculateAreaOfSquare = new JButton("Calculate");

    public void drawAreaOfSquareUI() {
        Geometry geometry = new Geometry();
        areaOfSquareFrame.setLayout(new GridLayout(3, 1));
        areaOfSquareFrame.setSize(300, 200);
        areaOfSquareFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel instructionLabel = new JLabel("Enter length of square:");
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);

        enterLengthOfSquare.setHorizontalAlignment(JTextField.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(calculateAreaOfSquare);

        areaOfSquareFrame.add(instructionLabel);
        areaOfSquareFrame.add(enterLengthOfSquare);
        areaOfSquareFrame.add(buttonPanel);

        areaOfSquareFrame.setVisible(true);

        calculateAreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float area = geometry.areaOfSquare(Float.parseFloat(enterLengthOfSquare.getText()));
                    JOptionPane.showMessageDialog(null, "Area of square is: " + area);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        });
    }

    JFrame areaOfTriangleFrame = new JFrame("Area of Triangle");

    JTextField enterLengthOfTriangle = new JTextField();
    JTextField enterBreadthOfTriangle = new JTextField();
    JButton calculateAreaOfTriangle = new JButton("Calculate");

    public void drawAreaOfTriangleUI() {
        Geometry geometry = new Geometry();
        areaOfTriangleFrame.setLayout(new GridLayout(4, 2));
        areaOfTriangleFrame.setSize(300, 200);
        areaOfTriangleFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel instructionLabel = new JLabel("Enter length and breadth of Triangle:");
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);

        enterLengthOfTriangle.setHorizontalAlignment(JTextField.CENTER);
        enterBreadthOfTriangle.setHorizontalAlignment(JTextField.CENTER);

        JLabel instructionLabel2 = new JLabel("Enter length and breadth of Triangle:");
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);

        enterLengthOfTriangle.setHorizontalAlignment(JTextField.CENTER);
        enterBreadthOfTriangle.setHorizontalAlignment(JTextField.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(calculateAreaOfTriangle);

        areaOfTriangleFrame.add(instructionLabel);
        areaOfTriangleFrame.add(enterLengthOfTriangle);
        areaOfTriangleFrame.add(enterBreadthOfTriangle);
        areaOfTriangleFrame.add(buttonPanel); // add button panel to frame

        areaOfTriangleFrame.setVisible(true);

        calculateAreaOfTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float area = geometry.areaOfTriangle(Float.parseFloat(enterLengthOfTriangle.getText()),
                            Float.parseFloat(enterBreadthOfTriangle.getText()));
                    JOptionPane.showMessageDialog(null, "Area of triangle is: " + area);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
            }
        });
    }
}