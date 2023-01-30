-- Drop the tables and sequences if they already exist
DROP TABLE IF EXISTS case_entity CASCADE;
DROP TABLE IF EXISTS party_entity CASCADE;
DROP TABLE IF EXISTS party_entity_addresses CASCADE;
DROP SEQUENCE IF EXISTS case_entity_seq;
DROP SEQUENCE IF EXISTS party_entity_seq;

-- Create the sequences for case_entity and party_entity
CREATE SEQUENCE case_entity_seq START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE party_entity_seq START WITH 1 INCREMENT BY 50;

-- Create the case_entity table
CREATE TABLE case_entity
(
    id                 bigint       NOT NULL,
    created_date       timestamp(6) NOT NULL,
    last_modified_date timestamp(6) NOT NULL,
    uuid               uuid         NOT NULL,
    version            bigint,
    case_number_number integer,
    case_number_year   integer,
    case_state         varchar(255),
    case_type          varchar(255),
    date_of_entry      date,
    PRIMARY KEY (id)
);

-- Create the party_entity table
CREATE TABLE party_entity
(
    id                 bigint       NOT NULL,
    created_date       timestamp(6) NOT NULL,
    last_modified_date timestamp(6) NOT NULL,
    uuid               uuid         NOT NULL,
    version            bigint,
    active             boolean      NOT NULL,
    first_name         varchar(255),
    surname            varchar(255),
    party_type         varchar(255),
    case_entity_id     bigint       NOT NULL,
    PRIMARY KEY (id)
);

-- Create the party_entity_addresses table
CREATE TABLE party_entity_addresses
(
    party_entity_id         bigint NOT NULL,
    city                    varchar(255),
    first_part_postal_code  varchar(255),
    second_part_postal_code varchar(255),
    street                  varchar(255)
);

-- Add the unique constraint on uuid column in case_entity table
ALTER TABLE IF EXISTS case_entity
    ADD CONSTRAINT UK_p16mrav9n0plvp35asv819sg7 UNIQUE (uuid);

-- Add the unique constraint on uuid column in party_entity table
ALTER TABLE IF EXISTS party_entity
    ADD CONSTRAINT UK_sv72tcko7vo9jj47g0kyouqxa UNIQUE (uuid);

-- Add the foreign key constraint from party_entity to case_entity
ALTER TABLE IF EXISTS party_entity
    ADD CONSTRAINT FKjfwisfraa28bwwfxgflp8905u FOREIGN KEY (case_entity_id) REFERENCES case_entity;

-- Add the foreign key constraint from party_entity_addresses to party_entity
ALTER TABLE IF EXISTS party_entity_addresses
    ADD CONSTRAINT FK3e5ut2ua6nrlfs18vdxeye4s4 FOREIGN KEY (party_entity_id) REFERENCES party_entity;
