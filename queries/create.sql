USE mercadinho;


CREATE TABLE produto (
	id_produto int AUTO_INCREMENT,
	nome varchar(60),
	categoria varchar(60),
	custo double,
	preco double,
	PRIMARY KEY(id_produto) 
)

CREATE TABLE estoque (
	id_estoque int AUTO_INCREMENT,
	id_produto int,
	quantidade int,
	PRIMARY KEY(id_estoque), 
	FOREIGN KEY(id_produto) REFERENCES produto(id_produto) ON DELETE CASCADE
)

CREATE TABLE vendas (
	id_venda int AUTO_INCREMENT,
	nome varchar(60) NULL,
	cpf char(11) NULL,
	id_produto int,
	quantidade int,
	valor_total double,
	data_venda date,
	PRIMARY KEY (id_venda),
	FOREIGN KEY (id_produto) REFERENCES estoque(id_produto) ON DELETE SET NULL
)