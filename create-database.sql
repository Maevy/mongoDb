CREATE DATABASE ourdb;
GO
USE ourdb;
GO
create table wphg_abschluss
(
    id                                     bigint not null
        primary key,
    abschluss_art                          varchar(255)
)
    GO
INSERT INTO wphg_abschluss (id, abschluss_art) VALUES (5, N'ABSCHLUSS_OHNE_GENEHMIGUNG');
create table wphg_checkliste
(
    id                                                         bigint not null
        primary key,
    created_date                                               datetime2,
    deleted_date                                               datetime2,
    name                                                       varchar(max)
)
    go
INSERT INTO wphg_checkliste (id, created_date, deleted_date, name) VALUES (1, N'2022-08-08 12:22:29.1255515', null, N'Geile Checkliste');
    go
create table wphg_prozess
(
    id                                                         bigint not null
        primary key,
    created_date                                               datetime2,
    deleted_date                                               datetime2,
    name                                                       varchar(max)
)
    go
INSERT INTO wphg_prozess (id, created_date, deleted_date,name) VALUES (1, N'2022-08-08 12:20:30.6293812', N'2022-08-15 15:21:07.5342206', N'Maciej Gorski');

