 🚗 Car Rental System

 📖 Introduction
 
The Car Rental System is a comprehensive platform designed to modernize the car rental industry by enhancing customer experience, operational efficiency, and inventory management. This system replaces traditional record-keeping methods with a centralized digital solution, facilitating seamless car rentals through an integrated database, user-friendly GUI, and real-time insights via Power BI.

🎯 Project Overview
 
 This project consists of three key components:
        1. Database: A robust relational database designed to manage vehicles, customers, bookings, payments, and maintenance schedules efficiently.
        2. Java Swing GUI: A user-friendly desktop application enabling CRUD (Create, Read, Update, Delete) operations for efficient management of rental operations.
        3. Power BI Dashboard: An interactive reporting solution providing insights into bookings, customer trends, vehicle performance, and revenue metrics.

🛠️ Key Features
 
 Database Features
 - Rental Car Inventory Management: Track vehicle availability, pricing, and maintenance schedules.  
 - Customer Record Retention: Store customer details and booking history for faster check-ins and check-outs.  
 - Operational Efficiency: Automate vehicle returns, cleaning, and maintenance tasks to maximize fleet utilization.  
 - Booking & Payments: Enable online bookings and secure payment processing.  
 - Scalability: Seamlessly manage growing vehicle and customer data across multiple rental agencies.  

 Java Swing GUI Features
 - Admin Dashboard: Manage vehicles, customers, bookings, and maintenance records.  
 - CRUD Operations: Create, view, update, and delete records for vehicles, customers, and bookings.  
 - Role-Based Access: Secure access for admin and staff, ensuring data integrity and privacy.  
 - User-Friendly Interface: Intuitive navigation and responsive design for enhanced user experience.  

 Power BI Dashboard Features
 - Booking Insights: Real-time visualization of bookings by status, location, and customer segment.  
 - Revenue Tracking: Monitor revenue trends, including daily, monthly, and yearly breakdowns.  
 - Fleet Utilization: Analyze vehicle availability, maintenance schedules, and rental frequency.  
 - Customer Insights: View booking history, preferences, and customer satisfaction trends.  

🛠️ Technology Stack
 
 Backend & Database:
 - Database: Microsoft SQL Server  
 - Programming Language: Java (Swing for GUI)  
 - JDBC: For database connectivity  
 - Microsoft Access: For database modeling (Proof of Concept)  
 
 Frontend (GUI):
 - Java Swing: For desktop-based user interface

 Business Intelligence:
 - Power BI: For interactive dashboards and real-time reporting  


🔑 Installation & Setup
 
 1. Database Setup

  - Create the database using the provided SQL scripts (`CarRentalDatabase.sql`).  
  - Ensure correct table relationships and indexing for optimal performance.  
  - Configure the JDBC connection in the Java Swing application.  

 2. Java Swing Application Setup

- Ensure you have Java JDK 11 or higher installed.  
- Clone the project repository.  
    bash
    git clone https://github.com/AnjanaSruthiR/Car-Rental-SystemDatabase-Management.git
- Open the project in NetBeans or IntelliJ.
- Update db.properties with the correct database credentials.
- Build and run the application.

 3. Power BI Dashboard Setup

- Open the CarRentalDashboard.pbix file in Power BI Desktop.
- Refresh the data source to connect with the live database.
- Publish the report to Power BI Service for real-time updates.

🏗️ Database Schema

The following are the key tables in the Car Rental Database:
        - Address: Stores customer and employee addresses.
        - Branch: Manages rental locations.
        - Vehicle: Tracks car details, including type, model, and availability.
        - Person: Links customers and employees with their profiles.
        - Employee: Manages staff details and roles.
        - Customer: Stores customer profiles and booking history.
        - Insurance: Manages insurance policies for rentals.
        - Maintenance: Tracks vehicle maintenance schedules.
        - Booking: Manages car rental reservations.
        - Feedback: Collects customer feedback.
        - Billing: Handles invoices and payments.

📊 Power BI Dashboard Preview

Key Metrics Displayed:
        - Number of Bookings by Status (Confirmed, Canceled, Completed)
        - Average Processing Time for Bookings
        - Fleet Utilization by Vehicle Type
        - Customer Booking Trends
        - Revenue Breakdown by Branch and Vehicle Type

🚀 Future Enhancements

- Notification System: Real-time alerts for booking confirmations and returns.
- Payment Gateway: Secure payment integration for online transactions.
- Mobile App: Extend booking functionality to mobile platforms.

🛠️ Technology Stack

Backend & Database:
        - Database: Microsoft SQL Server, Docker
        - Programming Language: Java (Swing for GUI)
        - JDBC: For database connectivity

Frontend (GUI):
        - Java Swing: For desktop-based user interface

Business Intelligence:
        - Power BI: For interactive dashboards and real-time reporting
