USE mercadinho;


CREATE TABLE produto (
	id_produto int AUTO_INCREMENT,
	nome varchar(60),
	categoria varchar(60),
	custo double,
	preco double,
	data_validade date,
	PRIMARY KEY(id_produto)
)

CREATE TABLE estoque (
	id_estoque int,
	id_produto int,
	quantidade int,
	PRIMARY KEY(id_estoque), 
	FOREIGN KEY(id_produto) REFERENCES produto(id_produto)
)

CREATE TABLE vendas (
	id_venda int,
	nome varchar(60),
	cpf int,
	id_produto int,
	data_venda date,
	PRIMARY KEY (id_venda),
	FOREIGN KEY (id_produto) REFERENCES estoque(id_produto)
)