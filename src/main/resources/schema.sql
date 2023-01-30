DROP TABLE IF EXISTS case_entity CASCADE;
DROP TABLE IF EXISTS party_entity CASCADE;
DROP SEQUENCE IF EXISTS case_entity_seq;
DROP SEQUENCE IF EXISTS party_entity_seq;
CREATE SEQUENCE case_entity_seq START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE party_entity_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE case_entity (
                             id BIGINT NOT NULL,
                             created_date TIMESTAMP(6) NOT NULL,
                             last_modified_date TIMESTAMP(6) NOT NULL,
                             uuid UUID NOT NULL,
                             version BIGINT,
                             case_number_number INTEGER,
                             case_number_year INTEGER,
                             case_state VARCHAR(255),
                             case_type VARCHAR(255),
                             date_of_entry DATE,
                             PRIMARY KEY (id)
);

CREATE TABLE party_entity (
                              id BIGINT NOT NULL,
                              created_date TIMESTAMP(6) NOT NULL,
                              last_modified_date TIMESTAMP(6) NOT NULL,
                              uuid UUID NOT NULL,
                              version BIGINT,
                              active BOOLEAN NOT NULL,
                              city VARCHAR(255),
                              first_part VARCHAR(255),
                              second_part VARCHAR(255),
                              street_name VARCHAR(255),
                              street_number VARCHAR(255),
                              first_name VARCHAR(255),
                              surname VARCHAR(255),
                              party_type VARCHAR(255),
                              case_entity_id BIGINT NOT NULL,
                              PRIMARY KEY (id)
);

ALTER TABLE case_entity
    ADD CONSTRAINT UK_p16mrav9n0plvp35asv819sg7 UNIQUE (uuid);

ALTER TABLE party_entity
    ADD CONSTRAINT UK_sv72tcko7vo9jj47g0kyouqxa UNIQUE (uuid);

ALTER TABLE party_entity
    ADD CONSTRAINT FKjfwisfraa28bwwfxgflp8905u
        FOREIGN KEY (case_entity_id) REFERENCES case_entity;