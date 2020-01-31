package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.conexion;

public class administrador {
	
	private usuario us = new usuario();
	private vehiculo vh = new vehiculo();
	
	public String getNuevosEnvios() {
		String aux="";
		int id=0;
		conexion con = new conexion();
		ResultSet rs = null;	
		String ans="<table style='background-color:#74BDFF;text-align:center;' border='1'>";
		try {
			String sql = "select * from cotizable where estado = 0";
			rs = con.Consulta(sql);
			ans += "<tr style='color:#FFFFFF'>"+
					"					<td>Ci Cliente</td>\r\n" + 
					"    				<td>Nombre del Cliente</td>\r\n" + 
					"    				<td>Tipo de carga</td>\r\n" + 
					"    				<td>Seleccione Vehiculo</td>\r\n" + 
					"    				<td>Asignar</td>"+
					"		</tr>\r\n";
			while (rs.next()) {
				aux = "vehiculo"+rs.getInt("id_cotizable");
				id = rs.getInt("id_cotizable");
				ans += "<input type='hidden' id='"+aux+"2' value='"+id+"'>";
				ans += "<tr>"
					+  "<td >"+rs.getString("ci")+"</td>"
					+  "<td>"+us.getNameByCi(rs.getString("ci"))+" "+us.getLastNameByCi(rs.getString("ci"))+"</td>"
					+  "<td>"+rs.getString("tipo_carga")+"</td>"
					+  "<td>"+vh.getVehiculos(aux)+"</td>"
					+  "<td> <a class='btn btn-primary' href=\"javascript:print('"+aux+"');\">Asignar</a> </td>"
					+  "</tr>";
			}
			ans += "</table>";
		
			con.cerrarConexion(); 
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	
	
	public String getRegistroClientes() {

		conexion con = new conexion();
		ResultSet rs = null;	
		String ans="<table style='background-color:#74BDFF;text-align:center;' border='1'>";
		try {
			String sql = "select * from cotizable where estado = 1 or estado = 3";
			rs = con.Consulta(sql);
			ans += "<tr style='color:#FFFFFF'>"+
					"					<td>Ci Cliente</td>\r\n" + 
					"    				<td>Nombre del cliente</td>\r\n" + 
					 
					"    				<td>Correo</td>\r\n" + 
					"    				<td>Estado</td>\r\n" + 
					"    				<td>Unidad Asignada</td>"+
					"		</tr>\r\n";
			while (rs.next()) {
				ans += "<tr>"
					+  "<td>"+rs.getString("ci")+"</td>"
					+  "<td>"+us.getNameByCi(rs.getString("ci"))+" "+us.getLastNameByCi(rs.getString("ci"))+"</td>"
					
					+	"<td>"+rs.getDate("fecha")+"</td>"
					+  "<td>"+getEstado(rs.getInt("estado"))+" </td>"
					+  "<td>"+vh.getPlaca(rs.getString("unidad"))+"</td>"
					+  "</tr>";
			}
			ans += "</table>";
			con.cerrarConexion(); 
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ans;
	}
	public String getEstado(int estado) {
	if(estado == 1) {
		return "En camino";
	}else {
		if(estado == 3) {
			return "Entregado";
		}else {
			return "Solicitado";
		}
	}
	}
}
