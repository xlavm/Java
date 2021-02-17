
CREATE SCHEMA IF NOT EXISTS `jsp_mvc_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

USE `jsp_mvc_db` ;

CREATE TABLE IF NOT EXISTS `jsp_mvc_db`.`persona` (
  `id` INT NOT NULL COMMENT '',
  `nombres` VARCHAR(45) NULL COMMENT '',
  `apellidos` VARCHAR(45) NULL COMMENT '',
  `edad` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB;


START TRANSACTION;
USE `jsp_mvc_db`;
INSERT INTO `jsp_mvc_db`.`persona` (`id`, `nombres`, `apellidos`, `edad`) VALUES (1, 'luis angel', 'vanegas martinez', '21');

COMMIT;

