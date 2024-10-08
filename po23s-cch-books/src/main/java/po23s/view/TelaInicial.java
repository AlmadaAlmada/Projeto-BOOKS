/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package po23s.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;
import po23s.http.ClienteHttp;
import po23s.model.Book;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static org.json.JSONObject.NULL;

/**
 *
 * @author MG-11-04-23
 */
public class TelaInicial extends javax.swing.JFrame {
    
    DefaultListModel<Book> listModel = new DefaultListModel<>();
    
    
    public TelaInicial() {
        initComponents();
        ListaLivros.addListSelectionListener(new LimparSelecaoListener());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CaixaBusca = new javax.swing.JTextField();
        BotaoBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoMaximo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaLivros = new javax.swing.JList<>();
        RespostaTitulo = new java.awt.Label();
        RespostaAutor = new java.awt.Label();
        RespostaEditora = new java.awt.Label();
        RespostaPreco = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RespostaPDF = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AvisoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 19, 19));

        CaixaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaBuscaActionPerformed(evt);
            }
        });

        BotaoBuscar.setText("buscar");
        BotaoBuscar.setName("ButtonBusca"); // NOI18N
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("digite um número de 1 a 40: ");

        jLabel3.setText("Configuraçãos de busca.");

        ListaLivros.setModel(listModel);
        ListaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaLivrosMouseClicked(evt);
            }
        });
        ListaLivros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaLivrosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaLivros);

        RespostaTitulo.setBackground(new java.awt.Color(255, 255, 255));

        RespostaAutor.setBackground(new java.awt.Color(255, 255, 255));

        RespostaEditora.setBackground(new java.awt.Color(255, 255, 255));

        RespostaPreco.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Preço:");

        jLabel5.setText("Disponível em PDF:");
        jLabel5.setToolTipText("");

        RespostaPDF.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Autor:");
        jLabel6.setToolTipText("");

        jLabel7.setText("Editora:");
        jLabel7.setToolTipText("");

        jLabel8.setText("Título:");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RespostaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RespostaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RespostaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RespostaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RespostaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AvisoLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CaixaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoBuscar)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscar)
                    .addComponent(jLabel2)
                    .addComponent(CampoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addComponent(AvisoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(RespostaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RespostaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RespostaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(RespostaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(RespostaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private class LimparSelecaoListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                ListaLivros.clearSelection();
            }
        }
    }
    
    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
            
            
        listModel.clear();  
        ListaLivros.clearSelection();
        
        ClienteHttp cliente = new ClienteHttp();
        String busca = CaixaBusca.getText();
        int maximo;
        
        if(CampoMaximo.getText().isEmpty()){
            CampoMaximo.setText("10");      
        }
        
        
        try{
            
            
            maximo = Integer.parseInt(CampoMaximo.getText());
            
            if(maximo <= 0){
            maximo = 10;
            CampoMaximo.setText("10");  
            JOptionPane.showMessageDialog(this, "0 ou valor negativo é inválido.\nA busca por padrão será 10.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        
            if(maximo > 40){
            maximo = 40;
            CampoMaximo.setText("40");  
            JOptionPane.showMessageDialog(this, "Valor > 40 é inválido.\nA busca por padrão será 40.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(NumberFormatException e){
            maximo = 10;
            CampoMaximo.setText("10");  
            JOptionPane.showMessageDialog(this, "Valor inválido.\nA busca por padrão será 10.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
     
        try{
            
            String url = "https://www.googleapis.com/books/v1/volumes?q=" + busca.replaceAll("\\s", "");

            if(maximo != 0){
                url = url + "&maxResults=" + maximo;
            }
            System.out.println(url);
            String json = cliente.buscaDados(url);
            JSONObject jsonObject = new JSONObject(json);
            JSONArray itensJson = jsonObject.optJSONArray("items");


            if (itensJson != null) {
                for (int i = 0; i < itensJson.length(); i++) {
                    JSONObject item = itensJson.getJSONObject(i);
                    JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                    JSONObject saleInfo = item.optJSONObject("saleInfo");
                    JSONObject accessInfo = item.optJSONObject("accessInfo");


                    if (volumeInfo != null) {
                        List<String> autores = new ArrayList<>();

                        String titulo = volumeInfo.optString("title", "Título não disponível");
                        String publisher = volumeInfo.optString("publisher", "Editora não disponível");
                        boolean disponivelPDF = accessInfo.optJSONObject("pdf") != null && accessInfo.optJSONObject("pdf").optBoolean("isAvailable", false);
                        double valor = saleInfo.optJSONObject("listPrice") != null ? saleInfo.optJSONObject("listPrice").optDouble("amount", 0.0) : 0.0;

                        JSONArray autoresJson = volumeInfo.optJSONArray("authors");
                        if (autoresJson != null) {
                            for (int j = 0; j < autoresJson.length(); j++) {
                                autores.add(autoresJson.getString(j));
                            }
                        }
                        if(autores.isEmpty()){
                              autores.add("Autores não disponíveis");
                        }



                        Book book = new Book(titulo, (ArrayList<String>) autores, publisher, disponivelPDF, valor);
                        listModel.addElement(book);
                    }

                }

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "JSon não efetuou a busca.\nPesquise novamente!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            System.out.print("testeeee");
        }
            
        
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void CaixaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaBuscaActionPerformed
            
    }//GEN-LAST:event_CaixaBuscaActionPerformed

    private void ListaLivrosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaLivrosValueChanged
        
        try{
            double valor = listModel.get(evt.getFirstIndex()).getValor();
            RespostaTitulo.setText( listModel.get(evt.getFirstIndex()).getTitulo());
            RespostaAutor.setText(listModel.get(evt.getFirstIndex()).getAutores().toString());
            RespostaEditora.setText( listModel.get(evt.getFirstIndex()).getEditora());
            RespostaPreco.setText(String.format("%.2f", listModel.get(evt.getFirstIndex()).getValor()));
            if(listModel.get(evt.getFirstIndex()).isDisponivelPDF()){
                RespostaPDF.setText("Sim");
            }
            else{
                RespostaPDF.setText("Não");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Valor não encontrado");
        }
       

    }//GEN-LAST:event_ListaLivrosValueChanged

    private void ListaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaLivrosMouseClicked
        
    }//GEN-LAST:event_ListaLivrosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
                TelaInicial telinha = new TelaInicial();
                telinha.setTitle("Buscador de Livros");
                telinha.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoLabel;
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JTextField CaixaBusca;
    private javax.swing.JTextField CampoMaximo;
    private javax.swing.JList<Book> ListaLivros;
    private java.awt.Label RespostaAutor;
    private java.awt.Label RespostaEditora;
    private java.awt.Label RespostaPDF;
    private java.awt.Label RespostaPreco;
    private java.awt.Label RespostaTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
