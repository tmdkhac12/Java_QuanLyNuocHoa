-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 26, 2025 lúc 04:54 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET
SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET
time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `java_nuochoa`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `brand`
--

CREATE TABLE `brand`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `brand`
--

INSERT INTO `brand` (`id`, `name`)
VALUES (1, 'Chanel'),
       (2, 'Dior'),
       (3, 'Gucci'),
       (4, 'Tom Ford'),
       (5, 'YSL');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `concentration`
--

CREATE TABLE `concentration`
(
    `id`    int(11) NOT NULL,
    `level` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `concentration`
--

INSERT INTO `concentration` (`id`, `level`)
VALUES (1, 'Eau de Parfum'),
       (2, 'Eau de Toilette'),
       (3, 'Parfum'),
       (4, 'Cologne'),
       (5, 'Eau Fraiche');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customer`
--

CREATE TABLE `customer`
(
    `id`    int(11) NOT NULL,
    `name`  varchar(255) DEFAULT NULL,
    `phone` varchar(20)  DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `customer`
--

INSERT INTO `customer` (`id`, `name`, `phone`, `email`)
VALUES (1, 'Nguyễn Văn A', '0387913298', 'nguyenvana1@example.com'),
       (2, 'Trần Nhất Nhất', '0123456789', 'trannhatnhat2@example.com'),
       (3, 'Hoàng Gia Bo', '0987654321', 'hoanggiabo3@example.com'),
       (4, 'Hồ Minh Hưng', '0867987456', 'hominhhung4@example.com'),
       (5, 'Nguyễn Thị Minh Anh', '0935123456', 'nguyenthiminhanh5@example.com'),
       (6, 'Trần Đức Minh', '0983456789', 'tranducminh6@example.com'),
       (7, 'Lê Hải Yến', '0977234567', 'lehaiyen7@example.com'),
       (8, 'Phạm Thanh Hằng', '0965876543', 'phamthanhhang8@example.com'),
       (9, 'Hoàng Đức Anh', '0946789012', 'hoangducanh9@example.com'),
       (10, 'Ngô Thanh Tùng', '0912345678', 'ngothanhtung10@example.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee`
(
    `id`           int(11) NOT NULL,
    `rolegroup_id` int(11) DEFAULT NULL,
    `name`         varchar(255) DEFAULT NULL,
    `username`     varchar(255) DEFAULT NULL,
    `password`     varchar(255) DEFAULT NULL,
    `status`       tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `employee` (`id`, `rolegroup_id`, `name`, `username`, `password`, `status`)
VALUES (1, 1, 'Nguyễn Văn An', 'an.nguyen', '123456', 1),
       (2, 2, 'Trần Thị Bích', 'bich.tran', 'abc@123', 1),
       (3, 1, 'Lê Minh Tuấn', 'tuan.le', 'tuanpass', 1),
       (4, 3, 'Phạm Thanh Hương', 'huong.pham', 'huong2025', 1),
       (5, 2, 'Đỗ Hoàng Nam', 'nam.do', 'nam123', 1),
       (6, 3, 'Hoàng Thị Lan', 'lan.hoang', 'lanpass', 1),
       (7, 1, 'Vũ Quang Huy', 'huy.vu', 'huy999', 1),
       (8, 2, 'Bùi Kim Ngân', 'ngan.bui', 'ngan888', 1),
       (9, 3, 'Lương Trọng Nghĩa', 'nghia.luong', 'nghia777', 1),
       (10, 1, 'Phan Hải Yến', 'yen.phan', 'yen@111', 1),
       (11, 2, 'Đinh Đức Mạnh', 'manh.dinh', 'manh222', 1),
       (12, 3, 'Ngô Mai Chi', 'chi.ngo', 'chi333', 1);

--
-- Cấu trúc bảng cho bảng `importreceipt`
--

CREATE TABLE `importreceipt`
(
    `id`          int(11) NOT NULL,
    `supplier_id` int(11) DEFAULT NULL,
    `import_date` datetime DEFAULT NULL,
    `total_cost` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `importreceipt` (`id`, `supplier_id`, `import_date`, `total_cost`)
VALUES (1, 1, '2025-03-01 10:30:00', 5000000),
       (2, 2, '2025-03-02 14:00:00', 7200000),
       (3, 3, '2025-03-03 09:15:00', 8900000),
       (4, 4, '2025-03-04 16:45:00', 4300000),
       (5, 5, '2025-03-05 11:20:00', 6700000),
       (6, 1, '2025-03-06 13:10:00', 8200000),
       (7, 2, '2025-03-07 15:30:00', 5500000),
       (8, 3, '2025-03-08 10:50:00', 7900000),
       (9, 4, '2025-03-09 08:40:00', 9100000),
       (10, 5, '2025-03-10 12:00:00', 6000000);

--
-- Cấu trúc bảng cho bảng `importreceiptdetail`
--

CREATE TABLE `importreceiptdetail`
(
    `import_receipt_id` int(11) NOT NULL,
    `perfume_id`        int(11) NOT NULL,
    `quantity`          int(11) DEFAULT NULL,
    `cost` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `importreceiptdetail` (`import_receipt_id`, `perfume_id`, `quantity`, `cost`)
VALUES (1, 1, 50, 1500000),
       (1, 3, 30, 1200000),
       (2, 2, 40, 1350000),
       (2, 4, 25, 1600000),
       (3, 5, 35, 1400000),
       (3, 6, 20, 1700000),
       (4, 7, 45, 1550000),
       (4, 8, 50, 1250000),
       (5, 9, 30, 1450000),
       (5, 10, 20, 1850000),
       (6, 11, 60, 1100000),
       (6, 12, 40, 1750000),
       (7, 1, 55, 1300000),
       (7, 3, 25, 1150000),
       (8, 2, 35, 1400000),
       (8, 4, 45, 1650000),
       (9, 5, 20, 1250000),
       (9, 6, 50, 1600000),
       (10, 7, 40, 1500000),
       (10, 8, 30, 1350000);

--
-- Cấu trúc bảng cho bảng `invoice`
--

CREATE TABLE `invoice`
(
    `id`          int(11) NOT NULL,
    `customer_id` int(11) DEFAULT NULL,
    `employee_id` int(11) DEFAULT NULL,
    `total` double DEFAULT NULL,
    `issue_date`  datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `invoice` (`id`, `customer_id`, `employee_id`, `total`, `issue_date`)
VALUES (1, 1, 5, 2450000, '2025-03-01 10:30:00'),
       (2, 2, 3, 3800000, '2025-03-02 14:00:00'),
       (3, 3, 8, 5600000, '2025-03-03 09:15:00'),
       (4, 4, 2, 2950000, '2025-03-04 16:45:00'),
       (5, 5, 7, 4150000, '2025-03-05 11:20:00'),
       (6, 6, 10, 6250000, '2025-03-06 13:10:00'),
       (7, 7, 1, 3400000, '2025-03-07 15:30:00'),
       (8, 8, 6, 4900000, '2025-03-08 10:50:00'),
       (9, 9, 9, 2800000, '2025-03-09 08:40:00'),
       (10, 10, 12, 5300000, '2025-03-10 12:00:00');

--
-- Cấu trúc bảng cho bảng `invoicedetail`
--

CREATE TABLE `invoicedetail`
(
    `invoice_id` int(11) NOT NULL,
    `perfume_id` int(11) NOT NULL,
    `quantity`   int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `invoicedetail` (`invoice_id`, `perfume_id`, `quantity`)
VALUES (1, 3, 2),
       (1, 7, 1),
       (2, 1, 3),
       (2, 9, 2),
       (3, 5, 1),
       (3, 8, 4),
       (4, 6, 2),
       (4, 12, 1),
       (5, 2, 3),
       (5, 10, 2),
       (6, 4, 1),
       (6, 11, 3),
       (7, 1, 2),
       (7, 5, 1),
       (8, 7, 4),
       (8, 9, 2),
       (9, 3, 3),
       (9, 6, 1),
       (10, 8, 2),
       (10, 12, 3);

--
-- Cấu trúc bảng cho bảng `notes`
--

CREATE TABLE `notes`
(
    `id`        int(11) NOT NULL,
    `note_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
--
-- Đang đổ dữ liệu cho bảng `note`
--

INSERT INTO `notes` (`id`, `note_name`)
VALUES (1, 'Bergamot'),
       (2, 'Sandalwood'),
       (3, 'Rose'),
       (4, 'Jasmine'),
       (5, 'Vanilla'),
       (6, 'Musk'),
       (7, 'Amber'),
       (8, 'Leather'),
       (9, 'Vetiver'),
       (10, 'Lavender'),
       (11, 'Cedarwood'),
       (12, 'Patchouli'),
       (13, 'Tonka Bean'),
       (14, 'Ylang Ylang'),
       (15, 'Tobacco'),
       (16, 'Oud'),
       (17, 'Cinnamon'),
       (18, 'Citrus'),
       (19, 'Pepper'),
       (20, 'Sea Breeze');
--
-- Cấu trúc bảng cho bảng `perfume`
--

CREATE TABLE `perfume`
(
    `id`            int(11) NOT NULL,
    `name`          varchar(255)  DEFAULT NULL,
    `price` double DEFAULT NULL,
    `stock`         int(11) DEFAULT NULL,
    `sex`           varchar(255)  DEFAULT NULL,
    `images`        varchar(255)  DEFAULT NULL,
    `description`   varchar(1000) DEFAULT NULL,
    `brand_id`      int(11) DEFAULT NULL,
    `scent_type_id` int(11) DEFAULT NULL,
    `promotion_id`  int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `perfume`
--

INSERT INTO `perfume` (`id`, `name`, `price`, `stock`, `sex`, `images`, `description`, `brand_id`, `scent_type_id`,
                       `promotion_id`)
VALUES (1, 'Chanel No.5', 150, 10, 'Female', 'chanel_no5.jpg', 'Classic floral fragrance', 1, 1, NULL),
       (2, 'Dior Sauvage', 120, 15, 'Male', 'dior_sauvage.jpg', 'Fresh woody scent', 2, 2, NULL),
       (3, 'Gucci Bloom', 140, 12, 'Female', 'gucci_bloom.jpg', 'Rich floral fragrance', 3, 1, NULL),
       (4, 'Tom Ford Oud Wood', 250, 8, 'Unisex', 'tom_ford_oud.jpg', 'Luxury oud scent', 4, 2, NULL),
       (5, 'YSL Black Opium', 130, 10, 'Female', 'ysl_black_opium.jpg', 'Oriental vanilla', 5, 4, NULL),
       (6, 'Bleu de Chanel', 160, 14, 'Male', 'bleu_de_chanel.jpg', 'Woody aromatic fragrance', 1, 2, NULL),
       (7, 'Miss Dior', 135, 18, 'Female', 'miss_dior.jpg', 'Elegant floral bouquet', 2, 1, NULL),
       (8, 'Gucci Guilty', 145, 10, 'Unisex', 'gucci_guilty.jpg', 'Warm citrus blend', 3, 3, NULL),
       (9, 'Tom Ford Tobacco Vanille', 275, 7, 'Unisex', 'tom_ford_tobacco.jpg', 'Sweet oriental scent', 4, 4, NULL),
       (10, 'YSL La Nuit de L Homme', 125, 13, 'Male', 'ysl_lanuit.jpg', 'Spicy woody fragrance', 5, 2, NULL),
       (11, 'Chanel Coco Mademoiselle', 155, 11, 'Female', 'coco_mademoiselle.jpg', 'Fresh floral citrus scent', 1, 1,
        NULL),
       (12, 'Dior Homme', 140, 9, 'Male', 'dior_homme.jpg', 'Powdery woody fragrance', 2, 2, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `perfume_concentration`
--

CREATE TABLE `perfume_concentration`
(
    `perfume_id`       int(11) DEFAULT NULL,
    `concentration_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `perfume_concentration` (`perfume_id`, `concentration_id`)
VALUES (1, 1),
       (1, 2),
       (2, 1),
       (2, 3),
       (3, 2),
       (3, 4),
       (4, 1),
       (4, 5),
       (5, 3),
       (5, 4),
       (6, 2),
       (6, 5),
       (7, 1),
       (7, 3),
       (8, 2),
       (8, 4),
       (9, 1),
       (9, 5),
       (10, 3),
       (10, 4),
       (11, 2),
       (11, 5),
       (12, 1),
       (12, 3);
--
-- Cấu trúc bảng cho bảng `perfume_notes`
--

CREATE TABLE `perfume_notes`
(
    `perfume_id` int(11) NOT NULL,
    `note_id`    int(11) NOT NULL,
    `type`       varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `perfume_notes` (`perfume_id`, `note_id`, `type`)
VALUES (1, 1, 'top'),
       (1, 5, 'middle'),
       (1, 10, 'base'),
       (2, 2, 'top'),
       (2, 6, 'middle'),
       (2, 11, 'base'),
       (3, 3, 'top'),
       (3, 7, 'middle'),
       (3, 12, 'base'),
       (4, 4, 'top'),
       (4, 8, 'middle'),
       (4, 13, 'base'),
       (5, 5, 'top'),
       (5, 9, 'middle'),
       (5, 14, 'base'),
       (6, 6, 'top'),
       (6, 10, 'middle'),
       (6, 15, 'base'),
       (7, 7, 'top'),
       (7, 11, 'middle'),
       (7, 16, 'base'),
       (8, 8, 'top'),
       (8, 12, 'middle'),
       (8, 17, 'base'),
       (9, 9, 'top'),
       (9, 13, 'middle'),
       (9, 18, 'base'),
       (10, 10, 'top'),
       (10, 14, 'middle'),
       (10, 19, 'base'),
       (11, 11, 'top'),
       (11, 15, 'middle'),
       (11, 20, 'base'),
       (12, 12, 'top'),
       (12, 16, 'middle'),
       (12, 1, 'base');
--
-- Cấu trúc bảng cho bảng `perfume_volume`
--

CREATE TABLE `perfume_volume`
(
    `perfume_id` int(11) DEFAULT NULL,
    `volume_id`  int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `perfume_volume`
--

INSERT INTO `perfume_volume` (`perfume_id`, `volume_id`)
VALUES (1, 1),
       (1, 2),
       (2, 1),
       (2, 3),
       (3, 2),
       (3, 4),
       (4, 3),
       (4, 5),
       (5, 1),
       (5, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `promotion`
--

CREATE TABLE `promotion`
(
    `id`         int(11) NOT NULL,
    `name`       varchar(255) DEFAULT NULL,
    `discount_percent` double DEFAULT NULL,
    `start_date` datetime     DEFAULT NULL,
    `end_date`   datetime     DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `promotion` (`id`, `name`, `discount_percent`, `start_date`, `end_date`)
VALUES (1, 'Spring Fragrance Sale', 10, '2025-03-01 00:00:00', '2025-03-10 23:59:59'),
       (2, 'Women’s Day Special', 20, '2025-03-08 00:00:00', '2025-03-08 23:59:59'),
       (3, 'VIP Member Discount', 15, '2025-03-15 00:00:00', '2025-03-31 23:59:59'),
       (4, 'April Fool’s Surprise', 5, '2025-04-01 00:00:00', '2025-04-01 23:59:59'),
       (5, 'Summer Fresh Event', 12, '2025-06-01 00:00:00', '2025-06-15 23:59:59'),
       (6, 'Mid-Year Sale', 25, '2025-06-20 00:00:00', '2025-06-30 23:59:59'),
       (7, 'Back to School', 8, '2025-08-15 00:00:00', '2025-08-31 23:59:59'),
       (8, 'Halloween Fragrance Fest', 18, '2025-10-25 00:00:00', '2025-10-31 23:59:59'),
       (9, 'Black Friday Mega Sale', 30, '2025-11-29 00:00:00', '2025-11-29 23:59:59'),
       (10, 'Christmas Special', 20, '2025-12-20 00:00:00', '2025-12-25 23:59:59');

--
-- Cấu trúc bảng cho bảng `role`
--

CREATE TABLE `role`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `role` (`id`, `name`)
VALUES (1, 'Quản lý sản phẩm'),
       (2, 'Quản lý hóa đơn'),
       (3, 'Quản lý khách hàng'),
       (4, 'Quản lý nhân viên'),
       (5, 'Quản lý khuyến mãi'),
       (6, 'Quản lý nhập hàng');

--
-- Cấu trúc bảng cho bảng `rolegroup`
--

CREATE TABLE `rolegroup`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `rolegroup`
--

INSERT INTO `rolegroup` (`id`, `name`)
VALUES (1, 'Admin'),
       (2, 'Nhân viên bán hàng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `role_rolegroup`
--

CREATE TABLE `role_rolegroup`
(
    `role_id`      int(11) DEFAULT NULL,
    `rolegroup_id` int(11) DEFAULT NULL,
    `status`       tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
INSERT INTO `role_rolegroup` (`role_id`, `rolegroup_id`, `status`)
VALUES (1, 1, 1), -- Admin có quyền quản lý sản phẩm
       (2, 1, 1), -- Admin có quyền quản lý hóa đơn
       (3, 1, 1), -- Admin có quyền quản lý khách hàng
       (4, 1, 1), -- Admin có quyền quản lý nhân viên
       (5, 1, 1), -- Admin có quyền quản lý khuyến mãi
       (6, 1, 1), -- Admin có quyền quản lý nhập hàng
       (2, 2, 1), -- Nhân viên bán hàng có quyền quản lý hóa đơn
       (3, 2, 1);
-- Nhân viên bán hàng có quyền quản lý khách hàng

--
-- Cấu trúc bảng cho bảng `scenttype`
--

CREATE TABLE `scenttype`
(
    `id`        int(11) NOT NULL,
    `type_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `scenttype`
--

INSERT INTO `scenttype` (`id`, `type_name`)
VALUES (1, 'Floral'),
       (2, 'Woody'),
       (3, 'Citrus'),
       (4, 'Oriental'),
       (5, 'Fruity');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `supplier`
--

CREATE TABLE `supplier`
(
    `id`    int(11) NOT NULL,
    `name`  varchar(255) DEFAULT NULL,
    `phone` varchar(20)  DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `supplier`
--

INSERT INTO `supplier` (`id`, `name`, `phone`, `email`)
VALUES (1, 'Perfume Supply Co.', '123-456-7890', 'contact@perfumeco.com'),
       (2, 'Luxury Scents Ltd.', '987-654-3210', 'info@luxuryscents.com'),
       (3, 'Fragrance World', '555-123-4567', 'support@fragranceworld.com'),
       (4, 'Elite Aromas', '444-987-6543', 'sales@elitearomas.com'),
       (5, 'Global Perfumes', '333-567-8901', 'service@globalperfumes.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `volume`
--

CREATE TABLE `volume`
(
    `id`   int(11) NOT NULL,
    `size` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `volume`
--

INSERT INTO `volume` (`id`, `size`)
VALUES (1, 50),
       (2, 100),
       (3, 150),
       (4, 200),
       (5, 250);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `brand`
--
ALTER TABLE `brand`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `concentration`
--
ALTER TABLE `concentration`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `customer`
--
ALTER TABLE `customer`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `employee`
--
ALTER TABLE `employee`
    ADD PRIMARY KEY (`id`),
  ADD KEY `rolegroup_id` (`rolegroup_id`);

--
-- Chỉ mục cho bảng `importreceipt`
--
ALTER TABLE `importreceipt`
    ADD PRIMARY KEY (`id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Chỉ mục cho bảng `importreceiptdetail`
--
ALTER TABLE `importreceiptdetail`
    ADD PRIMARY KEY (`import_receipt_id`, `perfume_id`),
  ADD KEY `perfume_id` (`perfume_id`);

--
-- Chỉ mục cho bảng `invoice`
--
ALTER TABLE `invoice`
    ADD PRIMARY KEY (`id`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Chỉ mục cho bảng `invoicedetail`
--
ALTER TABLE `invoicedetail`
    ADD PRIMARY KEY (`invoice_id`, `perfume_id`),
  ADD KEY `perfume_id` (`perfume_id`);

--
-- Chỉ mục cho bảng `notes`
--
ALTER TABLE `notes`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `perfume`
--
ALTER TABLE `perfume`
    ADD PRIMARY KEY (`id`),
  ADD KEY `brand_id` (`brand_id`),
  ADD KEY `scent_type_id` (`scent_type_id`),
  ADD KEY `promotion_id` (`promotion_id`);

--
-- Chỉ mục cho bảng `perfume_concentration`
--
ALTER TABLE `perfume_concentration`
    ADD UNIQUE KEY `Perfume_Concentration_index_1` (`perfume_id`,`concentration_id`),
    ADD KEY `concentration_id` (`concentration_id`);

--
-- Chỉ mục cho bảng `perfume_notes`
--
ALTER TABLE `perfume_notes`
    ADD PRIMARY KEY (`perfume_id`, `note_id`),
  ADD KEY `note_id` (`note_id`);

--
-- Chỉ mục cho bảng `perfume_volume`
--
ALTER TABLE `perfume_volume`
    ADD UNIQUE KEY `Perfume_Volume_index_0` (`perfume_id`,`volume_id`),
    ADD KEY `volume_id` (`volume_id`);

--
-- Chỉ mục cho bảng `promotion`
--
ALTER TABLE `promotion`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `role`
--
ALTER TABLE `role`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `rolegroup`
--
ALTER TABLE `rolegroup`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `role_rolegroup`
--
ALTER TABLE `role_rolegroup`
    ADD UNIQUE KEY `Role_RoleGroup_index_2` (`role_id`,`rolegroup_id`),
    ADD KEY `rolegroup_id` (`rolegroup_id`);

--
-- Chỉ mục cho bảng `scenttype`
--
ALTER TABLE `scenttype`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `supplier`
--
ALTER TABLE `supplier`
    ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `volume`
--
ALTER TABLE `volume`
    ADD PRIMARY KEY (`id`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `employee`
--
ALTER TABLE `employee`
    ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`rolegroup_id`) REFERENCES `rolegroup` (`id`);

--
-- Các ràng buộc cho bảng `importreceipt`
--
ALTER TABLE `importreceipt`
    ADD CONSTRAINT `importreceipt_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`);

--
-- Các ràng buộc cho bảng `importreceiptdetail`
--
ALTER TABLE `importreceiptdetail`
    ADD CONSTRAINT `importreceiptdetail_ibfk_1` FOREIGN KEY (`import_receipt_id`) REFERENCES `importreceipt` (`id`),
  ADD CONSTRAINT `importreceiptdetail_ibfk_2` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`);

--
-- Các ràng buộc cho bảng `invoice`
--
ALTER TABLE `invoice`
    ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);

--
-- Các ràng buộc cho bảng `invoicedetail`
--
ALTER TABLE `invoicedetail`
    ADD CONSTRAINT `invoicedetail_ibfk_1` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`id`),
  ADD CONSTRAINT `invoicedetail_ibfk_2` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`);

--
-- Các ràng buộc cho bảng `perfume`
--
ALTER TABLE `perfume`
    ADD CONSTRAINT `perfume_ibfk_1` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`),
  ADD CONSTRAINT `perfume_ibfk_2` FOREIGN KEY (`scent_type_id`) REFERENCES `scenttype` (`id`),
  ADD CONSTRAINT `perfume_ibfk_3` FOREIGN KEY (`promotion_id`) REFERENCES `promotion` (`id`);

--
-- Các ràng buộc cho bảng `perfume_concentration`
--
ALTER TABLE `perfume_concentration`
    ADD CONSTRAINT `perfume_concentration_ibfk_1` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`),
  ADD CONSTRAINT `perfume_concentration_ibfk_2` FOREIGN KEY (`concentration_id`) REFERENCES `concentration` (`id`);

--
-- Các ràng buộc cho bảng `perfume_notes`
--
ALTER TABLE `perfume_notes`
    ADD CONSTRAINT `perfume_notes_ibfk_1` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`),
  ADD CONSTRAINT `perfume_notes_ibfk_2` FOREIGN KEY (`note_id`) REFERENCES `notes` (`id`);

--
-- Các ràng buộc cho bảng `perfume_volume`
--
ALTER TABLE `perfume_volume`
    ADD CONSTRAINT `perfume_volume_ibfk_1` FOREIGN KEY (`perfume_id`) REFERENCES `perfume` (`id`),
  ADD CONSTRAINT `perfume_volume_ibfk_2` FOREIGN KEY (`volume_id`) REFERENCES `volume` (`id`);

--
-- Các ràng buộc cho bảng `role_rolegroup`
--
ALTER TABLE `role_rolegroup`
    ADD CONSTRAINT `role_rolegroup_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  ADD CONSTRAINT `role_rolegroup_ibfk_2` FOREIGN KEY (`rolegroup_id`) REFERENCES `rolegroup` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
