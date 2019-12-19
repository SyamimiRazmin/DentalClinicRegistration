package dentalclinicregistration;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DentalClinicRegistration {

    ArrayList<Patient> Patientlist = new ArrayList<Patient>();
    String header[] = new String[]{"ID", "NAME", "AGE", "PHONE NUMBER", "ADDRESS", "DATE REGISTERED", "NUMBER OF VISITS"};
    DefaultTableModel dtm = new DefaultTableModel(header, 1);

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setLayout(null);

        JLabel username = new JLabel("Username");
        username.setBounds(10, 10, 70, 20);
        frame.add(username);
        
        JLabel password = new JLabel("Password");
        password.setBounds(10, 30, 70, 20);
        frame.add(password);
        
        JTextField jtfusername = new JTextField();
        jtfusername.setBounds(100, 10, 170, 20);
        frame.add(jtfusername);
        
        JTextField jtfpassword = new JTextField();
        jtfpassword.setBounds(100, 30, 170, 20);
        frame.add(jtfpassword);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 60, 170, 20);
        frame.add(btnLogin);
        
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = jtfusername.getText();
                String pass = jtfpassword.getText();
                if (name.equals("orched") && pass.equals("10009")) {
                    new DentalClinicRegistration();
                    frame.setVisible(false);
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect login data");
                }
            }
        });

    }

    DentalClinicRegistration() {

        JFrame frame = new JFrame("Patient Information System");
        frame.setSize(950, 600);

        JLabel patientID = new JLabel("IDENTIFICATION NUMBER:");
        patientID.setBounds(10, 10, 150, 20);
        frame.add(patientID);
        

        JLabel patientName = new JLabel("NAME:");
        patientName.setBounds(10, 30, 60, 20);
        frame.add(patientName);

        JLabel patientAge = new JLabel("AGE:");
        patientAge.setBounds(10, 50, 50, 20);
        frame.add(patientAge);

        JLabel patientPhoneNum = new JLabel("PHONE NUMBER:");
        patientPhoneNum.setBounds(200, 50, 100, 20);
        frame.add(patientPhoneNum);

        JLabel patientAddress = new JLabel("ADDRESS:");
        patientAddress.setBounds(10, 70, 60, 20);
        frame.add(patientAddress);

        JLabel dateRegister = new JLabel("REGISTER DATE:");
        dateRegister.setBounds(10, 90, 120, 20);
        frame.add(dateRegister);

        JLabel numOfVisits = new JLabel("VISITS NUMBERS:");
        numOfVisits.setBounds(10, 112, 120, 20);
        frame.add(numOfVisits);

        JTextField jtfpatientID = new JTextField();
        jtfpatientID.setBounds(170, 10, 400, 20);
        frame.add(jtfpatientID);
        

        JTextField jtfpatientName = new JTextField();
        jtfpatientName.setBounds(80, 30, 490, 20);
        frame.add(jtfpatientName);

        JTextField jtfpatientAge = new JTextField();
        jtfpatientAge.setBounds(70, 52, 100, 20);
        frame.add(jtfpatientAge);
        

        JTextField jtfpatientPhoneNum = new JTextField();
        jtfpatientPhoneNum.setBounds(300, 52, 270, 20);
        frame.add(jtfpatientPhoneNum);

        JTextField jtfpatientAddress = new JTextField();
        jtfpatientAddress.setBounds(70, 72, 500, 20);
        frame.add(jtfpatientAddress);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

        JTextField jtfdateRegister = new JTextField();
        jtfdateRegister.setBounds(110, 92, 460, 20);
        jtfdateRegister.setText(formatter.format(date));
        frame.add(jtfdateRegister);

        JTextField jtfnumOfVisits = new JTextField();
        jtfnumOfVisits.setBounds(120, 112, 450, 20);
        frame.add(jtfnumOfVisits);

        JButton jbtninsert = new JButton("INSERT");
        jbtninsert.setBounds(600, 30, 90, 40);
        frame.add(jbtninsert);

        JButton jbtndelete = new JButton("DELETE");
        jbtndelete.setBounds(700, 30, 90, 40);
        frame.add(jbtndelete);

        JButton jbtnsearch = new JButton("SEARCH");
        jbtnsearch.setBounds(650, 90, 90, 40);
        frame.add(jbtnsearch);

        JButton jbtnupdate = new JButton("UPDATE");
        jbtnupdate.setBounds(750, 90, 90, 40);
        frame.add(jbtnupdate);


        JTable jtable = new JTable();
        jtable.setBounds(20, 160, 900, 400);
        frame.add(jtable);
        jtable.setModel(dtm);
        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(20, 160, 900, 400);
        frame.add(scrollPane);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(200);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(220);
        jtable.getColumnModel().getColumn(2).setPreferredWidth(80);
        jtable.getColumnModel().getColumn(3).setPreferredWidth(150);
        jtable.getColumnModel().getColumn(4).setPreferredWidth(200);
        jtable.getColumnModel().getColumn(5).setPreferredWidth(200);
        jtable.getColumnModel().getColumn(6).setPreferredWidth(220);

        jbtninsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String patientID = jtfpatientID.getText();
                String patientName = jtfpatientName.getText().toUpperCase();
                String patientAge = jtfpatientAge.getText();
                String patientPhoneNum = jtfpatientPhoneNum.getText();
                String patientAddress = jtfpatientAddress.getText().toUpperCase();
                String dateRegister = jtfdateRegister.getText();
                String numOfVisits = jtfnumOfVisits.getText();
                
                if (patientName.length() < 5) {
                    JOptionPane.showMessageDialog(frame, "Name should contain more than 5 char!!!");
                    return;
                }
                
                Patient patient = new Patient(patientID, patientName, patientAge,patientPhoneNum,patientAddress,dateRegister,numOfVisits);
                Patientlist.add(patient);//create object list array
                writeData();
            }
        });

        jbtndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String patientID = JOptionPane.showInputDialog("ID number to delete?");
                if (patientID != null) {
                    System.out.println("not null");
                    for (int i = 0; i < Patientlist.size(); i++) {
                        if (Patientlist.get(i).getpatientID().equalsIgnoreCase(patientID)) {
                            Patientlist.remove(i);
                        }
                    }
                    writeData();
                }
            }
        });

        jbtnsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String patientID = JOptionPane.showInputDialog("Enter ID Number?");
                if (patientID != null) {
                    for (int i = 0; i < Patientlist.size(); i++) {
                        if (Patientlist.get(i).getpatientID().equalsIgnoreCase(patientID)) {
                            JOptionPane.showMessageDialog(frame, "Found!!!");
                            jtfpatientID.setText(Patientlist.get(i).getpatientID());
                            jtfpatientName.setText(Patientlist.get(i).getpatientName());
                            jtfpatientAge.setText(Patientlist.get(i).getpatientAge());
                            jtfpatientPhoneNum.setText(Patientlist.get(i).getpatientPhoneNum());
                            jtfpatientAddress.setText(Patientlist.get(i).getpatientAddress());
                            jtfdateRegister.setText(Patientlist.get(i).getdateRegister());
                            jtfnumOfVisits.setText(Patientlist.get(i).getnumOfVisits());
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Not Found!!!");
                }
                
            }
            
        });

        jbtnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String patientID = jtfpatientID.getText();
                String patientName = jtfpatientName.getText();
                String patientAge = jtfpatientAge.getText();
                String patientPhoneNum = jtfpatientPhoneNum.getText();
                String patientAddress = jtfpatientAddress.getText();
                String dateRegister = jtfdateRegister.getText();
                String numOfVisits = jtfnumOfVisits.getText();

                if (patientID != null) {
                    for (int i = 0; i < Patientlist.size(); i++) {
                        if (Patientlist.get(i).getpatientID().equalsIgnoreCase(patientID)) {
                            Patientlist.get(i).setpatientName(patientName);
                            Patientlist.get(i).setpatientAge(patientAge);
                            Patientlist.get(i).setpatientPhoneNum(patientPhoneNum);
                            Patientlist.get(i).setpatientAddress(patientAddress);
                            Patientlist.get(i).setdateRegister(dateRegister);
                            Patientlist.get(i).setnumOfVisits(numOfVisits);
                            JOptionPane.showMessageDialog(frame, "Updated!!!");
                        }
                    }
                }
                writeData();
            }
        });
         
                 
        readData();
        jtable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtable.getSelectedRow();
                jtfpatientID.setText(dtm.getValueAt(row, 0).toString());
                jtfpatientName.setText(dtm.getValueAt(row, 1).toString());
                jtfpatientAge.setText(dtm.getValueAt(row, 2).toString());
                jtfpatientPhoneNum.setText(dtm.getValueAt(row, 3).toString());
                jtfpatientAddress.setText(dtm.getValueAt(row, 4).toString());
                jtfdateRegister.setText(dtm.getValueAt (row, 5).toString());
                jtfnumOfVisits.setText(dtm.getValueAt(row, 6).toString());
            }
        });
        
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    void readData() { //read data from "data.txt" and display on table
        try {
            File file = new File("data.txt"); //create file
            file.createNewFile();//if not exit
            FileReader f = new FileReader("data.txt");
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '-') {
                    System.out.println(sb);
                    String patientarray[] = sb.toString().split(",");
                    Patient patient = new Patient(patientarray[0], patientarray[1], patientarray[2],patientarray[3],
                    patientarray[4],patientarray[5],patientarray[6]);
                    Patientlist.add(patient);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            dtm.setRowCount(0); //update table
            for (int i = 0; i < Patientlist.size(); i++) {//populate table using object list
                Object[] objs = {Patientlist.get(i).getpatientID(), Patientlist.get(i).getpatientName(), Patientlist.get(i).getpatientAge(),
                    Patientlist.get(i).getpatientPhoneNum(),Patientlist.get(i).getpatientAddress(),Patientlist.get(i).getdateRegister(),
                    Patientlist.get(i).getnumOfVisits()};
                dtm.addRow(objs);
            }
        } catch (IOException e) {
        }
    }

    private void writeData() { //write data to file "data.txt"
        try (FileWriter f = new FileWriter("data.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Patientlist.size(); i++) {
                sb.append(Patientlist.get(i).getpatientID() + "," + Patientlist.get(i).getpatientName() + "," + Patientlist.get(i).getpatientAge() 
                        +"," + Patientlist.get(i).getpatientPhoneNum()+ ","+ Patientlist.get(i).getpatientAddress()+ "," + 
                        Patientlist.get(i).getdateRegister()+ "," + Patientlist.get(i).getnumOfVisits()+ "-");
            }
            f.write(sb.toString());
            f.close();
        } catch (IOException e) {
            return;
        }
        dtm.setRowCount(0); //update table content
        for (int i = 0; i < Patientlist.size(); i++) {//populate table using object list
            Object[] objs = {Patientlist.get(i).getpatientID(), Patientlist.get(i).getpatientName(), Patientlist.get(i).getpatientAge(),
                Patientlist.get(i).getpatientPhoneNum(),Patientlist.get(i).getpatientAddress(),Patientlist.get(i).getdateRegister(),
                Patientlist.get(i).getnumOfVisits()};
            dtm.addRow(objs);
        }
    }
}