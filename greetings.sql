DROP TABLE IF EXISTS saluti;
DROP TABLE IF EXISTS nome;
DROP TABLE IF EXISTS domanda;

BEGIN;

CREATE TABLE saluti (id serial PRIMARY KEY, string varchar);
CREATE TABLE nome (id serial PRIMARY KEY, string varchar);
CREATE TABLE domanda (id serial PRIMARY KEY, string varchar);

INSERT INTO saluti (string) VALUES ('Ciao');
INSERT INTO saluti (string) VALUES ('Buongiorno');
INSERT INTO saluti (string) VALUES ('Buonasera');


INSERT INTO nome (string) VALUES ('amico');
INSERT INTO nome (string) VALUES ('bello');
INSERT INTO nome (string) VALUES ('compagno');


INSERT INTO domanda (string) VALUES ('tutto bene');
INSERT INTO domanda (string) VALUES ('come stai');
INSERT INTO domanda (string) VALUES ('tutto apposto');

COMMIT;