
-- -----------------------------------------------------------------------------
--       TABLE : ENSEIGNANT
-- -----------------------------------------------------------------------------

CREATE TABLE ENSEIGNANT
   (
    MATRICULE VARCHAR2(128)  NOT NULL,
    NOM VARCHAR2(128)  NULL,
    PRENOM VARCHAR2(128)  NULL,
   CONSTRAINT PK_ENSEIGNANT PRIMARY KEY (MATRICULE)   
   )  ;

-- -----------------------------------------------------------------------------
--       TABLE : ENSEIGNE
-- -----------------------------------------------------------------------------

CREATE TABLE ENSEIGNE
   (
    MATRICULE_E VARCHAR2(128)  NOT NULL,
    CODE_COURS VARCHAR2(128)  NOT NULL
,   CONSTRAINT PK_ENSEIGNE PRIMARY KEY (MATRICULE_E, CODE_COURS)   
   )  ;

-- -----------------------------------------------------------------------------
--       INDEX DE LA TABLE ENSEIGNE
-- -----------------------------------------------------------------------------

CREATE  INDEX I_FK_ENSEIGNE_ENSEIGNANT
     ON ENSEIGNE (MATRICULE_E ASC)
    ;

CREATE  INDEX I_FK_ENSEIGNE_COURS
     ON ENSEIGNE (CODE_COURS ASC)
    ;

-- -----------------------------------------------------------------------------
--       TABLE : COURS
-- -----------------------------------------------------------------------------

CREATE TABLE COURS
   (
    CODEC VARCHAR2(128)  NOT NULL,
    NBRHA INTEGER  NULL,
    INTITULEC VARCHAR2(128)  NULL,
    CODE_GROUPE VARCHAR2(128)  NOT NULL
,   CONSTRAINT PK_COURS PRIMARY KEY (CODEC)   
   )  ;

-- -----------------------------------------------------------------------------
--       INDEX DE LA TABLE COURS
-- -----------------------------------------------------------------------------

CREATE  INDEX I_FK_COURS_GROUPE
     ON COURS (CODE_GROUPE ASC)
    ;

-- -----------------------------------------------------------------------------
--       TABLE : GROUPE
-- -----------------------------------------------------------------------------

CREATE TABLE GROUPE
   (
    CODEGR VARCHAR2(128)  NOT NULL,
    INTITULEGR VARCHAR2(128)  NULL,
    NIVEAU VARCHAR2(128)  NULL
,   CONSTRAINT PK_GROUPE PRIMARY KEY (CODEGR)   
   )  ;


-- -----------------------------------------------------------------------------
--       CREATION DES REFERENCES DE TABLE
-- -----------------------------------------------------------------------------


ALTER TABLE ENSEIGNE ADD (
     CONSTRAINT FK_ENSEIGNE_ENSEIGNANT
          FOREIGN KEY (MATRICULE_E)
               REFERENCES ENSEIGNANT (MATRICULE))  ;

ALTER TABLE ENSEIGNE ADD (
     CONSTRAINT FK_ENSEIGNE_COURS
          FOREIGN KEY (CODE_COURS)
               REFERENCES COURS (CODEC))  ;

ALTER TABLE COURS ADD (
     CONSTRAINT FK_COURS_GROUPE
          FOREIGN KEY (CODE_GROUPE)
               REFERENCES GROUPE (CODEGR))  ;