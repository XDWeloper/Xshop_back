CREATE TABLE IF NOT EXISTS product
(
    id          BIGSERIAL PRIMARY KEY ,
    category    VARCHAR(50),
    title       VARCHAR(255) ,
    photo       VARCHAR,
    info        VARCHAR(2000) ,
    price       NUMERIC ,
    color       VARCHAR(50) ,
    size        VARCHAR(50) ,
    date        date
);
