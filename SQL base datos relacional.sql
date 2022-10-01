create database fix_medical;
 
 create table paciente (
 idpaciente int primary key auto_increment,
 nombre varchar(45) not null,
 apellido varchar (45) not null,
 direccion varchar (45),
 telefono varchar (45),
 edad int (3) not null,
 sexo varchar (45) not null
 );
 
 create table expediente (
 idexpediente int primary key auto_increment,
 motivo_consulta varchar(250) not null,
 antecedentes varchar (250) not null,
 alergia varchar (250) not null,
 peso varchar (45) not null,
 estatura varchar (45) not null,
 id_paciente int not null,
 foreign key (id_paciente) references paciente(idpaciente)
 );
 
create table citas(
idcitas int primary key auto_increment,
id_paciente int not null,
fecha_cita date not null,
hora_cita date not null,
foreign key (id_paciente) references paciente(idpaciente)
);

create table consulta(
idconsulta int primary key auto_increment,
id_cita int not null,
sintomas varchar (250) not null,
padecimientos varchar (250) not null,
examenes varchar (250) not null,
foreign key (id_cita) references citas(idcitas)
);

create table reseta (
 idreseta int primary key auto_increment,
 medicamento varchar(50) not null,
 dosis varchar (45) not null
 );
 
 create table reportes(
idreportes int primary key auto_increment,
id_consulta int not null,
id_reseta int not null,
Detalles varchar (250) not null,
foreign key (id_consulta) references consulta(idconsulta),
foreign key (id_reseta) references reseta(idreseta)
);