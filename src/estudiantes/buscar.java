/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estudiantes;
import estudiantes.DB2;
import estudiantes.resultados;
import java.util.List;
import java.util.ArrayList;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class buscar extends javax.swing.JFrame {

    /**
     * Creates new form buscar
     */
    public buscar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        primero = new javax.swing.JButton();
        segundo = new javax.swing.JButton();
        tercero = new javax.swing.JButton();
        cuarto = new javax.swing.JButton();
        quinto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ordendesc = new javax.swing.JButton();
        ordenasc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aqui puedes buscar alumnos por: ");

        A.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        J.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        M.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        N.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        O.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        P.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        Q.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        S.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        T.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        U.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        V.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tambien puedes buscar alumnos por: ");

        primero.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        primero.setText("1er AÑO");
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });

        segundo.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        segundo.setText("2do AÑO");
        segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoActionPerformed(evt);
            }
        });

        tercero.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        tercero.setText("3er AÑO");
        tercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceroActionPerformed(evt);
            }
        });

        cuarto.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        cuarto.setText("4to AÑO");
        cuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuartoActionPerformed(evt);
            }
        });

        quinto.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        quinto.setText("5to AÑO");
        quinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quintoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("O puedes ver todos los alumnos por: ");

        ordendesc.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        ordendesc.setText("Orden descendiente");
        ordendesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordendescActionPerformed(evt);
            }
        });

        ordenasc.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        ordenasc.setText("Orden ascendente");
        ordenasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenascActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ordenasc)
                        .addGap(67, 67, 67)
                        .addComponent(ordendesc))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(A)
                        .addGap(12, 12, 12)
                        .addComponent(B)
                        .addGap(12, 12, 12)
                        .addComponent(C)
                        .addGap(12, 12, 12)
                        .addComponent(D)
                        .addGap(12, 12, 12)
                        .addComponent(E)
                        .addGap(12, 12, 12)
                        .addComponent(F)
                        .addGap(12, 12, 12)
                        .addComponent(G)
                        .addGap(12, 12, 12)
                        .addComponent(H)
                        .addGap(12, 12, 12)
                        .addComponent(I)
                        .addGap(12, 12, 12)
                        .addComponent(J)
                        .addGap(12, 12, 12)
                        .addComponent(K)
                        .addGap(12, 12, 12)
                        .addComponent(L))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(M)
                        .addGap(12, 12, 12)
                        .addComponent(N)
                        .addGap(12, 12, 12)
                        .addComponent(O)
                        .addGap(12, 12, 12)
                        .addComponent(P)
                        .addGap(12, 12, 12)
                        .addComponent(Q)
                        .addGap(12, 12, 12)
                        .addComponent(R)
                        .addGap(12, 12, 12)
                        .addComponent(S)
                        .addGap(12, 12, 12)
                        .addComponent(T)
                        .addGap(12, 12, 12)
                        .addComponent(U)
                        .addGap(12, 12, 12)
                        .addComponent(V)
                        .addGap(12, 12, 12)
                        .addComponent(W)
                        .addGap(12, 12, 12)
                        .addComponent(X))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Y)
                        .addGap(12, 12, 12)
                        .addComponent(Z))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(primero)
                        .addGap(18, 18, 18)
                        .addComponent(segundo)
                        .addGap(18, 18, 18)
                        .addComponent(tercero)
                        .addGap(18, 18, 18)
                        .addComponent(cuarto)
                        .addGap(18, 18, 18)
                        .addComponent(quinto)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D)
                    .addComponent(E)
                    .addComponent(F)
                    .addComponent(G)
                    .addComponent(H)
                    .addComponent(I)
                    .addComponent(J)
                    .addComponent(K)
                    .addComponent(L))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M)
                    .addComponent(N)
                    .addComponent(O)
                    .addComponent(P)
                    .addComponent(Q)
                    .addComponent(R)
                    .addComponent(S)
                    .addComponent(T)
                    .addComponent(U)
                    .addComponent(V)
                    .addComponent(W)
                    .addComponent(X))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Y)
                    .addComponent(Z))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(primero)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tercero)
                        .addComponent(cuarto)
                        .addComponent(quinto)
                        .addComponent(segundo)))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordendesc)
                    .addComponent(ordenasc))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        List<String> nombres = DB2.buscarNombresPorLetra('A');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('B');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('C');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('D');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('E');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('F');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('G');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('H');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('I');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('J');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('K');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('L');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('M');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('N');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('O');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('P');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('Q');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('R');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('S');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('T');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('U');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('V');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('W');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('X');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('Y');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarNombresPorLetra('Z');
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_ZActionPerformed

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarEstudiantesPorCurso("1ro");
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_primeroActionPerformed

    private void segundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarEstudiantesPorCurso("2do");
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_segundoActionPerformed

    private void terceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceroActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarEstudiantesPorCurso("3ro");
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_terceroActionPerformed

    private void cuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuartoActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarEstudiantesPorCurso("4to");
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_cuartoActionPerformed

    private void quintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quintoActionPerformed
        // TODO add your handling code here:
        List<String> nombres = DB2.buscarEstudiantesPorCurso("5to");
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombres);
        res.setVisible(true);
    }//GEN-LAST:event_quintoActionPerformed

    private void ordenascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenascActionPerformed
        // TODO add your handling code here:
        List<String> nombresOrdenados = DB2.obtenerNombresEnOrdenAlfabetico();
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombresOrdenados);
        res.setVisible(true);
    }//GEN-LAST:event_ordenascActionPerformed

    private void ordendescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordendescActionPerformed
        // TODO add your handling code here:this.setVisible(false);
        List<String> nombresOrdenados = DB2.obtenerNombresEnOrdenAlfabetico_ZA();
        resultados res = new resultados();
        res.mostrarNombresEnTextArea(nombresOrdenados);
        res.setVisible(true);
    }//GEN-LAST:event_ordendescActionPerformed

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
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton cuarto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ordenasc;
    private javax.swing.JButton ordendesc;
    private javax.swing.JButton primero;
    private javax.swing.JButton quinto;
    private javax.swing.JButton segundo;
    private javax.swing.JButton tercero;
    // End of variables declaration//GEN-END:variables
}
