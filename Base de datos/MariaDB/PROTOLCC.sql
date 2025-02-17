/* Luis Cabello Cabanillas*/
create or replace database ProtoLCC;
use ProtoLCC;

create or replace table PrototiposLCC (
id tinyint auto_increment primary key,
Nombre Varchar(20) unique,
Descripcion Varchar(100),
Presupuesto float check unsigned,
fecha_inicio date,
fecha_fin date check > fecha_inicio,
horas_estimadas float check >= 30
);

create or replace table RecursosLCC (
id tinyint auto_increment primary key,
Nombre Varchar(20),
Descripcion Varchar(100),
Tipo Varchar(15)
);

create or replace table EmpleadosLCC (
id tinyint auto_increment primary key,
dni char(9) unique,
Email Varchar(30) unique,
Nombre Varchar(20),
Titulacion Varchar(50),
Anos_de_experiencia Varchar(2),
Tipo_via  enum('Calle','Plaz','Avenida'),
Nombre_via Varchar(20),
Codigo_postal char(5),
Localidad char(20),
Provincia Varchar(20)
);

create or replace table Telefonos_empleadosLCC (
Telefono char(9),
id_Empleado tinyint ,
primary key (Telefono, id_Empleado),
constraint id_Empleado foreign key (id_Empleado)
	references EmpleadosLCC(id)
);

create or replace table gastosLCC (
id tinyint auto_increment primary key,
id_prototipo tinyint not null ,
id_empleado tinyint not null,
Fecha date,
descripcion varchar(100),
tipo varchar(15),
importe float check (importe>0 and  importe<= 20000 and importe = round(valor, 2)),
foreign key (id_prototipo)
	references PrototiposLCC(id),
foreign key (id_empleado)
	references EmpleadosLCC(id)
)