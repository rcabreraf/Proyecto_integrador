package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.conexion;

public class vehiculo {
	
	public String getVehiculos(String name) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans="<select id='"+name+"'>";
		try {
			String sql = "select * from vehiculo_2 where estado=0";
			rs = con.Consulta(sql);
			while (rs.next()) {
				ans+= "<option value='"+rs.getInt("id_vehiculo")+"'>"+rs.getString("placa")+"</option>";
			}
			con.cerrarConexion();
		ans += "</select>";
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public String getPlaca(String ide) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from vehiculo_2 where id_vehiculo = "+ide;
			rs = con.Consulta(sql);
			while (rs.next()) {
				ans = rs.getString("placa");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	
	
	
	public void actualizarEstado(String id) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "update vehiculo_2 set estado = 1 where id_vehiculo = "+id;
			System.out.println(sql);
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void registrarDuenio(String placa,String ci) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "insert into vehiculo_2(placa,estado,ci) values ('"+placa+"',0,'"+ci+"')";
			System.out.println(sql);
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
