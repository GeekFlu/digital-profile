create keyspace digital_profile with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

create table digital_profile
(
	id_profile timeuuid primary key,
	nombre text,
	ap_paterno text,
	ap_materno text,
	nombre_completo text,
	edad smallint,
	anio_nacimiento smallint,
    mes_nacimiento smallint,
    dia_nacimiento smallint,
	primary key (id_profile)
)
with comment = 'This table will hold the infomation for the digital profile, the most basic information';

create table profiles_by_birthdate
(
	anio_nacimiento smallint,
	mes_nacimiento smallint,
	dia_nacimiento smallint,
	ap_paterno text,
	ap_materno text,
	nombre int,
	id_profile timeuuid,
	primary key ((anio_nacimiento, mes_nacimiento, dia_nacimiento), ap_paterno, ap_materno, nombre)
);

