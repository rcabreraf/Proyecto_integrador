package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import controller.conexion;

public class cotizable {
	
	
	
	public boolean cotizar(String fecha, String tiempo_entrega, String peso, String tipo_carga, String ci, String ciudad_destino, String ciudad_origen,int id_destino,int id_origen) {
		insertarDestino(ciudad_destino,id_destino);
		insertarOrigen(ciudad_origen,id_origen);
		boolean ans=false;
		conexion con = new conexion();
		ResultSet rs = null;
		LocalTime tiempo = LocalTime.of(Integer.parseInt(tiempo_entrega), 0, 0); 
		try {
			String sql = "insert into cotizable (fecha,tiempo_entrega,peso,tipo_carga,ci,ciudad_destino,ciudad_origen,estado,unidad)"
					+ "values ('"+fecha+"','"+tiempo+"','"+peso+"','"+tipo_carga+"','"+ci+"','"+ciudad_destino+"','"+ciudad_origen+"',0,0)";
			rs = con.Consulta(sql);
			System.out.println(sql);
			con.cerrarConexion();
			ans=true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public void insertarDestino(String destino, int id_provincia) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "insert into destino (ciudad_destino, id_provincia)"
					+ "values ('"+destino+"','"+id_provincia+"')";
			System.out.println(sql);
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void insertarOrigen(String origen, int id_provincia) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "insert into origen ( ciudad_origen, id_provincia)"
					+ "values ('"+origen+"','"+id_provincia+"')";
			System.out.println(sql);
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

//************************************************************************************************
	public String getCotizable(String ci) {

		conexion con = new conexion();
		ResultSet rs = null;	
		String ans="<table style='background-color:#74BDFF;text-align:center;' border='1'>";
		try {
			String sql = "select tipo_carga,fecha,ciudad_origen,ciudad_destino, estado from cotizable where ci = '"+ci+"'";
			rs = con.Consulta(sql);
			ans += "<tr style='color:#FFFFFF'>"
					+ "<td>Tipo</td>\r\n" + 
					"			<td>Fecha de Pedido</td>\r\n" + 
					"			<td>Origen</td>\r\n" + 
					"			<td>Destino</td>\r\n" + 
					"			<td>Estado</td>\r\n" +  
					"		</tr>\r\n";
			while (rs.next()) {
				ans += "<tr>"
					+  "<td>"+rs.getString("tipo_carga")+"</td>"
					+  "<td>"+rs.getDate("fecha")+"</td>"
					+  "<td>"+rs.getString("ciudad_origen")+"</td>"
					+  "<td>"+rs.getString("ciudad_destino")+"</td>"
					+  "<td>"+getEstado(rs.getInt("estado"))+"</td>"
					+  "</tr>"; 
			}
			ans += "</table>"; 
			con.cerrarConexion(); 
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	public void actualizarEstado(String unidad, String id) {
		conexion con = new conexion();
		ResultSet rs = null;
		try {
			String sql = "update cotizable set estado = 1, unidad = '"+unidad+"' where id_cotizable = "+id;
			System.out.println(sql);
			rs = con.Consulta(sql);
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getEstado(int estado) {
		
		if (estado==0) {
			return "Solicitado";
		}else {
			if(estado == 1) {
			return "En camino";
			}else {
				return "Entregado";
			}
		}
		
	}
	
}
