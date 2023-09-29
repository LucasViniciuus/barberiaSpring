
--CREATE TABLE Client (
--                         ID SERIAL PRIMARY KEY,
--                         name VARCHAR(255) NOT NULL
--);
CREATE TABLE Person (
                           ID SERIAL PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           assignment_code INTEGER NULL
);

CREATE TABLE Address (
                         id SERIAL PRIMARY KEY,
                         street VARCHAR(255) NOT NULL,
                         city VARCHAR(255) NOT NULL,
                         client_id BIGINT REFERENCES Client(id) -- Foreign key to client
);


INSERT INTO Client (name) VALUES ('Teste');
INSERT INTO Address (street, city, client_id) VALUES ('123 Main Street', 'Cityville', 1);