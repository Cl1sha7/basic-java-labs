package edu.ntudp.fit.klishevych.lab5;

import java.sql.*;

public class lab5 {
    private static final String URL = "jdbc:postgresql://localhost/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Підключено до бази даних PostgreSQL!");

            int targetMonth = 1;

            String sql = "SELECT id, last_name, first_name, fathers_name, birth_date, record_book " +
                    "FROM students WHERE EXTRACT(MONTH FROM birth_date) = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, targetMonth);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String lastName = resultSet.getString("last_name");
                    String firstName = resultSet.getString("first_name");
                    String fathersName = resultSet.getString("fathers_name");
                    String birthDate = resultSet.getString("birth_date");
                    int recordBook = resultSet.getInt("record_book");

                    System.out.printf("%d, %s, %s, %s, %s, %d%n",
                            id, lastName, firstName, fathersName, birthDate, recordBook);
                }
            }
        } catch (SQLException e) {
            System.out.println("Помилка підключення до бази даних.");
            e.printStackTrace();
        }
    }
}
