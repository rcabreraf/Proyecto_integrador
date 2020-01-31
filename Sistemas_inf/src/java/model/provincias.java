package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.conexion;

public class provincias {
	public String cargarprovincias(String name) {

		conexion con = new conexion();
		ResultSet rs = null;
		String ans="<select name="+name+">";
		try {
			String sql = "select * from provincias";
			rs = con.Consulta(sql);
			while (rs.next()) {
				ans += "<option value='"+rs.getInt("id_provincia")+"'>"+rs.getString("nom_provincia")+"</option>";
			}
			ans += "</selected>";
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public String getProvinciaName(int id_provincia) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from provincias where id_provincia = '"+id_provincia+"'";
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans =rs.getString("nom_provincia");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
}
