create database concesionario_db;

use concesionario_db;


Create table clientes 
(doc varchar (10) , 
nombre_completo varchar (60) , 
telefono varchar (15),
username varchar(50),
password varchar(50),
constraint kei primary key (doc) );

Create table vehiculos 
(mat varchar (6), 
marca varchar (15) , 
modelo varchar(20), 
valor integer,
foto blob, 
constraint k primary key (mat));


Create table ventas 
(id int auto_increment,
doc varchar (10), 
mat varchar (6),
cantidad integer, 
valor integer,
constraint kk primary key (id),
constraint fc foreign key (doc) references clientes (doc),
constraint fc2 foreign key (mat) references vehiculos (mat));