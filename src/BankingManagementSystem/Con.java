package BankingManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;
    public void Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Sibiharan1234@");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

