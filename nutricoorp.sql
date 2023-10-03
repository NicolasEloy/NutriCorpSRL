-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-10-2023 a las 23:51:50
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
-- Base de datos: `nutricoorp`
--

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
(20, 'Ensalada de quinoa', 'Ensalada de quinoa con aguacate y garbanzos', 230);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comidadieta`
--

CREATE TABLE `comidadieta` (
  `IntIdComidaDieta` int(11) NOT NULL,
  `IdComida` int(11) NOT NULL,
  `IdDieta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `IdDieta` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `IdPaciente` int(11) NOT NULL,
  `IdComida` int(11) NOT NULL,
  `fechaInicial` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `pesoFinal` double NOT NULL,
  `FechaFinal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`IdDieta`, `Nombre`, `IdPaciente`, `IdComida`, `fechaInicial`, `pesoInicial`, `pesoFinal`, `FechaFinal`) VALUES
(13, 'Dieta 1', 21, 0, '2023-09-01', 75, 70, '2023-09-30'),
(14, 'Dieta 2', 22, 0, '2023-08-15', 85.5, 80, '2023-09-15'),
(15, 'Dieta 3', 23, 0, '2023-09-10', 70, 65.5, '2023-10-10'),
(16, 'Dieta 4', 24, 0, '2023-08-20', 95, 90, '2023-09-30'),
(17, 'Dieta 5', 25, 0, '2023-09-05', 80, 75, '2023-10-05'),
(18, 'Dieta 6', 26, 0, '2023-08-10', 70.5, 67, '2023-09-10'),
(19, 'Dieta 7', 27, 0, '2023-09-02', 88, 84.5, '2023-09-30'),
(20, 'Dieta 8', 28, 0, '2023-08-25', 75, 70.5, '2023-09-25'),
(21, 'Dieta 9', 29, 0, '2023-09-15', 90.5, 86, '2023-10-15'),
(22, 'Dieta 10', 30, 0, '2023-08-12', 78, 74, '2023-09-12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `IdPaciente` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `DNI` int(11) NOT NULL,
  `Domicilio` varchar(200) NOT NULL,
  `Telefono` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`IdPaciente`, `Nombre`, `DNI`, `Domicilio`, `Telefono`) VALUES
(21, 'Juan Pérez', 11111111, 'Calle 123, Ciudad A', 1234567890),
(22, 'María García', 22222222, 'Avenida XYZ, Ciudad B', 1234567891),
(23, 'Luis Rodríguez', 33333333, 'Calle Principal, Ciudad C', 1234567892),
(24, 'Ana López', 44444444, 'Avenida Central, Ciudad D', 1234567893),
(25, 'Carlos Martínez', 55555555, 'Calle 456, Ciudad E', 1234567894),
(26, 'Laura Fernández', 66666666, 'Avenida ABC, Ciudad F', 1234567895),
(27, 'Pedro González', 77777777, 'Calle 789, Ciudad G', 1234567896),
(28, 'Sofía Díaz', 88888888, 'Avenida XYZ, Ciudad H', 1234567897),
(29, 'Miguel Pérez', 99999999, 'Calle 101, Ciudad I', 1234567898),
(30, 'Lucía Rodríguez', 10101010, 'Avenida Principal, Ciudad J', 1234567899),
(31, 'Eduardo Sánchez', 11111112, 'Calle 121, Ciudad K', 1234567800),
(32, 'Andrea López', 12121212, 'Avenida Central, Ciudad L', 1234567801),
(33, 'Javier Martínez', 13131313, 'Calle 141, Ciudad M', 1234567802),
(34, 'Silvia Fernández', 14141414, 'Avenida ABC, Ciudad N', 1234567803),
(35, 'Roberto González', 15151515, 'Calle 161, Ciudad O', 1234567804),
(36, 'Florencia Díaz', 16161616, 'Avenida 171, Ciudad P', 1234567805),
(37, 'Alberto Pérez', 17171717, 'Calle 181, Ciudad Q', 1234567806),
(38, 'Clara Rodríguez', 18181818, 'Avenida 191, Ciudad R', 1234567807),
(39, 'José Martínez', 19191919, 'Calle 202, Ciudad S', 1234567808),
(40, 'Daniela López', 20202020, 'Avenida XYZ, Ciudad T', 1234567809);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`IdComida`);

--
-- Indices de la tabla `comidadieta`
--
ALTER TABLE `comidadieta`
  ADD PRIMARY KEY (`IntIdComidaDieta`),
  ADD KEY `IdComida` (`IdComida`),
  ADD KEY `IdDieta` (`IdDieta`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`IdDieta`),
  ADD KEY `IdPaciente` (`IdPaciente`);

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
  MODIFY `IdComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `comidadieta`
--
ALTER TABLE `comidadieta`
  MODIFY `IntIdComidaDieta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `IdDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

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
  ADD CONSTRAINT `comidadieta_ibfk_1` FOREIGN KEY (`IdComida`) REFERENCES `comida` (`IdComida`),
  ADD CONSTRAINT `comidadieta_ibfk_2` FOREIGN KEY (`IdDieta`) REFERENCES `dieta` (`IdDieta`);

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`IdPaciente`) REFERENCES `paciente` (`IdPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
