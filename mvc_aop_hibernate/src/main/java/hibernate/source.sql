select 'Hello, world!'
from dual;

Create table students
(
    id        integer primary key,
    name      varchar(20) not null,
    last_name varchar(20),
    course    integer,
    constraint max_course check ( course < 5 )
);

insert into students (id, name, last_name, course)
values ('1', 'Alex', 'Redux', '3');
insert into students (id, name, last_name, course)
values ('2', 'Misha', 'Gen', '2');

select *
from students;

select *
from employees;

select surname
from employees
group by surname;

CREATE TABLE employees
(
    id         int NOT NULL AUTO_INCREMENT,
    name       varchar(15),
    surname    varchar(25),
    department varchar(20),
    salary     int,
    PRIMARY KEY (id)
);

select *
from employees;

CREATE TABLE details
(
    id           int not null auto_increment,
    city         varchar(15),
    phone_number varchar(25),
    email        varchar(30),
    PRIMARY KEY (id)
);

create table employees2
(
    id         int not null auto_increment,
    name       varchar(15),
    surname    varchar(25),
    department varchar(20),
    salary     int,
    details_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (details_id) references details (id)
);

select *
from employees2;
select *
from details;

delete
from employees2
where salary = 4870
  and details_id = 1;

create table departments
(
    id         int not null auto_increment,
    name       varchar(15),
    max_salary int,
    min_salary int,
    primary key (id)
);

create table employees3
(
    id            int not null auto_increment,
    name          varchar(15),
    surname       varchar(25),
    salary        int,
    department_id int,
    primary key (id),
    foreign key (department_id) references departments (id)
);

select *
from employees3;
select *
from departments;

delete
from departments
where id = 2;
delete
from employees3
where department_id = 3;
delete
from employees3
where id = 4;

create table children
(
    id   int not null auto_increment,
    name varchar(15),
    age  int,
    primary key (id)
);

create table section
(
    id   int not null auto_increment,
    name varchar(15),
    primary key (id)
);

create table child_section
(
    child_id   int not null,
    section_id int not null,
    primary key (child_id, section_id),
    foreign key (child_id) references children (id),
    foreign key (section_id) references section (id)
);

select * from section;
select * from children;
select * from child_section;
