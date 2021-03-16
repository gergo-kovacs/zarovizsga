CREATE TABLE `dog_types` (
`id` BIGINT AUTO_INCREMENT,
`name` VARCHAR(250),
`country` VARCHAR(255),
 PRIMARY KEY(id)
);

insert into dog_types(name, country) values ('komondor', 'HUNGARY');
insert into dog_types(name, country) values ('Doberman', 'GERMANY');
insert into dog_types(name, country) values ('kuvasz', 'HUNGARY');