CREATE TABLE sample (
sample_id INT PRIMARY KEY AUTO_INCREMENT,
sample_name VARCHAR(100),
sample_type VARCHAR(50),
collection_date DATE,
status VARCHAR(20)
);

CREATE TABLE test (
test_id INT PRIMARY KEY AUTO_INCREMENT,
sample_id INT,
test_name VARCHAR(100),
result VARCHAR(50),
approved_by VARCHAR(100)
);
