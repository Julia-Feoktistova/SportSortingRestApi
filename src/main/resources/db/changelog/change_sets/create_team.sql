create table team
(
    id serial
        constraint team
            primary key,
    name varchar(30) not null ,
    sport_type varchar(50),
    foundation_date date
);