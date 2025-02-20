SELECT c.nombre"Nombre LCC", c.apellido1, c.apellido2, max(p.total)||' €'"Total Pedido"
FROM clientes c join pedidos p on c.id=p.id_cliente
where p.total= (SELECT max(p.total)FROM pedidos p)
group by c.nombre,c.apellido1,c.apellido2;

