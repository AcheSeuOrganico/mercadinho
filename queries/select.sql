select 
	p.id_produto,
	p.nome,
	p.categoria,
	p.custo,
	p.preco,
	e.quantidade,
	p.data_validade
from produto p 
join estoque e 
	on p.id_produto = e.id_produto 