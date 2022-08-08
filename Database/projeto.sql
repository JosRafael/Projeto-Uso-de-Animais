-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: projeto
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `protocolo`
--

DROP TABLE IF EXISTS `protocolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `protocolo` (
  `dataEmissaoProtocolo` date NOT NULL,
  `dataInicioExperimento` date NOT NULL,
  `dataFimExperimento` date NOT NULL,
  `JustificativaUsoAnimais` varchar(500) NOT NULL,
  `resumoPortugues` varchar(500) NOT NULL,
  `resumoIngles` varchar(500) NOT NULL,
  `dataEnvioParecer` date DEFAULT NULL,
  `dataEmissaoParecer` date DEFAULT NULL,
  `descricaoParecer` varchar(500) DEFAULT NULL,
  `statusParecer` varchar(500) DEFAULT NULL,
  `dataDeliberacaoProtocolo` date DEFAULT NULL,
  `statusDeliberacao` varchar(500) DEFAULT NULL,
  `statusProtocolo` varchar(500) DEFAULT NULL,
  `id` smallint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `protocolo`
--

LOCK TABLES `protocolo` WRITE;
/*!40000 ALTER TABLE `protocolo` DISABLE KEYS */;
INSERT INTO `protocolo` VALUES ('2022-08-02','2022-08-02','2022-08-02','São bonitos','port','ingl','2022-08-02','2022-08-02','desc','2','2022-08-02','2','Deliberado',1),('2022-08-02','2019-06-12','2020-07-14','Justificativa','port','english','2022-08-02','2022-08-02','Desc','1','2022-08-02','2','Deliberado',2),('2022-08-02','2022-08-02','2022-08-02','Terceiro teste','portugues','ingles','2022-08-02','2022-08-02','descricao nova','1','2022-08-02','1','Deliberado',3),('2022-08-07','2022-08-07','2022-08-07','asdasd','asdasda','dsadasd',NULL,NULL,NULL,NULL,NULL,NULL,'Aguardando Envio',4),('2022-08-07','2022-08-07','2022-08-07','bonitos','morreu','death','2022-08-07','2022-08-07','descricao','vivo','2022-08-07','1','Deliberado',5);
/*!40000 ALTER TABLE `protocolo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-07 16:50:02
