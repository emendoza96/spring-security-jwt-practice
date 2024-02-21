INSERT INTO user_entity (id, email, username, password) VALUES (1, 'emi@gmail.com', 'emi123', '$2a$10$3MqlE56NbZRMPDduskqlV.j5UepDJn/NJcvzgaLvaUO76u/.ar65e');
INSERT INTO user_entity (id, email, username, password) VALUES (2, 'celi@gmail.com', 'celi123', '$2a$10$Qf3m9/VjtJmIrG2Or5039.cJmVlfYUUs9fBcIRoiBfYuLdZFWzW3S');
INSERT INTO user_entity (id, email, username, password) VALUES (3, 'test@gmail.com', 'test', '$2a$10$Qf3m9/VjtJmIrG2Or5039.cJmVlfYUUs9fBcIRoiBfYuLdZFWzW3S');


INSERT INTO role_entity (id, role) VALUES (1, 'ADMIN');
INSERT INTO role_entity (id, role) VALUES (2, 'USER');
INSERT INTO role_entity (id, role) VALUES (3, 'INVITED');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO user_role (user_id, role_id) VALUES (3, 3);
