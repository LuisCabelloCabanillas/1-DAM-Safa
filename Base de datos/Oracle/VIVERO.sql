SET SERVEROUTPUT ON

create or replace procedure productosGamas(tipo producto.gama%type) as 
 cursor datosproduc is
    SELECT nombre, precio_venta
    FROM producto
    where gama = tipo;

        conteo number;
    BEGIN
        select count(gama) into conteo
        from producto
        where gama = tipo;
        
        DBMS_OUTPUT.PUT_LINE('Los productos de la gama ' || tipo || ' son:');
        DBMS_OUTPUT.PUT_LINE('------------------------------------');
        for datos in datosproduc LOOP
        DBMS_OUTPUT.PUT_LINE ('Nombre:   '||datos.nombre|| ' PVP: ' ||datos.precio_venta);
        DBMS_OUTPUT.PUT_LINE('------------------------------------');
        END LOOP;
        DBMS_OUTPUT.PUT_LINE('Hay ' || conteo || ' productos de la gama ' || tipo);
    END;
    /
exec productosGamas('Herramientas');



create or replace procedure LCC3 (mes pedido.fecha_pedido%type) as 
 cursor fechasPedidos is 
    select *
    from pedido
    where to_char(fecha_entrega,'MM')=mes;
    
Begin
    Open fechasPedidos;
    Fetch fechasPedidos into datos;
    While fechasPedidos%found LOOP
        DBMS_OUTPUT.PUT_LINE ('Codigo pedido: '||);
        FETCH fechasPedidos into datos;
    End LOOP;
    CLOSE fechasPedidos;
End;
/