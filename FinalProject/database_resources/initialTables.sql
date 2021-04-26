
create table if not exists users(
	id serial primary key,
	firstname varchar(255),
	lastname varchar(255),
	username varchar(255),
	password varchar(255)
);
create table if not exists roles(
	id serial primary key,
	name varchar(255) not null
);
create table if not exists account(
	id serial primary key,
	user_id int not null,
	foreign key (user_id) references users (id)
);
create table if not exists transactions(
	id serial primary key,
	user_id int not null,
	role_id int not null,
	name varchar(255) not null,
	foreign key (user_id) references users (id),
	foreign key (role_id) references roles (id)
);
