DROP TABLE IF EXISTS user_credentials CASCADE;
CREATE TABLE user_credentials
(
    id       SERIAL PRIMARY KEY,
    role     VARCHAR(256) NOT NULL,
    email    VARCHAR(256) NOT NULL,
    password VARCHAR(256) NOT NULL
);
ALTER TABLE user_credentials ADD CONSTRAINT unique_email UNIQUE (email);
ALTER TABLE user_credentials ADD CONSTRAINT unique_username UNIQUE (role);


DROP TABLE IF EXISTS admission_type CASCADE;
CREATE TABLE admission_type
(
    id   BIGSERIAL PRIMARY KEY,
    type VARCHAR(256) NOT NULL
);

DROP TABLE IF EXISTS specialization CASCADE;
CREATE TABLE specialization
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(256) NOT NULL
);

DROP TABLE IF EXISTS functions CASCADE;
CREATE TABLE functions
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(256)
);


INSERT INTO functions (name)
VALUES ('Doctor'),
       ('Asistent'),
       ('Specialist'),
       ('Manager de Spital');

DROP TABLE IF EXISTS room CASCADE;
CREATE TABLE room
(
    id                BIGSERIAL PRIMARY KEY,
    number            INTEGER NOT NULL,
    capacity          INTEGER NOT NULL,
    specialization_id BIGINT  NOT NULL,
    is_available      BOOLEAN NOT NULL,
    CONSTRAINT fk_specialization
        FOREIGN KEY (specialization_id)
            REFERENCES specialization (id)
);
ALTER TABLE room
    ALTER COLUMN capacity SET DEFAULT 1;

DROP TABLE IF EXISTS patient CASCADE;
CREATE TABLE patient
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(256)  NOT NULL,
    last_name  VARCHAR(256)  NOT NULL,
    gender     VARCHAR(256)  NOT NULL,
    birth_date DATE          NOT NULL,
    address    VARCHAR(256)  NOT NULL,
    cnp        BIGINT UNIQUE NOT NULL,
    serial     VARCHAR(256)  NOT NULL,
    number     INTEGER       NOT NULL
);
ALTER TABLE patient
    ADD CONSTRAINT age_check CHECK (birth_date IS NULL OR DATE_PART('year', age(birth_date)) BETWEEN 0 AND 120);

DROP TABLE IF EXISTS insurance_type CASCADE;
CREATE TABLE insurance_type
(
    id             BIGSERIAL PRIMARY KEY,
    insurance_type VARCHAR(256) NOT NULL
);

DROP TABLE IF EXISTS patient_file CASCADE;
CREATE TABLE patient_file
(
    id                                        BIGSERIAL PRIMARY KEY,
    is_insured                                boolean,
    admission_date                            DATE,
    discharge_date                            DATE,
    initial_diagnosis                         TEXT,
    seventy_two_hour_diagnosis                TEXT,
    final_diagnosis                           TEXT,
    medic_team                                varchar(256),
    surgery_details                           varchar(256),
    surgery_date                              DATE,
    history_antecedents                       varchar(256),
    history_living_working_conditions         varchar(256),
    history_behaviors                         varchar(256),
    history_medication_before_hospitalization varchar(256),
    history_disease                           varchar(256),
    history_general_clinical_examination      varchar(256),
    admission_type_id                         bigint REFERENCES admission_type (id),
    room_id                                   bigint REFERENCES room (id),
    patient_id                                bigint REFERENCES patient (id),
    insurance_type_id                         bigint REFERENCES insurance_type (id)
);

DROP TABLE IF EXISTS evolution_and_treatment CASCADE;
CREATE TABLE evolution_and_treatment
(
    id              BIGSERIAL PRIMARY KEY,
    patient_file_id BIGINT    NOT NULL,
    details         TEXT,
    start_date      TIMESTAMP NOT NULL,
    end_date        TIMESTAMP NOT NULL,
    CONSTRAINT fk_patient_file
        FOREIGN KEY (patient_file_id)
            REFERENCES patient_file (id)
);



INSERT INTO specialization (name)
VALUES ('Allergy and Immunology');
INSERT INTO specialization (name)
VALUES ('Anesthesiology');
INSERT INTO specialization (name)
VALUES ('Cardiology');
INSERT INTO specialization (name)
VALUES ('Dermathology');
INSERT INTO specialization (name)
VALUES ('Gastroenterology');
INSERT INTO specialization (name)
VALUES ('Pediatrics');
INSERT INTO specialization (name)
VALUES ('Internal Medicine');
INSERT INTO specialization (name)
VALUES ('Oncology');
INSERT INTO specialization (name)
VALUES ('Plastic Surgery');
INSERT INTO specialization (name)
VALUES ('General Surgery');

INSERT INTO room (number, specialization_id, is_available)
VALUES (1, 2, TRUE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (2, 1, TRUE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (3, 4, FALSE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (4, 3, TRUE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (5, 1, TRUE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (6, 2, FALSE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (7, 5, TRUE);
INSERT INTO room (number, specialization_id, is_available)
VALUES (8, 4, TRUE);