-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1:2016
-- Время создания: Окт 03 2018 г., 09:05
-- Версия сервера: 10.1.10-MariaDB
-- Версия PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `danilevichbooking`
--

-- --------------------------------------------------------

--
-- Структура таблицы `apartment`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`apartment` (
  `id` int(11) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `description` varchar(250) DEFAULT NULL,
  `roomSize` double DEFAULT NULL,
  `countGuest` int(11) DEFAULT NULL,
  `price` double NOT NULL,
  `hotelId` int(11) NOT NULL,
  `nameEn` varchar(60) NOT NULL,
  `descriptionEn` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `apartment`
--

INSERT INTO `danilevichbooking`.`apartment` (`id`, `name`, `description`, `roomSize`, `countGuest`, `price`, `hotelId`, `nameEn`, `descriptionEn`) VALUES
(12, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 68, '2-bed room', 'Funny room with everything you need'),
(19, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 68, ' 3-bed room', 'Funny room with everything you need'),
(20, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 68, '1-bed room', 'Funny room with everything you need'),
(21, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 1, '2-bed room', 'Funny room with everything you need'),
(22, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 1, ' 3-bed room', 'Funny room with everything you need'),
(23, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 1, '1-bed room', 'Funny room with everything you need'),
(24, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 2, '1-bed room', 'Funny room with everything you need'),
(25, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 2, ' 3-bed room', 'Funny room with everything you need'),
(26, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 2, '1-bed room', 'Funny room with everything you need'),
(27, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 3, '1-bed room', 'Funny room with everything you need'),
(28, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 3, ' 3-bed room', 'Funny room with everything you need'),
(29, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 3, '1-bed room', 'Funny room with everything you need'),
(30, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 4, '2-bed room', 'Funny room with everything you need'),
(31, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 4, ' 3-bed room', 'Funny room with everything you need'),
(32, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 4, '1-bed room', 'Funny room with everything you need'),
(33, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 5, '2-bed room', 'Funny room with everything you need'),
(34, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 5, ' 3-bed room', 'Funny room with everything you need'),
(35, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 5, '1-bed room', 'Funny room with everything you need'),
(36, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 6, '2-bed room', 'Funny room with everything you need'),
(37, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 6, ' 3-bed room', 'Funny room with everything you need'),
(38, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 6, '1-bed room', 'Funny room with everything you need'),
(39, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 69, '2-bed room', 'Funny room with everything you need'),
(40, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 69, ' 3-bed room', 'Funny room with everything you need'),
(41, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 69, '1-bed room', 'Funny room with everything you need'),
(42, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 78, '2-bed room', 'Funny room with everything you need'),
(43, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 78, ' 3-bed room', 'Funny room with everything you need'),
(44, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 78, '1-bed room', 'Funny room with everything you need'),
(45, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 79, '2-bed room', 'Funny room with everything you need'),
(46, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 79, ' 3-bed room', 'Funny room with everything you need'),
(47, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 79, '1-bed room', 'Funny room with everything you need'),
(48, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 80, '1-bed room', 'Funny room with everything you need'),
(49, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 80, ' 3-bed room', 'Funny room with everything you need'),
(50, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 80, '1-bed room', 'Funny room with everything you need'),
(51, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 81, '1-bed room', 'Funny room with everything you need'),
(52, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 82, '2-bed room', 'Funny room with everything you need'),
(53, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 82, ' 3-bed room', 'Funny room with everything you need'),
(54, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 86, '1-bed room', 'Funny room with everything you need'),
(55, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 86, '1-bed room', 'Funny room with everything you need'),
(56, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 87, ' 3-bed room', 'Funny room with everything you need'),
(57, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 87, '1-bed room', 'Funny room with everything you need'),
(58, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 88, '1-bed room', 'Funny room with everything you need'),
(59, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 88, '2-bed room', 'Funny room with everything you need'),
(60, '3-eх местный номер', 'Уютный номер со всем необходимым', 35, 3, 75, 89, ' 3-bed room', 'Funny room with everything you need'),
(61, 'Одно местный номер', 'Уютный номер со всем необходимым', 16, 1, 45, 89, '1-bed room', 'Funny room with everything you need'),
(62, '2-ух местный номер', 'Уютный номер со всем необходимым', 23.6, 2, 60, 90, '2-bed room', 'Funny room with everything you need');

-- --------------------------------------------------------

--
-- Структура таблицы `apartmentfacility`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`apartmentfacility` (
  `id` int(11) NOT NULL,
  `facilityId` int(11) NOT NULL,
  `apartmentId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `apartmentfacility`
--

INSERT INTO `danilevichbooking`.`apartmentfacility` (`id`, `facilityId`, `apartmentId`) VALUES
(7, 5, 12),
(8, 5, 19),
(9, 5, 20),
(10, 5, 21),
(11, 5, 22),
(12, 5, 23),
(13, 5, 24),
(14, 5, 25),
(15, 5, 26),
(16, 5, 27),
(17, 5, 28),
(18, 5, 29),
(19, 5, 30),
(20, 5, 31),
(21, 5, 32),
(22, 5, 33),
(23, 5, 34),
(24, 5, 35),
(25, 5, 36),
(26, 5, 37),
(27, 5, 38),
(28, 5, 39),
(29, 5, 40),
(30, 5, 41),
(31, 5, 42),
(32, 5, 43),
(33, 5, 44),
(34, 5, 45),
(35, 5, 46),
(36, 5, 47),
(37, 5, 48),
(38, 5, 49),
(39, 5, 50),
(40, 5, 51),
(41, 5, 52),
(42, 5, 53),
(43, 5, 54),
(44, 5, 55),
(45, 5, 56),
(46, 5, 57),
(47, 5, 58),
(48, 5, 59),
(49, 5, 60),
(50, 5, 61),
(51, 5, 62),
(52, 6, 12),
(53, 6, 19),
(54, 6, 20),
(55, 6, 21),
(56, 6, 22),
(57, 6, 23),
(58, 6, 24),
(59, 6, 25),
(60, 6, 26),
(61, 6, 27),
(62, 6, 28),
(63, 6, 29),
(64, 6, 30),
(65, 6, 31),
(66, 6, 32),
(67, 6, 33),
(68, 6, 34),
(69, 6, 35),
(70, 6, 36),
(71, 6, 37),
(72, 6, 38),
(73, 6, 39),
(74, 6, 40),
(75, 6, 41),
(76, 6, 42),
(77, 6, 43),
(78, 6, 44),
(79, 6, 45),
(80, 6, 46),
(81, 6, 47),
(82, 6, 48),
(83, 6, 49),
(84, 6, 50),
(85, 6, 51),
(86, 6, 52),
(87, 6, 53),
(88, 6, 54),
(89, 6, 55),
(90, 6, 56),
(91, 6, 57),
(92, 6, 58),
(93, 6, 59),
(94, 6, 60),
(95, 6, 61),
(96, 6, 62),
(97, 7, 12),
(103, 7, 24),
(107, 7, 28),
(108, 7, 29),
(111, 7, 32),
(112, 7, 33),
(113, 7, 34),
(114, 7, 35),
(115, 7, 36),
(116, 7, 37),
(117, 7, 38),
(118, 7, 39),
(119, 7, 40),
(120, 7, 41),
(121, 7, 42),
(122, 7, 43),
(123, 7, 44),
(124, 7, 45),
(125, 7, 46),
(126, 7, 47),
(127, 7, 48),
(128, 7, 49),
(129, 7, 50),
(130, 7, 51),
(131, 7, 52),
(132, 7, 53),
(133, 7, 54),
(134, 7, 55),
(135, 7, 56),
(136, 7, 57),
(137, 7, 58),
(138, 7, 59),
(139, 7, 60),
(140, 7, 61),
(141, 7, 62),
(142, 8, 12),
(143, 8, 19),
(144, 8, 20),
(145, 8, 21),
(146, 8, 22),
(147, 8, 23),
(148, 8, 24),
(149, 8, 25),
(150, 8, 26),
(151, 8, 27),
(152, 8, 28),
(153, 8, 29),
(154, 8, 30),
(155, 8, 31),
(156, 8, 32),
(157, 8, 33),
(158, 8, 34),
(159, 8, 35),
(160, 8, 36),
(161, 8, 37),
(162, 8, 38),
(163, 8, 39),
(164, 8, 40),
(165, 8, 41),
(166, 8, 42),
(167, 8, 43),
(168, 8, 44),
(169, 8, 45),
(170, 8, 46),
(171, 8, 47),
(172, 8, 48),
(173, 8, 49),
(174, 8, 50),
(175, 8, 51),
(176, 8, 52),
(177, 8, 53),
(178, 8, 54),
(179, 8, 55),
(180, 8, 56),
(181, 8, 57),
(182, 8, 58),
(183, 8, 59),
(184, 8, 60),
(185, 8, 61),
(186, 8, 62),
(187, 9, 12),
(188, 9, 19),
(189, 9, 20),
(190, 9, 21),
(191, 9, 22),
(192, 9, 23),
(193, 9, 24),
(194, 9, 25),
(195, 9, 26),
(196, 9, 27),
(197, 9, 28),
(198, 9, 29),
(199, 9, 30),
(200, 9, 31),
(201, 9, 32),
(202, 9, 33),
(203, 9, 34),
(204, 9, 35),
(205, 9, 36),
(206, 9, 37),
(207, 9, 38),
(208, 9, 39),
(209, 9, 40),
(210, 9, 41),
(211, 9, 42),
(212, 9, 43),
(213, 9, 44),
(214, 9, 45),
(215, 9, 46),
(216, 9, 47),
(217, 9, 48),
(218, 9, 49),
(219, 9, 50),
(220, 9, 51),
(221, 9, 52),
(222, 9, 53),
(223, 9, 54),
(224, 9, 55),
(225, 9, 56),
(226, 9, 57),
(227, 9, 58),
(228, 9, 59),
(229, 9, 60),
(230, 9, 61),
(231, 9, 62),
(232, 10, 12),
(233, 10, 19),
(234, 10, 20),
(235, 10, 21),
(236, 10, 22),
(237, 10, 23),
(238, 10, 24),
(239, 10, 25),
(240, 10, 26),
(241, 10, 27),
(242, 10, 28),
(243, 10, 29),
(244, 10, 30),
(245, 10, 31),
(246, 10, 32),
(247, 10, 33),
(248, 10, 34),
(249, 10, 35),
(250, 10, 36),
(251, 10, 37),
(252, 10, 38),
(253, 10, 39),
(254, 10, 40),
(255, 10, 41),
(256, 10, 42),
(257, 10, 43),
(258, 10, 44),
(259, 10, 45),
(260, 10, 46),
(261, 10, 47),
(262, 10, 48),
(263, 10, 49),
(264, 10, 50),
(265, 10, 51),
(266, 10, 52),
(267, 10, 53),
(268, 10, 54),
(269, 10, 55),
(270, 10, 56),
(271, 10, 57),
(272, 10, 58),
(273, 10, 59),
(274, 10, 60),
(275, 10, 61),
(276, 10, 62),
(277, 11, 12),
(278, 11, 19),
(279, 11, 20),
(280, 11, 21),
(281, 11, 22),
(282, 11, 23),
(283, 11, 24),
(284, 11, 25),
(285, 11, 26),
(286, 11, 27),
(287, 11, 28),
(288, 11, 29),
(289, 11, 30),
(290, 11, 31),
(291, 11, 32),
(292, 11, 33),
(293, 11, 34),
(294, 11, 35),
(295, 11, 36),
(296, 11, 37),
(297, 11, 38),
(298, 11, 39),
(299, 11, 40),
(300, 11, 41),
(301, 11, 42),
(302, 11, 43),
(303, 11, 44),
(304, 11, 45),
(305, 11, 46),
(306, 11, 47),
(307, 11, 48),
(308, 11, 49),
(309, 11, 50),
(310, 11, 51),
(311, 11, 52),
(312, 11, 53),
(313, 11, 54),
(314, 11, 55),
(315, 11, 56),
(316, 11, 57),
(317, 11, 58),
(318, 11, 59),
(319, 11, 60),
(320, 11, 61),
(321, 11, 62),
(322, 12, 12),
(323, 12, 19),
(324, 12, 20),
(325, 12, 21),
(326, 12, 22),
(327, 12, 23),
(328, 12, 24),
(329, 12, 25),
(330, 12, 26),
(331, 12, 27),
(332, 12, 28),
(333, 12, 29),
(334, 12, 30),
(335, 12, 31),
(336, 12, 32),
(337, 12, 33),
(338, 12, 34),
(339, 12, 35),
(340, 12, 36),
(341, 12, 37),
(342, 12, 38),
(343, 12, 39),
(344, 12, 40),
(345, 12, 41),
(346, 12, 42),
(347, 12, 43),
(348, 12, 44),
(349, 12, 45),
(350, 12, 46),
(351, 12, 47),
(352, 12, 48),
(353, 12, 49),
(354, 12, 50),
(355, 12, 51),
(356, 12, 52),
(357, 12, 53),
(358, 12, 54),
(359, 12, 55),
(360, 12, 56),
(361, 12, 57),
(362, 12, 58),
(363, 12, 59),
(364, 12, 60),
(365, 12, 61),
(366, 12, 62),
(367, 13, 12),
(368, 13, 19),
(369, 13, 20),
(370, 13, 21),
(371, 13, 22),
(372, 13, 23),
(373, 13, 24),
(374, 13, 25),
(375, 13, 26),
(376, 13, 27),
(377, 13, 28),
(378, 13, 29),
(379, 13, 30),
(380, 13, 31),
(381, 13, 32),
(382, 13, 33),
(383, 13, 34),
(384, 13, 35),
(385, 13, 36),
(386, 13, 37),
(387, 13, 38),
(388, 13, 39),
(389, 13, 40),
(390, 13, 41),
(391, 13, 42),
(392, 13, 43),
(393, 13, 44),
(394, 13, 45),
(395, 13, 46),
(396, 13, 47),
(397, 13, 48),
(398, 13, 49),
(402, 13, 53),
(403, 13, 54),
(404, 13, 55),
(406, 13, 57),
(409, 13, 60),
(411, 13, 62),
(412, 14, 12),
(413, 14, 19),
(414, 14, 20),
(415, 14, 21),
(416, 14, 22),
(417, 14, 23),
(418, 14, 24),
(419, 14, 25),
(420, 14, 26),
(421, 14, 27),
(422, 14, 28),
(423, 14, 29),
(424, 14, 30),
(425, 14, 31),
(426, 14, 32),
(427, 14, 33),
(428, 14, 34),
(429, 14, 35),
(430, 14, 36),
(431, 14, 37),
(432, 14, 38),
(433, 14, 39),
(434, 14, 40),
(435, 14, 41),
(436, 14, 42),
(437, 14, 43),
(438, 14, 44),
(439, 14, 45),
(440, 14, 46),
(441, 14, 47),
(442, 14, 48),
(443, 14, 49),
(444, 14, 50),
(445, 14, 51),
(446, 14, 52),
(447, 14, 53),
(448, 14, 54),
(449, 14, 55),
(450, 14, 56),
(451, 14, 57),
(452, 14, 58),
(453, 14, 59),
(454, 14, 60),
(455, 14, 61),
(456, 14, 62),
(457, 15, 12),
(458, 15, 19),
(459, 15, 20),
(460, 15, 21),
(461, 15, 22),
(462, 15, 23),
(463, 15, 24),
(464, 15, 25),
(465, 15, 26),
(466, 15, 27),
(467, 15, 28),
(468, 15, 29),
(469, 15, 30),
(470, 15, 31),
(471, 15, 32),
(472, 15, 33),
(473, 15, 34),
(474, 15, 35),
(475, 15, 36),
(476, 15, 37),
(477, 15, 38),
(478, 15, 39),
(479, 15, 40),
(480, 15, 41),
(481, 15, 42),
(482, 15, 43),
(483, 15, 44),
(484, 15, 45),
(485, 15, 46),
(486, 15, 47),
(487, 15, 48),
(488, 15, 49),
(489, 15, 50),
(490, 15, 51),
(491, 15, 52),
(492, 15, 53),
(493, 15, 54),
(494, 15, 55),
(495, 15, 56),
(496, 15, 57),
(497, 15, 58),
(498, 15, 59),
(499, 15, 60),
(500, 15, 61),
(501, 15, 62),
(502, 16, 12),
(503, 16, 19),
(504, 16, 20),
(505, 16, 21),
(506, 16, 22),
(507, 16, 23),
(508, 16, 24),
(509, 16, 25),
(510, 16, 26),
(511, 16, 27),
(512, 16, 28),
(513, 16, 29),
(514, 16, 30),
(515, 16, 31),
(516, 16, 32),
(517, 16, 33),
(518, 16, 34),
(519, 16, 35),
(520, 16, 36),
(521, 16, 37),
(522, 16, 38),
(523, 16, 39),
(524, 16, 40),
(525, 16, 41),
(526, 16, 42),
(527, 16, 43),
(528, 16, 44),
(529, 16, 45),
(530, 16, 46),
(531, 16, 47),
(532, 16, 48),
(533, 16, 49),
(534, 16, 50),
(535, 16, 51),
(536, 16, 52),
(537, 16, 53),
(538, 16, 54),
(539, 16, 55),
(540, 16, 56),
(541, 16, 57),
(542, 16, 58),
(543, 16, 59),
(544, 16, 60),
(545, 16, 61),
(546, 16, 62);

-- --------------------------------------------------------

--
-- Структура таблицы `city`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`city` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `countryId` int(11) NOT NULL,
  `nameEn` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `city`
--

INSERT INTO `danilevichbooking`.`city` (`id`, `name`, `countryId`, `nameEn`) VALUES
(1, 'Минск', 2, 'Minsk'),
(23, 'Буковель', 52, 'Bukovel'),
(24, 'Гродно', 2, 'Grodno'),
(25, 'Брест', 2, 'Brest'),
(26, 'Киев', 52, 'Kiev'),
(27, 'Одесса', 52, 'Odessa'),
(28, 'Москва', 1, 'Moscow'),
(29, 'Калининград', 1, 'Kaliningrad');

-- --------------------------------------------------------

--
-- Структура таблицы `country`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`country` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `nameEn` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `country`
--

INSERT INTO `danilevichbooking`.`country` (`id`, `name`, `nameEn`) VALUES
(1, 'Россия', 'Russia'),
(2, 'Беларусь', 'Belarus'),
(52, 'Украина', 'Ukraine');

-- --------------------------------------------------------

--
-- Структура таблицы `facility`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`facility` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `nameEn` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `facility`
--

INSERT INTO `danilevichbooking`.`facility` (`id`, `name`, `nameEn`) VALUES
(5, 'Wi-Fi', 'Wi-Fi'),
(6, 'Утюг', 'Iron'),
(7, 'Бассейн', 'Swimming pool'),
(8, 'Крытый плавательный бассейн', ' Indoor swimming pool'),
(9, 'Бесплатная парковка', ' Free Parking'),
(10, 'Семейные номера', 'Family Rooms'),
(11, 'Ресторан', 'Restaurant'),
(12, 'Бар', 'Bar'),
(13, 'Допускается размещение домашних животных', 'Pets allowed'),
(14, 'Доставка еды и напитков в номер', 'Room Service'),
(15, 'Фен', 'Hair dryer'),
(16, 'Электрический чайник', 'Electric kettle');

-- --------------------------------------------------------

--
-- Структура таблицы `hotel`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`hotel` (
  `id` int(11) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `nameEn` varchar(60) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `addressEn` varchar(100) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `descriptionEn` varchar(250) NOT NULL,
  `cityId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `hotel`
--

INSERT INTO `danilevichbooking`.`hotel` (`id`, `name`, `nameEn`, `address`, `addressEn`, `description`, `descriptionEn`, `cityId`) VALUES
(1, 'Korali', 'Korali', '270 Svobody str., Яремча, 78500, Украина –', '270 Svobody str., Yaremche, 78500, Ukraine ', 'Комплекс апартаментов «Корали» находится на курорте Яремче, в 40 км от курорта Буковель', 'Korali offers accommodation in Yaremche. Bukovel is 40 km from the property. ', 23),
(2, 'Charda', 'Charda', 'Uchastok Staishche 280, Буковель, 78593, Украина', 'Uchastok Staishche 280, Bukovel, 78593, Ukraine ', 'Отель Charda с рестораном украинской кухни и пунктом проката лыжного снаряжения расположен в центре поселка Поляница, в 2 км от Буковеля. ', 'Featuring an on-site restaurant serving Ukrainian cuisine and a ski equipment rental shop, Charda is located in the centre of Polyanitsya villiage, 2 km from Bukovel, and offers guests free Wi-Fi access and free private parking.', 23),
(3, 'Магия Карпат', 'The Magic Carpathian ', 'Горнолыжный курорт Буковель, Буковель, 77221, Украина', 'Ski Resort Bukovel, Bukovel, 77221, Ukraine', 'Отель «Магия Карпат» находится в центре горнолыжного курорта Буковель. К услугам гостей элегантные номера с бесплатным Wi-Fi, сауна, большой ресторан и круглосуточная стойка регистрации.', 'Situated in the heart of the Bukovel Ski Resort, The Magic Carpathian hotel features elegant rooms with free Wi-Fi. The hotel offers a sauna, a large restaurant and a 24-hour reception.', 23),
(4, 'Отель Верховина ', 'Hotel Verhovina', 'Улица Петропавловская 24, Петропавловская Борщаговка, Киев, 08130, Украина', 'Petropavlivs''ka Street 24, Petropavlivs''ka Borshchahivka, Kiev, 08130, Ukraine', 'Отель расположен в Киеве, в 7 минутах езды от станции метро «Житомирская». К услугам гостей ресторан с террасой, бесплатный Wi-Fi, а также номера с кондиционером и телевизором с плоским экраном.', 'Featuring free Wi-Fi and a restaurant with a terrace, this hotel is 7 minutes’ drive from Zhitomirskaya Metro Station in Kiev. It offers air-conditioned rooms with a flat-screen TV.', 26),
(5, 'Гостиничный Комплекс Турист', 'Tourist Hotel Complex', 'Улица Р. Окипной 2, Киев, 02002, Украина ', 'R. Okipnoi Street 2, Kiev, 02002, Ukraine', 'До пляжа можно дойти всего за 9 минут. Этот современный 3-звездочный отель находится в Киеве, рядом со станцией метро «Левобережная». ', 'This property is 9 minutes walk from the beach. Located beside Livoberezhna Metro Station in Kiev, this modern, 3-star hotel offers 2 international restaurants, and a 24-hour reception.', 26),
(6, 'Гостиница Море', 'Hotel Sea', 'Улица Р. Окипной 2, одесса, 02002, Украина ', 'R. Okipnoi Street 2, Odessa, 02002, Ukraine', 'До пляжа можно дойти всего за 9 минут. Этот современный 3-звездочный отель находится в Одессе. ', 'This property is 9 minutes walk from the beach. ', 27),
(68, 'Гостиница Орбита', 'Orbita Hotel', 'пр. Пушкина 39, 220092 Минск, Беларусь', 'Pr. Pushkina 39, 220092 Minsk, Belarus', 'Гостиница «Орбита» расположена в Минске, в 50 м от станции метро «Пушкинская». В отеле работают кафе-пиццерия, бар. Гости могут воспользоваться бесплатным Wi-Fi и бесплатной парковкой..', 'Located in Minsk, 50 m from Pushkinskaya Metro Station, Orbita Hotel features a cafe-pizzeria, a bar. Free WIFi and free parking are offered.', 1),
(69, 'Green City Hotel', 'Green City Hotel', 'Pritytskogo 156, Фрунзенский район, 220017 Минск, Беларусь', 'Pritytskogo 156, Frunzensky District, 220017 Minsk, Belarus', 'Отель Green City расположен в Минске. К услугам гостей бесплатный Wi-Fi и бесплатная парковка.', 'Located in Minsk, Green City Hotel offers free WiFi and free parking.', 1),
(78, 'Президент-Отель', 'President Hotel', 'Улица Кирова 18, Ленинский район, 220030 Минск, Беларусь', 'Kirova Street 18, Leninsky District, 220030 Minsk, Belarus', 'Отель «Президент-отель» расположен в самом центре Минска, всего в 5 минутах ходьбы от Октябрьской площади. К услугам гостей бесплатный фитнес-центр, крытый бассейн и бесплатный Wi-Fi. Прогулка до площади Независимости занимает 15 минут.', 'This hotel is located in the heart of Minsk, just a 5-minute walk from Oktyabrskaya Square. Free fitness centre, an indoor pool and free Wi-Fi are available at President Hotel. Nezavisimosti Square is a 15-minute walk away.', 1),
(79, 'Отель Семашко', 'Semashko Hotel', 'Улица Антонова 10, 230025 Гродно, Беларусь', 'Antonova Street 10, 230025 Grodno, Belarus ', 'Отель расположен в историческом центре города Гродно. К услугам гостей бесплатный плавательный бассейн, сауна, ресторан, бар, номера с бесплатным Wi-Fi, охраняемая парковка, парковка для велосипедов, банкомат и туристическое агентство.', 'Featuring free swimming pool and a sauna, this hotel is located in the historic centre of Grodno town. It also offers a restaurant, bar and rooms with free Wi-Fi. For guests convenience, there is a secured parking, ATM and travel agency on site.', 24),
(80, 'Отель Славия', 'Slavia Hotel', 'Улица Молодежная 1 , 230025 Гродно, Беларусь', 'Molodeznaya Street 1, 230025 Grodno, Belarus', 'В отеле «Славия», расположенном в центре города Гродно, рядом с Бригитским монастырем, к услугам гостей круглосуточная стойка регистрации, бесплатный WiFi и бесплатная парковка. Советская площадь находится в 5 минутах ходьбы.', 'Located in the city centre of Grodno, next to Brygids Monastery, Slavia Hotel features 24-hour front desk, free Wi-Fi and a free car park. Sovetskaya Square is a 5-minute walk away.', 24),
(81, 'Серебряный Талер', 'Serebryaniy Taler Hotel', 'ул. Красногвардейская, д.88б, 224024 Брест, Беларусь ', 'Krasnogvargeyskaya Street 88B, 224024 Brest, Belarus', 'Отель «Серебряный талер» расположен в 6,5 км от Брестской крепости в городе Брест. В отеле работают бар и ресторан. Гости могут воспользоваться бесплатным Wi-Fi. На территории обустроена бесплатная частная парковка.', 'Located 6.5 km from Brest Fortress in Brest, Serebryaniy Taler Hotel features a restaurant, bar and free WiFi. Free private parking is available on site.', 25),
(82, 'Cosmonauts Apartment ', 'Cosmonauts Apartment', 'Бульвар Космонавтов 40, 224000 Брест, Беларусь', 'Boulevard of Cosmonauts, 40, 224000 Brest, Belarus', 'Апартаменты Cosmonauts расположены в городе Брест, в 39 км от города Бяла-Подляска.', 'Located 39 km from Biała Podlaska, Cosmonauts Apartment offers accommodation in Brest.', 25),
(86, 'Отель Одесса', 'Hotel Odessa', 'Улица Петропавловская 24, Петропавловская Борщаговка, Одесса, 08130, Украина', 'Petropavlivs''ka Street 24, Petropavlivs''ka Borshchahivka, Odessa, 08130, Ukraine', 'Отель расположен в Одессе». К услугам гостей ресторан с террасой, бесплатный Wi-Fi, а также номера с кондиционером и телевизором с плоским экраном.', 'Featuring free Wi-Fi and a restaurant with a terrac. It offers air-conditioned rooms with a flat-screen TV.', 27),
(87, 'Серебряный Талер', 'Serebryaniy Taler Hotel', 'ул. Красногвардейская, д.88б, 224024 Москва Россия', 'Krasnogvargeyskaya Street 88B, 224024 Moscow Russia', 'Отель «Серебряный талер» расположен  городе Москва. В отеле работают бар и ресторан. Гости могут воспользоваться бесплатным Wi-Fi. На территории обустроена бесплатная частная парковка.', 'Located in Moscow, Serebryaniy Taler Hotel features a restaurant, bar and free WiFi. Free private parking is available on site.', 28),
(88, 'Cosmonauts Apartment ', 'Cosmonauts Apartment', 'Бульвар Космонавтов 40, 224000 Москва Россия', 'Boulevard of Cosmonauts, 40, 224000 Moscow Russia', 'Апартаменты Cosmonauts расположены в городе Москва', 'Cosmonauts Apartment offers accommodation in Moscow.', 28),
(89, 'Президент-Отель', 'President Hotel', 'Улица Кирова 18, Ленинский район, 220030 Россия, Калининград', 'Kirova Street 18, Leninsky District,  Russia Kaliningrad', 'Отель «Президент-отель» расположен в самом центре Калининграда, всего в 5 минутах ходьбы от Октябрьской площади. К услугам гостей бесплатный фитнес-центр, крытый бассейн и бесплатный Wi-Fi. Прогулка до площади Независимости занимает 15 минут.', 'This hotel is located in the heart of  Russia Kaliningrad, just a 5-minute walk from Oktyabrskaya Square. Free fitness centre, an indoor pool and free Wi-Fi are available at President Hotel. Nezavisimosti Square is a 15-minute walk away.', 29),
(90, 'Отель Семашко', 'Semashko Hotel', 'Улица Антонова 10, 230025 Россия, Калининград', 'Antonova Street 10, 230025 Russia Kaliningrad', 'Отель расположен в историческом центре города Калининграда. К услугам гостей бесплатный плавательный бассейн, сауна, ресторан, бар, номера с бесплатным Wi-Fi, охраняемая парковка, парковка для велосипедов, банкомат и туристическое агентство.', 'Featuring free swimming pool and a sauna, this hotel is located in the historic centre of Grodno town. It also offers a restaurant, bar and rooms with free Wi-Fi. For guests convenience, there is a secured parking, ATM and travel agency on site.', 29);

-- --------------------------------------------------------

--
-- Структура таблицы `order`
--

CREATE TABLE IF NOT EXISTS `danilevichbooking`.`order` (
  `id` int(11) NOT NULL,
  `beginDate` mediumtext,
  `endDate` mediumtext,
  `countDay` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `apartmentId` int(11) NOT NULL,
  `userId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE  IF NOT EXISTS `danilevichbooking`.`user` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `danilevichbooking`.`user` (`id`, `name`, `login`, `password`, `email`) VALUES
(1, 'Client1', 'client1', '123', ''),
(2, 'Client2', 'client2', '123', 'temp@tut.by'),
(3, 'Qwert', 'TestLogin', 'TestPassword', 'null'),
(4, 'Admin', 'admin', 'admin', 'null');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `apartment`
--
ALTER TABLE `danilevichbooking`.`apartment`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `fk_apartment_hotel1_idx` (`hotelId`);

--
-- Индексы таблицы `apartmentfacility`
--
ALTER TABLE `danilevichbooking`.`apartmentfacility`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_apartmentfacility_facility1_idx` (`facilityId`),
  ADD KEY `fk_apartmentfacility_apartment1_idx` (`apartmentId`);

--
-- Индексы таблицы `city`
--
ALTER TABLE `danilevichbooking`.`city`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`),
  ADD KEY `fk_city_country_idx` (`countryId`);

--
-- Индексы таблицы `country`
--
ALTER TABLE `danilevichbooking`.`country`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`);

--
-- Индексы таблицы `facility`
--
ALTER TABLE `danilevichbooking`.`facility`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`);

--
-- Индексы таблицы `hotel`
--
ALTER TABLE `danilevichbooking`.`hotel`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`),
  ADD KEY `fk_hotel_city1_idx` (`cityId`);

--
-- Индексы таблицы `order`
--
ALTER TABLE `danilevichbooking`.`order`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`),
  ADD KEY `fk_order_apartment1_idx` (`apartmentId`),
  ADD KEY `fk_order_user1_idx` (`userId`);

--
-- Индексы таблицы `user`
--
ALTER TABLE `danilevichbooking`.`user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `apartment`
--
ALTER TABLE `danilevichbooking`.`apartment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;
--
-- AUTO_INCREMENT для таблицы `apartmentfacility`
--
ALTER TABLE `danilevichbooking`.`apartmentfacility`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=547;
--
-- AUTO_INCREMENT для таблицы `city`
--
ALTER TABLE `danilevichbooking`.`city`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT для таблицы `country`
--
ALTER TABLE `danilevichbooking`.`country`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
--
-- AUTO_INCREMENT для таблицы `facility`
--
ALTER TABLE `danilevichbooking`.`facility`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT для таблицы `hotel`
--
ALTER TABLE `danilevichbooking`.`hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=91;
--
-- AUTO_INCREMENT для таблицы `order`
--
ALTER TABLE `danilevichbooking`.`order`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `user`
--
ALTER TABLE `danilevichbooking`.`user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `apartment`
--
ALTER TABLE `danilevichbooking`.`apartment`
  ADD CONSTRAINT `fk_apartment_hotel1` FOREIGN KEY (`hotelId`) REFERENCES `danilevichbooking`.`hotel` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `apartmentfacility`
--
ALTER TABLE `danilevichbooking`.`apartmentfacility`
  ADD CONSTRAINT `fk_apartmentfacility_apartment1` FOREIGN KEY (`apartmentId`) REFERENCES `danilevichbooking`.`apartment` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_apartmentfacility_facility1` FOREIGN KEY (`facilityId`) REFERENCES `danilevichbooking`.`facility` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `city`
--
ALTER TABLE `danilevichbooking`.`city`
  ADD CONSTRAINT `fk_city_country` FOREIGN KEY (`countryId`) REFERENCES `danilevichbooking`.`country` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `hotel`
--
ALTER TABLE `danilevichbooking`.`hotel`
  ADD CONSTRAINT `fk_hotel_city1` FOREIGN KEY (`cityId`) REFERENCES `danilevichbooking`.`city` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `order`
--
ALTER TABLE `danilevichbooking`.`order`
  ADD CONSTRAINT `fk_order_apartment1` FOREIGN KEY (`apartmentId`) REFERENCES `danilevichbooking`.`apartment` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_order_user1` FOREIGN KEY (`userId`) REFERENCES `danilevichbooking`.`user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
