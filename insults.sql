DROP TABLE IF EXISTS short_adjective;
DROP TABLE IF EXISTS long_adjective;
DROP TABLE IF EXISTS noun;

BEGIN;

CREATE TABLE short_adjective (id serial PRIMARY KEY, string varchar);
CREATE TABLE long_adjective (id serial PRIMARY KEY, string varchar);
CREATE TABLE noun (id serial PRIMARY KEY, string varchar);

INSERT INTO short_adjective (string) VALUES ('Ciao');
INSERT INTO short_adjective (string) VALUES ('Buongiorno');
INSERT INTO short_adjective (string) VALUES ('Buonasera');

INSERT INTO long_adjective (string) VALUES ('amico');
INSERT INTO long_adjective (string) VALUES ('bello');
INSERT INTO long_adjective (string) VALUES ('compagno');

INSERT INTO noun (string) VALUES ('come stai');
INSERT INTO noun (string) VALUES ('come va');
INSERT INTO noun (string) VALUES ('tutto bene');
COMMIT;
