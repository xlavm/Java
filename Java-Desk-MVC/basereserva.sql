-- MySQL Script generated by MySQL Workbench
-- 03/14/18 17:05:46
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema basereserva
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema basereserva
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `basereserva` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `basereserva` ;

-- -----------------------------------------------------
-- Table `basereserva`.`habitacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`habitacion` (
  `idhabitacion` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `numero` VARCHAR(4) NOT NULL COMMENT '',
  `piso` VARCHAR(2) NOT NULL COMMENT '',
  `descripcion` VARCHAR(255) NULL COMMENT '',
  `caracteristicas` VARCHAR(512) NULL COMMENT '',
  `precio_diario` DECIMAL(7,2) NOT NULL COMMENT '',
  `estado` VARCHAR(15) NOT NULL COMMENT '',
  `tipo_habitacion` VARCHAR(20) NOT NULL COMMENT '',
  PRIMARY KEY (`idhabitacion`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`persona` (
  `idpersona` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(20) NOT NULL COMMENT '',
  `apaterno` VARCHAR(20) NOT NULL COMMENT '',
  `amaterno` VARCHAR(20) NOT NULL COMMENT '',
  `tipo_documento` VARCHAR(15) NOT NULL COMMENT '',
  `num_documento` VARCHAR(8) NOT NULL COMMENT '',
  `direccion` VARCHAR(100) NULL COMMENT '',
  `telefono` VARCHAR(8) NULL COMMENT '',
  `email` VARCHAR(25) NULL COMMENT '',
  PRIMARY KEY (`idpersona`)  COMMENT '',
  UNIQUE INDEX `email_UNIQUE` (`email` ASC)  COMMENT '',
  UNIQUE INDEX `telefono_UNIQUE` (`telefono` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`cliente` (
  `idpersona` INT NOT NULL COMMENT '',
  `codigo_cliente` VARCHAR(10) NOT NULL COMMENT '',
  PRIMARY KEY (`idpersona`)  COMMENT '',
  UNIQUE INDEX `codigo_cliente_UNIQUE` (`codigo_cliente` ASC)  COMMENT '',
  CONSTRAINT `fk_persona_cliente`
    FOREIGN KEY (`idpersona`)
    REFERENCES `basereserva`.`persona` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`trabajador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`trabajador` (
  `idpersona` INT NOT NULL COMMENT '',
  `sueldo` DECIMAL(7,2) NOT NULL COMMENT '',
  `acceso` VARCHAR(15) NOT NULL COMMENT '',
  `login` VARCHAR(15) NOT NULL COMMENT '',
  `password` VARCHAR(20) NOT NULL COMMENT '',
  `estado` VARCHAR(1) NOT NULL COMMENT '',
  PRIMARY KEY (`idpersona`)  COMMENT '',
  UNIQUE INDEX `login_UNIQUE` (`login` ASC)  COMMENT '',
  CONSTRAINT `fk_persona_trabajador`
    FOREIGN KEY (`idpersona`)
    REFERENCES `basereserva`.`persona` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(45) NOT NULL COMMENT '',
  `descripcion` VARCHAR(255) NULL COMMENT '',
  `unidad_medida` VARCHAR(20) NOT NULL COMMENT '',
  `precio_venta` DECIMAL(7,2) NOT NULL COMMENT '',
  PRIMARY KEY (`idproducto`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`reserva`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`reserva` (
  `idreserva` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `idhabitacion` INT NOT NULL COMMENT '',
  `idcliente` INT NOT NULL COMMENT '',
  `idtrabajador` INT NOT NULL COMMENT '',
  `tipo_reserva` VARCHAR(20) NOT NULL COMMENT '',
  `fecha_reserva` DATE NOT NULL COMMENT '',
  `fecha_ingresa` DATE NOT NULL COMMENT '',
  `fecha_salida` DATE NOT NULL COMMENT '',
  `costo_alojamiento` DECIMAL(7,2) NOT NULL COMMENT '',
  `estado` VARCHAR(15) NOT NULL COMMENT '',
  PRIMARY KEY (`idreserva`)  COMMENT '',
  INDEX `fk_reserva_habitacion_idx` (`idhabitacion` ASC)  COMMENT '',
  INDEX `fk_reserva_cliente_idx` (`idcliente` ASC)  COMMENT '',
  INDEX `fk_reserva_trabajador_idx` (`idtrabajador` ASC)  COMMENT '',
  CONSTRAINT `fk_reserva_habitacion`
    FOREIGN KEY (`idhabitacion`)
    REFERENCES `basereserva`.`habitacion` (`idhabitacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reserva_cliente`
    FOREIGN KEY (`idcliente`)
    REFERENCES `basereserva`.`cliente` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reserva_trabajador`
    FOREIGN KEY (`idtrabajador`)
    REFERENCES `basereserva`.`trabajador` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`consumo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`consumo` (
  `idconsumo` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `idreserva` INT NOT NULL COMMENT '',
  `idproducto` INT NOT NULL COMMENT '',
  `cantidad` DECIMAL(7,2) NOT NULL COMMENT '',
  `precio_venta` DECIMAL(7,2) NOT NULL COMMENT '',
  `estado` VARCHAR(15) NOT NULL COMMENT '',
  PRIMARY KEY (`idconsumo`)  COMMENT '',
  INDEX `fk_consumo_producto_idx` (`idproducto` ASC)  COMMENT '',
  INDEX `fk_consumo_reserva_idx` (`idreserva` ASC)  COMMENT '',
  CONSTRAINT `fk_consumo_producto`
    FOREIGN KEY (`idproducto`)
    REFERENCES `basereserva`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_consumo_reserva`
    FOREIGN KEY (`idreserva`)
    REFERENCES `basereserva`.`reserva` (`idreserva`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `basereserva`.`pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `basereserva`.`pago` (
  `idpago` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `idreserva` INT NOT NULL COMMENT '',
  `tipo_comprobante` VARCHAR(20) NOT NULL COMMENT '',
  `num_comprobante` VARCHAR(20) NOT NULL COMMENT '',
  `igv` DECIMAL(4,2) NOT NULL COMMENT '',
  `total_pago` DECIMAL(7,2) NOT NULL COMMENT '',
  `fecha_emision` DATE NOT NULL COMMENT '',
  `fecha_pago` DATE NOT NULL COMMENT '',
  PRIMARY KEY (`idpago`)  COMMENT '',
  INDEX `fk_pago_reserva_idx` (`idreserva` ASC)  COMMENT '',
  CONSTRAINT `fk_pago_reserva`
    FOREIGN KEY (`idreserva`)
    REFERENCES `basereserva`.`reserva` (`idreserva`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;