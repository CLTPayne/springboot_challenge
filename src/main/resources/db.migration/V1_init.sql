DROP TABLE IF EXISTS players;

CREATE TABLE players(
  id SERIAL PRIMARY KEY,
  name varchar(20) NOT NULL
);