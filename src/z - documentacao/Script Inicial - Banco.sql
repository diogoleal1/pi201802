--CREATE DATABASE projetopi;

--CREATE USER projetopi WITH PASSWORD '123456';

CREATE TABLE cidade(
	codigo int serial primary key,
	nome varchar(30) not null,
	uf varchar(2) not null
);

--insert into cidade(nome, uf) values('SENADOR CANEDO','GO');


CREATE TABLE agencia(
	codigo serial primary key,
	nome varchar(30) not null,
	rua varchar(15) not null,
	quadra varchar(8) not null,
	lote varchar(8) not null,
	id_cidade int not null, 
	FOREIGN KEY (id_cidade) REFERENCES cidade(codigo)
);

--insert into agencia(nome, rua, quadra, lote, id_cidade) values('BURITI','AV. RIO VERDE','20','1 a 70',2);

CREATE TABLE conta(
	numero int primary key,
	saldo numeric(11,2) default 0.00,
	tipo varchar(1) check (tipo in('C','P')),
	conjunta boolean not null,
	cheque boolean not null,	
	id_agencia int,
	FOREIGN KEY (id_agencia) REFERENCES agencia(codigo)
);


CREATE TABLE cliente(
	codigo int primary key,
	nome varchar (40) not null,
	cpf varchar(11) not null,
	rua	varchar(15) not null,
	quadra varchar(8) not null,
	lote varchar(8) not null,
	dataCadastro date not null,
	id_cidade int references cidade(codigo)
);


CREATE TABLE conta_usuario(
	id_usuario int references usuario(codigo),
	id_conta int references conta(numero),
	primary key(id_usuario, id_conta)
);

CREATE TABLE movimentacao(
	codigo int primary key,
	tipo varchar(1) check (tipo in('D','S')),
	valor numeric(11,2) not null,
	data date not null,
	id_cliente int references cliente(codigo),
	id_conta int references conta(numero)	
)
