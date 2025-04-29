# OOP Project Assignment  
**Construction, Hotel, and Traffic Fine Management Systems**  
_By NZIKWINKUNDA ALINE, ID: 26654_

---

## Overview

This project showcases the application of **Object-Oriented Programming (OOP)** principles through the implementation of three real-world Java systems:

1. **Site Construction Management System**
2. **Hotel Booking and Billing System**
3. **Rwanda National Police Traffic Fine Management System**

Each system uses **abstract classes**, **inheritance**, **modular design**, and **data validation** to ensure clean, scalable, and reusable code.

---

## Technologies Used

- **Java 21 (locally)** and **OpenJDK 17 (inside Docker)**
- **Docker** (for containerized execution)
- **Git & GitHub** (for version control and sharing)
- **VS Code** (for development)

---
## Description of Systems

### 1. Site Construction Management
Simulates material delivery, usage tracking, and cost estimation on construction sites.

### 2. Hotel Management System
Handles room booking, guest checkout, and billing with dynamic room status updates and full input validation.

### 3. Rwanda Police Traffic Fine System
Records traffic violations, assesses fines based on violation type, and processes payment status. Validates plate formats and national IDs.

---

## How to Run

### With Docker
1. **Build the image**  
```bash
docker build -t oop_project_26654 .
```
2. **Run the container**

```bash
docker run -it oop_project_26654
```

### To Switch Between Systems:
Edit the CMD in Dockerfile to run a different system:

```dockerfile
CMD ["java", "casestudy.realconstructor.RealConstructorMain"]
CMD ["java", "casestudy.lemigohotel.LemigoHotelMain"]
CMD ["java", "casestudy.rwandanationalpolice.RwandaPoliceMain"]
```
---

- **Docker Hub**: [karlie1/oop_project_26654](https://hub.docker.com/repositories/karlie1) 
- **GitHub Repository**: [aline_nzikwinkunda](https://github.com/Aline-eng/aline_nzikwinkunda)
