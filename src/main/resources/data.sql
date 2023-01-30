INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (1, NOW(), NOW(), RANDOM_UUID(), 1, 2881, 22, 'DISMISSED', 'P', '2023-01-14');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (2, NOW(), NOW(), RANDOM_UUID(), 1, 5076, 21, 'CLOSED', 'K', '2021-08-26');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (3, NOW(), NOW(), RANDOM_UUID(), 1, 3272, 21, 'OPEN', 'W', '2022-02-13');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (4, NOW(), NOW(), RANDOM_UUID(), 1, 9914, 21, 'DISMISSED', 'C', '2021-12-03');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (5, NOW(), NOW(), RANDOM_UUID(), 1, 6176, 22, 'OPEN', 'W', '2022-02-04');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (6, NOW(), NOW(), RANDOM_UUID(), 1, 9841, 21, 'DISMISSED', 'K', '2021-03-30');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (7, NOW(), NOW(), RANDOM_UUID(), 1, 6693, 21, 'DISMISSED', 'K', '2021-09-21');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (8, NOW(), NOW(), RANDOM_UUID(), 1, 7397, 21, 'DISMISSED', 'K', '2022-08-11');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (9, NOW(), NOW(), RANDOM_UUID(), 1, 4892, 21, 'CLOSED', 'Co', '2021-07-24');
INSERT INTO case_entity (id, created_date, last_modified_date, uuid, version, case_number_number, case_number_year,
                         case_state, case_type, date_of_entry)
VALUES (10, NOW(), NOW(), RANDOM_UUID(), 1, 3471, 21, 'CLOSED', 'K', '2022-07-08');

INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (1, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Ava', 'Richardson', 'DEFENDANT', '8');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (1, 'Kwidzyn', '66', '151', 'Lester Court');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (1, 'Kwidzyn', '35', '834', 'Lawton Street');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (1, 'Gdańsk', '59', '942', 'Montieth Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (2, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Rae', 'Vincent', 'PLAINTIFF', '7');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (2, 'Gdańsk', '61', '770', 'Dwight Street');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (2, 'Kwidzyn', '10', '241', 'Suydam Place');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (2, 'Gdańsk', '37', '741', 'Division Avenue');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (3, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Hunter', 'Walker', 'DEFENDANT', '9');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (3, 'Kraków', '98', '505', 'Bridgewater Street');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (3, 'Malbork', '55', '707', 'Bills Place');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (4, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Tamra', 'Collins', 'DEFENDANT', '10');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (4, 'Sopot', '72', '587', 'Conway Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (5, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Hammond', 'Flowers', 'DEFENDANT', '2');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (5, 'Kraków', '92', '222', 'Vandervoort Avenue');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (5, 'Kraków', '34', '953', 'Pineapple Street');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (5, 'Sopot', '18', '249', 'Union Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (6, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Cox', 'Morton', 'PLAINTIFF', '4');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (6, 'Malbork', '29', '877', 'Schenck Place');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (7, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Hardy', 'Gilmore', 'PLAINTIFF', '1');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (7, 'Malbork', '54', '236', 'Chestnut Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (8, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Marcy', 'Robinson', 'PLAINTIFF', '5');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (8, 'Gdynia', '51', '215', 'Coventry Road');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (8, 'Gdynia', '21', '326', 'Garden Street');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (8, 'Gdańsk', '45', '107', 'Rutland Road');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (9, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Pacheco', 'Barnett', 'PLAINTIFF', '5');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (9, 'Gdynia', '51', '743', 'Poplar Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (10, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Dianna', 'Griffin', 'PLAINTIFF', '6');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (10, 'Sopot', '24', '495', 'Seigel Court');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (11, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Irma', 'Kent', 'PLAINTIFF', '2');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (11, 'Kwidzyn', '29', '918', 'Harbor Court');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (11, 'Sopot', '19', '801', 'Boardwalk ');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (12, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Annmarie', 'Brewer', 'PLAINTIFF', '10');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (12, 'Gdynia', '60', '176', 'Kimball Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (13, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Rita', 'Patel', 'DEFENDANT', '8');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (13, 'Sopot', '56', '311', 'Lefferts Avenue');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (14, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Dennis', 'Zimmerman', 'DEFENDANT', '6');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (14, 'Kraków', '53', '350', 'Troutman Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (15, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Sweet', 'Deleon', 'PLAINTIFF', '8');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (15, 'Sopot', '79', '789', 'Noll Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (16, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Concetta', 'Norris', 'DEFENDANT', '7');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (16, 'Malbork', '53', '138', 'Saratoga Avenue');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (16, 'Sopot', '11', '810', 'Whitwell Place');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (17, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Beach', 'Joseph', 'DEFENDANT', '6');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (17, 'Malbork', '82', '548', 'Harrison Place');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (17, 'Kraków', '56', '853', 'Cheever Place');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (17, 'Sopot', '25', '566', 'Jamison Lane');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (18, NOW(), NOW(), RANDOM_UUID(), 1, 'True', 'Gabrielle', 'Figueroa', 'PLAINTIFF', '10');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (18, 'Malbork', '82', '511', 'Monument Walk');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (18, 'Kraków', '16', '835', 'Love Lane');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (18, 'Kwidzyn', '99', '714', 'Olive Street');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (19, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Hickman', 'Wolfe', 'PLAINTIFF', '6');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (19, 'Kraków', '39', '414', 'Bedford Avenue');
INSERT INTO party_entity (id, created_date, last_modified_date, uuid, version, active, first_name, surname, party_type,
                          case_entity_id)
VALUES (20, NOW(), NOW(), RANDOM_UUID(), 1, 'False', 'Rosemary', 'Pratt', 'PLAINTIFF', '2');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (20, 'Gdańsk', '75', '238', 'Argyle Road');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (20, 'Kwidzyn', '14', '851', 'Noel Avenue');
INSERT INTO party_entity_addresses (party_entity_id, city, first_part_postal_code, second_part_postal_code, street)
VALUES (20, 'Kwidzyn', '44', '507', 'Clarkson Avenue');
