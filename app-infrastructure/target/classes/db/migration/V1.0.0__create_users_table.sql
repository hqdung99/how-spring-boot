create table if not exists users (
    id int primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255)
);

create sequence if not exists users_seq start 100;
