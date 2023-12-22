DROP TABLE IF EXISTS pets;
CREATE TABLE pets
(
    id     INT         NOT NULL PRIMARY KEY,
    name   VARCHAR(50) NOT NULL,
    gender VARCHAR(10),
    type   VARCHAR(100)
)