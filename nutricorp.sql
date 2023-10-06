-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-10-2023 a las 00:02:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricorp`
--
CREATE DATABASE IF NOT EXISTS `nutricorp` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricorp`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `IdComida` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Detalle` varchar(500) NOT NULL,
  `CantCalorias` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`IdComida`, `Nombre`, `Detalle`, `CantCalorias`) VALUES
(1, 'Pollo a la parrilla', 'Pechuga de pollo asada con especias', 150),
(2, 'Ensalada César', 'Lechuga, crutones, pollo a la parrilla, aderezo César', 300),
(3, 'Salmón al horno', 'Filete de salmón horneado con limón y eneldo', 200),
(4, 'Pasta de tomate', 'Pasta de trigo integral con salsa de tomate y albahaca', 250),
(5, 'Batido de proteínas', 'Batido de proteínas con proteína en polvo y leche', 180),
(6, 'Ensalada de frutas', 'Mezcla de frutas frescas con miel y nueces', 120),
(7, 'Tacos de pavo', 'Tacos de pavo con tortillas de trigo y guarniciones', 280),
(8, 'Hamburguesa vegetariana', 'Hamburguesa de garbanzos con pan integral', 220),
(9, 'Pizza de verduras', 'Pizza con base de coliflor y vegetales variados', 320),
(10, 'Arroz integral con brócoli', 'Arroz integral con brócoli y almendras', 180),
(11, 'Sopa de lentejas', 'Sopa de lentejas con zanahorias y apio', 150),
(12, 'Yogur con frutas', 'Yogur griego con fresas y miel', 120),
(13, 'Huevos revueltos', 'Huevos revueltos con espinacas y queso feta', 220),
(14, 'Sándwich de pavo', 'Sándwich de pavo con aguacate y espinacas', 280),
(15, 'Pechuga de pollo con quinua', 'Pechuga de pollo a la parrilla con quinua', 270),
(16, 'Tostadas de aguacate', 'Tostadas de aguacate con huevo pochado', 190),
(17, 'Batido de bayas', 'Batido de bayas con espinacas y proteína en polvo', 210),
(18, 'Sopa de tomate', 'Sopa de tomate casera con albahaca', 160),
(19, 'Pasta de garbanzos', 'Pasta de garbanzos con pesto de albahaca', 250),
(20, 'Ensalada de quinoa', 'Ensalada de quinoa con aguacate y garbanzos', 230),
(21, 'Pechuga de pavo a la plancha', 'Pechuga de pavo a la plancha con especias', 170),
(22, 'Ensalada de espinacas', 'Ensalada de espinacas frescas con vinagreta', 90),
(23, 'Salmón a la parrilla', 'Filete de salmón a la parrilla con limón y ajo', 220),
(24, 'Pasta al pesto', 'Pasta con salsa pesto y tomates cherry', 280),
(25, 'Batido de vainilla', 'Batido de proteínas con sabor a vainilla', 160),
(26, 'Ensalada de aguacate', 'Ensalada con aguacate, maíz y tomate', 180),
(27, 'Tacos de pollo', 'Tacos de pollo con tortillas de maíz y guacamole', 320),
(28, 'Hamburguesa de lentejas', 'Hamburguesa vegetariana de lentejas con pan integral', 250),
(29, 'Pizza de pollo a la barbacoa', 'Pizza con base de coliflor y pollo a la barbacoa', 310),
(30, 'Arroz integral con vegetales', 'Arroz integral con brócoli, zanahorias y guisantes', 210),
(31, 'Sopa de calabaza', 'Sopa de calabaza con cebolla y crutones', 130),
(32, 'Yogur con nueces', 'Yogur griego con nueces y miel', 140),
(33, 'Huevos benedictinos', 'Huevos benedictinos con jamón y salsa holandesa', 280),
(34, 'Sándwich de pollo a la parrilla', 'Sándwich de pollo a la parrilla con lechuga y tomate', 250),
(35, 'Pechuga de pollo con couscous', 'Pechuga de pollo a la parrilla con couscous', 290),
(36, 'Tostadas de salmón ahumado', 'Tostadas con salmón ahumado y crema agria', 240),
(37, 'Batido de frutas tropicales', 'Batido de frutas tropicales con piña y mango', 200),
(38, 'Sopa de champiñones', 'Sopa de champiñones con cebollinos', 120),
(39, 'Pasta de trigo sarraceno', 'Pasta de trigo sarraceno con pesto de albahaca', 260),
(40, 'Ensalada de garbanzos', 'Ensalada de garbanzos con pimientos y cebolla', 180);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidadieta`
--

CREATE TABLE `comidadieta` (
  `IdComidaDieta` int(11) NOT NULL,
  `IdDieta` int(11) NOT NULL,
  `IdComida` int(11) NOT NULL,
  `Horarios` varchar(100) NOT NULL,
  `Porciones` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comidadieta`
--

INSERT INTO `comidadieta` (`IdComidaDieta`, `IdDieta`, `IdComida`, `Horarios`, `Porciones`) VALUES
(6, 14, 14, 'Desayuno', 100),
(7, 14, 15, 'Almuerzo', 270),
(8, 14, 16, 'Merienda', 90),
(9, 14, 18, 'Cena', 160),
(10, 14, 20, 'Snack', 180),
(11, 15, 3, 'Desayuno', 150),
(12, 15, 10, 'Almuerzo', 180),
(13, 15, 13, 'Merienda', 220),
(14, 15, 7, 'Cena', 280),
(15, 15, 12, 'Snack', 120),
(16, 16, 1, 'Desayuno', 150),
(17, 16, 11, 'Almuerzo', 150),
(18, 16, 17, 'Merienda', 210),
(19, 16, 19, 'Cena', 250),
(20, 16, 8, 'Snack', 220),
(21, 17, 23, 'Desayuno', 200),
(22, 17, 30, 'Almuerzo', 210),
(23, 17, 33, 'Merienda', 280),
(24, 17, 27, 'Cena', 320),
(25, 17, 32, 'Snack', 140),
(26, 18, 22, 'Desayuno', 180),
(27, 18, 24, 'Almuerzo', 280),
(28, 18, 31, 'Merienda', 130),
(29, 18, 35, 'Cena', 290),
(30, 18, 38, 'Snack', 120),
(31, 19, 5, 'Desayuno', 180),
(32, 19, 14, 'Almuerzo', 280),
(33, 19, 21, 'Merienda', 170),
(34, 19, 25, 'Cena', 160),
(35, 19, 29, 'Snack', 310),
(36, 20, 2, 'Desayuno', 300),
(37, 20, 9, 'Almuerzo', 320),
(38, 20, 15, 'Merienda', 270),
(39, 20, 26, 'Cena', 180),
(40, 20, 39, 'Snack', 260),
(41, 21, 4, 'Desayuno', 250),
(42, 21, 19, 'Almuerzo', 250),
(43, 21, 28, 'Merienda', 250),
(44, 21, 33, 'Cena', 280),
(45, 21, 36, 'Snack', 240),
(46, 22, 6, 'Desayuno', 120),
(47, 22, 8, 'Almuerzo', 220),
(48, 22, 27, 'Merienda', 320),
(49, 22, 31, 'Cena', 130),
(50, 22, 37, 'Snack', 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `IdDieta` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `IdPaciente` int(11) NOT NULL,
  `fechaInicial` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `pesoFinal` double NOT NULL,
  `FechaFinal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`IdDieta`, `Nombre`, `IdPaciente`, `fechaInicial`, `pesoInicial`, `pesoFinal`, `FechaFinal`) VALUES
(13, 'Dieta 1', 21, '2023-09-01', 75, 70, '2023-09-30'),
(14, 'Dieta 2', 22, '2023-08-15', 85.5, 80, '2023-09-15'),
(15, 'Dieta 3', 23, '2023-09-10', 70, 65.5, '2023-10-10'),
(16, 'Dieta 4', 24, '2023-08-20', 95, 90, '2023-09-30'),
(17, 'Dieta 5', 25, '2023-09-05', 80, 75, '2023-10-05'),
(18, 'Dieta 6', 26, '2023-08-10', 70.5, 67, '2023-09-10'),
(19, 'Dieta 7', 27, '2023-09-02', 88, 84.5, '2023-09-30'),
(20, 'Dieta 8', 28, '2023-08-25', 75, 70.5, '2023-09-25'),
(21, 'Dieta 9', 29, '2023-09-15', 90.5, 86, '2023-10-15'),
(22, 'Dieta 10', 30, '2023-08-12', 78, 74, '2023-09-12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialpeso`
--

CREATE TABLE `historialpeso` (
  `IdHistorialPeso` int(11) NOT NULL,
  `IdPaciente` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Peso` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `IdPaciente` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Apellido` varchar(100) NOT NULL,
  `DNI` int(11) NOT NULL,
  `Domicilio` varchar(200) NOT NULL,
  `Telefono` int(20) NOT NULL,
  `FechaNacimiento` date NOT NULL,
  `pesoActual` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`IdPaciente`, `Nombre`, `Apellido`, `DNI`, `Domicilio`, `Telefono`, `FechaNacimiento`, `pesoActual`) VALUES
(21, 'Juan Pérez', '', 11111111, 'Calle 123, Ciudad A', 1234567890, '1990-01-15', 0),
(22, 'María García', '', 22222222, 'Avenida XYZ, Ciudad B', 1234567891, '1985-05-20', 0),
(23, 'Luis Rodríguez', '', 33333333, 'Calle Principal, Ciudad C', 1234567892, '1978-12-10', 0),
(24, 'Ana López', '', 44444444, 'Avenida Central, Ciudad D', 1234567893, '1992-08-30', 0),
(25, 'Carlos Martínez', '', 55555555, 'Calle 456, Ciudad E', 1234567894, '1980-03-25', 0),
(26, 'Laura Fernández', '', 66666666, 'Avenida ABC, Ciudad F', 1234567895, '1995-06-12', 0),
(27, 'Pedro González', '', 77777777, 'Calle 789, Ciudad G', 1234567896, '1974-02-08', 0),
(28, 'Sofía Díaz', '', 88888888, 'Avenida XYZ, Ciudad H', 1234567897, '1988-11-19', 0),
(29, 'Miguel Pérez', '', 99999999, 'Calle 101, Ciudad I', 1234567898, '1987-07-05', 0),
(30, 'Lucía Rodríguez', '', 10101010, 'Avenida Principal, Ciudad J', 1234567899, '1998-04-03', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`IdComida`),
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- Indices de la tabla `comidadieta`
--
ALTER TABLE `comidadieta`
  ADD PRIMARY KEY (`IdComidaDieta`),
  ADD KEY `IdDieta` (`IdDieta`),
  ADD KEY `comidadieta_1` (`IdComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`IdDieta`),
  ADD KEY `IdPaciente` (`IdPaciente`);

--
-- Indices de la tabla `historialpeso`
--
ALTER TABLE `historialpeso`
  ADD PRIMARY KEY (`IdHistorialPeso`),
  ADD KEY `HistorialPeso-1` (`IdPaciente`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`IdPaciente`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `IdComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `comidadieta`
--
ALTER TABLE `comidadieta`
  MODIFY `IdComidaDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `IdDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `historialpeso`
--
ALTER TABLE `historialpeso`
  MODIFY `IdHistorialPeso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `IdPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comidadieta`
--
ALTER TABLE `comidadieta`
  ADD CONSTRAINT `comidadieta_1` FOREIGN KEY (`IdComida`) REFERENCES `comida` (`IdComida`),
  ADD CONSTRAINT `comidadieta_ibfk_2` FOREIGN KEY (`IdDieta`) REFERENCES `dieta` (`IdDieta`);

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`IdPaciente`) REFERENCES `paciente` (`IdPaciente`);

--
-- Filtros para la tabla `historialpeso`
--
ALTER TABLE `historialpeso`
  ADD CONSTRAINT `HistorialPeso-1` FOREIGN KEY (`IdPaciente`) REFERENCES `paciente` (`IdPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
