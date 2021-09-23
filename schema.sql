
--Create database biblio;

CREATE TABLE IF NOT EXISTS editor (
                       id SERIAL NOT NULL  PRIMARY KEY,
                       editorName VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS description(
                            id SERIAL NOT NULL  PRIMARY KEY,
                            desc_title VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS language(
    lang_id SERIAL NOT NULL,
    lang_name VARCHAR(50) NOT NULL PRIMARY KEY
);

Create table IF NOT EXISTS book (
                      isbn VARCHAR(20) NOT NULL PRIMARY KEY ,
                      title VARCHAR(100) NOT NULL ,
                      editor_id INTEGER NOT NULL,
                      publish_date TIMESTAMP NOT NULL,
                      description_id INTEGER NOT NULL,
                      language VARCHAR(50) NOT NULL,
                      FOREIGN KEY (editor_id)REFERENCES editor(id),
                      FOREIGN KEY (description_id) REFERENCES description(id),
                      FOREIGN KEY (language) REFERENCES language(lang_name)
);

CREATE TABLE IF NOT EXISTS type (
                      id SERIAL NOT NULL PRIMARY KEY,
                      type_name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS type_of_Book(
                             isbn VARCHAR(20) NOT NULL,
                             type_id INTEGER NOT NULL,
                             FOREIGN KEY (isbn) REFERENCES  book(isbn),
                             FOREIGN KEY (type_id) REFERENCES type(id)
);

CREATE TABLE IF NOT EXISTS author(
                       id SERIAL NOT NULL PRIMARY KEY,
                       lastname VARCHAR(100) NOT NULL,
                       firstname VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS author_book(
                            isbn VARCHAR(20) NOT NULL,
                            author_id INTEGER NOT NULL,
                            FOREIGN KEY (isbn) REFERENCES  book(isbn),
                            FOREIGN KEY (author_id) REFERENCES author(id)
);

CREATE TABLE IF NOT EXISTS paragraph (
                           desc_id INTEGER NOT NULL ,
                           paragraph_order INTEGER NOT NULL PRIMARY KEY ,
                           texte text NOT NULL
);

CREATE TABLE IF NOT EXISTS customer(
                         id SERIAL NOT NULL PRIMARY KEY,
                         email VARCHAR(100) NOT NULL UNIQUE,
                         user_lastname VARCHAR(100) NOT NULL,
                         user_firstname VARCHAR(100),
                         pass VARCHAR(100) NOT NULL

);
CREATE TABLE IF NOT EXISTS copy(
                     id SERIAL NOT NULL PRIMARY KEY,
                     isbn VARCHAR(20) NOT NULL,
                     lib_id INTEGER NOT NULL,
                     FOREIGN KEY (isbn) REFERENCES book(isbn),
                     FOREIGN KEY (lib_id) REFERENCES library(id)

);

CREATE TABLE IF NOT EXISTS rent(
                     date_start TIMESTAMP NOT NULL ,
                     date_end TIMESTAMP NOT NULL,
                     renew BOOLEAN DEFAULT FALSE,
                     customer_id INTEGER NOT NULL,
                     copy_id INTEGER NOT NULL,
                     FOREIGN KEY (customer_id) REFERENCES customer(id),
                     FOREIGN KEY (copy_id) REFERENCES copy(id)
);
CREATE TABLE IF NOT EXISTS library(
                     id SERIAL NOT NULL PRIMARY KEY ,
                     lib_name VARCHAR(255) NOT NULL
);


