package JavaJDBC;

import org.postgresql.core.QueryExecutor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static String URL = "jdbc:postgresql://localhost:5432/postgres";
    static String userName = "postgres";
    static String password = "Determined123";


    public static void main(String[] args) {
         //get();
        //Update();
        //Create();
        //Delete();
        //get1();
        Update1();
    }

    public static void get() {

        try {
            Connection connection = DatabaseConnection.connection(URL, userName, password);
            System.out.println("connected");

            PostgresQuery.SelectQuery(connection);

            DatabaseConnection.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Update() {
        try {
            Connection connection = DatabaseConnection.connection(URL, userName, password);
            System.out.println("Connected");

            int idToUpdate = 1;
            String updatedName = "cruz";

            PostgresQuery.UpdateQuery(connection, idToUpdate, updatedName);
            PostgresQuery.SelectQuery(connection);

            DatabaseConnection.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Create(){
        try{
            Connection connection = DatabaseConnection.connection(URL,userName,password);
            System.out.println("connected");

            int id = 201;
            String first_name = "Mark";
            String last_name = "Webber";

            PostgresQuery.Create(connection,id,first_name,last_name);

            DatabaseConnection.CloseConnection(connection);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void Delete(){
        try {
            Connection connection =DatabaseConnection.connection(URL,userName,password);
            System.out.println("Connected");

            List<Integer> idsToDelete = new ArrayList<>(Arrays.asList(201,202));
            PostgresQuery.Delete(connection,idsToDelete);

            DatabaseConnection.CloseConnection(connection);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static void get1() {

        try {
            Connection connection = DatabaseConnection.connection(URL, userName, password);
            System.out.println("connected");

            PostgresQuery.SelectQuery1(connection);

            DatabaseConnection.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Update1() {
        try {
            Connection connection = DatabaseConnection.connection(URL, userName, password);
            System.out.println("Connected");

            int idToUpdate = 133;
            String updatedTitle = "Unlikely Chemistry";

            PostgresQuery.UpdateQuery1(connection, idToUpdate, updatedTitle);
            PostgresQuery.SelectQuery(connection);

            DatabaseConnection.CloseConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}

























