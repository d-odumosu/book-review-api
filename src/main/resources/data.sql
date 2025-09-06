
INSERT INTO users (id, username, email, role) VALUES
(1, 'amina', 'amina@example.com', 'USER'),
(2, 'james', 'james@example.com', 'ADMIN'),
(3, 'chioma', 'chioma@example.com', 'USER'),
(4, 'lucas', 'lucas@example.com', 'USER'),
(5, 'fatima', 'fatima@example.com', 'MODERATOR'),
(6, 'michael', 'michael@example.com', 'USER'),
(7, 'grace', 'grace@example.com', 'USER'),
(8, 'ibrahim', 'ibrahim@example.com', 'USER'),
(9, 'nora', 'nora@example.com', 'USER'),
(10, 'peter', 'peter@example.com', 'USER'),
(11, 'sophia', 'sophia@example.com', 'USER'),
(12, 'daniel', 'daniel@example.com', 'USER'),
(13, 'leila', 'leila@example.com', 'USER'),
(14, 'ahmed', 'ahmed@example.com', 'USER'),
(15, 'john', 'john@example.com', 'USER'),
(16, 'maryam', 'maryam@example.com', 'USER'),
(17, 'tolu', 'tolu@example.com', 'USER'),
(18, 'emma', 'emma@example.com', 'USER'),
(19, 'paul', 'paul@example.com', 'USER'),
(20, 'zara', 'zara@example.com', 'USER');


INSERT INTO book (id, title, author, rating, synopsis, genre) VALUES
(1, 'Half of a Yellow Sun', 'Chimamanda Ngozi Adichie', 5, 'Story set during the Nigerian Civil War.', 'Historical Fiction'),
(2, 'Purple Hibiscus', 'Chimamanda Ngozi Adichie', 4, 'Coming-of-age story in postcolonial Nigeria.', 'Fiction'),
(3, 'Things Fall Apart', 'Chinua Achebe', 5, 'Classic novel about Igbo society and colonialism.', 'Classic'),
(4, 'Americanah', 'Chimamanda Ngozi Adichie', 3, 'A love story exploring race and migration.', 'Romance'),
(5, 'Born a Crime', 'Trevor Noah', 5, 'Memoir of growing up in South Africa under apartheid.', 'Biography'),
(6, 'The Famished Road', 'Ben Okri', 4, 'Magical realist novel about an abiku child.', 'Magical Realism'),
(7, 'Season of Migration to the North', 'Tayeb Salih', 4, 'Story of postcolonial identity and exile.', 'Literary Fiction'),
(8, 'The Joys of Motherhood', 'Buchi Emecheta', 5, 'Life of a Nigerian woman navigating tradition and modernity.', 'Fiction'),
(9, 'So Long a Letter', 'Mariama Bâ', 4, 'Epistolary novel on women, tradition, and independence.', 'Literary Fiction'),
(10, 'No Longer at Ease', 'Chinua Achebe', 3, 'Sequel to Things Fall Apart about corruption and colonial rule.', 'Classic'),
(11, 'The Secret Lives of Baba Segi’s Wives', 'Lola Shoneyin', 4, 'Dark comedy exploring polygamy in Nigeria.', 'Fiction'),
(12, 'Every Day is for the Thief', 'Teju Cole', 3, 'Narrative of a returnee navigating Lagos.', 'Fiction'),
(13, 'Open City', 'Teju Cole', 4, 'Meditative novel set in New York, exploring identity.', 'Literary Fiction'),
(14, 'The Fishermen', 'Chigozie Obioma', 5, 'A prophecy changes the fate of four brothers.', 'Fiction'),
(15, 'An Orchestra of Minorities', 'Chigozie Obioma', 4, 'Epic tale of love, destiny, and Igbo cosmology.', 'Fiction'),
(16, 'Waiting for an Angel', 'Helon Habila', 3, 'Struggles of life under a military dictatorship.', 'Fiction'),
(17, 'Measuring Time', 'Helon Habila', 4, 'Twin brothers take different life paths.', 'Historical Fiction'),
(18, 'Graceland', 'Chris Abani', 3, 'Young Elvis impersonator in Lagos slum.', 'Fiction'),
(19, 'Behold the Dreamers', 'Imbolo Mbue', 5, 'Cameroonian family in New York during financial crisis.', 'Fiction'),
(20, 'We Need New Names', 'NoViolet Bulawayo', 4, 'A girl’s journey from Zimbabwe to America.', 'Fiction');


INSERT INTO review (id, content, rating, book_id, user_id) VALUES
(1, 'Absolutely loved this book, very moving.', 5, 1, 1),
(2, 'Well written but a bit slow in parts.', 3, 2, 2),
(3, 'A masterpiece. Every student should read it.', 5, 3, 3),
(4, 'Not really my style, but beautifully written.', 3, 4, 4),
(5, 'Hilarious and heartbreaking at the same time.', 5, 5, 5),
(6, 'A deep and imaginative novel.', 4, 6, 6),
(7, 'Challenging read but rewarding.', 4, 7, 7),
(8, 'Strong storytelling, I enjoyed it.', 4, 8, 8),
(9, 'Couldn’t put it down!', 5, 9, 9),
(10, 'A book that stays with you long after reading.', 5, 10, 10),
(11, 'Unique and powerful, though dense in style.', 4, 11, 11),
(12, 'Simple, elegant, and insightful.', 5, 12, 12),
(13, 'Didn’t connect with me, but I see its value.', 3, 13, 13),
(14, 'A bold story told with creativity.', 4, 14, 14),
(15, 'Philosophical, though sometimes hard to follow.', 3, 15, 15);

-- Users with no reviews: 16, 17, 18, 19, 20
-- Books with no reviews: 16, 17, 18, 19, 20
