-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bdproyectos
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `ancho` double DEFAULT NULL,
  `largo` double DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `imagen` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Absol',15,25,400,'Absol.png',0),(2,'Alakazam',10,15,250,'Alakazam.png',4),(3,'Arcanine',15,10,220,'Arcanine.png',6),(4,'Arceus',30,60,9500,'Arceus.png',7),(5,'Bidoof',15,20,100,'Bidoof.png',7),(6,'Blastoise',20,40,6500,'Blastoise.png',7),(7,'Blaziken',5,10,200,'Blaziken.png',9),(8,'Bulbasaur',10,15,1000,'Bulbasaur.png',9),(9,'Calyrex',5,8,100,'Calyrex.png',7),(10,'Charizard',20,40,7000,'Charizard.png',3),(11,'Charmander',10,15,500,'Charmander.png',4),(12,'Chesnaught',7,10,200,'Chesnaught.png',10),(13,'Cinderace',8,16,250,'Cinderace.png',9),(14,'Corviknight',17.5,10,225,'Corviknight.png',10),(15,'Cresselia',20,40,3000,'Cresselia.png',9),(16,'Cubone',5,8,300,'Cubone.png',10),(17,'Darkrai',15,25,2500,'Darkrai.png',6),(18,'Decidueye',15,10,750,'Decidueye.png',10),(19,'Dedenne',20,15,2000,'Dedenne.png',10),(20,'Delphox',9,8,250,'Delphox.png',10),(21,'Dialga',30,65,8000,'Dialga.png',10),(22,'Dragapult',15,20,750,'Dragapult.png',10),(23,'Dragonite',15,25,1500,'Dragonite.png',10),(24,'Eevee',10,15,550,'Eevee.png',10),(25,'Empoleon',10,19,300,'Empoleon.png',9),(26,'Espeon',25,25,2500,'Espeon.png',10),(27,'Eternatus',15,15,450,'Eternatus.png',10),(28,'Excadrill',10,17.5,275,'Excadrill.png',10),(29,'Flareon',12,17.5,450,'Flareon.png',10),(30,'Froakie',8,12,135,'Froakie.png',10),(31,'Garchomp',20,40,5750,'Garchomp.png',10),(32,'Gardevoir',20,20,2500,'Gardevoir.png',10),(33,'Gastrodon',15,15,750,'Gastrodon.png',10),(34,'Gengar',30,45,5500,'Gengar.png',10),(35,'Giratina',15,15,1850,'Giratina.png',10),(36,'Glastrier',10,15,300,'Glastrier.png',10),(37,'Greninja',15,20,2500,'Greninja.png',10),(38,'Gyarados',15,25,3000,'Gyarados.png',10),(39,'Hawlucha',12,22.5,350,'Hawlucha.png',10),(40,'Heatran',10,8,150,'Heatran.png',10),(41,'Houndoom',20,25,1250,'Houndoom.png',10),(42,'Incineroar',10,20,650,'Incineroar.png',10),(43,'Infernape',15,22.5,950,'Infernape.png',10),(44,'Inteleon',17.5,25.5,1150,'Inteleon.png',10),(45,'Jolteon',12,17.5,550,'Jolteon.png',10),(46,'Kleavor',10,15.5,250,'Kleavor.png',10),(47,'Kubfu',10,10,75,'Kubfu.png',10),(48,'Kyurem',15,17.5,1050,'Kyurem.png',10),(49,'Lapras',25,25,1750,'Lapras.png',10),(50,'Lucario',20,35,4500,'Lucario.png',10),(51,'Lunala',20,15,1500,'Lunala.png',10),(52,'Luxray',15,10,500,'Luxray.png',10),(53,'Machamp',15,20,4750,'Machamp.png',10),(54,'Magearna',12.5,17.5,650,'Magearna.png',10),(55,'Marshadow',20,60,6500,'Marshadow.png',10),(56,'Melmetal',15,9,375,'Melmetal.png',10),(57,'Metagross',25,25,4500,'Metagross.png',10),(58,'Mew',30,50,7500,'Mew.png',10),(59,'Mewtwo',30,65,10000,'Mewtwo.png',10),(60,'Necrozma',10,8,350,'Necrozma.png',10),(61,'Ninetales',15,35,2500,'Ninetales.png',10),(62,'Onix',17.5,25.5,2250,'Onix.png',10),(63,'Oshawott',10,17.5,270,'Oshawott.jpg',10),(64,'Palkia',13.5,17.5,950,'Palkia.png',10),(65,'Pikachu',25,20,5000,'Pikachu.png',10),(66,'Primarina',30,30,15000,'Primarina.png',10),(67,'Psyduck',20,17.5,550,'Psyduck.png',10),(68,'Rayquaza',20,35,5200,'Rayquaza.png',10),(69,'Regidrago',15,20,350,'Regidrago.png',10),(70,'Regieleki',18,15,350,'Regieleki.png',10),(71,'Regigigas',25,27.5,3375,'Regigigas.png',10),(72,'Reshiram',25,25.5,2250,'Reshiram.png',10),(73,'Rillaboom',15,15,650,'Rillaboom.png',10),(74,'Riolu',25,25,4550,'Riolu.png',10),(75,'Salamence',20,40,5500,'Salamence.png',10),(76,'Samurott',15,22.5,700,'Samurott.png',10),(77,'Sceptile',17,22.5,600,'Sceptile.png',10),(78,'Scizor',20,32.5,2500,'Scizor.png',10),(79,'Snorlax',25,22.5,3750,'Snorlax.png',10),(80,'Solgaleo',15,20,1500,'Solgaleo.png',10),(81,'Spectrier',15,12,150,'Spectrier.png',10),(82,'Squirtle',10,15,500,'Squirtle.png',10),(83,'Swampert',18,14,750,'Swampert.png',10),(84,'Swoobat',18,19,950,'Swoobat.png',10),(85,'Sylveon',20,26,3350,'Sylveon.png',10),(86,'Togepi',25,21,3000,'Togepi.png',10),(87,'Torterra',20,22,1000,'Torterra.png',10),(88,'Toxtricity',13,20,300,'Toxtricity.png',10),(89,'Tyranitar',27.5,40,5750,'Tyranitar.png',10),(90,'Umbreon',20,26,3550,'Umbreon.png',10),(91,'Urshifu',12,17.5,350,'Urshifu.png',10),(92,'Vaporeon',20,26,4500,'Vaporeon.png',10),(93,'Xerneas',18,25,2500,'Xerneas.png',10),(94,'Yveltal',25,25,2500,'Yveltal.png',10),(95,'Zacian',15,12,500,'Zacian.png',10),(96,'Zamazenta',16,12,600,'Zamazenta.png',10),(97,'Zarude',15,15,300,'Zarude.png',10),(98,'Zekrom',25,25.5,2250,'Zekrom.png',10),(99,'Zoroark',30,30,5500,'Zoroark.png',10),(100,'Zygarde',25,25,2500,'Zygarde.png',10);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-30 15:32:55
