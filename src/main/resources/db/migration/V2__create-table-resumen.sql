CREATE TABLE resumen (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         fecha DATE NOT NULL,
                         tipo_Foto VARCHAR(50) NOT NULL,
                         cantidad INT NOT NULL,
                         total DECIMAL(10, 2) NOT NULL,
                         UNIQUE (fecha, tipo_Foto)
);
