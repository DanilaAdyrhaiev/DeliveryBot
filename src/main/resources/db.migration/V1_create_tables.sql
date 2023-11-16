create database Delivery;

CREATE TABLE Dish (
    ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50),
    description VARCHAR(500),
    price DOUBLE
);

CREATE TABLE Ordering (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(255)
);

CREATE TABLE OrderDish (
    id BIGINT PRIMARY KEY,
    Order_id BIGINT,
    Dish_id BIGINT,
    FOREIGN KEY (Order_id) REFERENCES Ordering(id),
    FOREIGN KEY (Dish_id) REFERENCES Dish(ID)
);

