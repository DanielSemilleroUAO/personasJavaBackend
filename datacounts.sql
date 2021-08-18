-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-08-2021 a las 00:11:21
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `datacounts`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `count`
--

CREATE TABLE `count` (
  `id_tarjeta` int(11) NOT NULL,
  `number` varchar(250) NOT NULL,
  `clave` varchar(250) NOT NULL,
  `state` varchar(250) NOT NULL,
  `saldo` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `cedula` int(11) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `fecha_nacimiento` varchar(250) NOT NULL,
  `numero_telefono` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  `direccion` varchar(250) NOT NULL,
  `ciudad` varchar(250) NOT NULL,
  `profesion` varchar(250) NOT NULL,
  `trabajo_actual` varchar(250) NOT NULL,
  `ingresos` varchar(250) NOT NULL,
  `egresos` varchar(250) NOT NULL,
  `id_tarjeta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `count`
--
ALTER TABLE `count`
  ADD PRIMARY KEY (`id_tarjeta`);

--
-- Indices de la tabla `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`cedula`),
  ADD KEY `id_tarjeta` (`id_tarjeta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `count`
--
ALTER TABLE `count`
  MODIFY `id_tarjeta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `person_ibfk_1` FOREIGN KEY (`id_tarjeta`) REFERENCES `count` (`id_tarjeta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
