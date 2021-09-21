
--Create database biblio;

CREATE TABLE editor(
                       id SERIAL NOT NULL  PRIMARY KEY,
                       editorName VARCHAR(100) NOT NULL
);

CREATE TABLE description(
                            id SERIAL NOT NULL  PRIMARY KEY,
                            desc_title VARCHAR(100)
);

CREATE TABLE language(
    lang_name VARCHAR(50) NOT NULL PRIMARY KEY
);

Create table book (
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

CREATE TABLE type (
                      id SERIAL NOT NULL PRIMARY KEY,
                      type_name VARCHAR(20) NOT NULL
);

CREATE TABLE type_of_Book(
                             isbn VARCHAR(20) NOT NULL,
                             type_id INTEGER NOT NULL,
                             FOREIGN KEY (isbn) REFERENCES  book(isbn),
                             FOREIGN KEY (type_id) REFERENCES type(id)
);

CREATE TABLE author(
                       id SERIAL NOT NULL PRIMARY KEY,
                       lastname VARCHAR(100) NOT NULL,
                       firstname VARCHAR(100)
);

CREATE TABLE author_book(
                            isbn VARCHAR(20) NOT NULL,
                            author_id INTEGER NOT NULL,
                            FOREIGN KEY (isbn) REFERENCES  book(isbn),
                            FOREIGN KEY (author_id) REFERENCES author(id)
);

CREATE TABLE paragraph (
                           desc_id INTEGER NOT NULL ,
                           paragraph_order INTEGER NOT NULL PRIMARY KEY ,
                           texte text NOT NULL
);

CREATE TABLE customer(
                         id SERIAL NOT NULL PRIMARY KEY,
                         email VARCHAR(100) NOT NULL UNIQUE,
                         user_lastname VARCHAR(100) NOT NULL,
                         user_firstname VARCHAR(100),
                         pass VARCHAR(100) NOT NULL

);
CREATE TABLE copy(
                     id SERIAL NOT NULL PRIMARY KEY,
                     isbn VARCHAR(20) NOT NULL,
                     library VARCHAR(50) NOT NULL
);

CREATE TABLE rent(
                     date_start TIMESTAMP NOT NULL ,
                     date_end TIMESTAMP NOT NULL,
                     renew BOOLEAN DEFAULT FALSE,
                     user_id INTEGER NOT NULL,
                     copy_id INTEGER NOT NULL,
                     FOREIGN KEY (user_id) REFERENCES customer(id),
                     FOREIGN KEY (copy_id) REFERENCES copy(id)
);



