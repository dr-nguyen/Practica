package com.tosirom.practica.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *.
 */
public class Plati {
    public int ID;
    public double Suma;
    public String Metoda;
    public Date Data;
    public int Id_Inchiriere;

    public Plati() {}

    public Plati(
        int ID,
        double Suma,
        String Metoda,
        Date Data,
        int Id_Inchiriere
    ) {
        this.ID = ID;
        this.Suma = Suma;
        this.Metoda = Metoda;
        this.Data = Data;
        this.Id_Inchiriere = Id_Inchiriere;
    }

    private static Plati _ReadPlati(ResultSet result) throws SQLException {
        int id = result.getInt("ID");
        double suma = result.getDouble("Suma");
        String metoda = result.getString("Metoda");
        Date data = result.getDate("Data");
        int idInchiriere = result.getInt("Id_Inchiriere");

        Plati plata = new Plati(id, suma, metoda, data, idInchiriere);
        return plata;
    }

    public static ArrayList<Plati> GetAllPlati() {
        ArrayList<Plati> platiList = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String SQL = "SELECT * FROM Plati";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(SQL);

            while (result.next()) {
                platiList.add(_ReadPlati(result));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return platiList;
    }

    public static Plati GetPlatiById(int id) {
        Plati plata = new Plati();

        try (Connection conn = Database.getConnection()) {
            String SQL = "SELECT * FROM Plati WHERE ID = " + id;
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(SQL);

            if (result.next()) {
                plata = _ReadPlati(result);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return plata;
    }
    public static boolean CreatePlati(Plati in) {
        try (Connection conn = Database.getConnection()) {
            String SQL = "INSERT INTO Plati (ID,Suma,Metoda,Data,ID_Inchiriere) VALUES (?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(SQL);
            statement.setInt(1, in.ID);
            statement.setDouble(2, in.Suma);
            statement.setString(3, in.Metoda);
            statement.setDate(4,in.Data);
            statement.setInt(5,in.Id_Inchiriere);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
     public static boolean UpdatePlati(Plati in) {
        try (Connection conn = Database.getConnection()) {
            String SQL = "UPDATE Plati SET Suma = ?, Data = ? WHERE ID = ?";
            PreparedStatement statement = conn.prepareStatement(SQL);
            statement.setDouble(1, in.Suma);
            statement.setDate(2, in.Data);
            statement.setInt(3, in.ID);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean DeletePlati(Integer id) {

        try (Connection conn = Database.getConnection()) {
            String SQL = "DELETE FROM Plati WHERE ID = ?";
            PreparedStatement statement = conn.prepareStatement(SQL);
            statement.setInt(1, id);
            
            statement.executeUpdate();
            
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public String toString() {
        return this.ID + ", " + this.Suma + ", " + this.Metoda + ", " + this.Data + ", " + this.Id_Inchiriere;
    }
}
