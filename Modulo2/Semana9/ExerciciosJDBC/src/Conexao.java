import java.sql.*;
import java.util.List;

public class Conexao {
    String url = "jdbc:oracle:thin:@localhost:1521/devinphilips";
    String user = "sys as sysdba";
    String password = "admin";

    public void conectar() {

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println(conn.getSchema());
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("SELECT * FROM PRODUTOS");
            stm.executeUpdate("INSERT INTO produtos (nome, descricao, preco) VALUES ('Livro bom demais', 'muito bom mesmo', 900)");
            conn.commit();
            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.println(id + " a " + nome);
            }
            stm.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
