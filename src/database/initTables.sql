-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2025 at 11:14 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_nuochoa`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
                         `id` int(11) NOT NULL,
                         `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `name`) VALUES
                                       (1, 'Chanel'),
                                       (2, 'Dior'),
                                       (3, 'Gucci'),
                                       (4, 'Yves Saint Laurent'),
                                       (5, 'Versace'),
                                       (6, 'Tom Ford'),
                                       (7, 'Burberry'),
                                       (8, 'Calvin Klein'),
                                       (9, 'Givenchy'),
                                       (10, 'Hugo Boss');

-- --------------------------------------------------------

--
-- Table structure for table `concentration`
--

CREATE TABLE `concentration` (
                                 `id` int(11) NOT NULL,
                                 `level` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `concentration`
--

INSERT INTO `concentration` (`id`, `level`) VALUES
                                                (1, 'Parfum'),
                                                (2, 'EDP'),
                                                (3, 'EDT'),
                                                (4, 'EDC'),
                                                (5, 'Eau Fraîche'),
                                                (6, 'Aftershave'),
                                                (7, 'Perfume Oil');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
                            `id` int(11) NOT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `phone` varchar(20) DEFAULT NULL,
                            `email` varchar(255) DEFAULT NULL,
                            `is_deleted` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `phone`, `email`, `is_deleted`) VALUES
                                                                          (1, 'Nguyễn Văn An', '0905123456', 'annguyen@example.com', 0),
                                                                          (2, 'Trần Thị Bích', '0916234567', 'bichtran@example.com', 0),
                                                                          (3, 'Lê Hữu Cường', '0927345678', 'cuongle@example.com', 0),
                                                                          (4, 'Phạm Thị Dung', '0938456789', 'dungpham@example.com', 0),
                                                                          (5, 'Hoàng Văn Đông', '0949567890', 'donghoang@example.com', 0),
                                                                          (6, 'Đặng Thị Hoa', '0951678901', 'hoadang@example.com', 0),
                                                                          (7, 'Võ Minh Khang', '0962789012', 'khangvo@example.com', 0),
                                                                          (8, 'Bùi Thị Lan', '0973890123', 'lanbui@example.com', 0),
                                                                          (9, 'Dương Thành Nam', '0984901234', 'namduong@example.com', 0),
                                                                          (10, 'Lý Thị Oanh', '0995012345', 'oanhly@example.com', 0),
                                                                          (11, 'Phan Văn Phúc', '0906123456', 'phucphan@example.com', 0),
                                                                          (12, 'Tạ Thị Quỳnh', '0917234567', 'quynhta@example.com', 0),
                                                                          (13, 'Ngô Hoàng Sơn', '0928345678', 'sonngo@example.com', 0),
                                                                          (14, 'Hồ Thị Thanh', '0939456789', 'thanhho@example.com', 0),
                                                                          (15, 'Lâm Chí Vĩnh', '0940567890', 'vinhlam@example.com', 0),
                                                                          (16, 'Phạm Tường Vy', '0564337862', 'vy123@gmail.com', 0),
                                                                          (17, 'Lê Lý Lan Hương', '0933467531', 'huonglele@gmail.com', 0),
                                                                          (18, 'Nguyễn Thị Hồng', '0909837632', 'longthihe@gmail.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
                            `id` int(11) NOT NULL,
                            `rolegroup_id` int(11) DEFAULT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `username` varchar(255) DEFAULT NULL,
                            `password` varchar(255) DEFAULT NULL,
                            `status` tinyint(1) DEFAULT NULL,
                            `is_deleted` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `rolegroup_id`, `name`, `username`, `password`, `status`, `is_deleted`) VALUES
                                                                                                          (1, 2, 'Nguyễn Văn An', 'annguyen', 'an123', 1, 0),
                                                                                                          (2, 2, 'Trần Thị Bích', 'bichtran', 'bich456', 1, 0),
                                                                                                          (3, 2, 'Lê Hoàng Nam', 'namle', 'nam789', 1, 0),
                                                                                                          (4, 2, 'Phạm Hữu Phúc', 'phucpham', 'phuc321', 0, 0),
                                                                                                          (5, 2, 'Đỗ Thanh Tâm', 'tamdo', 'tam654', 1, 0),
                                                                                                          (6, 2, 'Lê Huỳnh Thái Vy', 'vyvymoon', 'vyh135', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `importreceipt`
--

CREATE TABLE `importreceipt` (
                                 `id` int(11) NOT NULL,
                                 `supplier_id` int(11) DEFAULT NULL,
                                 `import_date` datetime DEFAULT NULL,
                                 `total_cost` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `importreceipt`
--

INSERT INTO `importreceipt` (`id`, `supplier_id`, `import_date`, `total_cost`) VALUES
                                                                                   (1, 1, '2025-04-01 08:00:00', 1400),
                                                                                   (2, 2, '2025-04-02 09:00:00', 1240),
                                                                                   (3, 3, '2025-04-03 10:15:00', 1050),
                                                                                   (4, 4, '2025-04-04 11:30:00', 1460),
                                                                                   (5, 5, '2025-04-05 14:45:00', 780);

-- --------------------------------------------------------

--
-- Table structure for table `importreceiptdetail`
--

CREATE TABLE `importreceiptdetail` (
                                       `import_receipt_id` int(11) NOT NULL,
                                       `perfume_id` int(11) NOT NULL,
                                       `quantity` int(11) DEFAULT NULL,
                                       `cost` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `importreceiptdetail`
--

INSERT INTO `importreceiptdetail` (`import_receipt_id`, `perfume_id`, `quantity`, `cost`) VALUES
                                                                                              (1, 1, 10, 100),
                                                                                              (1, 2, 5, 80),
                                                                                              (2, 3, 8, 90),
                                                                                              (2, 4, 4, 130),
                                                                                              (3, 5, 15, 70),
                                                                                              (4, 6, 6, 110),
                                                                                              (4, 7, 10, 80),
                                                                                              (5, 8, 5, 60),
                                                                                              (5, 9, 3, 100),
                                                                                              (5, 10, 2, 90);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
                           `id` int(11) NOT NULL,
                           `customer_id` int(11) DEFAULT NULL,
                           `employee_id` int(11) DEFAULT NULL,
                           `total` double DEFAULT NULL,
                           `issue_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `customer_id`, `employee_id`, `total`, `issue_date`) VALUES
                                                                                      (1, 1, 1, 430, '2025-04-01 10:00:00'),
                                                                                      (2, 2, 2, 300, '2025-04-02 11:30:00'),
                                                                                      (3, 3, 3, 330, '2025-04-03 09:45:00'),
                                                                                      (4, 4, 5, 360, '2025-04-04 14:20:00'),
                                                                                      (5, 5, 1, 295, '2025-04-05 16:15:00');

-- --------------------------------------------------------

--
-- Table structure for table `invoicedetail`
--

CREATE TABLE `invoicedetail` (
                                 `invoice_id` int(11) NOT NULL,
                                 `perfume_id` int(11) NOT NULL,
                                 `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `invoicedetail`
--

INSERT INTO `invoicedetail` (`invoice_id`, `perfume_id`, `quantity`) VALUES
                                                                         (1, 1, 2),
                                                                         (1, 3, 1),
                                                                         (2, 2, 1),
                                                                         (2, 4, 1),
                                                                         (3, 5, 3),
                                                                         (4, 6, 1),
                                                                         (4, 7, 2),
                                                                         (5, 8, 2),
                                                                         (5, 10, 1);

-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE `notes` (
                         `id` int(11) NOT NULL,
                         `note_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `notes`
--

INSERT INTO `notes` (`id`, `note_name`) VALUES
                                            (1, 'Hoa Hồng'),
                                            (2, 'Hoa Nhài'),
                                            (3, 'Hoa Oải Hương'),
                                            (4, 'Hoa Ly'),
                                            (5, 'Hoa Violet'),
                                            (6, 'Hoa Mẫu Đơn'),
                                            (7, 'Hoa Lan'),
                                            (8, 'Hoa Dành Dành'),
                                            (9, 'Hoa Mộc Lan'),
                                            (10, 'Hoa Lan Nam Phi'),
                                            (11, 'Táo'),
                                            (12, 'Lê'),
                                            (13, 'Đào'),
                                            (14, 'Mâm Xôi Đen'),
                                            (15, 'Mâm Xôi Đỏ'),
                                            (16, 'Dâu Tây'),
                                            (17, 'Anh Đào'),
                                            (18, 'Dứa'),
                                            (19, 'Dừa'),
                                            (20, 'Dưa Gang'),
                                            (21, 'Chanh'),
                                            (22, 'Cam'),
                                            (23, 'Cam Bergamot'),
                                            (24, 'Bưởi'),
                                            (25, 'Quýt'),
                                            (26, 'Gỗ Đàn Hương'),
                                            (27, 'Gỗ Tuyết Tùng'),
                                            (28, 'Hoắc Hương'),
                                            (29, 'Cỏ Hương Bài'),
                                            (30, 'Trầm Hương'),
                                            (31, 'Quế'),
                                            (32, 'Đinh Hương'),
                                            (33, 'Bạch Đậu Khấu'),
                                            (34, 'Gừng'),
                                            (35, 'Nhục Đậu Khấu'),
                                            (36, 'Vani'),
                                            (37, 'Đậu Tonka'),
                                            (38, 'Muối Biển'),
                                            (39, 'Hương Biển'),
                                            (40, 'Hương Ozone'),
                                            (41, 'Hương Aldehyde'),
                                            (42, 'Xạ Hương'),
                                            (43, 'Long Diên Hương'),
                                            (44, 'Cầy Hương'),
                                            (45, 'Da Thuộc'),
                                            (46, 'Rêu Sồi'),
                                            (47, 'Húng Quế'),
                                            (48, 'Xô Thơm'),
                                            (49, 'Cỏ Xạ Hương'),
                                            (50, 'Bạc Hà');

-- --------------------------------------------------------

--
-- Table structure for table `perfume`
--

CREATE TABLE `perfume` (
                           `id` int(11) NOT NULL,
                           `name` varchar(255) DEFAULT NULL,
                           `price` double DEFAULT NULL,
                           `stock` int(11) DEFAULT NULL,
                           `sex` varchar(255) DEFAULT NULL,
                           `images` varchar(255) DEFAULT NULL,
                           `description` varchar(1000) DEFAULT NULL,
                           `brand_id` int(11) DEFAULT NULL,
                           `scent_type_id` int(11) DEFAULT NULL,
                           `promotion_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `perfume`
--

INSERT INTO `perfume` (`id`, `name`, `price`, `stock`, `sex`, `images`, `description`, `brand_id`, `scent_type_id`, `promotion_id`) VALUES
                                                                                                                                        (1, 'Chanel No. 5', 150, 100, 'Female', 'chanel_no_5.jpg', 'Một biểu tượng kinh điển của nước hoa nữ.', 1, 1, 1),
                                                                                                                                        (2, 'Dior Sauvage', 120, 200, 'Male', 'dior_sauvage.jpg', 'Nước hoa nam mạnh mẽ với hương gỗ và tiêu.', 2, 4, 3),
                                                                                                                                        (3, 'Gucci Bloom', 130, 150, 'Female', 'gucci_bloom.jpg', 'Hương hoa tươi mát dành cho phụ nữ hiện đại.', 3, 1, 2),
                                                                                                                                        (4, 'Tom Ford Black Orchid', 180, 50, 'Female', 'tom_ford_black_orchid.jpg', 'Một mùi hương sang trọng và quyến rũ.', 6, 1, 5),
                                                                                                                                        (5, 'Versace Eros', 110, 180, 'Male', 'versace_eros.jpg', 'Nước hoa nam với hương gỗ và cam quýt.', 5, 2, 2),
                                                                                                                                        (6, 'Yves Saint Laurent Libre', 160, 70, 'Female', 'ysl_libre.jpg', 'Nước hoa nữ với sự kết hợp giữa hoa oải hương và vani.', 4, 1, 4),
                                                                                                                                        (7, 'Burberry London', 100, 200, 'Male', 'burberry_london.jpg', 'Hương gỗ và gia vị đặc trưng của nước hoa nam.', 7, 4, 1),
                                                                                                                                        (8, 'Calvin Klein CK One', 90, 300, 'Unisex', 'ck_one.jpg', 'Nước hoa unisex dễ chịu với hương trái cây.', 8, 3, 5),
                                                                                                                                        (9, 'Givenchy Gentleman', 140, 120, 'Male', 'givenchy_gentleman.jpg', 'Nước hoa nam tính với sự pha trộn của hương gỗ và hoa.', 9, 4, 3),
                                                                                                                                        (10, 'Hugo Boss Bottled', 115, 250, 'Male', 'hugo_boss_bottled.jpg', 'Hương gỗ và trái cây cho người đàn ông năng động.', 10, 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `perfume_concentration`
--

CREATE TABLE `perfume_concentration` (
                                         `perfume_id` int(11) DEFAULT NULL,
                                         `concentration_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `perfume_concentration`
--

INSERT INTO `perfume_concentration` (`perfume_id`, `concentration_id`) VALUES
                                                                           (1, 2),
                                                                           (2, 3),
                                                                           (3, 2),
                                                                           (4, 1),
                                                                           (5, 3),
                                                                           (6, 2),
                                                                           (7, 3),
                                                                           (8, 3),
                                                                           (9, 2),
                                                                           (10, 3);

-- --------------------------------------------------------

--
-- Table structure for table `perfume_notes`
--

CREATE TABLE `perfume_notes` (
                                 `perfume_id` int(11) NOT NULL,
                                 `note_id` int(11) NOT NULL,
                                 `type` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `perfume_notes`
--

INSERT INTO `perfume_notes` (`perfume_id`, `note_id`, `type`) VALUES
                                                                  (1, 1, 'Heart'),
                                                                  (1, 2, 'Heart'),
                                                                  (1, 3, 'Heart'),
                                                                  (1, 21, 'Top'),
                                                                  (1, 23, 'Top'),
                                                                  (1, 26, 'Base'),
                                                                  (1, 30, 'Base'),
                                                                  (1, 36, 'Base'),
                                                                  (1, 41, 'Top'),
                                                                  (2, 3, 'Heart'),
                                                                  (2, 23, 'Top'),
                                                                  (2, 26, 'Base'),
                                                                  (2, 27, 'Base'),
                                                                  (2, 32, 'Top'),
                                                                  (2, 34, 'Heart'),
                                                                  (3, 1, 'Heart'),
                                                                  (3, 2, 'Top'),
                                                                  (3, 3, 'Top'),
                                                                  (3, 4, 'Heart'),
                                                                  (3, 5, 'Base'),
                                                                  (3, 6, 'Base'),
                                                                  (4, 10, 'Heart'),
                                                                  (4, 23, 'Top'),
                                                                  (4, 30, 'Base'),
                                                                  (4, 32, 'Top'),
                                                                  (4, 36, 'Base'),
                                                                  (4, 43, 'Heart'),
                                                                  (5, 11, 'Top'),
                                                                  (5, 17, 'Heart'),
                                                                  (5, 21, 'Top'),
                                                                  (5, 27, 'Base'),
                                                                  (5, 36, 'Base'),
                                                                  (5, 37, 'Heart'),
                                                                  (6, 1, 'Heart'),
                                                                  (6, 2, 'Heart'),
                                                                  (6, 3, 'Top'),
                                                                  (6, 23, 'Top'),
                                                                  (6, 27, 'Base'),
                                                                  (6, 36, 'Base'),
                                                                  (7, 26, 'Base'),
                                                                  (7, 28, 'Heart'),
                                                                  (7, 29, 'Heart'),
                                                                  (7, 30, 'Base'),
                                                                  (7, 31, 'Top'),
                                                                  (7, 32, 'Top'),
                                                                  (8, 11, 'Top'),
                                                                  (8, 12, 'Base'),
                                                                  (8, 13, 'Top'),
                                                                  (8, 16, 'Heart'),
                                                                  (8, 17, 'Heart'),
                                                                  (8, 18, 'Base'),
                                                                  (9, 1, 'Top'),
                                                                  (9, 2, 'Top'),
                                                                  (9, 3, 'Heart'),
                                                                  (9, 4, 'Heart'),
                                                                  (9, 26, 'Base'),
                                                                  (9, 30, 'Base'),
                                                                  (10, 1, 'Heart'),
                                                                  (10, 2, 'Heart'),
                                                                  (10, 11, 'Top'),
                                                                  (10, 12, 'Top'),
                                                                  (10, 26, 'Base'),
                                                                  (10, 30, 'Base');

-- --------------------------------------------------------

--
-- Table structure for table `perfume_volume`
--

CREATE TABLE `perfume_volume` (
                                  `perfume_id` int(11) DEFAULT NULL,
                                  `volume_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `perfume_volume`
--

INSERT INTO `perfume_volume` (`perfume_id`, `volume_id`) VALUES
                                                             (1, 6),
                                                             (2, 6),
                                                             (3, 6),
                                                             (4, 6),
                                                             (5, 6),
                                                             (6, 6),
                                                             (7, 6),
                                                             (8, 6),
                                                             (9, 6),
                                                             (10, 6);

-- --------------------------------------------------------

--
-- Table structure for table `promotion`
--

CREATE TABLE `promotion` (
                             `id` int(11) NOT NULL,
                             `name` varchar(255) DEFAULT NULL,
                             `discount_percent` double DEFAULT NULL,
                             `start_date` datetime DEFAULT NULL,
                             `end_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `promotion`
--

INSERT INTO `promotion` (`id`, `name`, `discount_percent`, `start_date`, `end_date`) VALUES
                                                                                         (1, 'Giảm giá mùa hè', 15, '2025-06-01 00:00:00', '2025-06-30 23:59:59'),
                                                                                         (2, 'Khuyến mãi ngày Quốc tế Phụ nữ', 20, '2025-03-08 00:00:00', '2025-03-08 23:59:59'),
                                                                                         (3, 'Giảm giá Black Friday', 50, '2025-11-27 00:00:00', '2025-11-27 23:59:59'),
                                                                                         (4, 'Khuyến mãi sinh nhật cửa hàng', 10, '2025-05-01 00:00:00', '2025-05-10 23:59:59'),
                                                                                         (5, 'Giảm giá lễ Tết Nguyên Đán', 25, '2025-01-01 00:00:00', '2025-01-15 23:59:59');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
                        `id` int(11) NOT NULL,
                        `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
                                      (1, 'Quản lý sản phẩm'),
                                      (2, 'Quản lý hóa đơn'),
                                      (3, 'Quản lý khách hàng'),
                                      (4, 'Quản lý nhân viên'),
                                      (5, 'Quản lý nhập hàng'),
                                      (6, 'Quản lý thuộc tính'),
                                      (7, 'Quản lý nhà cung cấp'),
                                      (8, 'Quản lý thống kê'),
                                      (9, 'Quản lý nhóm quyền');

-- --------------------------------------------------------

--
-- Table structure for table `rolegroup`
--

CREATE TABLE `rolegroup` (
                             `id` int(11) NOT NULL,
                             `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rolegroup`
--

INSERT INTO `rolegroup` (`id`, `name`) VALUES
                                           (1, 'Admin'),
                                           (2, 'Nhân viên bán hàng');

-- --------------------------------------------------------

--
-- Table structure for table `role_rolegroup`
--

CREATE TABLE `role_rolegroup` (
                                  `role_id` int(11) DEFAULT NULL,
                                  `rolegroup_id` int(11) DEFAULT NULL,
                                  `status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `role_rolegroup`
--

INSERT INTO `role_rolegroup` (`role_id`, `rolegroup_id`, `status`) VALUES
                                                                       (1, 1, 1),
                                                                       (2, 1, 1),
                                                                       (3, 1, 1),
                                                                       (4, 1, 1),
                                                                       (5, 1, 1),
                                                                       (6, 1, 1),
                                                                       (7, 1, 1),
                                                                       (8, 1, 1),
                                                                       (9, 1, 1),
                                                                       (1, 2, 0),
                                                                       (2, 2, 1),
                                                                       (3, 2, 0),
                                                                       (4, 2, 0),
                                                                       (5, 2, 1),
                                                                       (6, 2, 0),
                                                                       (7, 2, 0),
                                                                       (8, 2, 0),
                                                                       (9, 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `scenttype`
--

CREATE TABLE `scenttype` (
                             `id` int(11) NOT NULL,
                             `type_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `scenttype`
--

INSERT INTO `scenttype` (`id`, `type_name`) VALUES
                                                (1, 'Floral - Hương Hoa'),
                                                (2, 'Fruity - Hương Trái Cây'),
                                                (3, 'Citrus - Hương Cam Chanh'),
                                                (4, 'Woody - Hương Gỗ'),
                                                (5, 'Oriental - Hương Phương Đông'),
                                                (6, 'Spicy - Hương Cay'),
                                                (7, 'Fresh - Hương Tươi Mát'),
                                                (8, 'Aquatic - Hương Biển'),
                                                (9, 'Green - Hương Xanh'),
                                                (10, 'Gourmand - Hương Kẹo Ngọt'),
                                                (11, 'Musk - Hương Xạ Hương'),
                                                (12, 'Leather - Hương Da Thuộc'),
                                                (13, 'Amber - Hương Hổ Phách'),
                                                (14, 'Powdery - Hương Phấn'),
                                                (15, 'Aromatic - Hương Thảo Mộc'),
                                                (16, 'Chypre - Hương Rêu Sồi'),
                                                (17, 'Fougère - Hương Dương Xỉ');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
                            `id` int(11) NOT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `phone` varchar(20) DEFAULT NULL,
                            `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `name`, `phone`, `email`) VALUES
                                                            (1, 'Luxury Fragrance Co.', '0901234567', 'contact@luxuryfragrance.com'),
                                                            (2, 'Elite Perfume Distributors', '0912345678', 'info@eliteperfume.com'),
                                                            (3, 'Prestige Aroma', '0923456789', 'support@prestigearoma.com'),
                                                            (4, 'Exclusive Scents Ltd.', '0934567890', 'service@exclusivescents.com'),
                                                            (5, 'Premium Essence Supply', '0945678901', 'sales@premiumessence.com');

-- --------------------------------------------------------

--
-- Table structure for table `volume`
--

CREATE TABLE `volume` (
                          `id` int(11) NOT NULL,
                          `size` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `volume`
--

INSERT INTO `volume` (`id`, `size`) VALUES
                                        (1, 5),
                                        (2, 10),
                                        (3, 15),
                                        (4, 20),
                                        (5, 30),
                                        (6, 50),
                                        (7, 75),
                                        (8, 90),
                                        (9, 100),
                                        (10, 125),
                                        (11, 150),
                                        (12, 200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `concentration`
--
ALTER TABLE `concentration`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
    ADD PRIMARY KEY (`id`),
  ADD KEY `rolegroup_id` (`rolegroup_id`);

--
-- Indexes for table `importreceipt`
--
ALTER TABLE `importreceipt`
    ADD PRIMARY KEY (`id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Indexes for table `importreceiptdetail`
--
ALTER TABLE `importreceiptdetail`
    ADD PRIMARY KEY (`import_receipt_id`,`perfume_id`),
  ADD KEY `perfume_id` (`perfume_id`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
    ADD PRIMARY KEY (`id`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `invoicedetail`
--
ALTER TABLE `invoicedetail`
    ADD PRIMARY KEY (`invoice_id`,`perfume_id`),
  ADD KEY `perfume_id` (`perfume_id`);

--
-- Indexes for table `notes`
--
ALTER TABLE `notes`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `perfume`
--
ALTER TABLE `perfume`
    ADD PRIMARY KEY (`id`),
  ADD KEY `brand_id` (`brand_id`),
  ADD KEY `scent_type_id` (`scent_type_id`),
  ADD KEY `promotion_id` (`promotion_id`);

--
-- Indexes for table `perfume_concentration`
--
ALTER TABLE `perfume_concentration`
    ADD UNIQUE KEY `Perfume_Concentration_index_1` (`perfume_id`,`concentration_id`),
    ADD KEY `concentration_id` (`concentration_id`);

--
-- Indexes for table `perfume_notes`
--
ALTER TABLE `perfume_notes`
    ADD PRIMARY KEY (`perfume_id`,`note_id`),
  ADD KEY `note_id` (`note_id`);

--
-- Indexes for table `perfume_volume`
--
ALTER TABLE `perfume_volume`
    ADD UNIQUE KEY `Perfume_Volume_index_0` (`perfume_id`,`volume_id`),
    ADD KEY `volume_id` (`volume_id`);

--
-- Indexes for table `promotion`
--
ALTER TABLE `promotion`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rolegroup`
--
ALTER TABLE `rolegroup`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role_rolegroup`
--
ALTER TABLE `role_rolegroup`
    ADD UNIQUE KEY `Role_RoleGroup_index_2` (`role_id`,`rolegroup_id`),
    ADD KEY `rolegroup_id` (`rolegroup_id`);

--
-- Indexes for table `scenttype`
--
ALTER TABLE `scenttype`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
    ADD PRIMARY KEY (`id`);

--
-- Indexes for table `volume`
--
ALTER TABLE `volume`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
    ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`rolegroup_id`) REFERENCES `rolegroup` (`id`);

--
-- Constraints for table `importreceipt`
--
ALTER TABLE `importreceipt`
    ADD CONSTRAINT `importreceipt_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`);

--
-- Constraints for table `importreceiptdetail`
--
ALTER TABLE `importreceiptdetail`
    ADD CONSTRAINT `importreceiptdetail_ibfk_1` FOREIGN KEY (`import_receipt_id`) REFERENCES `importreceipt` (`id`),
  ADD CONSTRAINT `importreceiptdetail_ibfk_2` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`);

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
    ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Constraints for table `invoicedetail`
--
ALTER TABLE `invoicedetail`
    ADD CONSTRAINT `invoicedetail_ibfk_1` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`id`),
  ADD CONSTRAINT `invoicedetail_ibfk_2` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`);

--
-- Constraints for table `perfume`
--
ALTER TABLE `perfume`
    ADD CONSTRAINT `perfume_ibfk_1` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`),
  ADD CONSTRAINT `perfume_ibfk_2` FOREIGN KEY (`scent_type_id`) REFERENCES `scenttype` (`id`),
  ADD CONSTRAINT `perfume_ibfk_3` FOREIGN KEY (`promotion_id`) REFERENCES `promotion` (`id`);

--
-- Constraints for table `perfume_concentration`
--
ALTER TABLE `perfume_concentration`
    ADD CONSTRAINT `perfume_concentration_ibfk_1` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`),
  ADD CONSTRAINT `perfume_concentration_ibfk_2` FOREIGN KEY (`concentration_id`) REFERENCES `concentration` (`id`);

--
-- Constraints for table `perfume_notes`
--
ALTER TABLE `perfume_notes`
    ADD CONSTRAINT `perfume_notes_ibfk_1` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`),
  ADD CONSTRAINT `perfume_notes_ibfk_2` FOREIGN KEY (`note_id`) REFERENCES `notes` (`id`);

--
-- Constraints for table `perfume_volume`
--
ALTER TABLE `perfume_volume`
    ADD CONSTRAINT `perfume_volume_ibfk_1` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`),
  ADD CONSTRAINT `perfume_volume_ibfk_2` FOREIGN KEY (`volume_id`) REFERENCES `volume` (`id`);

--
-- Constraints for table `role_rolegroup`
--
ALTER TABLE `role_rolegroup`
    ADD CONSTRAINT `role_rolegroup_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  ADD CONSTRAINT `role_rolegroup_ibfk_2` FOREIGN KEY (`rolegroup_id`) REFERENCES `rolegroup` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
