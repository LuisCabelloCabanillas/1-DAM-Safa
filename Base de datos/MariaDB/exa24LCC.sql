/*Luis Cabello Cabanillas*/
create or replace database exa24LCC;
use exa24LCC;

create or replace table clientesLCC(
ID tinyint auto_increment primary key,
DNI char(9) unique not null,
Nombre varchar(20),
Ape1 varchar(30),
Ape2 varchar (30),
Tipo_de_via enum('Calle', 'Plaza', 'Avenida'),
Nombre_via varchar (30),
CP char (5) default 41001,
Localidad varchar (25),
Provincia varchar(15)
);
alter table clientesLCC auto_increment=200;
alter table clientesLCC add Fecha_nacimineto date after Ape2;


create or replace table telefono_clienteLCC(
id_clientes tinyint,
tel_clientes char(9),
primary key(id_clientes,tel_clientes),
constraint tel_cliente foreign key (id_clientes)
	references clientesLCC(ID)
	on delete cascade
	on update cascade
); 

create or replace table cochesLCC(
ID tinyint auto_increment primary key,
matricula char(7) unique,
Marca varchar (20) not null,
Modelo varchar (30) not null check (Marca != Modelo),
Precio decimal (8,2) unsigned check (Precio >= 10500 and Precio <=400000),
Color enum ('Negro','Amarillo','Verde','Blanco'),
Id_cliente tinyint,
constraint id_cli foreign key (Id_cliente)
	references clientesLCC(ID)
		on delete set null 
		on update cascade
);

create or replace table revisionesLCC(
ID tinyint auto_increment primary key,
Fecha date,
id_coche tinyint,
constraint coche foreign key (id_coche)
	references cochesLCC(ID)
		on delete cascade
		on update cascade
);

create or replace table operacionesLCC(
ID tinyint auto_increment primary key,
Descripcion varchar(250),
nombre_corto varchar(20),
horas int check (horas >= 1)
);
alter table operacionesLCC modify horas int check (horas>=2 and horas<=15);

create or replace table consta_deLCC(
ID_revisiones tinyint,
ID_operaciones tinyint,
primary key (ID_revisiones, ID_operaciones),
constraint revi foreign key (ID_revisiones)
	references revisionesLCC(ID),
constraint opera foreign key (ID_operaciones)
	references operacionesLCC(ID)
);

create or replace table materialesLCC(
ID tinyint auto_increment primary key,
Nombre varchar(30),
Precios decimal (5,2) unsigned check (Precios>=15 and Precios <=500 )
);

create or replace table necesitanLCC(
Id_material tinyint,
ID_operaciones tinyint,
Cantidad int,
primary key (ID_material, ID_operaciones),
constraint mate foreign key (ID_material)
	references materialesLCC(ID),
constraint ope foreign key (ID_operaciones)
	references operacionesLCC(ID)
);
alter table necesitanLCC modify Cantidad int default 1;

/*Drop table 
  necesitanLCC,
  materialesLCC,
  consta_deLCC,
  operacionesLCC,
  revisionesLCC,
  cochesLCC,
  telefono_clienteLCC,
  clientesLCC;
 */	