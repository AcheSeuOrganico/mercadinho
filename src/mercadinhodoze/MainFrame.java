package mercadinhodoze;

import database.Database;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MainFrame extends javax.swing.JFrame {

    Database db = new Database();
    ArrayList<String[]> carrinho = new ArrayList<>();
   
    public MainFrame() {
        initComponents();
        setIdProdutos();
        fetchAll();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutoVendas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        atualizarProduto = new javax.swing.JButton();
        botaoBuscarTabelaVendaProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        botaoComprar = new javax.swing.JButton();
        botaoAdicionarCarrinho = new javax.swing.JButton();
        txtDataValidade = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        selectBoxIdProduto = new javax.swing.JComboBox<>();
        botaoQueryProduto = new javax.swing.JButton();
        txtCategoriaProduto = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JTextField();
        txtCustoProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        botaoBuscarTabelaVendaProduto1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        selectIdProdutoDelete = new javax.swing.JComboBox<>();
        apagarProduto = new javax.swing.JButton();
        inserirButton = new javax.swing.JButton();
        cleanFieldsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idProdutoCarrinho = new javax.swing.JComboBox<>();
        botaoRemover = new javax.swing.JButton();
        botaoLimparCarrinho = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalCarrinho = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nomeClienteTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cpfClienteTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaProdutoVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id produto", "Nome", "Categoria", "Custo", "Preço", "Data validade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutoVendas);

        jLabel2.setText("Nome");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Custo");

        jLabel5.setText("Preço");

        jLabel6.setText("Data validade");

        jLabel7.setText("Cadastrar/Atualizar Produto");

        atualizarProduto.setText("Atualizar");
        atualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProdutoActionPerformed(evt);
            }
        });

        botaoBuscarTabelaVendaProduto.setText("Buscar");
        botaoBuscarTabelaVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarTabelaVendaProdutoActionPerformed(evt);
            }
        });

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Produto", "Nome", "Categoria", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaCarrinho);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        botaoComprar.setText("Comprar");
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });

        botaoAdicionarCarrinho.setText("Adicionar");
        botaoAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarCarrinhoActionPerformed(evt);
            }
        });

        jLabel10.setText("ID Produto");

        selectBoxIdProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botaoQueryProduto.setText("Buscar");
        botaoQueryProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQueryProdutoActionPerformed(evt);
            }
        });

        txtCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProdutoActionPerformed(evt);
            }
        });

        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });

        txtCustoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoProdutoActionPerformed(evt);
            }
        });

        jLabel11.setText("Categoria");

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id venda", "Nome", "CPF", "Produto", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaVendas);

        botaoBuscarTabelaVendaProduto1.setText("Buscar");
        botaoBuscarTabelaVendaProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarTabelaVendaProduto1ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        selectIdProdutoDelete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        apagarProduto.setText("Apagar");
        apagarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarProdutoActionPerformed(evt);
            }
        });

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });

        cleanFieldsButton.setText("Limpar");
        cleanFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFieldsButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Apagar produto");

        idProdutoCarrinho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoLimparCarrinho.setText("Limpar");
        botaoLimparCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCarrinhoActionPerformed(evt);
            }
        });

        jLabel3.setText("Total R$:");

        totalCarrinho.setText("0");

        jLabel9.setText("CPF");

        nomeClienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteTxtActionPerformed(evt);
            }
        });

        jLabel12.setText("Nome cliente");

        cpfClienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoBuscarTabelaVendaProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(selectBoxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(idProdutoCarrinho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAdicionarCarrinho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLimparCarrinho)
                                .addGap(134, 134, 134))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botaoComprar)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoBuscarTabelaVendaProduto1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeClienteTxt)
                                        .addComponent(jLabel12)
                                        .addComponent(cpfClienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDataValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCategoriaProduto)
                                    .addComponent(txtNomeProduto))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoQueryProduto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cleanFieldsButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtCustoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(txtPrecoProduto))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(inserirButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(atualizarProduto))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectIdProdutoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apagarProduto))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(335, 335, 335)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(selectBoxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoQueryProduto)
                            .addComponent(cleanFieldsButton))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAdicionarCarrinho)
                            .addComponent(idProdutoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemover)
                            .addComponent(botaoLimparCarrinho))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inserirButton)
                            .addComponent(atualizarProduto)
                            .addComponent(botaoComprar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectIdProdutoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarProduto))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoBuscarTabelaVendaProduto)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscarTabelaVendaProduto1)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setIdProdutos(){
        selectBoxIdProduto.removeAllItems();
        selectIdProdutoDelete.removeAllItems();
        idProdutoCarrinho.removeAllItems();
        String[][] teste = db.selectAll("produto", "id_produto");
        for(String[] a : teste){
            for(String b : a){
                selectBoxIdProduto.addItem(b);
                selectIdProdutoDelete.addItem(b);
                idProdutoCarrinho.addItem(b);
            }
        }
    }
    
    public void updateCarrinho(){
        DefaultTableModel df = (DefaultTableModel)tabelaCarrinho.getModel();
        df.setRowCount(0);
        
        for(String[] produto : this.carrinho){
            df.addRow(produto);
        }
    }
    
    public void cleanFields(){
        txtNomeProduto.setText("");
        txtCategoriaProduto.setText("");
        txtCustoProduto.setText("");
        txtPrecoProduto.setText("");
        txtDataValidade.setText("");
    }
    
    public void fetchAll(){
        String[][] produtos = db.selectAll("produto", "*");
        
        DefaultTableModel df = (DefaultTableModel)tabelaProdutoVendas.getModel();
        df.setRowCount(0);
        
        for (String[] produto : produtos) {
            Vector vetor = new Vector();
            for (String parametro : produto) {
                vetor.add(parametro);
            }
            df.addRow(vetor);
        }
    }
    
    public void updateTotalCarrinho(){
        
        double preco = 0;
        for(int i = 0; i < this.carrinho.size(); i++){
            String precoProduto = this.carrinho.get(i)[3];
            preco = preco + Double.parseDouble(precoProduto);
        }        
        totalCarrinho.setText(String.format("%.2f", preco));
    }
    
    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void atualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProdutoActionPerformed
            try{
                String id_produto = selectBoxIdProduto.getSelectedItem().toString();
                String name = txtNomeProduto.getText();
                String categoria = txtCategoriaProduto.getText();
                String custo = txtCustoProduto.getText();
                String preco = txtPrecoProduto.getText();
                String dataValidade = txtDataValidade.getText();    

                name = String.format("'%s'", name);
                categoria = String.format("'%s'", categoria);
                dataValidade = String.format("'%s'", dataValidade);
                
                String[] parametros = {name, categoria, custo, preco, dataValidade};
                db.updateValue("produto", parametros, id_produto);
                JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso");
                fetchAll();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Houve um erro para atualizar o produto");
            }
            
    }//GEN-LAST:event_atualizarProdutoActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void botaoBuscarTabelaVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarTabelaVendaProdutoActionPerformed

        fetchAll();
        
    }//GEN-LAST:event_botaoBuscarTabelaVendaProdutoActionPerformed

    private void txtCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaProdutoActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void txtCustoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoProdutoActionPerformed

    private void botaoQueryProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQueryProdutoActionPerformed
        
        String id = selectBoxIdProduto.getSelectedItem().toString();
        try (Connection connection = DriverManager.getConnection(db.url, db.username, db.password)){
            String query = String.format("SELECT * FROM produto WHERE id_produto=%s", id);
            Statement statement = connection.createStatement(); 
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                txtNomeProduto.setText(rs.getString(2));
                txtCategoriaProduto.setText(rs.getString(3));
                txtCustoProduto.setText(rs.getString(4));
                txtPrecoProduto.setText(rs.getString(5));
                txtDataValidade.setText(rs.getString(6));
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Houve um erro para buscar o produto");
            throw new IllegalStateException("SQL Error", e);
            
        }
        

    }//GEN-LAST:event_botaoQueryProdutoActionPerformed

    private void botaoBuscarTabelaVendaProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarTabelaVendaProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoBuscarTabelaVendaProduto1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void apagarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarProdutoActionPerformed
        
        try{
            String id_produto = selectIdProdutoDelete.getSelectedItem().toString();
            db.deleteRow("produto", Integer.parseInt(id_produto));
            JOptionPane.showMessageDialog(this, "Produto apagado com sucesso");
            fetchAll();
            setIdProdutos();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Houve um erro para apagar o produto");
        }
        
        
        
        
    }//GEN-LAST:event_apagarProdutoActionPerformed

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
        try{
            String name = txtNomeProduto.getText();
            String categoria = txtCategoriaProduto.getText();
            String custo = txtCustoProduto.getText();
            String preco = txtPrecoProduto.getText();
            String dataValidade = txtDataValidade.getText();

            String parametros = String.format("'%s' , '%s' , %s, %s, '%s'", name, categoria, custo, preco, dataValidade);
            db.insertInto("produto", parametros);
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso");
            
            setIdProdutos();
            fetchAll();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Houve um erro para cadastrar o produto");
        }
    }//GEN-LAST:event_inserirButtonActionPerformed

    private void cleanFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFieldsButtonActionPerformed
        cleanFields();
    }//GEN-LAST:event_cleanFieldsButtonActionPerformed

    private void botaoAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarCarrinhoActionPerformed
        
        String id_produto = idProdutoCarrinho.getSelectedItem().toString();
        String[] parametros = {"id_produto", "nome", "categoria", "preco"};
        String[] produto = db.getProduto(parametros, Integer.parseInt(id_produto));
        
        this.carrinho.add(produto);
        JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso");
        updateCarrinho();
        updateTotalCarrinho();
    }//GEN-LAST:event_botaoAdicionarCarrinhoActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
       try{
            String id_produto = idProdutoCarrinho.getSelectedItem().toString();            
            DefaultTableModel df = (DefaultTableModel)tabelaCarrinho.getModel();
            
            for(int i = 0; i < this.carrinho.size(); i++){

                if(this.carrinho.get(i)[0].equals(id_produto)){
                    df.removeRow(i);
                    this.carrinho.remove(i);
                    break;
                }
            }
            
            updateCarrinho();
            updateTotalCarrinho();
        }
       catch(Exception e){
            JOptionPane.showMessageDialog(this, "Não foi possivel remover este item do carrinho");
       }        
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoLimparCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCarrinhoActionPerformed
        try{
            DefaultTableModel df = (DefaultTableModel)tabelaCarrinho.getModel();
            df.setRowCount(0);
            this.carrinho.clear();
            updateTotalCarrinho();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Não foi possivel remover itens do carrinho");
        }
    }//GEN-LAST:event_botaoLimparCarrinhoActionPerformed

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
       
        try{
            String nomeCliente = nomeClienteTxt.getText();
            String cpf = cpfClienteTxt.getText();
            
            String[] values = new String[this.carrinho.size()];
            
            for(int i = 0; i < this.carrinho.size(); i++){
                values[i] = String.format("(%s, %s, %s,  YEAR(CURDATE()))", nomeCliente, cpf, this.carrinho.get(i)[0]); 
            }
            
            for(String a : values){
                System.out.println(a);
            }
            
            String teste = "INSERT INTO vendas (nome, cpf, id_produto, data_venda) VALUES (1,2,3,4),";
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Não foi realizar a transação");
        }
        
        
    }//GEN-LAST:event_botaoComprarActionPerformed

    private void nomeClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteTxtActionPerformed

    private void cpfClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteTxtActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarProduto;
    private javax.swing.JButton atualizarProduto;
    private javax.swing.JButton botaoAdicionarCarrinho;
    private javax.swing.JButton botaoBuscarTabelaVendaProduto;
    private javax.swing.JButton botaoBuscarTabelaVendaProduto1;
    private javax.swing.JButton botaoComprar;
    private javax.swing.JButton botaoLimparCarrinho;
    private javax.swing.JButton botaoQueryProduto;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton cleanFieldsButton;
    private javax.swing.JTextField cpfClienteTxt;
    private javax.swing.JComboBox<String> idProdutoCarrinho;
    private javax.swing.JButton inserirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField nomeClienteTxt;
    private javax.swing.JComboBox<String> selectBoxIdProduto;
    private javax.swing.JComboBox<String> selectIdProdutoDelete;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTable tabelaProdutoVendas;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JLabel totalCarrinho;
    private javax.swing.JTextField txtCategoriaProduto;
    private javax.swing.JTextField txtCustoProduto;
    private javax.swing.JFormattedTextField txtDataValidade;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
