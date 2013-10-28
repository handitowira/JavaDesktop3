-- phpMyAdmin SQL Dump
-- version 4.0.5
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2013 at 10:04 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `java_desktop_3`
--

-- --------------------------------------------------------

--
-- Table structure for table `datakelas`
--

CREATE TABLE IF NOT EXISTS `datakelas` (
  `idkelas` int(255) NOT NULL,
  `namakelas` varchar(255) NOT NULL,
  `jurusan` varchar(255) NOT NULL,
  `walikelas` varchar(255) NOT NULL,
  `ketuakelas` varchar(255) NOT NULL,
  `jumlahsiswa` int(255) NOT NULL,
  `letak` varchar(255) NOT NULL,
  PRIMARY KEY (`idkelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datakelas`
--

INSERT INTO `datakelas` (`idkelas`, `namakelas`, `jurusan`, `walikelas`, `ketuakelas`, `jumlahsiswa`, `letak`) VALUES
(1, 'XIITKJ1', 'TKJ', 'Bu Rini', 'Ari', 38, 'Atas Kanan Selatan Timur'),
(2, 'XIITKJ2', 'TKJ', 'Pak Nasikin', 'Gisedo', 39, 'Pojok'),
(3, 'saz', 'asdasd', 'sad', 'sad', 12, 'asd'),
(4, 'XIITKJAFSD', 'JLKJ', 'LKJL', 'LKJL', 1, 'LKJL'),
(12, 'asfas', 'dfsaf', 'asdf', 'sadf', 123, 'sasdf'),
(13, 'LKJ', 'LJL', 'JL', 'JL', 121, 'LJLKJ');

-- --------------------------------------------------------

--
-- Table structure for table `datasiswa`
--

CREATE TABLE IF NOT EXISTS `datasiswa` (
  `nis` varchar(10) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `notelp` varchar(255) NOT NULL,
  PRIMARY KEY (`nis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datasiswa`
--

INSERT INTO `datasiswa` (`nis`, `nama`, `alamat`, `notelp`) VALUES
('12345', 'Bayu Intan Jati Kuncoro', 'Ngawi', '081828212098'),
('3241.906', 'Kurniawan Wira Handitos', 'Jl. Danau Ranau Sawojajar Malang ', '081331862530');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
