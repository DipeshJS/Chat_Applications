# Chat Application

This is a chat application built on Java GUI using Java Swing in a multithreaded environment. It utilizes JDBC for password verification and socket programming for connection encryption. The passwords are securely stored in a MySQL database.

## Features

- Real-time chat: Users can engage in real-time conversations with each other.
- Java GUI: The application provides a graphical user interface built with Java Swing.
- Multithreaded environment: Multiple users can connect to the application simultaneously and chat concurrently.
- Password verification: The application uses JDBC to verify user passwords against a MySQL database.
- Connection encryption: The communication between the server and clients is encrypted to ensure security.

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/chat-application.git
   ```

2. Set up the MySQL database:
   - Install MySQL if you haven't already.
   - Create a new database and note down the database name.
   - Create a table named `users` with the following structure:
     ```sql
     CREATE TABLE users (
       id INT PRIMARY KEY AUTO_INCREMENT,
       username VARCHAR(255) UNIQUE,
       password VARCHAR(255)
     );
     ```
   - Update the database connection details in the application code.

3. Build and compile the application:

   ```bash
   cd chat-application
   javac ChatApplication.java
   ```

4. Run the server:

   ```bash
   java ChatServer
   ```

5. Run the client(s):

   ```bash
   java ChatClient
   ```

## Usage

1. Launch the application by running the server and client(s).
2. Enter your username and password to log in.
3. Start chatting with other users who are connected to the server.
4. Enjoy real-time communication in the chat application!

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
