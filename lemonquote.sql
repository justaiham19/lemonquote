CREATE TABLE book
( 
  isbn INTEGER PRIMARY KEY,
  title TEXT,
  author TEXT,
  release_date DATE
);

CREATE TABLE chapter
( 
  chapter_id SERIAL PRIMARY KEY,
  chapter_number INTEGER,
  chapter_name TEXT,
  isbn INTEGER REFERENCES book (isbn)
);

CREATE TABLE quote
( 
  quote_id SERIAL PRIMARY KEY,
  content TEXT,
  score INTEGER,
  chapter_id INTEGER REFERENCES chapter (chapter_id)
);
