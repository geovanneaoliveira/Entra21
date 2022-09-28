-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: livraria
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `avaliacao`
--

DROP TABLE IF EXISTS `avaliacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `avaliacao` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome_avaliador` varchar(100) NOT NULL,
  `nota` decimal(6,2) NOT NULL,
  `comentario` varchar(250) DEFAULT NULL,
  `id_item` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_item` (`id_item`),
  CONSTRAINT `avaliacao_ibfk_1` FOREIGN KEY (`id_item`) REFERENCES `item` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avaliacao`
--

LOCK TABLES `avaliacao` WRITE;
/*!40000 ALTER TABLE `avaliacao` DISABLE KEYS */;
INSERT INTO `avaliacao` VALUES (6,'Geovanne',9.50,'Vasco!',3);
/*!40000 ALTER TABLE `avaliacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dvd`
--

DROP TABLE IF EXISTS `dvd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dvd` (
  `diretor` varchar(250) NOT NULL,
  `duracao` time NOT NULL,
  `ano_lancamento` int NOT NULL,
  `id_item` bigint NOT NULL,
  PRIMARY KEY (`id_item`),
  KEY `id_item` (`id_item`),
  CONSTRAINT `dvd_ibfk_1` FOREIGN KEY (`id_item`) REFERENCES `item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dvd`
--

LOCK TABLES `dvd` WRITE;
/*!40000 ALTER TABLE `dvd` DISABLE KEYS */;
INSERT INTO `dvd` VALUES ('George Lucas','02:01:00',1977,1),('Barry Sonnenfeld','01:38:00',1997,2),('Andrew Adamson, Vicky Jenson','01:29:00',2001,3),('Andrew Adamson, Kelly Asbury, Conrad Vernon','01:32:00',2004,7),('Irvin Kershner','02:04:00',1980,8);
/*!40000 ALTER TABLE `dvd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `franquia`
--

DROP TABLE IF EXISTS `franquia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `franquia` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `franquia`
--

LOCK TABLES `franquia` WRITE;
/*!40000 ALTER TABLE `franquia` DISABLE KEYS */;
INSERT INTO `franquia` VALUES (1,'shrekao'),(2,'Star Wars'),(3,'MIB'),(4,'Desventuras em Série'),(9,'vasco da gama!'),(11,'franquiaDTO teste'),(12,'debs');
/*!40000 ALTER TABLE `franquia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Sci-fi'),(2,'Ação'),(3,'Aventura'),(4,'Comédia'),(5,'Fantasia'),(6,'Romance Policial'),(7,'Suspense'),(8,'Mistério'),(9,'Ficção Absurda'),(10,'Ficção Gótica'),(11,'genero vasco!'),(12,'generoDtoTeste'),(13,'uhu');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero_item`
--

DROP TABLE IF EXISTS `genero_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero_item` (
  `id_genero` bigint NOT NULL,
  `id_item` bigint NOT NULL,
  PRIMARY KEY (`id_genero`,`id_item`),
  KEY `id_item` (`id_item`),
  CONSTRAINT `genero_item_ibfk_1` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`id`),
  CONSTRAINT `genero_item_ibfk_2` FOREIGN KEY (`id_item`) REFERENCES `item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero_item`
--

LOCK TABLES `genero_item` WRITE;
/*!40000 ALTER TABLE `genero_item` DISABLE KEYS */;
INSERT INTO `genero_item` VALUES (2,1),(3,1),(2,2),(4,2),(4,3),(5,3),(1,4),(6,5),(7,5),(5,6),(4,7),(5,7),(2,8),(3,8),(5,8),(8,9),(9,9),(10,9),(8,10),(9,10),(10,10);
/*!40000 ALTER TABLE `genero_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) NOT NULL,
  `valor_venda` decimal(6,2) NOT NULL,
  `valor_locacao` decimal(6,2) NOT NULL,
  `emprestado` bit(1) NOT NULL DEFAULT b'0',
  `id_franquia` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_franquia` (`id_franquia`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`id_franquia`) REFERENCES `franquia` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'Star Wars: EP IV - Uma Nova Esperança',25.60,8.00,_binary '\0',2),(2,'Homens de Preto',56.00,8.00,_binary '\0',3),(3,'Shrek',48.25,8.00,_binary '\0',1),(4,'Eu robô',74.00,12.00,_binary '\0',NULL),(5,'O Código Da Vinci',56.80,12.00,_binary '\0',NULL),(6,'A Batalha do Apocalipse',45.30,12.00,_binary '\0',NULL),(7,'Shrek 2',43.70,8.00,_binary '\0',1),(8,'Star Wars: EP V - O Império Contra-ataca',58.60,8.00,_binary '\0',2),(9,'Mau Começo',49.60,12.00,_binary '\0',4),(10,'A Sala dos Répteis',51.80,12.00,_binary '\0',4);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `livro`
--

DROP TABLE IF EXISTS `livro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `livro` (
  `autor` varchar(250) NOT NULL,
  `qtde_paginas` int NOT NULL,
  `ano_publicacao` int NOT NULL,
  `edicao` int NOT NULL,
  `id_item` bigint NOT NULL,
  PRIMARY KEY (`id_item`),
  KEY `id_item` (`id_item`),
  CONSTRAINT `livro_ibfk_1` FOREIGN KEY (`id_item`) REFERENCES `item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livro`
--

LOCK TABLES `livro` WRITE;
/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
INSERT INTO `livro` VALUES ('Isaac Asimov',253,1950,1,4),('Dan Brown',432,2004,1,5),('Eduardo Spohr',586,2010,1,6),('Lemony Snicket',162,1999,1,9),('Lemony Snicket',180,1999,1,10);
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'livraria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-28 19:27:18
