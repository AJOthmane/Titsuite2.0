CREATE TABLE CUSTOMER (
    id INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    hashed_password VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    phone_number VARCHAR(255),
    birth_date DATE,
    city VARCHAR(255),
    address VARCHAR(255),
    subscription VARCHAR(255) DEFAULT 'BASIC' CHECK (subscription in ('BASIC', 'PREMIUM')),
    refresh_token VARCHAR(4000),
    verification_code VARCHAR(255),
    is_active INTEGER DEFAULT 0 CHECK (is_active in (0, 1)),
    created_at TIMESTAMP DEFAULT NOW() NOT NULL,
    resend_timeout DATE
);
CREATE TABLE DIPLOMA (
    id INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(255) NOT NULL,
    acquisition_date DATE NOT NULL,
    field VARCHAR(255) NOT NULL,
    freelancer_ref INTEGER NOT NULL,
    FOREIGN KEY (freelancer_ref) REFERENCES FREELANCER(id)
);
CREATE TABLE FREELANCER (
    id INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    hashed_password VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    phone_number VARCHAR(255),
    birth_date DATE,
    city VARCHAR(255),
    address VARCHAR(255),
    activity VARCHAR(255),
    minimum_wage DECIMAL(38, 2),
    refresh_token VARCHAR(4000),
    verification_code VARCHAR(255),
    is_active INTEGER DEFAULT 0 CHECK (is_active in (0, 1)),
    created_at TIMESTAMP DEFAULT NOW() NOT NULL,
    resend_timeout DATE
);
CREATE TABLE JOB(

    id INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    refFreelancer  int,
    refRate   int,

    refOffer  int,

    FOREIGN KEY(refOffer) REFERENCES OFFERS(ID),
    FOREIGN KEY(refRate) REFERENCES RATE(ID),

    FOREIGN KEY(refFreelancer) REFERENCES FREELANCER(ID)

);
create table OFFERS(
    ID INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    description varchar(500),
    city varchar(15),
    minimumWage int,
    status varchar(10),
    refCustomer int  NOT NULL,
    startDay DATE,
    activity varchar(50),
    FOREIGN KEY(refCustomer) REFERENCES CUSTOMER(ID)
);
CREATE TABLE RATE (
    id INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    rate int,
    review varchar(500)
);	
CREATE TABLE STAFF (
    id INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    hashed_password VARCHAR(255) NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    phone_number VARCHAR(255),
    birth_date DATE,
    city VARCHAR(255),
    address VARCHAR(255),
    role VARCHAR(255) DEFAULT 'CUSTOMER_SERVICE' CHECK (role in ('CUSTOMER_SERVICE', 'ADMINISTRATOR')),
    refresh_token VARCHAR(4000),
    verification_code VARCHAR(255),
    is_active INTEGER DEFAULT 0 CHECK (is_active in (0, 1)),
    created_at TIMESTAMP DEFAULT NOW() NOT NULL,
    resend_timeout DATE
);
