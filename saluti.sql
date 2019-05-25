DROP TABLE IF EXISTS saluti;
DROP TABLE IF EXISTS appellativi;
DROP TABLE IF EXISTS domande;

BEGIN;

CREATE TABLE saluti (id serial PRIMARY KEY, string varchar);
CREATE TABLE appellativi (id serial PRIMARY KEY, string varchar);
CREATE TABLE domande (id serial PRIMARY KEY, string varchar);

INSERT INTO saluti (string) VALUES ('Ciao');
INSERT INTO saluti (string) VALUES ('Buongiorno');
INSERT INTO saluti (string) VALUES ('Buonasera');

INSERT INTO appellativi (string) VALUES ('amico');
INSERT INTO appellativi (string) VALUES ('bello');
INSERT INTO appellativi (string) VALUES ('compagno');

INSERT INTO saluti (string) VALUES ('come stai?');
INSERT INTO saluti (string) VALUES ('come va?');
INSERT INTO saluti (string) VALUES ('tutto bene?');
COMMIT;
