
package Kalkulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Farrel Ardian - A11.2021.13437
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    double BilanganPertama;
    double BilanganKedua;
    double Hasil;
    String Operator;
    
    public Kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTampil = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        angka_7 = new javax.swing.JButton();
        angka_8 = new javax.swing.JButton();
        angka_9 = new javax.swing.JButton();
        angka_4 = new javax.swing.JButton();
        angka_5 = new javax.swing.JButton();
        angka_6 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        angka_0 = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        angka_1 = new javax.swing.JButton();
        angka_2 = new javax.swing.JButton();
        angka_3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPlus = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnSamadengan = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(78, 80, 82));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        txtTampil.setBackground(new java.awt.Color(78, 80, 82));
        txtTampil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTampil.setForeground(new java.awt.Color(255, 255, 255));
        txtTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTampilActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        angka_7.setBackground(new java.awt.Color(51, 51, 51));
        angka_7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_7.setForeground(new java.awt.Color(255, 255, 255));
        angka_7.setText("7");
        angka_7.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_7ActionPerformed(evt);
            }
        });

        angka_8.setBackground(new java.awt.Color(51, 51, 51));
        angka_8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_8.setForeground(new java.awt.Color(255, 255, 255));
        angka_8.setText("8");
        angka_8.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_8ActionPerformed(evt);
            }
        });

        angka_9.setBackground(new java.awt.Color(51, 51, 51));
        angka_9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_9.setForeground(new java.awt.Color(255, 255, 255));
        angka_9.setText("9");
        angka_9.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_9ActionPerformed(evt);
            }
        });

        angka_4.setBackground(new java.awt.Color(51, 51, 51));
        angka_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_4.setForeground(new java.awt.Color(255, 255, 255));
        angka_4.setText("4");
        angka_4.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_4ActionPerformed(evt);
            }
        });

        angka_5.setBackground(new java.awt.Color(51, 51, 51));
        angka_5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_5.setForeground(new java.awt.Color(255, 255, 255));
        angka_5.setText("5");
        angka_5.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_5ActionPerformed(evt);
            }
        });

        angka_6.setBackground(new java.awt.Color(51, 51, 51));
        angka_6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_6.setForeground(new java.awt.Color(255, 255, 255));
        angka_6.setText("6");
        angka_6.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_6ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.setPreferredSize(new java.awt.Dimension(50, 50));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        angka_0.setBackground(new java.awt.Color(51, 51, 51));
        angka_0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_0.setForeground(new java.awt.Color(255, 255, 255));
        angka_0.setText("0");
        angka_0.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_0ActionPerformed(evt);
            }
        });

        btnTitik.setBackground(new java.awt.Color(51, 51, 51));
        btnTitik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTitik.setForeground(new java.awt.Color(255, 255, 255));
        btnTitik.setText(".");
        btnTitik.setPreferredSize(new java.awt.Dimension(50, 50));
        btnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitikActionPerformed(evt);
            }
        });

        angka_1.setBackground(new java.awt.Color(51, 51, 51));
        angka_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_1.setForeground(new java.awt.Color(255, 255, 255));
        angka_1.setText("1");
        angka_1.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_1ActionPerformed(evt);
            }
        });

        angka_2.setBackground(new java.awt.Color(51, 51, 51));
        angka_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_2.setForeground(new java.awt.Color(255, 255, 255));
        angka_2.setText("2");
        angka_2.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_2ActionPerformed(evt);
            }
        });

        angka_3.setBackground(new java.awt.Color(51, 51, 51));
        angka_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        angka_3.setForeground(new java.awt.Color(255, 255, 255));
        angka_3.setText("3");
        angka_3.setPreferredSize(new java.awt.Dimension(50, 50));
        angka_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(angka_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));

        btnPlus.setBackground(new java.awt.Color(51, 51, 51));
        btnPlus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setText("+");
        btnPlus.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(51, 51, 51));
        btnMin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setText("-");
        btnMin.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(51, 51, 51));
        btnKali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKali.setForeground(new java.awt.Color(255, 255, 255));
        btnKali.setText("*");
        btnKali.setPreferredSize(new java.awt.Dimension(50, 50));
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(51, 51, 51));
        btnBagi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBagi.setForeground(new java.awt.Color(255, 255, 255));
        btnBagi.setText("/");
        btnBagi.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("E");
        btnExit.setPreferredSize(new java.awt.Dimension(50, 50));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBackspace.setBackground(new java.awt.Color(51, 51, 51));
        btnBackspace.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackspace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackspace.setText("B");
        btnBackspace.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnSamadengan.setBackground(new java.awt.Color(51, 51, 51));
        btnSamadengan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSamadengan.setForeground(new java.awt.Color(255, 255, 255));
        btnSamadengan.setText("=");
        btnSamadengan.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });

        btnPersen.setBackground(new java.awt.Color(51, 51, 51));
        btnPersen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPersen.setForeground(new java.awt.Color(255, 255, 255));
        btnPersen.setText("%");
        btnPersen.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTampil)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTampil, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MasukanAngka(String number){
        String Angka = txtTampil.getText() + number;
        txtTampil.setText(Angka);
    }
    
    private void angka_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_5ActionPerformed
        MasukanAngka("5");
    }//GEN-LAST:event_angka_5ActionPerformed

    private void angka_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_1ActionPerformed
        MasukanAngka("1");
    }//GEN-LAST:event_angka_1ActionPerformed

    private void angka_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_2ActionPerformed
        MasukanAngka("2");
    }//GEN-LAST:event_angka_2ActionPerformed

    private void angka_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_3ActionPerformed
        MasukanAngka("3");
    }//GEN-LAST:event_angka_3ActionPerformed

    private void txtTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTampilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTampilActionPerformed

    private void angka_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_4ActionPerformed
        MasukanAngka("4");
    }//GEN-LAST:event_angka_4ActionPerformed

    private void angka_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_6ActionPerformed
        MasukanAngka("6");
    }//GEN-LAST:event_angka_6ActionPerformed

    private void angka_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_7ActionPerformed
        MasukanAngka("7");
    }//GEN-LAST:event_angka_7ActionPerformed

    private void angka_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_8ActionPerformed
        MasukanAngka("8");
    }//GEN-LAST:event_angka_8ActionPerformed

    private void angka_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_9ActionPerformed
        MasukanAngka("9");
    }//GEN-LAST:event_angka_9ActionPerformed

    private void angka_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka_0ActionPerformed
        MasukanAngka("0");
    }//GEN-LAST:event_angka_0ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        BilanganPertama = Double.parseDouble(txtTampil.getText());
        txtTampil.setText("");
        Operator = "+";
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        BilanganPertama = Double.parseDouble(txtTampil.getText());
        txtTampil.setText("");
        Operator = "-";
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        BilanganPertama = Double.parseDouble(txtTampil.getText());
        txtTampil.setText("");
        Operator = "*";
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        BilanganPertama = Double.parseDouble(txtTampil.getText());
        txtTampil.setText("");
        Operator = "/";
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersenActionPerformed
        BilanganPertama = Double.parseDouble(txtTampil.getText());
        txtTampil.setText("");
        Operator = "%";
    }//GEN-LAST:event_btnPersenActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtTampil.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        String backSpace = null;
        if(txtTampil.getText().length() > 0){
            StringBuilder sb = new StringBuilder(txtTampil.getText());
            sb.deleteCharAt(txtTampil.getText().length() - 1);
            
            backSpace = sb.toString();
            txtTampil.setText(backSpace);
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitikActionPerformed
        if(!txtTampil.getText().contains(".")){
            txtTampil.setText(txtTampil.getText() + btnTitik.getText());
        }
    }//GEN-LAST:event_btnTitikActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        BilanganKedua = Double.parseDouble(txtTampil.getText());
        
        if(Operator == "+"){
            Hasil = BilanganPertama + BilanganKedua;
            txtTampil.setText(String.valueOf(Hasil));
        }else if(Operator == "-"){
            Hasil = BilanganPertama - BilanganKedua;
            txtTampil.setText(String.valueOf(Hasil));
        }else if(Operator == "*"){
            Hasil = BilanganPertama * BilanganKedua;
            txtTampil.setText(String.valueOf(Hasil));
        }else if(Operator == "/"){
            Hasil = BilanganPertama / BilanganKedua;
            txtTampil.setText(String.valueOf(Hasil));
        }else if(Operator == "%"){
            Hasil = (BilanganKedua/100) * BilanganPertama;
            txtTampil.setText(String.valueOf(Hasil));
        }
    }//GEN-LAST:event_btnSamadenganActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka_0;
    private javax.swing.JButton angka_1;
    private javax.swing.JButton angka_2;
    private javax.swing.JButton angka_3;
    private javax.swing.JButton angka_4;
    private javax.swing.JButton angka_5;
    private javax.swing.JButton angka_6;
    private javax.swing.JButton angka_7;
    private javax.swing.JButton angka_8;
    private javax.swing.JButton angka_9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTitik;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtTampil;
    // End of variables declaration//GEN-END:variables
}
