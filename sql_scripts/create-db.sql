DO
$$BEGIN
IF EXISTS (SELECT FROM pg_roles WHERE rolname = 'patients_hub_admin') THEN
    IF EXISTS (SELECT FROM pg_database WHERE datname  = 'patients_hub') THEN
        EXECUTE 'REVOKE ALL ON DATABASE patients_hub FROM patients_hub_admin';
    END IF;
END IF;
END$$;
DROP USER IF EXISTS patients_hub_admin;
DROP DATABASE IF EXISTS patients_hub;

CREATE ROLE patients_hub_admin CREATEDB CREATEROLE LOGIN PASSWORD 'admin';
CREATE DATABASE patients_hub;
GRANT ALL PRIVILEGES ON DATABASE patients_hub TO patients_hub_admin;

\connect patients_hub patients_hub_admin;