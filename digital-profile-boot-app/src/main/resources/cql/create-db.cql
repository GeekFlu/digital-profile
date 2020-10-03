create keyspace digital_profile with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

create table digital_profile
(
	id_profile timeuuid primary key,
	nombre text,
	ap_paterno text,
	ap_materno text,
	nombre_completo text,
	edad smallint,
	fecha_nacimiento timestamp,
	primary key (fecha_nacimiento, digital_profile_id)
)
with comment = 'This table will hold the infomation for the digital profile, the most basic information';

create table profiles_by_birthdate
(
	fecha_nacimiento timestamp,
	digital_profile_id timeuuid,
	ap_paterno text,
	ap_materno text,
	edad smallint,
	nombre text,
	nombre_completo text,
	primary key (fecha_nacimiento, digital_profile_id)
)
with comment = 'Esta tabla mantendra el registro de los perfiles por anio';


