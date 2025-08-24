# Hotel-Management-System
Hotel Management System

This project is a Hotel Management System developed in Java using Swing for the graphical user interface and YugSQL as the database. It was my second project in college and helped me gain practical experience in Java programming, GUI design, and database integration.

Features

User Authentication

Login and Signup functionality for both customers and staff.

Hotel Management

Manage hotel details and services offered.

Reservation System

Create, view, and manage room reservations.

Staff Management

Separate staff login and staff-related operations.

Welcome Screen

A welcoming interface for users when the application starts.

Project Structure

The project consists of multiple classes and GUI forms:

dbhandler.java → Handles database connections and queries with YugSQL.

Hotel.java → Manages hotel-related data and core logic.

Login.java / Login.form → Login page for users.

Signup.java / Signup.form → Signup page for new users.

Reservation.java / Rezervation.form → Reservation form and logic for booking.

Services.java / Services.form → Manages services offered by the hotel.

Staff.java / Staff.form → Manages staff-related data.

StaffLogin.java / StaffLogin.form → Separate login system for staff members.

Welcome.java / Welcome.form → The welcome screen when the application launches.

Technologies Used

Java (Swing) → For building the desktop GUI.

YugSQL → For database storage and management.

How to Run

Clone the repository:

git clone https://github.com/your-username/hotel-management-system.git
cd hotel-management-system


Make sure you have Java JDK installed.

Connect the project to your YugSQL database (update dbhandler.java with your DB credentials).

Compile and run the project:

javac *.java
java Welcome

Screenshots (Optional)

Add screenshots of the login, signup, reservation, and welcome screens here for better presentation.

Learning Outcome

This project enhanced my understanding of:

GUI development with Java Swing.

Handling user authentication and reservations.

Database connectivity and CRUD operations.

Organizing multiple forms and classes in a Java project.
