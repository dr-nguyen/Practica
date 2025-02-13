package com.tosirom.practica.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 
 */
public class Produse {
    public int ID;
    public String Denumire;
    public double Pret;

    public Produse() {}

    public Produse(
        int ID,
        String Denumire,
        double Pret
    ) {
        this.ID = ID;
        this.Denumire = Denumire;
        this.Pret = Pret;
    }

    private static Produse _ReadProduse(ResultSet result) throws SQLException {
        int id = result.getInt("ID");
        String denumire = result.getString("Denumire");
        double pret = result.getDouble("Pret");

        Produse produs = new Produse(id, denumire, pret);
        return produs;
    }

    public static ArrayList<Produse> GetAllProduse() {
        ArrayList<Produse> produseList = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String SQL = "SELECT * FROM Produse";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(SQL);

            while (result.next()) {
                produseList.add(_ReadProduse(result));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return produseList;
    }

    public static Produse GetProdusById(int id) {
        Produse produs = new Produse();

        try (Connection conn = Database.getConnection()) {
            String SQL = "SELECT * FROM Produse WHERE ID = " + id;
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(SQL);

            if (result.next()) {
                produs = _ReadProduse(result);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return produs;
    } public static boolean CreateProduse(Produse in) {
        try (Connection conn = Database.getConnection()) {
            String SQL = "INSERT INTO Produse (Denumire,Pret) VALUES (?,?)";
            PreparedStatement statement = conn.prepareStatement(SQL);
            statement.setString(1, in.Denumire);
            statement.setDouble(2, in.Pret);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
     public static boolean UpdateProduse(Produse in) {
        try (Connection conn = Database.getConnection()) {
            String SQL = "UPDATE Produse SET Denumire = ?, Pret = ? WHERE ID = ?";
            PreparedStatement statement = conn.prepareStatement(SQL);
            statement.setString(1, in.Denumire);
            statement.setDouble(2, in.Pret);
            statement.setInt(3, in.ID);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static boolean DeleteProduse(Integer id) {

        try (Connection conn = Database.getConnection()) {
            String SQL = "DELETE FROM Produse WHERE ID = ?";
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
        return this.ID + ", " + this.Denumire + ", " + this.Pret;
    }
}
