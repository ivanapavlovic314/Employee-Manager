package orm;

import firma.entity.Zaposleni;
import firma.util.HibernateUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class gui extends javax.swing.JFrame {

    public gui() {
        initComponents();
    }
    
    private static final String QUERY_WHOLE_TABLE = "from Zaposleni";
    private static final String QUERY_ID = "from Zaposleni where id='";
    private static final String QUERY_IME_I_PREZIME = "from Zaposleni where ime_i_prezime ='";
    private static final String QUERY_STAROST = "from Zaposleni where starost";
    private static final String QUERY_ZARADA = "from Zaposleni where zarada";
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup_age = new javax.swing.ButtonGroup();
        buttonGroup_$ = new javax.swing.ButtonGroup();
        buttonGroup_alter_del = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_pretraga = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel_ime = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel_starost = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jPanel_zarada = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jPanel_unos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel_izmena_brisanje = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel_ime.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setText("Unesite ime i prezime zaposlenog");

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton4.setText("TRAZI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("npr: Ivana Pavlovic");

        javax.swing.GroupLayout jPanel_imeLayout = new javax.swing.GroupLayout(jPanel_ime);
        jPanel_ime.setLayout(jPanel_imeLayout);
        jPanel_imeLayout.setHorizontalGroup(
            jPanel_imeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_imeLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(170, 170, 170))
            .addGroup(jPanel_imeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_imeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel_imeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_imeLayout.setVerticalGroup(
            jPanel_imeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_imeLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addGap(38, 38, 38)
                .addComponent(jButton4)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Po imenu i prezimenu", jPanel_ime);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("godina");

        buttonGroup_age.add(jRadioButton4);
        jRadioButton4.setText("Zaposleni sa tacno:");

        buttonGroup_age.add(jRadioButton5);
        jRadioButton5.setText("Starost trazenih zaposlenih u rasponu");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "30", "40", "50", "60" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "30", "40", "50", "60" }));

        jLabel7.setText("od");

        jLabel9.setText("do");

        jLabel10.setText("godina");

        jButton5.setText("TRAZI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buttonGroup_age.add(jRadioButton3);
        jRadioButton3.setText("Zaposleni koji imaju manje od");

        buttonGroup_age.add(jRadioButton6);
        jRadioButton6.setText("Zaposleni koji imaju vise od");

        jLabel13.setText("godina");

        jLabel14.setText("godina");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "40", "50", "60" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "30", "40", "50", "60" }));

        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("npr: 33");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(98, 98, 98))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addComponent(jRadioButton5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addComponent(jButton5)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_starostLayout = new javax.swing.GroupLayout(jPanel_starost);
        jPanel_starost.setLayout(jPanel_starostLayout);
        jPanel_starostLayout.setHorizontalGroup(
            jPanel_starostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_starostLayout.setVerticalGroup(
            jPanel_starostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Po starosti", jPanel_starost);

        buttonGroup_$.add(jRadioButton1);
        jRadioButton1.setText("Zarada zaposlenog iznosi tacno");

        buttonGroup_$.add(jRadioButton2);
        jRadioButton2.setText("Pretraga zaposlenih prema iznosu zarade u rasponu");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel11.setText("RSD");

        jLabel12.setText("od");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25000", "40000", "60000", "80000" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40000", "60000", "80000", "100000" }));

        jLabel15.setText("do");

        jLabel16.setText("RSD");

        buttonGroup_$.add(jRadioButton7);
        jRadioButton7.setText("Zaposleni koji zaradjuju manje od");

        buttonGroup_$.add(jRadioButton8);
        jRadioButton8.setText("Zaposleni koji zaradjuju vise od");

        jLabel17.setText("RSD");

        jLabel18.setText("RSD");

        jButton6.setText("TRAZI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40000", "60000", "80000", "100000" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25000", "40000", "60000", "80000", "100000" }));

        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("npr: 40000");

        javax.swing.GroupLayout jPanel_zaradaLayout = new javax.swing.GroupLayout(jPanel_zarada);
        jPanel_zarada.setLayout(jPanel_zaradaLayout);
        jPanel_zaradaLayout.setHorizontalGroup(
            jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_zaradaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(114, 114, 114))
            .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                                .addComponent(jRadioButton8)
                                .addGap(1, 1, 1)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                                .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel35)
                                    .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel_zaradaLayout.setVerticalGroup(
            jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_zaradaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_zaradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Po visini zarade", jPanel_zarada);

        javax.swing.GroupLayout jPanel_pretragaLayout = new javax.swing.GroupLayout(jPanel_pretraga);
        jPanel_pretraga.setLayout(jPanel_pretragaLayout);
        jPanel_pretragaLayout.setHorizontalGroup(
            jPanel_pretragaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel_pretragaLayout.setVerticalGroup(
            jPanel_pretragaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("PRETRAGA", jPanel_pretraga);

        jLabel1.setText("Ime i prezime");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Adresa");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("Godine");

        jLabel4.setText("Visina zarade");

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setText("UNOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("npr: Ivana Pavlovic");

        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("npr: Deset avijaticara 5, Beograd");

        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("npr: 33");

        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("npr: 40000");

        javax.swing.GroupLayout jPanel_unosLayout = new javax.swing.GroupLayout(jPanel_unos);
        jPanel_unos.setLayout(jPanel_unosLayout);
        jPanel_unosLayout.setHorizontalGroup(
            jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_unosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel_unosLayout.createSequentialGroup()
                            .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel28)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32))
                    .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel_unosLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(52, 52, 52)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel27)
                        .addGroup(jPanel_unosLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(23, 23, 23)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel_unosLayout.setVerticalGroup(
            jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_unosLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(7, 7, 7)
                .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_unosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("UNOS", jPanel_unos);

        jLabel5.setText("Unesite ID zaposlenog:");

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton3.setText("TRAZI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel23.setText("Visina zarade");
        jLabel23.setEnabled(false);

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField16.setEnabled(false);

        jLabel22.setText("Starost");
        jLabel22.setEnabled(false);

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField15.setEnabled(false);

        jLabel21.setText("Adresa");
        jLabel21.setEnabled(false);

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setEnabled(false);

        jLabel19.setText("Ime i prezime");
        jLabel19.setEnabled(false);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setEnabled(false);

        jLabel20.setText("Unesite nove vrednosti");
        jLabel20.setEnabled(false);

        jButton7.setText("AZURIRAJ");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("BRISI");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        buttonGroup_alter_del.add(jRadioButton10);
        jRadioButton10.setText("Izbrisi zaposlenog");
        jRadioButton10.setEnabled(false);

        buttonGroup_alter_del.add(jRadioButton9);
        jRadioButton9.setText("Izmena podataka o zaposlenom");
        jRadioButton9.setEnabled(false);
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("npr: 1");

        javax.swing.GroupLayout jPanel_izmena_brisanjeLayout = new javax.swing.GroupLayout(jPanel_izmena_brisanje);
        jPanel_izmena_brisanje.setLayout(jPanel_izmena_brisanjeLayout);
        jPanel_izmena_brisanjeLayout.setHorizontalGroup(
            jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                                    .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel22))
                                            .addGap(43, 43, 43))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_izmena_brisanjeLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField14)
                                        .addComponent(jTextField15)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jLabel20))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jButton8)))))
                    .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_izmena_brisanjeLayout.setVerticalGroup(
            jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_izmena_brisanjeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addGap(18, 18, 18)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_izmena_brisanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("IZMENA / BRISANJE", jPanel_izmena_brisanje);

        jButton2.setText("PRIKAZ SVIH ZAPOSLENIH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime i prezime", "Adresa", "Starost", "Zarada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        celaTabela();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Integer id= Integer.parseInt(jTextField5.getText());
        if (jRadioButton10.isSelected()) {
            brisanje(id);
            reset();
        }       
        else {
            JOptionPane.showMessageDialog(null,"Obelezite funkciju 'Brisanje' ukoliko zelite da obrisete izabranog zaposlenog!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String id= jTextField5.getText();

        pretragaPoId(id);
        
        if (jTable1.getRowCount()==0) {
            JOptionPane.showMessageDialog(null,"Zaposleni sa zadatom id vrednoscu ne postoji!");
        }
        else {
            jRadioButton9.setEnabled(true);
            jRadioButton10.setEnabled(true);
            jLabel19.setEnabled(true);
            jLabel20.setEnabled(true);
            jLabel21.setEnabled(true);
            jLabel22.setEnabled(true);
            jLabel23.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField14.setEnabled(true);
            jTextField15.setEnabled(true);
            jTextField16.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
                   
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
                
            Zaposleni zaposleni = new Zaposleni();
            
            zaposleni.setImeIPrezime(jTextField1.getText());
            zaposleni.setAdresa(jTextField2.getText());
            zaposleni.setStarost(Integer.parseInt(jTextField3.getText()));
            zaposleni.setZarada(Integer.parseInt(jTextField4.getText()));
            
            System.out.println("Podaci pokupljeni!");
            
            unos(zaposleni);
            tfreset();
        }
        
        catch (NullPointerException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Unesite podatke u prikazanom obliku!");
            System.out.println("Greska u unosu");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String zarada;
        
        if ((!jRadioButton1.isSelected())&&(!jRadioButton2.isSelected())&&(!jRadioButton7.isSelected())&&(!jRadioButton8.isSelected())){
            JOptionPane.showMessageDialog(null,"Izaberite kriterijum pretrage!");
        }       

        if (jRadioButton1.isSelected()){
            
            zarada = jTextField9.getText();
                
            pretragaPoVrednosti(zarada);
        }

        if (jRadioButton2.isSelected()){
            
            String zarada1 = String.valueOf(jComboBox3.getSelectedItem());
            String zarada2 = String.valueOf(jComboBox4.getSelectedItem());
                
            pretragaOpseg(zarada1, zarada2);
        }

        if (jRadioButton7.isSelected()){
            
            zarada = String.valueOf(jComboBox7.getSelectedItem());
            
            pretragaManjeOd(zarada);     
        }
        
        if (jRadioButton8.isSelected()){
            
            zarada = String.valueOf(jComboBox8.getSelectedItem());

            pretragaViseOd(zarada);
        }      

        if (jTable1.getRowCount()==0) {
            JOptionPane.showMessageDialog(null,"Nema rezultata pretrage po datom kriterijumu");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String starost;
        
        if ((!jRadioButton3.isSelected())&&(!jRadioButton4.isSelected())&&(!jRadioButton5.isSelected())&&(!jRadioButton6.isSelected())){
            JOptionPane.showMessageDialog(null,"Izaberite kriterijum pretrage!");
        }

        if (jRadioButton4.isSelected()){
            
            starost = jTextField8.getText();
            
            pretragaPoVrednosti(starost);     
        }

        if (jRadioButton5.isSelected()){
                
            String starost1 = String.valueOf(jComboBox1.getSelectedItem());
            String starost2 = String.valueOf(jComboBox2.getSelectedItem());
                
            pretragaOpseg(starost1, starost2);               
        }

        if (jRadioButton3.isSelected()){
            
            starost = String.valueOf(jComboBox5.getSelectedItem());
                
            pretragaManjeOd(starost);
        }
        
        if (jRadioButton6.isSelected()){
            
            starost = String.valueOf(jComboBox6.getSelectedItem());

            pretragaViseOd(starost);
        }
     

        if (jTable1.getRowCount()==0) {
            JOptionPane.showMessageDialog(null,"Nema rezultata pretrage po datom kriterijumu");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String ime_i_prezime = jTextField6.getText();
      
            pretragaPoImenu(ime_i_prezime);

            if (jTable1.getRowCount()==0) {
                JOptionPane.showMessageDialog(null,"Nema rezultata pretrage po datom kriterijumu");
            }
        }
        catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Greska u unosu! \n Unesite podatke ponovo prema datom primeru!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        
        
        int id = Integer.parseInt(jTextField5.getText());
            
        Session session = HibernateUtil.createSessionFactory().openSession();
       
        try {
            
            session.beginTransaction();

            Zaposleni zaposleni = (Zaposleni) session.get(Zaposleni.class, id);
            jTextField7.setText(zaposleni.getImeIPrezime());
            jTextField14.setText(zaposleni.getAdresa());
            jTextField15.setText(String.valueOf(zaposleni.getStarost()));
            jTextField16.setText(String.valueOf(zaposleni.getZarada()));
            
            session.getTransaction().commit();
      
        } 
        catch (HibernateException e) {
                      
            System.out.println(e + "setup za izmenu");
        }      
        catch (NullPointerException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,"Greska u unosu podataka! \n Pokusajte ponovo!");
        }
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if(jRadioButton9.isSelected()) {

            int id = Integer.parseInt(jTextField5.getText());

            izmena(id);
            pretragaPoId(jTextField5.getText());
        }

    }//GEN-LAST:event_jButton7ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup_$;
    private javax.swing.ButtonGroup buttonGroup_age;
    private javax.swing.ButtonGroup buttonGroup_alter_del;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_ime;
    private javax.swing.JPanel jPanel_izmena_brisanje;
    private javax.swing.JPanel jPanel_pretraga;
    private javax.swing.JPanel jPanel_starost;
    private javax.swing.JPanel jPanel_unos;
    private javax.swing.JPanel jPanel_zarada;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    public void tfreset() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }
    
    public void reset(){
        jTextField5.setText("");
        
        jRadioButton9.setEnabled(false);
        jRadioButton10.setEnabled(false);
        
        
        jLabel19.setEnabled(false);
        jLabel20.setEnabled(false);
        jLabel21.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel23.setEnabled(false);
        
        jTextField7.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        
        jTextField7.setEnabled(false);
        jTextField14.setEnabled(false);
        jTextField15.setEnabled(false);
        jTextField16.setEnabled(false);
        
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        
        DefaultTableModel tablica = (DefaultTableModel) jTable1.getModel();
        tablica.setRowCount(0);
        
    }
    
    private void celaTabela() {
        executeHQLQuery(QUERY_WHOLE_TABLE);
    }
    
    private void pretragaPoImenu(String ime) {
        executeHQLQuery(QUERY_IME_I_PREZIME + ime+"'");
    }
    
    private void pretragaPoId(String id) {
        executeHQLQuery(QUERY_ID +id+"'");
    }
    
    private void pretragaPoVrednosti(String vrednost) {
        
        if(jRadioButton4.isSelected()){
            executeHQLQuery(QUERY_STAROST +"='" +vrednost+"'");
        }
        
        if(jRadioButton1.isSelected()){
            executeHQLQuery(QUERY_ZARADA +"='" +vrednost+"'");
        }
    }
    
    
    private void pretragaOpseg(String opseg1, String opseg2) {
        if(jRadioButton5.isSelected()){
            executeHQLQuery(QUERY_STAROST +">'"+opseg1+"' and starost<'"+opseg2+"'");
        }
        
        if(jRadioButton2.isSelected()){
            executeHQLQuery(QUERY_ZARADA +">'"+opseg1+"' and zarada<'"+opseg2+"'");
        }
}
    
    private void pretragaManjeOd(String vrednost) {
        if(jRadioButton3.isSelected()){
            executeHQLQuery(QUERY_STAROST +"<'"+vrednost+"'");
        }
        
        if(jRadioButton7.isSelected()){
            executeHQLQuery(QUERY_ZARADA +"<'"+vrednost+"'");
        }
    }
    
    private void pretragaViseOd(String vrednost) {
        if(jRadioButton6.isSelected()){
            executeHQLQuery(QUERY_STAROST +">'"+vrednost+"'");
        }
        
        if(jRadioButton8.isSelected()){
            executeHQLQuery(QUERY_ZARADA +">'"+vrednost+"'");
        }
    }
    
    private void unos(Zaposleni zaposleni){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
       
        try {
            session.beginTransaction();

            session.persist(zaposleni);

            session.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null,"Unos uspesan!");
        } 
        catch (HibernateException e) {
                      
            System.out.println(e + "opet greska u unosu");
        } 
        
    }
    
    private void brisanje(Integer id) {
        if(jRadioButton10.isSelected()){
            
           Session session = HibernateUtil.createSessionFactory().openSession();
  
            try {
                session.beginTransaction();
            
                Zaposleni zaposleni = (Zaposleni) session.get(Zaposleni.class, id);
                session.delete(zaposleni);

                session.getTransaction().commit();
            
                JOptionPane.showMessageDialog(null,"Brisanje uspesno!");
            } 
            catch (HibernateException e) {
                
                JOptionPane.showMessageDialog(null,"Greska u konekciji sa bazom!");
                      
                System.out.println(e + "opet greska u brisanju");
            } 
        }
    }
    
    private void izmena(Integer id){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
       
        try {
            session.beginTransaction();

            Zaposleni zaposleni = (Zaposleni) session.get(Zaposleni.class, id);
            zaposleni.setImeIPrezime(jTextField7.getText());
            zaposleni.setAdresa(jTextField14.getText());
            zaposleni.setStarost(Integer.parseInt(jTextField15.getText()));
            zaposleni.setZarada(Integer.parseInt(jTextField16.getText()));

            session.merge(zaposleni);
            session.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null,"Azuriranje uspesno!");
            
            reset();
        } 
        catch (HibernateException e) {
                      
            System.out.println(e + "greska azuriranje");
            JOptionPane.showMessageDialog(null,"Greska u konekciji sa bazom!");
        }
        catch (NullPointerException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,"Greska u unosu podataka! \n Pokusajte ponovo!");
        }
        
    }
    
    private void executeHQLQuery(String hql) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            
                System.out.println("Create proslo");
            
            List tabelaZaposlenih = q.list();
            listing(tabelaZaposlenih);
            
                System.out.println("Listing prosao");
        
            session.getTransaction().commit();
            
                System.out.println("Commit prosao");
        } 
        catch (HibernateException he) {
            System.out.println("Greska u ispisu cele tabele");
        }
    }
    
    private void listing(List tabelaZaposlenih) {
        Vector<String> zaglavlje = new Vector<>();
        Vector<Vector<Object>> podaci = new Vector<>();
        zaglavlje.add("Id"); 
        zaglavlje.add("Ime i prezime");
        zaglavlje.add("Adresa");
        zaglavlje.add("Starost");
        zaglavlje.add("Zarada");

        for(Object o : tabelaZaposlenih) {
            Zaposleni zaposleni = (Zaposleni)o;
            Vector<Object> red = new Vector<>();
            red.add(zaposleni.getId());
            red.add(zaposleni.getImeIPrezime());
            red.add(zaposleni.getAdresa());
            red.add(zaposleni.getStarost());
            red.add(zaposleni.getZarada());
            podaci.add(red);
        }
        jTable1.setModel(new DefaultTableModel(podaci, zaglavlje));
    }

} 
    

