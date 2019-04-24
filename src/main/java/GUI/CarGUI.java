package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Factory.HondaMaker;


public class CarGUI {

    static GraphicsConfiguration gc;
    String[] color = { "Black", "Silver", "Charcoal", "White", "Metallic Red", "Metallic Blue" };
    String[] type = { "4 dr sedan", "2 dr coupe" };
    Integer[] engine = { 4, 6 };
    String[] chassis = { "Steel", "Aluminum" };
    String[] transmission = { "Manual", "Automatic" };
    String[] tire = { "17", "18", "19" };

    public CarGUI() {
        HondaMaker honda = new HondaMaker();
        initComponents(honda);
    }

    private void initComponents(HondaMaker honda) {
        JFrame frame= new JFrame("Border Layout");
        frame.setTitle("Honda Car Picker");
        frame.setSize(600, 400);
        frame.setLocation(200, 200);
        
        //----------------
        //Panel and Layout
        //----------------
        JPanel panel = new JPanel();
        GridBagLayout g = new GridBagLayout();
        panel.setLayout(g);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        //----------------
        //End of Panel/Layout
        //----------------

        //----------------
        //adding comboBoxes
        //----------------
        JLabel paintLabel = new JLabel("Choose Paint: ");
        JComboBox<String> paintList = new JComboBox<String>(color);
        JLabel typeLabel = new JLabel("Choose Type: ");
        JComboBox<String> carList = new JComboBox<String>(type);
        JLabel engineLabel = new JLabel("Choose Engine: ");
        JComboBox<Integer> engineList = new JComboBox<Integer>(engine);
        JLabel chassisLabel = new JLabel("Choose Chassis: ");
        JComboBox<String> chassisList = new JComboBox<String>(chassis);
        JLabel trannyLabel = new JLabel("Choose Transmission: ");
        JComboBox<String> trannyList = new JComboBox<String>(transmission);
        JLabel tireLabel = new JLabel("Choose Tire Size: ");
        JComboBox<String> tireList = new JComboBox<String>(tire);
        JLabel priceLabel = new JLabel("0");
        JButton applyList = new JButton("Apply");
        JButton buyList = new JButton("Purchase");
        //paintList.setPreferredSize(new Dimension(20, 100));
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        g.setConstraints(paintLabel, c);
        panel.add(paintLabel);
        c.gridx = 1;
        c.gridy = 0;
        g.setConstraints(paintList, c);
        panel.add(paintList);
        paintList.setSelectedIndex(-1);
        c.gridx = 0;
        c.gridy = 1;
        g.setConstraints(typeLabel, c);
        panel.add(typeLabel);
        c.gridx = 1;
        c.gridy = 1;
        g.setConstraints(carList, c);
        panel.add(carList);
        carList.setSelectedIndex(-1);
        c.gridx = 0;
        c.gridy = 2;
        g.setConstraints(engineLabel, c);
        panel.add(engineLabel);
        c.gridx = 1;
        c.gridy = 2;
        g.setConstraints(engineList, c);
        panel.add(engineList);
        engineList.setSelectedIndex(-1);
        c.gridx = 0;
        c.gridy = 3;
        g.setConstraints(chassisLabel, c);
        panel.add(chassisLabel);
        c.gridx = 1;
        c.gridy = 3;
        g.setConstraints(chassisList, c);
        panel.add(chassisList);
        chassisList.setSelectedIndex(-1);
        c.gridx = 0;
        c.gridy = 4;
        g.setConstraints(trannyLabel, c);
        panel.add(trannyLabel);
        c.gridx = 1;
        c.gridy = 4;
        g.setConstraints(trannyList, c);
        panel.add(trannyList);
        trannyList.setSelectedIndex(-1);
        c.gridx = 0;
        c.gridy = 5;
        g.setConstraints(tireLabel, c);
        panel.add(tireLabel);
        c.gridx = 1;
        c.gridy = 5;
        g.setConstraints(tireList, c);
        panel.add(tireList);
        tireList.setSelectedIndex(-1);
        c.gridx = 0;
        c.gridy = 6;
        g.setConstraints(priceLabel, c);
        panel.add(priceLabel);
        c.gridx = 1;
        c.gridy = 6;
        g.setConstraints(applyList, c);
        panel.add(applyList);
        c.gridx = 1;
        c.gridy = 7;
        g.setConstraints(buyList, c);
        panel.add(buyList);
        //----------------
        //End of adding CB
        //----------------

        //----------------
        //Add listeners
        //----------------

        paintList.addActionListener(
            e -> {
                System.out.println("Value: " + paintList.getSelectedItem());
                honda.setPaint(paintList.getSelectedItem().toString());
            }
        );

        carList.addActionListener(
            e -> {
                System.out.println("Value: " + carList.getSelectedItem());
                honda.setCarType(carList.getSelectedItem().toString());
            }
        );

        engineList.addActionListener(
            e -> {
                System.out.println("Value: " + engineList.getSelectedItem());
                honda.setEngine(Integer.parseInt(engineList.getSelectedItem().toString()));
            }
        );

        chassisList.addActionListener(
            e -> {
                System.out.println("Value: " + chassisList.getSelectedItem());
                honda.setChassis(chassisList.getSelectedItem().toString());
            }
        );

        trannyList.addActionListener(
            e -> {
                System.out.println("Value: " + trannyList.getSelectedItem());
                honda.setTransmission(trannyList.getSelectedItem().toString());
            }
        );

        tireList.addActionListener(
            e -> {
                System.out.println("Value: " + tireList.getSelectedItem());
                honda.setTire(Integer.parseInt(tireList.getSelectedItem().toString()));
            }
        );

        applyList.addActionListener(
            e -> {
                Double m = 0.00;
                if (honda.getPaint() != null) {
                    m = m + 2200.00;
                }
                if (honda.getCarType() != null) {
                    m = m + 4800.00;
                }
                if (honda.getEngine() != null) {
                    if (honda.getEngine() == 4) {
                        m = m + 1500.00;
                    } else {
                        m = m + 8000.00;
                    }
                }
                if (honda.getChassis() != null) {
                    m = m + 4000.00;
                }
                if (honda.getTransmission() != null) {
                    if (honda.getTransmission() == "Manual") {
                        m = m + 0.00;
                    } else {
                        m = m + 2600.00;
                    }
                }
                if (honda.getTire() != null) {
                    m = m + 1200.00;
                }
                priceLabel.setText(m.toString());
            }
        );

        //----------------
        //End of listeners
        //----------------

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    
}