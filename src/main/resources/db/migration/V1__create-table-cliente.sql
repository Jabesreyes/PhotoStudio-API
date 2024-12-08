CREATE TABLE cliente (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(50) NOT NULL,
                         fecha DATETIME NOT NULL,
                         tipo_Foto VARCHAR(50) NOT NULL,
                         precio DECIMAL(10, 2) NOT NULL
);
