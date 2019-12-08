-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 25, 2019 at 04:55 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fixed_asset`
--
CREATE DATABASE IF NOT EXISTS `fixed_asset` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `fixed_asset`;

-- --------------------------------------------------------

--
-- Table structure for table `assemble_asset`
--

DROP TABLE IF EXISTS `assemble_asset`;
CREATE TABLE IF NOT EXISTS `assemble_asset` (
  `AssetNo` varchar(5) NOT NULL,
  `AssetName` varchar(10) NOT NULL,
  `category` varchar(10) NOT NULL,
  `DateOfAssemble` date NOT NULL,
  `Life_Time` int(5) NOT NULL,
  `totalPrice` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`AssetNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assemble_asset`
--

INSERT INTO `assemble_asset` (`AssetNo`, `AssetName`, `category`, `DateOfAssemble`, `Life_Time`, `totalPrice`) VALUES
('A1', 'machine', 'item1', '2018-02-03', 10, NULL),
('A2', 'guygfyu', 'Item 2', '2018-08-09', 5, '20000.0');

-- --------------------------------------------------------

--
-- Table structure for table `asset_master_table`
--

DROP TABLE IF EXISTS `asset_master_table`;
CREATE TABLE IF NOT EXISTS `asset_master_table` (
  `AssetNo` int(11) NOT NULL,
  `AssetName` varchar(35) NOT NULL,
  `Date` date NOT NULL,
  `Category` varchar(35) NOT NULL,
  `price` double NOT NULL,
  `Depreciate_Date` date NOT NULL,
  `Depreciate_Amt` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `direct_purchased`
--

DROP TABLE IF EXISTS `direct_purchased`;
CREATE TABLE IF NOT EXISTS `direct_purchased` (
  `AssetNo` int(11) NOT NULL,
  `AssetName` varchar(40) NOT NULL,
  `category` varchar(25) NOT NULL,
  `price` double NOT NULL,
  `purchased_date` date NOT NULL,
  `Life_Time` int(11) NOT NULL,
  PRIMARY KEY (`AssetNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `direct_purchased`
--

INSERT INTO `direct_purchased` (`AssetNo`, `AssetName`, `category`, `price`, `purchased_date`, `Life_Time`) VALUES
(12312, 'add', 'Item 1', 12312, '2019-05-06', 12),
(222, 'cupboard', 'Item 2', 132412, '2019-05-08', 5),
(3, 'Computer', 'Item 1', 20000, '2019-05-10', 5),
(4, 'laptop', 'Item 3', 110000, '2018-12-23', 10),
(1, 'car', 'Item 2', 2500000, '2019-05-10', 15),
(120, 'dsfg', 'Item 1', 120000, '2019-09-06', 12);

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE IF NOT EXISTS `register` (
  `loginID` varchar(10) NOT NULL,
  `FirstName` varchar(25) NOT NULL,
  `LastName` varchar(25) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `RegType` varchar(10) NOT NULL,
  PRIMARY KEY (`loginID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`loginID`, `FirstName`, `LastName`, `username`, `password`, `RegType`) VALUES
('0001', 'Kavindu', 'Madhusanka', 'KavinduGayashan', 'kavindu1234', 'Admin'),
('23123', 'qweqwe', 'qweqwe', 'qweqwe', 'qweqwe', 'Admin'),
('002', 'Michelle', 'Perera', 'MishuPerera', 'mishu123', 'Admin'),
('ssss', 'kavindu', 'gayashan', 'kkgg', 'kk123', 'Admin'),
('003', 'kavi', 'madhu', 'kavimadhu', '1234`', 'Admin'),
('0002', 'Dinusha', 'Atthanayaka', 'dinushajeewanka', 'DINUSHA123', 'Admin'),
('', '', '', '', '', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `working_progress`
--

DROP TABLE IF EXISTS `working_progress`;
CREATE TABLE IF NOT EXISTS `working_progress` (
  `wrkProgNo` int(5) NOT NULL AUTO_INCREMENT,
  `AssetNo` varchar(5) NOT NULL,
  `date` date DEFAULT NULL,
  `details` varchar(100) DEFAULT NULL,
  `price` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`AssetNo`,`wrkProgNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `working_progress`
--

INSERT INTO `working_progress` (`wrkProgNo`, `AssetNo`, `date`, `details`, `price`) VALUES
(1, 'A1', '2018-02-03', 'test', '10000'),
(1, 'A2', '2019-08-08', 'hujihui', '5000'),
(2, 'A2', '2019-08-08', 'hujihui', '6000'),
(3, 'A2', '2019-08-08', 'hujihui', '9000');

-- --------------------------------------------------------

--
-- Table structure for table `working_progress_master`
--

DROP TABLE IF EXISTS `working_progress_master`;
CREATE TABLE IF NOT EXISTS `working_progress_master` (
  `AssetNo` varchar(5) NOT NULL,
  `date` date DEFAULT NULL,
  `totalPrice` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`AssetNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
