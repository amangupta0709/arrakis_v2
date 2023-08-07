INSERT INTO User VALUES(1, 'Akash Rao', 'akash.rao@gmail.com', 'FINANCIAL ANALYST');
INSERT INTO User VALUES(2, 'Akhila Nori', 'akhila.nori@gmail.com', 'CA');
INSERT INTO User VALUES(3, 'Anjali Dofe', 'anjali.dofe@gmail.com', 'BUSINESS ANALYST');

INSERT INTO Book VALUES(1, 'GOVT BOND');
INSERT INTO Book VALUES(2, 'CORP BOND');

INSERT INTO BookUser VALUES(1, 1);
INSERT INTO BookUser VALUES(1, 2);
INSERT INTO BookUser VALUES(1, 3);
INSERT INTO BookUser VALUES(2, 1);
INSERT INTO BookUser VALUES(2, 2);

INSERT INTO Security VALUES(1, 'IN0004026251', '037833100', 'Gov. of India', '2025-12-31', 7.5, 'Yearly', 1000, 'Not-Matured');
INSERT INTO Security VALUES(2, 'IN0005627909', '037833100', 'STATE BANK OF INDIA', '2023-08-01', 9, 'Cumulative', 1000, 'Matured');
INSERT INTO Security VALUES(3, 'IN0007777666', '037833100', 'Sriram Finance', '2024-01-01', 11, 'Monthly', 1000, 'Not-Matured');

INSERT INTO CounterParty VALUES (1, 'ICICI Bank');
INSERT INTO CounterParty VALUES (2, 'HDFC Bank');
INSERT INTO CounterParty VALUES (3, 'JP Morgan');

INSERT INTO Trade VALUES(1, 1, 1, 1, 5, 'SUCCESS', 10000.0, 'BUY', '2022-12-20', '2022-12-21');
INSERT INTO Trade VALUES(2, 1, 1, 2, 10, 'SUCCESS', 20000.0, 'BUY', '2022-12-25', '2022-12-26');
INSERT INTO Trade VALUES(3, 1, 2, 1, 2, 'SUCCESS', 4000.0, 'BUY', '2022-11-29', '2022-11-30');
INSERT INTO Trade VALUES(4, 2, 1, 1, 10, 'SUCCESS', 20000.0, 'BUY', '2022-12-20', '2022-12-21');
INSERT INTO Trade VALUES(5, 2, 2, 2, 20, 'SUCCESS', 40000.0, 'BUY', '2022-12-25', '2022-12-26');
INSERT INTO Trade VALUES(6, 2, 3, 3, 4, 'SUCCESS', 8000.0, 'BUY', '2022-11-29', '2022-11-30');


--INSERT INTO owners (owner_id, name) VALUES (1, 'Selvyn');
--INSERT INTO owners (owner_id, name) VALUES (2, 'Martina');
--
--INSERT INTO dogs (dog_id, name, age, owner_id) VALUES (1, 'Einstein', 3, 1);
--INSERT INTO dogs (dog_id, name, age, owner_id) VALUES (2, 'Kaya', 5, 2);
--INSERT INTO dogs (dog_id, name, age, owner_id) VALUES (3, 'Lassie', 7, 2);