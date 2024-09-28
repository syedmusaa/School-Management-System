create table student
(
	id bigint not null,
	name varchar(255) not null,
	age int not null,
	class_name int not null,
	email varchar(255) not null,
	contact bigint not null,
	primary key (id)

);

create table course
(
	id bigint not null,
	title varchar(255) not null,
	description varchar(255) not null,
	primary key (id)
);

CREATE TABLE teacher (
    id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(255) NOT NULL,
    contact BIGINT NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);





