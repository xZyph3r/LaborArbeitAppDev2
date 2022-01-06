-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 06. Jan 2022 um 16:54
-- Server-Version: 10.4.21-MariaDB
-- PHP-Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `mobilfunkanbieter`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kunde`
--

CREATE TABLE `kunde` (
  `KundenNr` int(11) NOT NULL,
  `PosNr` int(11) NOT NULL,
  `Persodaten` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `mitarbeiter`
--

CREATE TABLE `mitarbeiter` (
  `MitarbeiterNr` int(11) NOT NULL,
  `PosNr` int(11) NOT NULL,
  `Gehalt` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `personen`
--

CREATE TABLE `personen` (
  `PosNr` int(11) NOT NULL,
  `Vorname` char(20) NOT NULL,
  `Name` char(20) NOT NULL,
  `Geburtstag` date NOT NULL,
  `Straße` varchar(255) NOT NULL,
  `Hausnummer` char(4) NOT NULL,
  `Postleitzahl` char(5) NOT NULL,
  `Ort` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `vertraege`
--

CREATE TABLE `vertraege` (
  `VertragsNr` int(11) NOT NULL,
  `KundenNr` int(11) NOT NULL,
  `Aktiv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `kunde`
--
ALTER TABLE `kunde`
  ADD PRIMARY KEY (`KundenNr`),
  ADD KEY `PosNr` (`PosNr`);

--
-- Indizes für die Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD PRIMARY KEY (`MitarbeiterNr`),
  ADD KEY `PosNr` (`PosNr`);

--
-- Indizes für die Tabelle `personen`
--
ALTER TABLE `personen`
  ADD PRIMARY KEY (`PosNr`);

--
-- Indizes für die Tabelle `vertraege`
--
ALTER TABLE `vertraege`
  ADD PRIMARY KEY (`VertragsNr`),
  ADD KEY `KundenNr` (`KundenNr`);

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `kunde`
--
ALTER TABLE `kunde`
  ADD CONSTRAINT `kunde_ibfk_1` FOREIGN KEY (`PosNr`) REFERENCES `personen` (`PosNr`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD CONSTRAINT `mitarbeiter_ibfk_1` FOREIGN KEY (`PosNr`) REFERENCES `personen` (`PosNr`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `vertraege`
--
ALTER TABLE `vertraege`
  ADD CONSTRAINT `vertraege_ibfk_1` FOREIGN KEY (`KundenNr`) REFERENCES `kunde` (`KundenNr`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
