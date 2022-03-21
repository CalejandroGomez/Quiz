package GameTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class ConectionBD {
	
	static String url = "jdbc:mysql://localhost:3306/participants?useSSL=false";
	static String user = "root";
	static String password = "alejandro18";	
		
	public void agregar(String usuario, String contraseña, int puntajeIn) {
		
		
		// Conncetion with the BD
		try (Connection conexion = DriverManager.getConnection(url, user, password);) {
		// Query to insert the initial info
			PreparedStatement ps = conexion.prepareStatement(
					"insert into usuariosbd (usuario, clave, puntaje) values (?,?,?)");

			ps.setString(1, usuario);
			ps.setString(2, contraseña);
			ps.setInt(3, puntajeIn);

			try {
				int resultado = ps.executeUpdate();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
				return;
			}

	} catch (SQLException sqlEx) {
		sqlEx.printStackTrace();

		}

	}
	
	
	public void actualizarPuntaje(int score) {		
		
		
		// Conection with the BD
		try (Connection conexion = DriverManager.getConnection(url, user, password);) {
			// Query that help us to update the score 
			PreparedStatement ps = conexion.prepareStatement("select * from usuariosbd");
			
			ResultSet rs = ps.executeQuery();
			
			rs.last();
			int pastScore = rs.getInt("puntaje");					
			int idUser = rs.getInt("idusuariosbd");	
			score = pastScore + score;
			
			System.out.println("Total Score: " + score);
			cambiarPuntaje(score, idUser);
							

	} catch (SQLException sqlEx) {
		sqlEx.printStackTrace();

		}

	}

	

	public void cambiarPuntaje(int score , int idUser) {

		try (Connection conexion = DriverManager.getConnection(url, user, password);) {
			
			PreparedStatement ps = conexion.prepareStatement("update usuariosbd set puntaje=? where idusuariosbd=?");
			 		
			ps.setInt(1, score);	
			ps.setInt(2, idUser);
			
			int resultado = ps.executeUpdate();
			

	} catch (SQLException sqlEx) {
		sqlEx.printStackTrace();

		}
	}	
}
