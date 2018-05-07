/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import static database.Database.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static models.Student.validateStudent;

/**
 *
 * @author Isaiah
 */
public class Menu extends javax.swing.JFrame implements ActionListener{
    
    public Menu() {
        initComponents();
        //
        this.btnAddStudent.addActionListener(this);
        this.btnViewStudent.addActionListener(this);
        this.btnEditRecordsStudent.addActionListener(this);
        this.btnPayment.addActionListener(this);
        //
        this.btnAddFaculty.addActionListener(this);
        this.btnViewFaculty.addActionListener(this);
        this.btnEditRecordsFaculty.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JOptionPane();
        panelNavigation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnEditRecordsStudent = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        btnAddFaculty = new javax.swing.JButton();
        btnViewFaculty = new javax.swing.JButton();
        btnEditRecordsFaculty = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        panelAddStudent = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        cbxGender = new javax.swing.JComboBox<>();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        spRepeated = new javax.swing.JSpinner();
        spNew = new javax.swing.JSpinner();
        btnSaveStudent = new javax.swing.JButton();
        panelViewStudent = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        panelNavViewStudents = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        panelEditStudent = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        edit_txtId = new javax.swing.JTextField();
        btn_EditFill = new javax.swing.JButton();
        edit_txtFirstName = new javax.swing.JTextField();
        edit_txtLastName = new javax.swing.JTextField();
        edit_cbxGender = new javax.swing.JComboBox<>();
        edit_txtContact = new javax.swing.JTextField();
        edit_txtAddress = new javax.swing.JTextField();
        edit_spRepeated = new javax.swing.JSpinner();
        edit_spNew = new javax.swing.JSpinner();
        btnSaveEditStudent = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty");

        btnAddStudent.setText("Add Student");

        btnViewStudent.setText("View Records");

        btnEditRecordsStudent.setText("Edit Records");

        btnPayment.setText("Make Payment");

        btnAddFaculty.setText("Add Teacher");

        btnViewFaculty.setText("View Records");

        btnEditRecordsFaculty.setText("Edit Records");

        javax.swing.GroupLayout panelNavigationLayout = new javax.swing.GroupLayout(panelNavigation);
        panelNavigation.setLayout(panelNavigationLayout);
        panelNavigationLayout.setHorizontalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                        .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnViewFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPayment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                        .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(btnEditRecordsStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelNavigationLayout.createSequentialGroup()
                        .addComponent(btnEditRecordsFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNavigationLayout.setVerticalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAddStudent)
                .addGap(18, 18, 18)
                .addComponent(btnViewStudent)
                .addGap(12, 12, 12)
                .addComponent(btnEditRecordsStudent)
                .addGap(18, 18, 18)
                .addComponent(btnPayment)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnAddFaculty)
                .addGap(18, 18, 18)
                .addComponent(btnViewFaculty)
                .addGap(18, 18, 18)
                .addComponent(btnEditRecordsFaculty)
                .addGap(10, 10, 10))
            .addGroup(panelNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Student");

        jLabel5.setText("Gender:");

        jLabel6.setText("Contact Number:");

        jLabel7.setText("Address:");

        jLabel8.setText("Repeated Module:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("New Module:");

        txtFirstName.setToolTipText("First Name");

        txtLastName.setToolTipText("Last Name");

        cbxGender.setMaximumRowCount(2);
        cbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        btnSaveStudent.setText("Save");
        btnSaveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddStudentLayout = new javax.swing.GroupLayout(panelAddStudent);
        panelAddStudent.setLayout(panelAddStudentLayout);
        panelAddStudentLayout.setHorizontalGroup(
            panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddStudentLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelAddStudentLayout.createSequentialGroup()
                        .addComponent(btnSaveStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator3)
                    .addGroup(panelAddStudentLayout.createSequentialGroup()
                        .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panelAddStudentLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAddStudentLayout.createSequentialGroup()
                                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spNew, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spRepeated, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelAddStudentLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress)
                        .addGap(6, 6, 6))
                    .addGroup(panelAddStudentLayout.createSequentialGroup()
                        .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddStudentLayout.createSequentialGroup()
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAddStudentLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(66, Short.MAX_VALUE))))
        );
        panelAddStudentLayout.setVerticalGroup(
            panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddStudentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spRepeated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addComponent(btnSaveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        panelMain.add(panelAddStudent, "card2");

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("View Students");

        tblStudents.setAutoCreateRowSorter(true);
        tblStudents.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblStudents.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Contact", "Modules", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        panelNavViewStudents.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        jLabel10.setText("Filters:");

        jButton1.setText("With 0 Balance");

        jLabel11.setText("Show Only:");

        jButton2.setText("With Balance");

        javax.swing.GroupLayout panelNavViewStudentsLayout = new javax.swing.GroupLayout(panelNavViewStudents);
        panelNavViewStudents.setLayout(panelNavViewStudentsLayout);
        panelNavViewStudentsLayout.setHorizontalGroup(
            panelNavViewStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavViewStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNavViewStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelNavViewStudentsLayout.createSequentialGroup()
                        .addGroup(panelNavViewStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        panelNavViewStudentsLayout.setVerticalGroup(
            panelNavViewStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavViewStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelViewStudentLayout = new javax.swing.GroupLayout(panelViewStudent);
        panelViewStudent.setLayout(panelViewStudentLayout);
        panelViewStudentLayout.setHorizontalGroup(
            panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelViewStudentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelNavViewStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        panelViewStudentLayout.setVerticalGroup(
            panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(panelNavViewStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelViewStudent, "card2");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("EDIT STUDENT");

        jLabel20.setText("Search Student By ID:");

        jLabel12.setText("Name:");

        jLabel14.setText("Gender:");

        jLabel15.setText("Contact Number:");

        jLabel16.setText("Address:");

        jLabel18.setText("Repeated Module:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("New Module:");

        btn_EditFill.setText("Fill");
        btn_EditFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditFillActionPerformed(evt);
            }
        });

        edit_txtFirstName.setToolTipText("First Name");

        edit_txtLastName.setToolTipText("Last Name");

        edit_cbxGender.setMaximumRowCount(2);
        edit_cbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        btnSaveEditStudent.setText("Save");
        btnSaveEditStudent.setEnabled(false);

        javax.swing.GroupLayout panelEditStudentLayout = new javax.swing.GroupLayout(panelEditStudent);
        panelEditStudent.setLayout(panelEditStudentLayout);
        panelEditStudentLayout.setHorizontalGroup(
            panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEditStudentLayout.createSequentialGroup()
                                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(edit_txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_EditFill, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12)
                                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit_txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit_cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139))
                                    .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEditStudentLayout.createSequentialGroup()
                                            .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelEditStudentLayout.createSequentialGroup()
                                                    .addComponent(edit_spNew, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnSaveEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(edit_spRepeated, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEditStudentLayout.createSequentialGroup()
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(edit_txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelEditStudentLayout.createSequentialGroup()
                                .addComponent(edit_txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditStudentLayout.createSequentialGroup()
                        .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        panelEditStudentLayout.setVerticalGroup(
            panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditStudentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(edit_txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditFill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_txtFirstName)
                    .addComponent(edit_txtLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(edit_cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(edit_txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(edit_txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(edit_spRepeated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_spNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnSaveEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelMain.add(panelEditStudent, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStudentActionPerformed
        if(validateStudent(
                txtFirstName.getText(), txtLastName.getText(),
                cbxGender.getItemAt(cbxGender.getSelectedIndex()),
                txtContact.getText(),
                txtAddress.getText(),
                (int)spRepeated.getValue(),
                (int)spNew.getValue(),
                0)){
            //Success Saving
            Dialog = new JOptionPane("Record Saved!", JOptionPane.PLAIN_MESSAGE);
            Dialog.setVisible(true);
            clearFields(this.panelAddStudent.getComponents());
        } else {
            Dialog = new JOptionPane("Unable to Save Record: "+error_message, JOptionPane.ERROR_MESSAGE);
            Dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnSaveStudentActionPerformed

    private void btn_EditFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditFillActionPerformed
        //Query ID
        if(getQuery("Students", "id", "=", "'"+edit_txtId.getText()+"'")){
           if(rs != null){
               try {
                   edit_txtFirstName.setText(rs.getString("first_name"));
                   /*edit_txtLastName.setText(rs.getString("first_name"));
                   edit_txtFirstName.setText(rs.getString("first_name"));
                   edit_txtFirstName.setText(rs.getString("first_name"));
                   edit_txtFirstName.setText(rs.getString("first_name"));
                   edit_txtFirstName.setText(rs.getString("first_name"));
                   edit_txtFirstName.setText(rs.getString("first_name"));*/
                   
               } catch (SQLException ex) {
                   Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        } else {
            System.out.println("No Such Student");
        }
    }//GEN-LAST:event_btn_EditFillActionPerformed
    
    /**
     * Catch any Button Navigation
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.panelMain.removeAll();
        this.panelMain.repaint();
        this.panelMain.revalidate();
        
         if(e.getSource() == this.btnAddStudent){
             
            this.panelMain.add(this.panelAddStudent);
            
        } else if(e.getSource() == this.btnViewStudent) {
            DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
            this.panelMain.add(this.panelViewStudent);
            if(getQuery("Students")){
                try {
                    while(rs.next()){
                        System.out.println(rs.getInt(1)+" "+rs.getString("first_name")+" "+rs.getString("last_name"));
                        Object []row = {
                            rs.getInt(1),
                            rs.getString("first_name")+" "+rs.getString("last_name"),
                            rs.getString("gender"),
                            rs.getString("contact"),
                            rs.getInt("num_new") + rs.getInt("num_repeat"),
                            rs.getDouble("balance")
                        };
                        model.addRow(row);
                    }
                    tblStudents.setModel(model);
                    tblStudents.setVisible(true);
                } catch (SQLException ex) {
                    //Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    Dialog = new JOptionPane("Error Fetching: "+error_message, JOptionPane.ERROR_MESSAGE);
                    Dialog.setVisible(true);
                }
            } else {
                Dialog = new JOptionPane("Error Fetching: "+error_message, JOptionPane.ERROR_MESSAGE);
                Dialog.setVisible(true);
            }
        } else if(e.getSource() == btnEditRecordsStudent){
            this.panelMain.add(this.panelEditStudent);
        }
        
        this.panelMain.repaint();
        this.panelMain.revalidate();
            
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void clearFields(Component comp[]){
        for(Component control : comp) {
            if(control instanceof JTextField) {
                JTextField ctrl = (JTextField) control;
                ctrl.setText("");
            } else if (control instanceof JComboBox) {
                JComboBox ctrl = (JComboBox) control;
                ctrl.setSelectedIndex(0);
            } else if (control instanceof JSpinner) {
                JSpinner ctrl = (JSpinner) control;
                ctrl.setValue(0);
            }
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane Dialog;
    private javax.swing.JButton btnAddFaculty;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnEditRecordsFaculty;
    private javax.swing.JButton btnEditRecordsStudent;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSaveEditStudent;
    private javax.swing.JButton btnSaveStudent;
    private javax.swing.JButton btnViewFaculty;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JButton btn_EditFill;
    private javax.swing.JComboBox<String> cbxGender;
    private javax.swing.JComboBox<String> edit_cbxGender;
    private javax.swing.JSpinner edit_spNew;
    private javax.swing.JSpinner edit_spRepeated;
    private javax.swing.JTextField edit_txtAddress;
    private javax.swing.JTextField edit_txtContact;
    private javax.swing.JTextField edit_txtFirstName;
    private javax.swing.JTextField edit_txtId;
    private javax.swing.JTextField edit_txtLastName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel panelAddStudent;
    private javax.swing.JPanel panelEditStudent;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNavViewStudents;
    private javax.swing.JPanel panelNavigation;
    private javax.swing.JPanel panelViewStudent;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spNew;
    private javax.swing.JSpinner spRepeated;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables

}
