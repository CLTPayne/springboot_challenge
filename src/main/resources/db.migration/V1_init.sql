DROP TABLE IF EXISTS players;
DROP TABLE IF EXISTS moves;
DROP TABLE IF EXISTS games;

CREATE TABLE players(
  id SERIAL PRIMARY KEY,
  name varchar(20) NOT NULL
);

CREATE TABLE games(
  id SERIAL PRIMARY KEY,
  first_player_id int NOT NULL REFERENCES players(id),
  second_player_id int REFERENCES players(id),
  game_id int NOT NULL REFERENCES games(id),
  game_status varchar(10) NOT NULL
);

CREATE TABLE moves(
  id SERIAL PRIMARY KEY,
  player_id int NOT NULL REFERENCES players(id),
  game_id int NOT NULL REFERENCES games(id),
  move varchar(10) NOT NULL
);


