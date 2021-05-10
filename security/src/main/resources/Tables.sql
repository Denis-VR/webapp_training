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

# update users set enabled = 0 where username = 'denis';

select * from users;
update users set password = '{bcrypt}$2y$07$UoW/4.ltKNwJ8q2M80ns2.C8gqtMMDDAXAFe/fpCxf4pfXhhU5HEG'
    where username = 'denis';
update users set password = '{bcrypt}$2y$07$bWLoeaGusnJu2.91DtsbPeFIaM6WKRiwt85Jywrxr/rMRRVpLcEDK'
    where username = 'alex';
update users set password = '{bcrypt}$2y$07$oGitgqM7uJFCq759DnHS7edJNCs6trWq/X70jhVmoaM3IW7tK4Dnm'
    where username = 'oleg';