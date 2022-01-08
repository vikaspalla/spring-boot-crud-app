# spring-boot-crud-app

create database app_customers;
drop table customers;
create table customers(id int primary key auto_increment not null, name varchar(50) not null, email varchar(1000) not null )auto_increment=1;

select * from customers;
insert into customers(id,name,email) values(1,'vikas','vikaspalla@gmail.com');