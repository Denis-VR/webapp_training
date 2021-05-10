CREATE TABLE users (
username varchar(15),
password varchar(100),
enabled tinyint(1),
PRIMARY KEY (USERNAME)
);
select * from users;
select * from authorities;

create table authorities (
username varchar(15),
authority varchar(25),
foreign key (USERNAME) references users(username)
);

insert into users (username, password, enabled)
values
    ('denis', '{noop}denis', 1),
    ('oleg', '{noop}oleg', 1),
    ('alex', '{noop}alex',1);

insert into AUTHORITIES (username, authority) VALUES
('denis', 'ROLE_EMPLOYEE'),
('oleg', 'ROLE_HR'),
('alex', 'ROLE_HR'),
('alex', 'ROLE_MANAGER');