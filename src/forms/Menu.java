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
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import libraries.StringFormatting;
import static models.Student.computeBalance;
import static models.Student.validateStudent;
import static models.Student.validateEdit;
import models.Teacher;
import static models.Teacher.getHours;

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
        //
        this.btnAddFaculty.addActionListener(this);
        this.btnViewFaculty.addActionListener(this);
        this.btnEditRecordsFaculty.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JOptionPane();
        frameSettings = new javax.swing.JFrame();
        jLabel30 = new javax.swing.JLabel();
        txtNewModule = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtRepeatedModule = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtOt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtBaseSalary = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtHA = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtMA = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtTA = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        btnSaveSettings = new javax.swing.JButton();
        btnCancelSettings = new javax.swing.JButton();
        panelNavigation = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnEditRecordsStudent = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        btnAddFaculty = new javax.swing.JButton();
        btnViewFaculty = new javax.swing.JButton();
        btnEditRecordsFaculty = new javax.swing.JButton();
        btnSettings = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
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
        jSeparator5 = new javax.swing.JSeparator();
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
        btnDeleteStudent = new javax.swing.JButton();
        btnMakePayment = new javax.swing.JButton();
        panelPayment = new javax.swing.JPanel();
        panelAddTeacher = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtFirstNameTeacher = new javax.swing.JTextField();
        txtLastNameTeacher = new javax.swing.JTextField();
        cbxGenderTeacher = new javax.swing.JComboBox<>();
        txtContactTeacher = new javax.swing.JTextField();
        txtAddressTeacher = new javax.swing.JTextField();
        cbxDeptTeacher = new javax.swing.JComboBox<>();
        cbxDesgTeacher = new javax.swing.JComboBox<>();
        btnSaveTeacher = new javax.swing.JButton();
        panelViewTeacher = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTeachers = new javax.swing.JTable();
        panelEditTeacher = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        edit_txtIdTeacher = new javax.swing.JTextField();
        edit_btnFillTeacher = new javax.swing.JButton();
        edit_txtFirstNameTeacher = new javax.swing.JTextField();
        edit_txtLastNameTeacher = new javax.swing.JTextField();
        edit_cbxGenderTeacher = new javax.swing.JComboBox<>();
        edit_txtContactTeacher = new javax.swing.JTextField();
        edit_txtAddressTeacher = new javax.swing.JTextField();
        edit_cbxDeptTeacher = new javax.swing.JComboBox<>();
        edit_cbxDesgTeacher = new javax.swing.JComboBox<>();
        btnSaveEditTeacher = new javax.swing.JButton();
        btnDeleteTeacher = new javax.swing.JButton();
        btnCalculateSalary = new javax.swing.JButton();

        frameSettings.setSize(new java.awt.Dimension(549, 338));

        jLabel30.setText("New Module Price:");

        jLabel31.setText("Repeated Module Price:");

        jLabel32.setText("Overtime Rate:");

        jLabel33.setText("Base Salary:");

        jLabel34.setText("Housing Allowance:");

        jLabel35.setText("Medical Allowance:");

        jLabel36.setText("Travelling Alllowance:");

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSaveSettings.setText("Save");
        btnSaveSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSettingsActionPerformed(evt);
            }
        });

        btnCancelSettings.setText("Cancel");
        btnCancelSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameSettingsLayout = new javax.swing.GroupLayout(frameSettings.getContentPane());
        frameSettings.getContentPane().setLayout(frameSettingsLayout);
        frameSettingsLayout.setHorizontalGroup(
            frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSaveSettings)
                    .addGroup(frameSettingsLayout.createSequentialGroup()
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNewModule)
                            .addComponent(txtRepeatedModule, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameSettingsLayout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(frameSettingsLayout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBaseSalary))
                                .addGroup(frameSettingsLayout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSettingsLayout.createSequentialGroup()
                                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel36))
                                .addGap(1, 1, 1)
                                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMA, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(txtTA)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSettingsLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(13, 13, 13)
                                .addComponent(txtHA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(frameSettingsLayout.createSequentialGroup()
                        .addComponent(btnCancelSettings)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frameSettingsLayout.setVerticalGroup(
            frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSettingsLayout.createSequentialGroup()
                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameSettingsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameSettingsLayout.createSequentialGroup()
                                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(frameSettingsLayout.createSequentialGroup()
                                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewModule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepeatedModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                    .addGroup(frameSettingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(frameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveSettings)
                    .addComponent(btnCancelSettings))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty");

        btnAddStudent.setText("Add Student");

        btnViewStudent.setText("View Records");

        btnEditRecordsStudent.setText("Edit Records");

        btnAddFaculty.setText("Add Teacher");

        btnViewFaculty.setText("View Records");

        btnEditRecordsFaculty.setText("Edit Records");

        btnSettings.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        btnSettings.setText("Settings");
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingsMouseClicked(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNavigationLayout = new javax.swing.GroupLayout(panelNavigation);
        panelNavigation.setLayout(panelNavigationLayout);
        panelNavigationLayout.setHorizontalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditRecordsFaculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnViewFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnViewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditRecordsStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelNavigationLayout.createSequentialGroup()
                            .addComponent(btnSettings)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNavigationLayout.setVerticalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNavigationLayout.createSequentialGroup()
                        .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSettings)
                            .addComponent(btnLogout))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddStudent)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewStudent)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditRecordsStudent)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        javax.swing.GroupLayout panelViewStudentLayout = new javax.swing.GroupLayout(panelViewStudent);
        panelViewStudent.setLayout(panelViewStudentLayout);
        panelViewStudentLayout.setHorizontalGroup(
            panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelViewStudentLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelViewStudentLayout.setVerticalGroup(
            panelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
        btnSaveEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditStudentActionPerformed(evt);
            }
        });

        btnDeleteStudent.setText("DELETE");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        btnMakePayment.setText("Make Payment");
        btnMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditStudentLayout = new javax.swing.GroupLayout(panelEditStudent);
        panelEditStudent.setLayout(panelEditStudentLayout);
        panelEditStudentLayout.setHorizontalGroup(
            panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelEditStudentLayout.createSequentialGroup()
                                .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(18, 18, 18)
                                        .addComponent(edit_txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_EditFill, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMakePayment)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                        .addComponent(btnDeleteStudent))
                                    .addComponent(jLabel12)
                                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit_txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEditStudentLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit_cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addContainerGap())
                            .addGroup(panelEditStudentLayout.createSequentialGroup()
                                .addComponent(edit_txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditStudentLayout.createSequentialGroup()
                        .addGroup(panelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
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
                    .addComponent(btn_EditFill)
                    .addComponent(btnDeleteStudent)
                    .addComponent(btnMakePayment))
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

        javax.swing.GroupLayout panelPaymentLayout = new javax.swing.GroupLayout(panelPayment);
        panelPayment.setLayout(panelPaymentLayout);
        panelPaymentLayout.setHorizontalGroup(
            panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        panelPaymentLayout.setVerticalGroup(
            panelPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        panelMain.add(panelPayment, "card8");

        jLabel21.setText("Name:");

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Add Teacher");

        jLabel23.setText("Gender:");

        jLabel24.setText("Contact Number:");

        jLabel25.setText("Address:");

        jLabel26.setText("Department:");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("Designation:");

        txtFirstNameTeacher.setToolTipText("First Name");

        txtLastNameTeacher.setToolTipText("Last Name");

        cbxGenderTeacher.setMaximumRowCount(2);
        cbxGenderTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        cbxDeptTeacher.setMaximumRowCount(2);
        cbxDeptTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Computing" }));

        cbxDesgTeacher.setMaximumRowCount(3);
        cbxDesgTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head of Faculty", "Coordinator", "Lecturer" }));

        btnSaveTeacher.setText("Save");
        btnSaveTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTeacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddTeacherLayout = new javax.swing.GroupLayout(panelAddTeacher);
        panelAddTeacher.setLayout(panelAddTeacherLayout);
        panelAddTeacherLayout.setHorizontalGroup(
            panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(panelAddTeacherLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContactTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 599, Short.MAX_VALUE))
                    .addGroup(panelAddTeacherLayout.createSequentialGroup()
                        .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelAddTeacherLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxGenderTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelAddTeacherLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddressTeacher))
                    .addGroup(panelAddTeacherLayout.createSequentialGroup()
                        .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddTeacherLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastNameTeacher))
                            .addGroup(panelAddTeacherLayout.createSequentialGroup()
                                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddTeacherLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxDeptTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAddTeacherLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSaveTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelAddTeacherLayout.createSequentialGroup()
                                                .addComponent(cbxDesgTeacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(236, 236, 236)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))))
        );
        panelAddTeacherLayout.setVerticalGroup(
            panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTeacherLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFirstNameTeacher)
                        .addComponent(txtLastNameTeacher))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbxGenderTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtContactTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtAddressTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cbxDeptTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cbxDesgTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelAddTeacher, "card2");

        jLabel28.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("View Teachers");

        tblTeachers.setAutoCreateRowSorter(true);
        tblTeachers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblTeachers.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Contact", "Address", "Department", "Designation", "Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTeachers);

        javax.swing.GroupLayout panelViewTeacherLayout = new javax.swing.GroupLayout(panelViewTeacher);
        panelViewTeacher.setLayout(panelViewTeacherLayout);
        panelViewTeacherLayout.setHorizontalGroup(
            panelViewTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        panelViewTeacherLayout.setVerticalGroup(
            panelViewTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelViewTeacher, "card2");

        jLabel37.setText("Name:");

        jLabel38.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Edit Teacher");

        jLabel39.setText("Gender:");

        jLabel40.setText("Contact Number:");

        jLabel41.setText("Address:");

        jLabel42.setText("Department:");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel43.setText("Designation:");

        jLabel29.setText("ID:");

        edit_btnFillTeacher.setText("Fill");
        edit_btnFillTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnFillTeacherActionPerformed(evt);
            }
        });

        edit_txtFirstNameTeacher.setToolTipText("First Name");

        edit_txtLastNameTeacher.setToolTipText("Last Name");

        edit_cbxGenderTeacher.setMaximumRowCount(2);
        edit_cbxGenderTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        edit_cbxDeptTeacher.setMaximumRowCount(2);
        edit_cbxDeptTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Computing" }));

        edit_cbxDesgTeacher.setMaximumRowCount(3);
        edit_cbxDesgTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head of Faculty", "Coordinator", "Lecturer" }));

        btnSaveEditTeacher.setText("Save");
        btnSaveEditTeacher.setEnabled(false);
        btnSaveEditTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditTeacherActionPerformed(evt);
            }
        });

        btnDeleteTeacher.setText("DELETE");
        btnDeleteTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTeacherActionPerformed(evt);
            }
        });

        btnCalculateSalary.setText("Calculate Salary");
        btnCalculateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateSalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditTeacherLayout = new javax.swing.GroupLayout(panelEditTeacher);
        panelEditTeacher.setLayout(panelEditTeacherLayout);
        panelEditTeacherLayout.setHorizontalGroup(
            panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditTeacherLayout.createSequentialGroup()
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditTeacherLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEditTeacherLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator7)
                            .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_txtIdTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_btnFillTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalculateSalary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteTeacher))
                            .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit_cbxDeptTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSaveEditTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edit_cbxDesgTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit_txtContactTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit_cbxGenderTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelEditTeacherLayout.createSequentialGroup()
                                            .addComponent(jLabel37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(edit_txtFirstNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(edit_txtLastNameTeacher))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEditTeacherLayout.createSequentialGroup()
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(edit_txtAddressTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelEditTeacherLayout.setVerticalGroup(
            panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditTeacherLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(edit_txtIdTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_btnFillTeacher)
                    .addComponent(btnDeleteTeacher)
                    .addComponent(btnCalculateSalary))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit_txtFirstNameTeacher)
                        .addComponent(edit_txtLastNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(edit_cbxGenderTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(edit_txtContactTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(edit_txtAddressTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(edit_cbxDeptTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(edit_cbxDesgTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveEditTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelEditTeacher, "card2");

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
                    .addComponent(panelNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStudentActionPerformed
        try {
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
                JOptionPane.showMessageDialog(panelAddStudent, "Added Student");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(panelAddStudent, ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveStudentActionPerformed

    private void btn_EditFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditFillActionPerformed
        //Query ID
        if(getQuery("Students", "id", "=", "'"+edit_txtId.getText()+"'")){
            try {
                if(rs.next()){
                    try {
                        edit_txtFirstName.setText(rs.getString("first_name"));
                        edit_txtLastName.setText(rs.getString("last_name"));
                        if("Male".equals(rs.getString("gender"))){
                            edit_cbxGender.setSelectedIndex(0);
                        } else {
                            edit_cbxGender.setSelectedIndex(1);
                        }
                        
                        edit_txtContact.setText(rs.getString("contact"));
                        edit_txtAddress.setText(rs.getString("address"));
                        edit_spNew.setValue(Integer.valueOf(rs.getString("num_new")));
                        edit_spRepeated.setValue(Integer.valueOf(rs.getString("num_repeat")));
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                btnSaveEditStudent.setEnabled(true);
                btnMakePayment.setEnabled(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            btnSaveEditStudent.setEnabled(false);
            System.out.println("No Such Student");
        }
    }//GEN-LAST:event_btn_EditFillActionPerformed

    private void btnSaveEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditStudentActionPerformed
         if(validateEdit(
                (int)spRepeated.getValue(),
                (int)spNew.getValue())){
            
             try {
                 String balance = computeBalance((int)spRepeated.getValue(),
                         (int)spNew.getValue());
                 
                 ArrayList<String> str = new ArrayList<>();
                 str.add(edit_txtId.getText());
                 str.add(edit_txtFirstName.getText());
                 str.add(edit_txtLastName.getText());
                 str.add(String.valueOf(edit_cbxGender.getSelectedItem()));
                 str.add(edit_txtContact.getText());
                 str.add(edit_txtAddress.getText());
                 str.add(String.valueOf(edit_spNew.getValue()));
                 str.add(String.valueOf(edit_spRepeated.getValue()));
                 str.add(balance);
                 str.add(rs.getString("created_at"));
                 str.add(getTimestampt());
                 //String values = StringFormatting.string2SQLValues(str);
                 //insertQuery(Student, values)
                 if(updateQuery("Students", str)){
                    //Success Saving
                     Dialog = new JOptionPane("Record Saved!", JOptionPane.PLAIN_MESSAGE);
                     Dialog.setVisible(true);
                     clearFields(this.panelAddStudent.getComponents());
                 } else {
                     System.out.println("Cant update record.");
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
             }
        } else {
            Dialog = new JOptionPane("Unable to Save Record: "+error_message, JOptionPane.ERROR_MESSAGE);
            Dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnSaveEditStudentActionPerformed

    private void btnSaveTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTeacherActionPerformed
        ArrayList<String> str = new ArrayList<>();
        str.add(String.valueOf(Teacher.getId()));
        str.add(txtFirstNameTeacher.getText());
        str.add(txtLastNameTeacher.getText());
        str.add((String)cbxGenderTeacher.getSelectedItem());
        str.add(txtContactTeacher.getText());
        str.add(txtAddressTeacher.getText());
        str.add((String)cbxDeptTeacher.getSelectedItem());
        str.add((String)cbxDesgTeacher.getSelectedItem());
        str.add(Teacher.getHours((String)cbxDesgTeacher.getSelectedItem()));
        str.add(getTimestampt());
        str.add(null);
        try {
            if(insertQuery("Teachers", str)){
                JOptionPane.showMessageDialog(panelAddTeacher, "Added new Teacher");
            } else {
                throw new SQLException();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panelAddTeacher, "Can't Create Record: "+ex.getMessage());
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveTeacherActionPerformed

    private void btnSaveEditTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditTeacherActionPerformed
         if(Teacher.validate()){
             try {
                 ArrayList<String> str = new ArrayList<>();
                 str.add(edit_txtFirstNameTeacher.getText());
                 str.add(edit_txtLastNameTeacher.getText());
                 str.add(String.valueOf(edit_cbxGenderTeacher.getSelectedItem()));
                 str.add(edit_txtContactTeacher.getText());
                 str.add(edit_txtAddressTeacher.getText());
                 str.add(String.valueOf(cbxDeptTeacher.getSelectedItem()));
                 str.add(String.valueOf(cbxDesgTeacher.getSelectedItem()));
                 str.add(Teacher.getHours(String.valueOf(cbxDesgTeacher.getSelectedItem())));
                 str.add(rs.getString("created_at"));
                 str.add(getTimestampt());
                 str.add(edit_txtIdTeacher.getText());
                 
                 if(updateQuery("Teachers", str)){
                    //Success Saving
                    JOptionPane.showMessageDialog(panelAddTeacher, "Edited Teacher");
                     clearFields(this.panelEditTeacher.getComponents());
                 } else {
                     JOptionPane.showMessageDialog(panelAddTeacher, "Can't Update Record");
                 }
                 
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panelAddTeacher, "Can't Update Record: "+ex.getMessage());
             }
        } else {
             JOptionPane.showMessageDialog(panelAddTeacher, "Validation Failed");
        }
    }//GEN-LAST:event_btnSaveEditTeacherActionPerformed

    private void edit_btnFillTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnFillTeacherActionPerformed
        //Query ID
        if(getQuery("Teachers", "id", "=", "'"+edit_txtIdTeacher.getText()+"'")){
            try {
                if(rs.next()){
                    try {
                        edit_txtFirstNameTeacher.setText(rs.getString("first_name"));
                        edit_txtLastNameTeacher.setText(rs.getString("last_name"));
                        if("Male".equals(rs.getString("gender"))){
                            edit_cbxGenderTeacher.setSelectedIndex(0);
                        } else {
                            edit_cbxGenderTeacher.setSelectedIndex(1);
                        }
                        
                        edit_txtContactTeacher.setText(rs.getString("contact"));
                        edit_txtAddressTeacher.setText(rs.getString("address"));
                        
                        //Business, Computing
                        if("Business".equals(rs.getString("dept"))){
                            edit_cbxDeptTeacher.setSelectedIndex(0);
                        } else {
                            edit_cbxDeptTeacher.setSelectedIndex(1);
                        }
                        
                        //Head of Faculty, Coordinator, Lecturer
                        if("Head of Faculty".equals(rs.getString("desg"))){
                            edit_cbxDeptTeacher.setSelectedIndex(0);
                        } else if("Head of Faculty".equals(rs.getString("desg"))){
                            edit_cbxDeptTeacher.setSelectedIndex(1);
                        } else {
                            edit_cbxDeptTeacher.setSelectedIndex(2);
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                btnSaveEditTeacher.setEnabled(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            btnSaveEditStudent.setEnabled(false);
            JOptionPane.showMessageDialog(panelEditTeacher, "ID does not exist");
        }
    }//GEN-LAST:event_edit_btnFillTeacherActionPerformed

    private void btnDeleteTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTeacherActionPerformed
        try {
            String id = edit_txtIdTeacher.getText();
            if(deleteQuery("Teachers", id)){
                JOptionPane.showMessageDialog(panelEditTeacher, "Success Delete Teacher");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(panelEditTeacher, "Unable to Delete Record: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteTeacherActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        String id = edit_txtId.getText();
        try {
            if(deleteQuery("Students", id)){
                JOptionPane.showMessageDialog(panelEditStudent, "Success Delete: "+id);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(panelEditStudent, "Unable to Delete: "+id);
        }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymentActionPerformed
        
        try {
            
            double payment = Double.valueOf(JOptionPane.showInputDialog(panelPayment, "Enter Payment"));
            double balance = Double.valueOf(rs.getString("balance")) - payment;
            ArrayList<String> values = new ArrayList<>();
            
            values.add(String.valueOf(balance));
            values.add(getTimestampt());
            values.add(edit_txtId.getText());
            
            if(updateBalanceQuery("Students", values)){
                JOptionPane.showConfirmDialog(panelPayment, "Balance Updated");
            } else {
                JOptionPane.showMessageDialog(panelPayment, "Unable to Update Payment");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMakePaymentActionPerformed

    private void btnCalculateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateSalaryActionPerformed
        try {
            String desg = rs.getString("desg");
            double hours = Double.valueOf(rs.getString("hours"));
            
            getSettings();
            double ot = rs.getDouble("ot");
            double bs = rs.getDouble("bs");
            double ha = rs.getDouble("ha");
            double ma = rs.getDouble("ma");
            double ta = rs.getDouble("ta");
            
            double shift = Double.valueOf(JOptionPane.showInputDialog(panelEditTeacher, "Input Hours: "));
            //shift hours - min hours, * otrate
            double overtime = (shift-hours) * ot;
            double salary = bs + overtime;
            salary = (salary * (1+ha)) + (salary * (1+ma)) + (salary * (1+ta));
            
            JOptionPane.showConfirmDialog(panelPayment, "Salary = "+salary);
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCalculateSalaryActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        
        this.setVisible(false);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseClicked
        if(!frameSettings.isVisible()){
            try {
                getQuery("Settings");
                if(rs.next()){
                    txtNewModule.setText(rs.getString("new_module"));
                    txtRepeatedModule.setText(rs.getString("rep_module"));
                    txtOt.setText(rs.getString("ot"));
                    txtBaseSalary.setText(rs.getString("bs"));
                    txtHA.setText(rs.getString("ha"));
                    txtMA.setText(rs.getString("ma"));
                    txtTA.setText(rs.getString("ta"));
                    frameSettings.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSettingsMouseClicked

    private void btnSaveSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSettingsActionPerformed
        ArrayList<Double> values = new ArrayList<>();
        values.add(Double.valueOf(txtNewModule.getText()));
        values.add(Double.valueOf(txtRepeatedModule.getText()));
        values.add(Double.valueOf(txtOt.getText()));
        values.add(Double.valueOf(txtBaseSalary.getText()));
        values.add(Double.valueOf(txtHA.getText()));
        values.add(Double.valueOf(txtMA.getText()));
        values.add(Double.valueOf(txtTA.getText()));
        
        if(updateSettingsQuery("Settings", values)){
            JOptionPane.showMessageDialog(frameSettings, "Settings Updated!");
        } else {
            JOptionPane.showMessageDialog(frameSettings, "Can't Update Settings!");
        }
        
    }//GEN-LAST:event_btnSaveSettingsActionPerformed

    private void btnCancelSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSettingsActionPerformed
        if(frameSettings.isVisible())
            frameSettings.setVisible(false);
    }//GEN-LAST:event_btnCancelSettingsActionPerformed
    
    /**
     * Catch any Button Navigation
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.panelMain.removeAll();
        this.panelMain.repaint();
        this.panelMain.revalidate();

        this.btnSaveEditStudent.setEnabled(false);
        this.btnSaveEditTeacher.setEnabled(false);
        
        clearFields(this.panelEditStudent.getComponents());
        clearFields(this.panelAddStudent.getComponents());
        clearFields(this.panelAddTeacher.getComponents());
        clearFields(this.panelEditTeacher.getComponents());
        
        //ADD STUDENTS
        if(e.getSource() == this.btnAddStudent){
            this.panelMain.add(this.panelAddStudent);
        }
        
        //VIEW STUDENTS RECORD 
        else if(e.getSource() == this.btnViewStudent) {
            DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
            model.setRowCount(0);
            this.panelMain.add(this.panelViewStudent);
            if(getQuery("Students")){
                try {
                    
                    System.out.println("----------");
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
                    
                }
            } else {
                Dialog = new JOptionPane("Error Fetching: "+error_message, JOptionPane.ERROR_MESSAGE);
                Dialog.setVisible(true);
            }
        }
        
        //EDIT STUDENT RECORDS
        else if(e.getSource() == btnEditRecordsStudent){
            this.panelMain.add(this.panelEditStudent);
        }
        
        //Add Teacher
        else if(e.getSource() == btnAddFaculty){
            this.panelMain.add(this.panelAddTeacher);
        }
        
        //VIEW TEACHER
        else if(e.getSource() == btnViewFaculty){
            DefaultTableModel model = (DefaultTableModel) tblTeachers.getModel();
            model.setRowCount(0);
            this.panelMain.add(this.panelViewTeacher);
            if(getQuery("Teachers")){
                try {
                    System.out.println("----------");
                    while(rs.next()){
                        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                        Object []row = {
                            rs.getString("id"),
                            rs.getString("first_name")+" "+rs.getString("last_name"),
                            rs.getString("gender"),
                            rs.getString("contact"),
                            rs.getString("address"),
                            rs.getString("dept"),
                            rs.getString("desg"),
                            rs.getString("hours"),
                        };
                        model.addRow(row);
                    }
                    tblTeachers.setModel(model);
                    tblTeachers.setVisible(true);
                } catch (SQLException ex) {
                    
                }
            }
        }
        
        //Edit Teacher
        else if(e.getSource() == btnEditRecordsFaculty){
            this.panelMain.add(this.panelEditTeacher);
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
    private javax.swing.JButton btnCalculateSalary;
    private javax.swing.JButton btnCancelSettings;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnDeleteTeacher;
    private javax.swing.JButton btnEditRecordsFaculty;
    private javax.swing.JButton btnEditRecordsStudent;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnMakePayment;
    private javax.swing.JButton btnSaveEditStudent;
    private javax.swing.JButton btnSaveEditTeacher;
    private javax.swing.JButton btnSaveSettings;
    private javax.swing.JButton btnSaveStudent;
    private javax.swing.JButton btnSaveTeacher;
    private javax.swing.JLabel btnSettings;
    private javax.swing.JButton btnViewFaculty;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JButton btn_EditFill;
    private javax.swing.JComboBox<String> cbxDeptTeacher;
    private javax.swing.JComboBox<String> cbxDesgTeacher;
    private javax.swing.JComboBox<String> cbxGender;
    private javax.swing.JComboBox<String> cbxGenderTeacher;
    private javax.swing.JButton edit_btnFillTeacher;
    private javax.swing.JComboBox<String> edit_cbxDeptTeacher;
    private javax.swing.JComboBox<String> edit_cbxDesgTeacher;
    private javax.swing.JComboBox<String> edit_cbxGender;
    private javax.swing.JComboBox<String> edit_cbxGenderTeacher;
    private javax.swing.JSpinner edit_spNew;
    private javax.swing.JSpinner edit_spRepeated;
    private javax.swing.JTextField edit_txtAddress;
    private javax.swing.JTextField edit_txtAddressTeacher;
    private javax.swing.JTextField edit_txtContact;
    private javax.swing.JTextField edit_txtContactTeacher;
    private javax.swing.JTextField edit_txtFirstName;
    private javax.swing.JTextField edit_txtFirstNameTeacher;
    private javax.swing.JTextField edit_txtId;
    private javax.swing.JTextField edit_txtIdTeacher;
    private javax.swing.JTextField edit_txtLastName;
    private javax.swing.JTextField edit_txtLastNameTeacher;
    private javax.swing.JFrame frameSettings;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panelAddStudent;
    private javax.swing.JPanel panelAddTeacher;
    private javax.swing.JPanel panelEditStudent;
    private javax.swing.JPanel panelEditTeacher;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNavigation;
    private javax.swing.JPanel panelPayment;
    private javax.swing.JPanel panelViewStudent;
    private javax.swing.JPanel panelViewTeacher;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spNew;
    private javax.swing.JSpinner spRepeated;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTable tblTeachers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddressTeacher;
    private javax.swing.JTextField txtBaseSalary;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContactTeacher;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstNameTeacher;
    private javax.swing.JTextField txtHA;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastNameTeacher;
    private javax.swing.JTextField txtMA;
    private javax.swing.JTextField txtNewModule;
    private javax.swing.JTextField txtOt;
    private javax.swing.JTextField txtRepeatedModule;
    private javax.swing.JTextField txtTA;
    // End of variables declaration//GEN-END:variables

}
