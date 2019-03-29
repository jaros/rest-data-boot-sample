create table candidate(
   id bigint not null auto_increment,
   first_name varchar(255) not null,
   last_name varchar(255) not null,
   birth_date varchar(255) not null,
   email varchar(255) not null,
   primary key(id)
);