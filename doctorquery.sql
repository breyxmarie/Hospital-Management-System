-- Create statements 
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema doctorquery
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS doctorquery ;

-- -----------------------------------------------------
-- Schema doctorquery
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS doctorquery DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
USE doctorquery ;

-- -----------------------------------------------------
-- Table doctorquery.`accounts`
-- -----------------------------------------------------
DROP TABLE IF EXISTS doctorquery.`accounts` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS doctorquery.`accounts` (
  Account_ID INT NOT NULL AUTO_INCREMENT,
  Account_Username CHAR(20) NOT NULL,
  Account_Password CHAR(20) NOT NULL,
  Account_Lvl INT NOT NULL,
  PRIMARY KEY (Account_ID))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table doctorquery.`specialization`
-- -----------------------------------------------------
DROP TABLE IF EXISTS doctorquery.`specialization` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS doctorquery.`specialization` (
  Specialization_ID INT NOT NULL AUTO_INCREMENT,
  Specialization_Name CHAR(20) NOT NULL,
  Specialization_Cost DOUBLE NOT NULL,
  PRIMARY KEY (Specialization_ID))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table doctorquery.`doctor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS doctorquery.`doctor` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS doctorquery.`doctor` (
  Doctor_ID INT NOT NULL AUTO_INCREMENT,
  Doctor_NAME CHAR(50) NOT NULL,
  Specialization_ID INT NULL DEFAULT NULL,
  Rate_Pay INT NULL DEFAULT NULL,
  Sched_DayFrom CHAR(15) NULL DEFAULT NULL,
  Sched_DayTo CHAR(15) NULL DEFAULT NULL,
  Sched_TimeFrom CHAR(15) NULL DEFAULT NULL,
  Sched_TimeTo CHAR(15) NULL DEFAULT NULL,
  PRIMARY KEY (Doctor_ID),
  CONSTRAINT FK_DocSpec
    FOREIGN KEY (Specialization_ID)
    REFERENCES doctorquery.`specialization` (Specialization_ID))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table doctorquery.`consultation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS doctorquery.`consultation` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS doctorquery.`consultation` (
  Consult_ID INT NOT NULL AUTO_INCREMENT,
  Patient_Name CHAR(50) NOT NULL,
  Consult_Date DATE NOT NULL,
  Payment INT NOT NULL,
  Doctor_ID INT NOT NULL,
  PRIMARY KEY (Consult_ID),
  CONSTRAINT FK_ConsultDoc
    FOREIGN KEY (Doctor_ID)
    REFERENCES doctorquery.`doctor` (Doctor_ID))
ENGINE = InnoDB
AUTO_INCREMENT = 30
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- Insert statements for account table
INSERT INTO Accounts(Account_Username,Account_Password,Account_Lvl)
VALUES('admin','admin', 2);

-- Insert statements for specialization table
INSERT INTO Specialization (Specialization_Name, Specialization_Cost)
VALUES('Cardiologist', 700.00),
('Urologist',500.00),
('Dermatologist',1000.00),
('Pediatrician',650.00);

-- Insert statements for doctor table
Insert Into Doctor (Doctor_NAME, Specialization_ID, Sched_DayFrom, Sched_DayTo, Sched_TimeFrom, Sched_TimeTo, Rate_Pay)
VALUES("Juan Cruz", 1, "Monday", "Friday", '13:00', '15:00', 700),
('Nadine Lustre', 1, 'Wednesday', 'Friday', '12:00:00', '13:00:00',1000),
('Guy Berryman', 1, 'Monday', 'Friday', '8:00:00', '11:00:00',400),
('Ayn Bernos', 2, 'Saturday', 'Sunday', '13:00:00', '14:00:00',850),
('Ethan Lee', 2, 'Monday', 'Friday', '09:00:00', '10:00:00',450),
('Will Champion', 2, 'Wednesday', 'Friday', '11:00:00', '14:00:00',1450),
('Joy Ramos', 3, 'Monday', 'Friday', '08:00:00', '12:00:00',500),
('Lava Reyes', 3, 'Monday', 'Sunday', '10:00:00', '11:00:00',1100),
('Jonny Buckland', 3, 'Tuesday', 'Thursday', '09:00:00', '12:00:00',450),
('Phil Harvey', 4, 'Wednesday', 'Sunday', '13:00:00', '14:00:00',450),
('Bea Quirk', 4, 'Monday', 'Wednesday', '09:00:00', '23:59:00',850),
('Tristan Dugray', 4, 'Thursday', 'Sunday', '13:00:00', '16:00:00',900),
('Chris Martin', 4, 'Tuesday', 'Sunday', '15:00:00', '17:00:00',1500);

-- Insert statements for consultation table
INSERT INTO CONSULTATION(Patient_Name, Consult_Date, Payment,Doctor_ID)
VALUES
('Katrina Bennet','2021-10-27',750,3),
('Winston Shmidt','2021-10-27',1000,6),
('Nick Miller','2021-10-27',800,8),
('Jessica Day','2021-10-27',900,1),
('Cece Parekh','2021-10-28',500,4),
('Winston Bishop','2021-10-28',550,5),
('Aly Nelson','2021-10-28',950,6),
('Haley Dunphy','2021-10-28',1000,7),
('Manny Delgado','2021-10-28',750,4),
('Claire Dunphy','2021-10-29',450,4),
('Logan Hunzberger','2021-10-29',500,7),
('Hilda nifuji','2021-10-29',750,2),
('Joe Goldenberg','2021-10-29',750,4),
('Mike Ross','2021-10-29',500,2),
('Louise Lit','2021-10-29',850,7),
('Rory Gilmore','2021-10-29',1000,1),
('Lane Kim','2021-10-29',1000,6),
('Harvey Specter','2021-10-30',700, 1),
('Jess Mariano','2021-10-30',650,8),
('Emily Gilmore','2021-10-30',800,1),
('Luke Danes','2021-10-30',900,2),
('Hiro Mifuji','2021-10-30',550,4),
('Harvey Specter','2021-10-31',500,8),
('Donna Paulsen','2021-10-31',700,3),
('Rachel Zane','2021-10-31',650,3),
('Jessica pearson','2021-10-31',900,6),
('Danna Scott','2021-10-31',950,8);
