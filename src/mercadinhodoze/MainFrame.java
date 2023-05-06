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
import java.util.Locale;

public class MainFrame extends javax.swing.JFrame {

    Database db = new Database();
    ArrayList<String[]> carrinho = new ArrayList<>();
   
    public MainFrame() {
        Locale.setDefault(new Locale("en", "US"));
        initComponents();
        try{
            setIdProdutos();
            fetchAll("");
            updateQuantidades();
            updateTabelaVendas("");
        }catch(Exception e){
            System.out.println("Erro ao consultar as tabelas " + e);
        }
        
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
        botaoBuscarTabelaProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        barraBuscaProduto = new javax.swing.JTextField();
        botaoComprar = new javax.swing.JButton();
        botaoAdicionarCarrinho = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        selectBoxIdProduto = new javax.swing.JComboBox<>();
        botaoQueryProduto = new javax.swing.JButton();
        txtCategoriaProduto = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JTextField();
        txtCustoProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        botaoBuscarTabelaVenda = new javax.swing.JButton();
        barraBuscarTabelaVenda = new javax.swing.JTextField();
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
        jLabel13 = new javax.swing.JLabel();
        quantidadeProdutoTxt = new javax.swing.JTextField();
        quantidadeBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

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
                "Id produto", "Nome", "Categoria", "Custo", "Preço", "Quantidade"
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

        jLabel7.setText("Cadastrar/Atualizar Produto");

        atualizarProduto.setText("Atualizar");
        atualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProdutoActionPerformed(evt);
            }
        });

        botaoBuscarTabelaProduto.setText("Buscar");
        botaoBuscarTabelaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarTabelaProdutoActionPerformed(evt);
            }
        });

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "ID Produto", "Nome", "Categoria", "Quantidade", "Valor unidade", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaCarrinho);

        barraBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBuscaProdutoActionPerformed(evt);
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
                "Id venda", "Nome", "Produto", "Quantidade", "Valor", "Data venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaVendas);

        botaoBuscarTabelaVenda.setText("Buscar");
        botaoBuscarTabelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarTabelaVendaActionPerformed(evt);
            }
        });

        barraBuscarTabelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBuscarTabelaVendaActionPerformed(evt);
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

        jLabel13.setText("Quantidade");

        quantidadeProdutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeProdutoTxtActionPerformed(evt);
            }
        });

        quantidadeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("ID Produto");

        jLabel15.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoBuscarTabelaVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barraBuscarTabelaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(botaoBuscarTabelaProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(barraBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoComprar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9)
                                        .addComponent(nomeClienteTxt)
                                        .addComponent(jLabel12)
                                        .addComponent(cpfClienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCategoriaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                                .addComponent(txtNomeProduto))
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel11)
                                            .addComponent(quantidadeProdutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(inserirButton)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCustoProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectIdProdutoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(apagarProduto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(2, 2, 2)
                                        .addComponent(selectBoxIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoQueryProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cleanFieldsButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(atualizarProduto))
                                    .addComponent(jLabel13))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idProdutoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(quantidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoAdicionarCarrinho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoRemover)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoLimparCarrinho))))))))
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
                            .addComponent(cleanFieldsButton)
                            .addComponent(atualizarProduto))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAdicionarCarrinho)
                            .addComponent(idProdutoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemover)
                            .addComponent(botaoLimparCarrinho)
                            .addComponent(quantidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectIdProdutoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apagarProduto))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoBuscarTabelaProduto)
                            .addComponent(barraBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoBuscarTabelaVenda)
                            .addComponent(barraBuscarTabelaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jLabel13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoComprar)
                                    .addComponent(inserirButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(quantidadeProdutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
    
    public void updateTabelaVendas(String query){
        String[] columns = {"x.id_venda","x.nome", "y.nome", "x.quantidade","x.valor_total","x.data_venda",};
        String[][] produtos = db.selectJoin("vendas", "produto", columns, query);
        
        DefaultTableModel df = (DefaultTableModel)tabelaVendas.getModel();
        df.setRowCount(0);
        
        for (String[] produto : produtos) {
            Vector vetor = new Vector();
            for (String parametro : produto) {
                vetor.add(parametro);
            }
            df.addRow(vetor);
        }
    }
    
    public void updateQuantidades(){
        quantidadeBox.removeAllItems();
        for(int i = 1; i <= 500; i++){
            String item = String.format("%d", i);
            quantidadeBox.addItem(item);
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
        quantidadeProdutoTxt.setText("");
    }
    
    public void fetchAll(String query){
        String[] columns = {"x.id_produto","x.nome","x.categoria","x.custo","x.preco","y.quantidade",};
        String[][] produtos = db.selectJoin("produto", "estoque", columns, query);
        
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
            String precoProduto = this.carrinho.get(i)[5];
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
                String quantidade = quantidadeProdutoTxt.getText();  

                name = String.format("'%s'", name);
                categoria = String.format("'%s'", categoria);
                
                String[] parametrosProduto = {name, categoria, custo, preco};
                String[] parametrosEstoque = {id_produto, quantidade};
                
                db.updateValue("produto", parametrosProduto, id_produto);
                db.updateValue("estoque", parametrosEstoque, id_produto);
                JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso");
                setIdProdutos();
                fetchAll("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Houve um erro para atualizar o produto");
            }
            
    }//GEN-LAST:event_atualizarProdutoActionPerformed

    private void barraBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBuscaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBuscaProdutoActionPerformed

    private void botaoBuscarTabelaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarTabelaProdutoActionPerformed

        String busca = barraBuscaProduto.getText();
        fetchAll(busca);
        
    }//GEN-LAST:event_botaoBuscarTabelaProdutoActionPerformed

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
            String[] columns = {"x.id_produto","x.nome","x.categoria","x.custo","x.preco","y.quantidade",};
            String query = String.format("SELECT %s FROM produto x JOIN estoque y ON y.id_produto = x.id_produto WHERE x.id_produto=%s", String.join(",", columns), id);
            Statement statement = connection.createStatement(); 
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                txtNomeProduto.setText(rs.getString(2));
                txtCategoriaProduto.setText(rs.getString(3));
                txtCustoProduto.setText(rs.getString(4));
                txtPrecoProduto.setText(rs.getString(5));
                quantidadeProdutoTxt.setText(rs.getString(6));
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Houve um erro para buscar o produto");
            throw new IllegalStateException("SQL Error", e);
            
        }
        

    }//GEN-LAST:event_botaoQueryProdutoActionPerformed

    private void botaoBuscarTabelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarTabelaVendaActionPerformed
        String query = barraBuscarTabelaVenda.getText();
        updateTabelaVendas(query);
    }//GEN-LAST:event_botaoBuscarTabelaVendaActionPerformed

    private void barraBuscarTabelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBuscarTabelaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBuscarTabelaVendaActionPerformed

    private void apagarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarProdutoActionPerformed
        
        try{
            String id_produto = selectIdProdutoDelete.getSelectedItem().toString();
            db.deleteRow("produto", Integer.parseInt(id_produto));
            fetchAll("");
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
            double custo = Double.parseDouble(txtCustoProduto.getText());
            double preco = Double.parseDouble(txtPrecoProduto.getText());
            int quantidadeProduto = Integer.parseInt(quantidadeProdutoTxt.getText());

            String parametros = String.format("('%s' , '%s' , %.2f, %.2f)", name, categoria, custo, preco);
            db.insertInto("produto", parametros);
            int idProduto = db.getIdProduto(name);
            db.insertInto("estoque", String.format("(%s, %s)", idProduto, quantidadeProduto));
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso");
            setIdProdutos();
            fetchAll("");
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
        String quantidade = quantidadeBox.getSelectedItem().toString();
        String[] parametros = {"id_produto", "nome", "categoria", "preco"};        
        String[] produto = db.getOne("produto", parametros, Integer.parseInt(id_produto));
        double precoTotal = Double.parseDouble(produto[3]) * Double.parseDouble(quantidade);
        String[] produtoFormatado = {produto[0], produto[1], produto[2], quantidade, produto[3], String.format("%.2f", precoTotal)};
        this.carrinho.add(produtoFormatado);
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
            DefaultTableModel df = (DefaultTableModel)tabelaCarrinho.getModel();
            String nomeCliente = nomeClienteTxt.getText();
            String cpf = cpfClienteTxt.getText();
            
            int numeroItensCarrinho = this.carrinho.size();
            
            String[] values = new String[numeroItensCarrinho];
            String[] productsIds = new String[numeroItensCarrinho];
            String[] productsValues = new String[numeroItensCarrinho];
            
            for(int i = 0; i < this.carrinho.size(); i++){
                String idProduto = this.carrinho.get(i)[0];
                String quantidade = this.carrinho.get(i)[3];
                String valorTotal = this.carrinho.get(i)[5];
                
                values[i] = String.format("('%s', '%s', %s, %s, %s,  CURDATE())", nomeCliente, cpf, idProduto, quantidade, valorTotal);
                
                String[] tableColumn = {"quantidade"};
                String[] quantidadeEstoque = db.getOne("estoque", tableColumn, Integer.parseInt(idProduto));
                
                int novoValorEstoque = Integer.parseInt(quantidadeEstoque[0]) - Integer.parseInt(quantidade);
                
                if(novoValorEstoque < 0){
                    JOptionPane.showMessageDialog(this, "Quantidade insuficiente no estoque");
                    throw new Exception();
                }
                
                productsIds[i] = idProduto;
                productsValues[i] = String.format("%d", novoValorEstoque);
            }
            
            String parametros = String.join(",", values);            
            db.insertInto("vendas", parametros);
            db.updateRows("estoque", "quantidade", productsIds, productsValues);
            JOptionPane.showMessageDialog(this, "Compra cadastrada com sucesso");
            df.setRowCount(0);            
            nomeClienteTxt.setText("");
            cpfClienteTxt.setText("");
            this.carrinho.clear();
            updateTotalCarrinho();
            updateTabelaVendas("");        
            fetchAll("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Não foi possivel realizar a transação");
        }
        
        
    }//GEN-LAST:event_botaoComprarActionPerformed

    private void nomeClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteTxtActionPerformed

    private void cpfClienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteTxtActionPerformed

    private void quantidadeProdutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeProdutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeProdutoTxtActionPerformed

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
    private javax.swing.JTextField barraBuscaProduto;
    private javax.swing.JTextField barraBuscarTabelaVenda;
    private javax.swing.JButton botaoAdicionarCarrinho;
    private javax.swing.JButton botaoBuscarTabelaProduto;
    private javax.swing.JButton botaoBuscarTabelaVenda;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField nomeClienteTxt;
    private javax.swing.JComboBox<String> quantidadeBox;
    private javax.swing.JTextField quantidadeProdutoTxt;
    private javax.swing.JComboBox<String> selectBoxIdProduto;
    private javax.swing.JComboBox<String> selectIdProdutoDelete;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTable tabelaProdutoVendas;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JLabel totalCarrinho;
    private javax.swing.JTextField txtCategoriaProduto;
    private javax.swing.JTextField txtCustoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
