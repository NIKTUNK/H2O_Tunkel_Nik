CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    serial_number VARCHAR(255),
    manufacturer VARCHAR(255),
    price DOUBLE,
    stock_quantity INT,
    product_type VARCHAR(255),
    form_factor VARCHAR(255),
    size VARCHAR(255),
    diagonal VARCHAR(255),
    capacity INT
);
