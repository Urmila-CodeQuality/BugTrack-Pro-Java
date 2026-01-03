CREATE TABLE BugReports (
    BugID INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(255) NOT NULL,
    Description TEXT,
    Severity ENUM('Low', 'Medium', 'High', 'Critical'),
    Status ENUM('Open', 'In Progress', 'Fixed', 'Closed') DEFAULT 'Open',
    ReporterName VARCHAR(100),
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
