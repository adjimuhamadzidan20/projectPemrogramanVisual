-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jul 2022 pada 13.15
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 7.4.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `silat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cabang`
--

CREATE TABLE `cabang` (
  `ID` int(11) NOT NULL,
  `Nama_Cabang` varchar(100) NOT NULL,
  `PJ` varchar(40) NOT NULL,
  `Jumlah_Anggota` int(11) NOT NULL,
  `Jadwal_Latihan` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `cabang`
--

INSERT INTO `cabang` (`ID`, `Nama_Cabang`, `PJ`, `Jumlah_Anggota`, `Jadwal_Latihan`) VALUES
(1, 'Petamburan RW.1', 'Rizki Muhammad Ridwan', 0, 'Rabu, dan Jumat'),
(2, 'Petamburan RPTRA', 'Sarah Kartika Ningrum', 0, 'Jumat, dan Sabtu'),
(3, 'Matraman', 'Adi Kurnia Salam', 0, 'Jumat, dan Sabtu'),
(4, 'Padel', 'Muhammad Akbar Asya', 0, 'Jumat, dan Sabtu'),
(5, 'Rawabunga', 'Eka Santika Putri', 0, 'Rabu, dan Jumat'),
(6, 'SMPN 67 Jakarta Selatan', 'Sri Dahlia', 0, 'Sabtu'),
(7, 'Al - Falah', 'Rifqih Rizqullah', 0, 'Jumat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datakeuangan`
--

CREATE TABLE `datakeuangan` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `Bulan` varchar(200) NOT NULL,
  `Keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datakeuangan`
--

INSERT INTO `datakeuangan` (`id`, `nama`, `Bulan`, `Keterangan`) VALUES
(1, 'Sifa Nur Febriani', 'Januari', 'Sudah dibayar'),
(2, 'Husen', 'Februari', 'Sudah dibayar');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datakeuangan.`
--

CREATE TABLE `datakeuangan.` (
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `dt_pelatih`
--

CREATE TABLE `dt_pelatih` (
  `ID` int(11) NOT NULL,
  `Nama` varchar(40) NOT NULL,
  `TTL` varchar(500) NOT NULL,
  `JK` varchar(2) NOT NULL,
  `Sabuk` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dt_pelatih`
--

INSERT INTO `dt_pelatih` (`ID`, `Nama`, `TTL`, `JK`, `Sabuk`) VALUES
(1, 'Abdullah Dzaki', 'Jakarta, 21 Juli 2005', 'L', 'Merah'),
(2, 'Adi Kurnia Salam', 'Jakarta, 17 November 2003', 'L', 'Merah'),
(3, 'Dimas Prayoga', 'Jakarta, 13 Februari 2004', 'L', 'Merah'),
(4, 'Evelyn Efriliani', 'Jakarta, 15 April 2005', 'P', 'Biru'),
(5, 'Medina Dwi Hamid', 'Jakarta, 07 Februari 2005', 'P', 'Biru'),
(6, 'Mochammad Zidan Alfiandy', 'Jakarta, 20 Juli 2003', 'L', 'Merah Strip 1'),
(7, 'Muhammad Rizal Alfarizi', 'Jakarta, 02 September 2004', 'L', 'Merah Strip 2'),
(8, 'Muhammad Akbar Asya', 'Jakarta, 12 November 2003', 'L', 'Merah'),
(9, 'Nailah Labibah', 'Jakarta, 08 Agustus 2005', 'P', 'Merah'),
(10, 'Nazla Shofana Monri', 'Jakarta, 07 Maret 2004', 'P', 'Merah'),
(11, 'Rizki Muhammad Ridwan', 'Jakarta, 06 Mei 2003', 'L', 'Merah Strip 2'),
(12, 'Sarah Hartika Ningrum', 'Jakarta, 12 Juni 2002', 'P', 'Merah Strip 2'),
(13, 'Sri Dahlia', 'Jakarta, 13 September 2002', 'P', 'Merah Strip 1'),
(14, 'Yasha Hidayah', 'Jakarta, 13 Maret 2005', 'P', 'Merah'),
(15, 'Zakiyah Annisa Bahtiar', 'Jakarta, 21 Februari 2005', 'P', 'Merah');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendaftaran`
--

CREATE TABLE `pendaftaran` (
  `ID` int(3) NOT NULL,
  `Nama` varchar(35) NOT NULL,
  `JK` varchar(2) NOT NULL,
  `Cabang` varchar(100) NOT NULL,
  `Sabuk` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pendaftaran`
--

INSERT INTO `pendaftaran` (`ID`, `Nama`, `JK`, `Cabang`, `Sabuk`) VALUES
(1, 'Evelyn Efriliani', 'P', 'Jakarta, 15 April 2005', 'Biru'),
(2, 'Hussen Asyari', 'L', 'Bogor', 'Merah'),
(4, 'Sifa Nur Febriani', 'P', 'Depok', 'Biru'),
(5, 'Dhimas Bagus A.U', 'L', 'Bekasi', 'Biru'),
(6, 'Muhamad Alfisyah', 'L', 'Kota Depok', 'Biru'),
(7, 'Muhamad Bagas Himawan', 'L', 'Kota Depok', 'Biru'),
(8, 'Adji Muhamad Zidan', 'L', 'Kota Bekasi', 'Merah');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `cabang`
--
ALTER TABLE `cabang`
  ADD PRIMARY KEY (`ID`);

--
-- Indeks untuk tabel `datakeuangan`
--
ALTER TABLE `datakeuangan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `datakeuangan.`
--
ALTER TABLE `datakeuangan.`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`),
  ADD UNIQUE KEY `ID_2` (`ID`);

--
-- Indeks untuk tabel `dt_pelatih`
--
ALTER TABLE `dt_pelatih`
  ADD PRIMARY KEY (`ID`);

--
-- Indeks untuk tabel `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `cabang`
--
ALTER TABLE `cabang`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `datakeuangan`
--
ALTER TABLE `datakeuangan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `datakeuangan.`
--
ALTER TABLE `datakeuangan.`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `dt_pelatih`
--
ALTER TABLE `dt_pelatih`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT untuk tabel `pendaftaran`
--
ALTER TABLE `pendaftaran`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
