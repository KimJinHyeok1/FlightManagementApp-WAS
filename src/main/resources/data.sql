INSERT INTO aircraft (aircraft_name, aircraft_register_num, aircraft_serial_num, aircraftmtow, aircraft_type, aircraft_description,
                      total_flight_time, created_at, updated_at)
VALUES
    ('A320_NEO', 'REG-1234', 'SERIAL-5678', 70000, 'Passenger', 'Airbus A320 Neo', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('B737_MAX', 'REG-2345', 'SERIAL-6789', 80000, 'Passenger', 'Boeing 737 MAX', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('Cessna_172', 'REG-3456', 'SERIAL-7890', 1200, 'Light Aircraft', 'Cessna Skyhawk 172', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('Gulfstream_G650', 'REG-4567', 'SERIAL-8901', 41000, 'Business Jet', 'High-speed Gulfstream Jet', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('Bombardier_CRJ700', 'REG-5678', 'SERIAL-9012', 33000, 'Regional Jet', 'Efficient regional jet', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('F-22_Raptor', 'REG-6789', 'SERIAL-0123', 38000, 'Fighter', 'Stealth fighter jet', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('Boeing_747_8', 'REG-7890', 'SERIAL-1234', 987000, 'Cargo', 'Large capacity cargo aircraft', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('Airbus_A380', 'REG-8901', 'SERIAL-2345', 1200000, 'Passenger', 'Largest passenger aircraft', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('Embraer_E195', 'REG-9012', 'SERIAL-3456', 52000, 'Regional Jet', 'Fuel-efficient regional jet', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('C-130_Hercules', 'REG-0123', 'SERIAL-4567', 155000, 'Transport', 'Military transport aircraft', 0,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO flight_data (flight_number, aircraft_aircraft_name, wind_speed, wind_direction, humidity, temperature,
                         flight_date, flight_time, payload_item, payload_weight, created_at, updated_at)
VALUES
    ('FL001', 'A320_NEO', 10, 180, 55, 22, CURRENT_TIMESTAMP, 120, 'Camera', 150, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL002', 'B737_MAX', 12, 200, 50, 23, CURRENT_TIMESTAMP, 130, 'Radar', 200, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL003', 'Cessna_172', 14, 220, 45, 20, CURRENT_TIMESTAMP, 140, 'Sensor', 100, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL004', 'Gulfstream_G650', 16, 190, 60, 24, CURRENT_TIMESTAMP, 110, 'Camera', 120, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL005', 'Bombardier_CRJ700', 18, 210, 48, 25, CURRENT_TIMESTAMP, 150, 'Antenna', 300, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL006', 'F-22_Raptor', 15, 230, 52, 26, CURRENT_TIMESTAMP, 170, 'Payload X', 250, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL007', 'Boeing_747_8', 20, 240, 40, 28, CURRENT_TIMESTAMP, 180, 'Radar', 350, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL008', 'Airbus_A380', 22, 200, 55, 30, CURRENT_TIMESTAMP, 200, 'Camera', 180, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL009', 'Embraer_E195', 10, 250, 42, 21, CURRENT_TIMESTAMP, 100, 'Sensor', 140, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('FL010', 'C-130_Hercules', 14, 260, 47, 22, CURRENT_TIMESTAMP, 130, 'Payload Z', 120, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO person (id, name, phone_number, team_name, position, certification, created_at, updated_at)
VALUES
    (1, '홍길동', '010-1234-5678', '운영팀', '팀장', 'A급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (2, '이순신', '010-2345-6789', '개발팀', '부장', 'B급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (3, '김유신', '010-3456-7890', '지원팀', '과장', 'C급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (4, '강감찬', '010-4567-8901', '운영팀', '대리', 'A급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (5, '유관순', '010-5678-9012', '품질팀', '사원', 'B급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (6, '안중근', '010-6789-0123', '운영팀', '팀장', 'A급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (7, '윤봉길', '010-7890-1234', '기획팀', '부장', 'C급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (8, '신사임당', '010-8901-2345', '지원팀', '과장', 'B급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (9, '세종대왕', '010-9012-3456', '운영팀', '대리', 'A급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (10, '정약용', '010-0123-4567', '품질팀', '사원', 'C급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (11, '장보고', '010-1230-4560', '운영팀', '사원', 'A급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (12, '왕건', '010-2130-4561', '기획팀', '과장', 'B급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (13, '최영', '010-3120-4562', '개발팀', '부장', 'C급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (14, '황희', '010-4120-4563', '품질팀', '대리', 'A급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    (15, '박문수', '010-5120-4564', '지원팀', '팀장', 'B급 조종사', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO flight_data_operator (id, flight_number, ep_id, ip_id, observer_id)
VALUES
    (1, 'FL001', 1, 2, null),
    (2, 'FL002', 4, 5, null),
    (3, 'FL003', 7, 8, null),
    (4, 'FL004', 10, 11, 12),
    (5, 'FL005', 13, 14, 15),
    (6, 'FL006', 2, 3, 4),
    (7, 'FL007', 5, 6, 7),
    (8, 'FL008', 8, 9, 10),
    (9, 'FL009', 11, 12, 13),
    (10, 'FL010', 14, 15, 1);



-- 데이터 삽입 스크립트\
INSERT INTO battery (battery_serial_num, battery_type, battery_cell, battery_capacity, total_using_time,
                     flight_data_flight_number, created_at, updated_at)
VALUES
    ('BAT-001', 'Li-ion', 4, 5000, 120, 'FL001', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-002', 'Li-ion', 6, 6000, 150, 'FL002', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-003', 'LiPo', 3, 4500, 110, 'FL003', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-004', 'Li-ion', 4, 5200, 130, 'FL004', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-005', 'LiPo', 6, 7000, 170, 'FL005', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-006', 'NiMH', 8, 3000, 90, 'FL006', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-007', 'Li-ion', 4, 4800, 140, 'FL007', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-008', 'LiPo', 5, 5200, 150, 'FL008', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-009', 'Li-ion', 6, 6500, 160, 'FL009', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-010', 'LiPo', 3, 5000, 120, 'FL010', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-011', 'NiMH', 8, 3100, 95, 'FL001', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-012', 'Li-ion', 4, 4700, 130, 'FL002', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-013', 'LiPo', 5, 4900, 140, 'FL003', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-014', 'Li-ion', 6, 6800, 180, 'FL004', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('BAT-015', 'LiPo', 4, 5100, 115, 'FL005', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


