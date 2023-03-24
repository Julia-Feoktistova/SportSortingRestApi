insert into participant (team_id, surname, lastname, otchectvo, birth_date, positionO)
values  ((select id from team where id = 1), 'Vlad', 'Marevich', 'Yurievich', '12.10.2000', 'zashitnick'),
        ((select id from team where id = 1), 'Vladimir', 'Pumin', 'Vitalievich', '17.07.2002', 'napadaushii'),
        ((select id from team where id = 1), 'Oleg', 'Polov', 'Vladimirivich', '23.05.2003', 'zashitnick'),
        ((select id from team where id = 1), 'Olga', 'Popova', 'Michailovna', '30.03.2004', 'vratar'),
        ((select id from team where id = 2), 'Aleksandr', 'Sergeev', 'Yaroslavovich', '13.01.2000', 'zashitnick'),
        ((select id from team where id = 2), 'Vsevolod', 'Vatslav', 'Dmitrievich', '04.12.1999', 'zashitnick'),
        ((select id from team where id = 2), 'Igor', 'Ukhnenko', 'Vladislavovich', '10.11.1989', 'napadaushii'),
        ((select id from team where id = 3), 'Igor', 'Semenov', 'Yurievich', '19.02.2001', 'zashitnick'),
        ((select id from team where id = 3), 'Semen', 'Ibaev', 'Yurievich', '31.09.2001', 'napadaushii'),
        ((select id from team where id = 3), 'Maria', 'Popova', 'Michailovna', '11.05.2002', 'napadaushii'),
        ((select id from team where id = 3), 'Secslo', 'Timy', , '10.11.1998', 'zashitnick'),
        ((select id from team where id = 3), 'Alekandra', 'Markova', 'Yurievna', '07.01.1999', 'zashitnick');
