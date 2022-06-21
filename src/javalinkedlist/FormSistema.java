package javalinkedlist;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame {
    LinkedList<Paciente> lista = new LinkedList<>();
    Comparator<Paciente> compareTempo = 
            (Paciente a1, Paciente a2) ->
                    a1.getTempo() - a2.getTempo();
    
    Comparator<Paciente> comparePrioridade = 
            (Paciente a1, Paciente a2) ->
                    a2.getPrioridade()- a1.getPrioridade();
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        lblProx1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtPrioridade = new javax.swing.JTextField();
        txtTempo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtPosicaoAdd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtEnfermidade = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAtividades = new javax.swing.JTextArea();
        btnAtender = new javax.swing.JButton();
        txtPosicaoRemove = new javax.swing.JTextField();
        btnOrdPrioridade = new javax.swing.JButton();
        btnOrdTempo = new javax.swing.JButton();
        btnOrdNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/equipe-medica.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 200));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblProx.setForeground(new java.awt.Color(19, 128, 221));
        lblProx.setText("Paciente:");

        lblProx1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblProx1.setForeground(new java.awt.Color(19, 128, 221));
        lblProx1.setText("Hospital Kardecista");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/hospital (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblProx1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProx1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(207, 207, 207))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        txtPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPrioridade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prioridade de Atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        txtPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrioridadeActionPerformed(evt);
            }
        });

        txtTempo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTempo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Tempo de Espera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/clipboard.png"))); // NOI18N
        btnAdd.setText("Adicionar Paciente");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPosicaoAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPosicaoAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Posição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/task.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtEnfermidade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtEnfermidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enfermidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPosicaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEnfermidade, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 226, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnfermidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPosicaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        listAtividades.setEditable(false);
        listAtividades.setColumns(20);
        listAtividades.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        listAtividades.setRows(5);
        listAtividades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jScrollPane1.setViewportView(listAtividades);

        btnAtender.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAtender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/completed-task.png"))); // NOI18N
        btnAtender.setText("Atender paciente");
        btnAtender.setActionCommand("");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        txtPosicaoRemove.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPosicaoRemove.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Posição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnOrdPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdPrioridade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/check-list (1).png"))); // NOI18N
        btnOrdPrioridade.setLabel("Ordenar por prioridade");
        btnOrdPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdPrioridadeActionPerformed(evt);
            }
        });

        btnOrdTempo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdTempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/check-list (1).png"))); // NOI18N
        btnOrdTempo.setText("Ordenar por tempo");
        btnOrdTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdTempoActionPerformed(evt);
            }
        });

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/check-list (1).png"))); // NOI18N
        btnOrdNome.setLabel("Ordenar por nome");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAtender)
                        .addGap(18, 18, 18)
                        .addComponent(txtPosicaoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdPrioridade)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtPosicaoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "dados.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Paciente p = new Paciente();
                leitura = line.split(",");
                p.setNome(leitura[0]);
                p.setEnfermidade(leitura[1]);
                p.setPrioridade(Integer.parseInt(leitura[2]));
                int idade = (Integer.parseInt(leitura[3]));
                p.setTempo(idade);
                lista.add(p); 
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void mostra(){
        listAtividades.setText("");
        if(!lista.isEmpty())
            for(Paciente a:lista)
                listAtividades.append(a+"\n");
    }// fim mostra
   
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       Paciente a = new Paciente();
       a.setNome(txtNome.getText());
       a.setEnfermidade(txtEnfermidade.getText());
       a.setPrioridade(
         Integer.parseInt(txtPrioridade.getText()) );
       a.setTempo(
               Integer.parseInt(txtTempo.getText()));
       if(txtPosicaoAdd.getText().equals(""))
           lista.add(a);
       else
           lista.add(Integer.parseInt(txtPosicaoAdd.getText()),a);
       mostra();
    }//GEN-LAST:event_btnAddActionPerformed

   
    
    
    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        Paciente a;
        if(!lista.isEmpty()){
            if(txtPosicaoRemove.getText().equals(""))
                a = lista.remove();
            else
                a = lista.remove(
                    Integer.parseInt(
                        txtPosicaoRemove.getText()) );
            
            lblProx.setText(a.getNome());
            mostra();
        }// fim if isEmpty
        else{
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }
                
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnOrdPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdPrioridadeActionPerformed
        lista.sort(comparePrioridade);
        mostra();
    }//GEN-LAST:event_btnOrdPrioridadeActionPerformed

    private void btnOrdTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdTempoActionPerformed
        lista.sort(compareTempo);
        mostra();
    }//GEN-LAST:event_btnOrdTempoActionPerformed

    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        Collections.sort(lista);
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int c=0;
        boolean encontrou = false;
        for(Paciente a:lista){
            if(a.getNome().contains(txtNome.getText())){
                JOptionPane.showMessageDialog
                    (null, "Encontrado posicao "+c);
                encontrou = true;
            }
            c++;
        }// fim for
        if(!encontrou)
            JOptionPane.showMessageDialog
                    (null, "Não encontrado ");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrioridadeActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.JButton btnOrdPrioridade;
    private javax.swing.JButton btnOrdTempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JLabel lblProx1;
    private javax.swing.JTextArea listAtividades;
    private javax.swing.JTextField txtEnfermidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPosicaoAdd;
    private javax.swing.JTextField txtPosicaoRemove;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
}
