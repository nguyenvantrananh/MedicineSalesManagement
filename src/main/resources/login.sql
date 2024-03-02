Create table  users
(
    username VARCHAR(50) PRIMARY KEY,
    password  VARCHAR(50) NOT NULL,
    enabled   BOOLEAN     NOT NULL
);
Create table authorities
(
    id        SERIAL PRIMARY KEY,
    username  varchar(50) NOT NULL,
    authority varchar(50) NOT NULL,
    CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username) ON DELETE CASCADE
);