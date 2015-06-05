-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 05 Juin 2015 à 14:29
-- Version du serveur :  5.6.23-log
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `towerdefense`
--

-- --------------------------------------------------------

--
-- Structure de la table `carteinit`
--

CREATE TABLE IF NOT EXISTS `carteinit` (
  `idCarte` bigint(20) NOT NULL AUTO_INCREMENT,
  `carte` varchar(440) NOT NULL,
  PRIMARY KEY (`idCarte`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `carteinit`
--

INSERT INTO `carteinit` (`idCarte`, `carte`) VALUES
(1, '02000000044444444444,01000000004444444444,01110040000444444444,00010000000044444444,00011100400000444444,00400100000000044444,00011100000000000444,000111111111111004444,00000000000000100444,00004004000000100444,40000000000000100444,44000000000000100444,44404000111111100444,44440000100000000444,44444000100000000444,44444000100000000444,44444000111300004444,44444400000000044444,444444400000004444,44444440000004444444,');

-- --------------------------------------------------------

--
-- Structure de la table `cartesave`
--

CREATE TABLE IF NOT EXISTS `cartesave` (
  `carteLongueurSave1` bigint(20) NOT NULL AUTO_INCREMENT,
  `carteLongueurSave2` bigint(20) DEFAULT NULL,
  `carteLongueurSave3` bigint(20) DEFAULT NULL,
  `carteLongueurSave4` bigint(20) DEFAULT NULL,
  `carteLongueurSave5` bigint(20) DEFAULT NULL,
  `carteLongueurSave6` bigint(20) DEFAULT NULL,
  `carteLongueurSave7` bigint(20) DEFAULT NULL,
  `carteLongueurSave8` bigint(20) DEFAULT NULL,
  `carteLongueurSave9` bigint(20) DEFAULT NULL,
  `carteLongueurSave10` bigint(20) DEFAULT NULL,
  `carteLongueurSave11` bigint(20) DEFAULT NULL,
  `carteLongueurSave12` bigint(20) DEFAULT NULL,
  `carteLongueurSave13` bigint(20) DEFAULT NULL,
  `carteLongueurSave14` bigint(20) DEFAULT NULL,
  `carteLongueurSave15` bigint(20) DEFAULT NULL,
  `carteLongueurSave16` bigint(20) DEFAULT NULL,
  `carteLongueurSave17` bigint(20) DEFAULT NULL,
  `carteLongueurSave18` bigint(20) DEFAULT NULL,
  `carteLongueurSave19` bigint(20) DEFAULT NULL,
  `carteLongueurSave20` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`carteLongueurSave1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `enemy`
--

CREATE TABLE IF NOT EXISTS `enemy` (
  `enemyID` bigint(20) NOT NULL AUTO_INCREMENT,
  `enemyName` varchar(50) DEFAULT NULL,
  `enemyHealth` bigint(20) DEFAULT NULL,
  `damageSpeed` double DEFAULT NULL,
  `enemySpeed` double DEFAULT NULL,
  `enemyRange` bigint(20) DEFAULT NULL,
  `enemyResistance` bigint(20) DEFAULT NULL,
  `slowResistance` double DEFAULT NULL,
  `freezeResistance` double DEFAULT NULL,
  `dropRessources` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`enemyID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `enemy`
--

INSERT INTO `enemy` (`enemyID`, `enemyName`, `enemyHealth`, `damageSpeed`, `enemySpeed`, `enemyRange`, `enemyResistance`, `slowResistance`, `freezeResistance`, `dropRessources`) VALUES
(1, 'Trojan', 100, 0.2, 0.5, 5, 0, 0, 0, 100),
(2, 'Ddos', 150, 1, 1, 2, 2, 0, 0, 150),
(3, 'Hack', 200, 0.5, 0.5, 2, 3, 0.2, 0, 200),
(4, 'Virus', 250, 0.6, 0.6, 3, 4, 0.3, 0.3, 250),
(5, 'Error404', 500, 0.8, 1, 4, 50, 0.8, 0.9, 500);

-- --------------------------------------------------------

--
-- Structure de la table `enemysave`
--

CREATE TABLE IF NOT EXISTS `enemysave` (
  `IDEnemysave` bigint(20) NOT NULL AUTO_INCREMENT,
  `enemyName` bigint(20) NOT NULL,
  `EnemyHealthSave` bigint(20) NOT NULL,
  `PositionEnemyX` bigint(20) NOT NULL,
  `PositionEnemyY` bigint(20) NOT NULL,
  PRIMARY KEY (`IDEnemysave`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `joueur`
--

CREATE TABLE IF NOT EXISTS `joueur` (
  `joueurID` bigint(20) NOT NULL AUTO_INCREMENT,
  `joueurName` varchar(50) DEFAULT NULL,
  `joueurPoints` bigint(20) DEFAULT NULL,
  `joueurRessources` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`joueurID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `joueursave`
--

CREATE TABLE IF NOT EXISTS `joueursave` (
  `joueurSaveID` bigint(20) NOT NULL AUTO_INCREMENT,
  `carteSave` int(11) NOT NULL,
  `joueurNameSave` varchar(50) DEFAULT NULL,
  `posteHealthSave` bigint(20) DEFAULT NULL,
  `joueurRessourcesSave` bigint(20) DEFAULT NULL,
  `joueurPointsSave` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`joueurSaveID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `poste`
--

CREATE TABLE IF NOT EXISTS `poste` (
  `posteID` bigint(20) NOT NULL AUTO_INCREMENT,
  `posteHealth` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`posteID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `poste`
--

INSERT INTO `poste` (`posteID`, `posteHealth`) VALUES
(1, 1000);

-- --------------------------------------------------------

--
-- Structure de la table `tour`
--

CREATE TABLE IF NOT EXISTS `tour` (
  `tourID` bigint(20) NOT NULL AUTO_INCREMENT,
  `tourName` varchar(50) DEFAULT NULL,
  `tourCost` bigint(20) DEFAULT NULL,
  `freezeDamage` double DEFAULT NULL,
  `slowDamage` double DEFAULT NULL,
  `tourDamage` bigint(20) DEFAULT NULL,
  `attackSpeed` double DEFAULT NULL,
  `tourRange` bigint(20) DEFAULT NULL,
  `tourHealth` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`tourID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `tour`
--

INSERT INTO `tour` (`tourID`, `tourName`, `tourCost`, `freezeDamage`, `slowDamage`, `tourDamage`, `attackSpeed`, `tourRange`, `tourHealth`) VALUES
(1, 'Avira', 100, 0, 0, 20, 1, 3, 100),
(2, 'McAfee', 200, 1, 0, 25, 0.8, 3, 100),
(3, 'Avast', 300, 0, 0.5, 50, 0.8, 4, 100),
(4, 'Norton', 500, 1, 0.5, 75, 1, 4, 100);

-- --------------------------------------------------------

--
-- Structure de la table `toursave`
--

CREATE TABLE IF NOT EXISTS `toursave` (
  `IDTour` bigint(20) NOT NULL AUTO_INCREMENT,
  `typeTour` bigint(20) NOT NULL,
  `PositionTourX` bigint(20) NOT NULL,
  `PositionTourY` bigint(20) NOT NULL,
  PRIMARY KEY (`IDTour`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
