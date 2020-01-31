package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.conexion;

public class chofer {
	
	public String getPlaca(String ci) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans=null;
		try {
			String sql = "select * from vehiculo_2 where ci = '"+ci+"'";
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans =rs.getString("placa");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public int getIdVehiculo(String ci) {
		conexion con = new conexion();
		ResultSet rs = null;
		int ans=0;
		try {
			String sql = "select * from vehiculo_2 where ci = '"+ci+"'";
			rs = con.Consulta(sql);
			if (rs.next()) {
				ans =rs.getInt("id_vehiculo");
			}
			con.cerrarConexion();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	
	public String getCotizable(String unidad) {
		conexion con = new conexion();
		ResultSet rs = null;
		String ans="	<table style='background-color:#74BDFF;text-align:center;' border='1'>\r\n" + 
				"    			<tr style='color:#FFFFFF'>\r\n" + 
				"    				<td>Ci Cliente</td>\r\n" + 
				"    				<td>Tipo de entrega</td>\r\n" + 
				"    				<td>Salida</td>\r\n" + 
				"    				<td>Llegada</td>\r\n" + 
				"    				<td>Estado</td>\r\n" + 
				"					<td>Entregar</td>"+
				"    				\r\n" + 
				"    			</tr>\r\n";
				
		try {
			String sql = "select * from cotizable where unidad ='"+unidad+"'";
			System.out.println(sql);
			rs = con.Consulta(sql);
			while (rs.next()) {
				ans += "<tr>";
				ans += "<td>"+rs.getString("ci")+"</td>";
				ans += "<td>"+rs.getString("tipo_carga")+"</td>";
				ans += "<td>"+rs.getString("ciudad_origen")+"</td>";
				ans += "<td>"+rs.getString("ciudad_destino")+"</td>";
				ans += "<td>"+getEstado(rs.getInt("estado"))+"</td>";
				ans += "<td> <a class='btn btn-outline-primary' href='chofer_entregar.jsp?cod="+rs.getInt("id_cotizable")+"'>Entregar</a></td>";
				ans += "</tr>";
			}
			con.cerrarConexion();
			ans += "    		</table>";
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}	
	
	public String getEstado(int estado) {
		String ans=null;
		if(estado == 1) {
			return "Asignado";
		}else {
			if(estado == 3) {
				return "Entregado";
			}else {
			return "En camino";
			}
		}
	}
	
	public void BusListo(String placa) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "update vehiculo_2 set estado = 0 where placa = '"+placa+"'";
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateEstado(String cod) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "update cotizable set estado = 3 where id_cotizable ="+cod;
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
