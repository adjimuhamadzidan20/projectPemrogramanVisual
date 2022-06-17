-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jun 2022 pada 16.31
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `silat_baru`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_anggota`
--

CREATE TABLE `data_anggota` (
  `id_anggota` varchar(100) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `jen_kel` varchar(15) NOT NULL,
  `ttl` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_anggota`
--

INSERT INTO `data_anggota` (`id_anggota`, `nama_anggota`, `jen_kel`, `ttl`, `alamat`) VALUES
('01AG', 'Saifudin', 'Laki Laki', 'Bogor , 31-01-1999', 'Jl Pemuda Pancasila'),
('04AG', 'Sintia Siska', 'P', 'Makassar 12-12-1998', 'Jl Elang Raya III'),
('05AG', 'Rizky Riza', 'L', 'Jember 21-10-1999', 'JL Mahakaryamu'),
('06AG', 'Vincent', 'L', 'Jepara 13-12-1999', 'Jl Mahakarya Satu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_cabang`
--

CREATE TABLE `data_cabang` (
  `id_cabang` varchar(100) NOT NULL,
  `nama_cabang` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_cabang`
--

INSERT INTO `data_cabang` (`id_cabang`, `nama_cabang`, `alamat`) VALUES
('CAB1', 'Merpati Putih', 'Jl Merbabu III'),
('CAB2', 'AZEKKK', 'AZEKKKKK'),
('CAB3', 'PekanRaya', 'PekanRaya Bogor'),
('CAB4', 'KOSONG', 'KOSONG');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_keuangan`
--

CREATE TABLE `data_keuangan` (
  `id_uang` int(50) NOT NULL,
  `id_anggota` varchar(100) NOT NULL,
  `bulan` varchar(100) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_keuangan`
--

INSERT INTO `data_keuangan` (`id_uang`, `id_anggota`, `bulan`, `keterangan`) VALUES
(1, '01AG', 'Januari', 'Sudah Bayar');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pelatih`
--

CREATE TABLE `data_pelatih` (
  `id_pelatih` varchar(100) NOT NULL,
  `nama_pelatih` varchar(100) NOT NULL,
  `jenkel` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_pelatih`
--

INSERT INTO `data_pelatih` (`id_pelatih`, `nama_pelatih`, `jenkel`, `alamat`) VALUES
('PL01', 'Satria', 'Laki Laki', 'Jl Anggrek'),
('PL03', 'Saskia', 'Perempuan', 'Jl Anggur Manis'),
('PL2', 'Sutroyo', 'Laki Laki', 'Jl Anggrek Merah');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_tanding`
--

CREATE TABLE `data_tanding` (
  `id_tanding` varchar(100) NOT NULL,
  `id_anggota` varchar(100) NOT NULL,
  `id_cabang` varchar(100) NOT NULL,
  `id_pelatih` varchar(100) NOT NULL,
  `jadwal_tanding` varchar(100) NOT NULL,
  `nama_tanding` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_tanding`
--

INSERT INTO `data_tanding` (`id_tanding`, `id_anggota`, `id_cabang`, `id_pelatih`, `jadwal_tanding`, `nama_tanding`) VALUES
('1', '01AG', 'CAB3', 'PL01', 'Sabtu 12-10-2023', 'Piala Menpora'),
('2', '06AG', 'CAB1', 'PL01', 'Minggu 13-11-2023', 'Piala Presiden');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_anggota`
--
ALTER TABLE `data_anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indeks untuk tabel `data_cabang`
--
ALTER TABLE `data_cabang`
  ADD PRIMARY KEY (`id_cabang`);

--
-- Indeks untuk tabel `data_keuangan`
--
ALTER TABLE `data_keuangan`
  ADD PRIMARY KEY (`id_uang`),
  ADD KEY `id_anggota` (`id_anggota`);

--
-- Indeks untuk tabel `data_pelatih`
--
ALTER TABLE `data_pelatih`
  ADD PRIMARY KEY (`id_pelatih`);

--
-- Indeks untuk tabel `data_tanding`
--
ALTER TABLE `data_tanding`
  ADD PRIMARY KEY (`id_tanding`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `id_cabang` (`id_cabang`),
  ADD KEY `id_pelatih` (`id_pelatih`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `data_keuangan`
--
ALTER TABLE `data_keuangan`
  MODIFY `id_uang` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `data_keuangan`
--
ALTER TABLE `data_keuangan`
  ADD CONSTRAINT `data_keuangan_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `data_anggota` (`id_anggota`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `data_tanding`
--
ALTER TABLE `data_tanding`
  ADD CONSTRAINT `data_tanding_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `data_anggota` (`id_anggota`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `data_tanding_ibfk_2` FOREIGN KEY (`id_cabang`) REFERENCES `data_cabang` (`id_cabang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `data_tanding_ibfk_3` FOREIGN KEY (`id_pelatih`) REFERENCES `data_pelatih` (`id_pelatih`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
