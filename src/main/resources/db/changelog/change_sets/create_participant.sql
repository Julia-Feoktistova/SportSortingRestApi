create table team
(
    id serial
        constraint team
            primary key,
    team_id bigint not null
            constraint team_id
                references team,
    surname varchar(30) not null,
    lastname varchar(30) not null,
    otcestvo varchar(30) not null,
    birth_date date,
    positionO varchar(50)
);