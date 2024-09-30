package com.calmah.ecommerce.model;

public class Usuario {
private Integer id;
private String nombreString;
private String usuarioString;
private String emeal;
private String direccion;
private String telefono;
private String tipo;
private String password;


public Usuario() {

}

public Usuario(Integer id, String nombreString, String usuarioString, String emeal, String direccion, String telefono,
		String tipo, String password) {
	super();
	this.id = id;
	this.nombreString = nombreString;
	this.usuarioString = usuarioString;
	this.emeal = emeal;
	this.direccion = direccion;
	this.telefono = telefono;
	this.tipo = tipo;
	this.password = password;
}


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNombreString() {
	return nombreString;
}
public void setNombreString(String nombreString) {
	this.nombreString = nombreString;
}
public String getUsuarioString() {
	return usuarioString;
}
public void setUsuarioString(String usuarioString) {
	this.usuarioString = usuarioString;
}
public String getEmeal() {
	return emeal;
}
public void setEmeal(String emeal) {
	this.emeal = emeal;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Usuario [id=" + id + ", nombreString=" + nombreString + ", usuarioString=" + usuarioString + ", emeal="
			+ emeal + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password="
			+ password + "]";
}

 

}
