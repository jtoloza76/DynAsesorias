CREATE SCHEMA `DynAsesorias` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;

CREATE TABLE `DynAsesorias`.`capacitaciones` (
  `idcapacitaciones` INT NOT NULL AUTO_INCREMENT,
  `nombreCurso` VARCHAR(45) NULL,
  `nombreDocente` VARCHAR(45) NULL,
  `fechaInicio` VARCHAR(45) NULL,
  `fechaTermino` VARCHAR(45) NULL,
  `precio` VARCHAR(45) NULL,
  PRIMARY KEY (`idcapacitaciones`));
 
INSERT INTO `DynAsesorias`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (1, 'BD Manejo de Extintores', 'Andrea Gonzalez', '01-10-2022', '01-11-2022', '$1.300.000.-');
INSERT INTO `DynAsesorias`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (2, 'BD Manejo manual de cargas', 'Fernando Araya', '01-11-2022', '01-12-2022', '$2.000.000.-');
INSERT INTO `DynAsesorias`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (3, 'BD Comites Paritarios', 'Claudio Diaz', '15-11-2022', '16-11-2022', '$1.000.000.-');
INSERT INTO `DynAsesorias`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (4, 'BD Brigadas de emergencias', 'Francisca Gutierrez', '05-10-2022', '06-10-2022', '$1.000.000.-');
INSERT INTO `DynAsesorias`.`capacitaciones` (`idcapacitaciones`,`nombreCurso`,`nombreDocente`,`fechaInicio`,`fechaTermino`,`precio`) VALUES (5, 'BD Primeros Auxilios', 'Maria Barra', '20-10-2022', '20-10-2022', '$3.000.000.-');


CREATE TABLE `DynAsesorias`.`usuarios` (
  `idusuarios` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuarios`));
 
INSERT INTO `DynAsesorias`.`usuarios` (`idusuarios`,`usuario`,`password`,`tipo`) values (1, 'admin','1234','0');
INSERT INTO `DynAsesorias`.`usuarios` (`idusuarios`,`usuario`,`password`,`tipo`) values (2, 'cliente','1234','1');
INSERT INTO `DynAsesorias`.`usuarios` (`idusuarios`,`usuario`,`password`,`tipo`) values (3, 'administrativo','1234','2');
INSERT INTO `DynAsesorias`.`usuarios` (`idusuarios`,`usuario`,`password`,`tipo`) values (4, 'profesional','1234','3');


CREATE TABLE `DynAsesorias`.`contactos` (
  `idcontacto` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `mensaje` VARCHAR(45) NULL,
  PRIMARY KEY (`idcontacto`));
  
 INSERT INTO `dynasesorias`.`contactos` (`idcontacto`, `usuario`, `email`, `mensaje`) VALUES(1, 'admin', 'admin@sistema.com', 'Mensaje del administrador');
 INSERT INTO `dynasesorias`.`contactos` (`idcontacto`, `usuario`, `email`, `mensaje`) VALUES(2, 'cliente', 'cliente@sistema.com', 'Mensaje del cliente');
 INSERT INTO `dynasesorias`.`contactos` (`idcontacto`, `usuario`, `email`, `mensaje`) VALUES(3, 'administrativo', 'administrativo@sistema.com', 'Mensaje del administrativo');
 
