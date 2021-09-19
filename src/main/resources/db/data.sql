
/* COUNSELOR */
INSERT INTO COUNSELOR(id, password, name, created_at) values('cs001','$2a$10$6u/ZKYsyeUat7Cyc3wu9xeh4/VKE8l/W4d98ozXvmMwa.pX7XPxV2','상담원001', CURRENT_TIMESTAMP );
INSERT INTO COUNSELOR(id, password, name, created_at) values('cs002','$2a$10$6u/ZKYsyeUat7Cyc3wu9xeh4/VKE8l/W4d98ozXvmMwa.pX7XPxV2','상담원002', CURRENT_TIMESTAMP);
INSERT INTO COUNSELOR(id, password, name, created_at) values('cs003','$2a$10$6u/ZKYsyeUat7Cyc3wu9xeh4/VKE8l/W4d98ozXvmMwa.pX7XPxV2','상담원003', CURRENT_TIMESTAMP);
INSERT INTO COUNSELOR(id, password, name, created_at) values('cs004','$2a$10$6u/ZKYsyeUat7Cyc3wu9xeh4/VKE8l/W4d98ozXvmMwa.pX7XPxV2','상담원004', CURRENT_TIMESTAMP);
INSERT INTO COUNSELOR(id, password, name, created_at) values('cs005','$2a$10$6u/ZKYsyeUat7Cyc3wu9xeh4/VKE8l/W4d98ozXvmMwa.pX7XPxV2','상담원005', CURRENT_TIMESTAMP);


/* ROLE */

INSERT INTO ROLE(counselor_id, name, created_at) values('cs001','ROLE_COUNSELOR', CURRENT_TIMESTAMP);
INSERT INTO ROLE(counselor_id, name, created_at) values('cs001','ROLE_ADMIN', CURRENT_TIMESTAMP);
INSERT INTO ROLE(counselor_id, name, created_at) values('cs002','ROLE_COUNSELOR', CURRENT_TIMESTAMP);
INSERT INTO ROLE(counselor_id, name, created_at) values('cs003','ROLE_COUNSELOR', CURRENT_TIMESTAMP);
INSERT INTO ROLE(counselor_id, name, created_at) values('cs004','ROLE_COUNSELOR', CURRENT_TIMESTAMP);
INSERT INTO ROLE(counselor_id, name, created_at) values('cs005','ROLE_COUNSELOR', CURRENT_TIMESTAMP);

