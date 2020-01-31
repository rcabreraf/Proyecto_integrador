package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.*;

public class usuario {
	
	public int Logear(String correo,String contra) {

		conexion con = new conexion();
		ResultSet rs = null;
		int ans=0;
		try {
			String sql = "select * from usuario  where correo ='"+correo+"' and clave = '"+contra+"'";
			System.out.println(sql);
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans=rs.getInt("id_tipo_usuario");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public boolean registrarUsuario(String ci,String nombre, String apellido, String genero, String correo, String clave,String id_tipo_usuario) {
		boolean ans=false;
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "insert into usuario(ci,nombre,apellidos,genero,correo,direcccion,clave,telefono,id_tipo_usuario)"
					+ "values ('"+ci+"','"+nombre+"','"+apellido+"','"+genero+"','"+correo+"','"+clave+"',"+id_tipo_usuario+")";
			rs = con.Consulta(sql);
			con.cerrarConexion();
			ans=true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public String getCiByCoCla(String correo,String contra) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from usuario  where correo ='"+correo+"' and clave = '"+contra+"'";
			System.out.println(sql);
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans=rs.getString("ci");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public void setCi(String ci) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "insert into login (ci)"
					+ "values ('"+ci+"')";
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getCi() {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from login";
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans=rs.getString("ci");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public String getNameByCi(String ci) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from usuario where ci ='"+ci+"'";
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans=rs.getString("nombre");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public String getLastNameByCi(String ci) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from usuario where ci ='"+ci+"'";
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans=rs.getString("apellidos");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	
	public void eraseCi() {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "delete from login";
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
