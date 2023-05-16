package Ui;
import oop.Geometry;
import files.FileWriterMain;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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

        areaOfRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawAreaOfRectangleUI();
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
                    FileWriterMain.writeData("Area Of Square with length: "
                            +enterLengthOfSquare.getText()+" is "+ area);
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


        enterLengthOfTriangle.setHorizontalAlignment(JTextField.CENTER);
        enterBreadthOfTriangle.setHorizontalAlignment(JTextField.CENTER);

        JLabel instructionLabel2 = new JLabel("Enter length and breadth of Triangle:");
        instructionLabel2.setHorizontalAlignment(JLabel.CENTER);

        enterLengthOfTriangle.setHorizontalAlignment(JTextField.CENTER);
        enterBreadthOfTriangle.setHorizontalAlignment(JTextField.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        buttonPanel.add(calculateAreaOfTriangle);

        areaOfTriangleFrame.add(instructionLabel2);
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
                    FileWriterMain.writeData("Area Of Triangle with length: "
                            +enterLengthOfTriangle.getText()+"and breadth:"+enterBreadthOfTriangle.getText()+" is "+ area);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
            }
        });
    }

        JFrame areaOfRectangleFrame = new JFrame("Area of Rectangle");

        JTextField enterLengthOfRectangle = new JTextField();
        JTextField enterBreadthOfRectangle = new JTextField();
        JButton calculateAreaOfRectangle = new JButton("Calculate");

        public void drawAreaOfRectangleUI() {
            Geometry geometry = new Geometry();
            areaOfRectangleFrame.setLayout(new GridLayout(4, 2));
            areaOfRectangleFrame.setSize(300, 200);
            areaOfRectangleFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            enterLengthOfRectangle.setHorizontalAlignment(JTextField.CENTER);
            enterBreadthOfRectangle.setHorizontalAlignment(JTextField.CENTER);

            JLabel instructionLabel3 = new JLabel("Enter length and breadth of Rectangle:");
            instructionLabel3.setHorizontalAlignment(JLabel.CENTER);

            enterLengthOfRectangle.setHorizontalAlignment(JTextField.CENTER);
            enterBreadthOfRectangle.setHorizontalAlignment(JTextField.CENTER);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());

            buttonPanel.add(calculateAreaOfRectangle);

            areaOfRectangleFrame.add(instructionLabel3);
            areaOfRectangleFrame.add(enterLengthOfRectangle);
            areaOfRectangleFrame.add(enterBreadthOfRectangle);
            areaOfRectangleFrame.add(buttonPanel); // add button panel to frame

            areaOfRectangleFrame.setVisible(true);

            calculateAreaOfRectangle.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        float area = geometry.areaOfRectangle(Float.parseFloat(enterLengthOfRectangle.getText()),
                                Float.parseFloat(enterBreadthOfRectangle.getText()));
                        JOptionPane.showMessageDialog(null, "Area of Rectangle is: " + area);
                        FileWriterMain.writeData("Area Of Rectangle with length: "
                                +enterLengthOfRectangle.getText()+"and breadth:"+enterBreadthOfRectangle.getText()+" is "+ area);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                    }
                }
            });
        }

}