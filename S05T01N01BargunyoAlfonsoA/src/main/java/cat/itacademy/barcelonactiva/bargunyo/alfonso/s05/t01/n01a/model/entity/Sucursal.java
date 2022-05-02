package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pk_SucursalId;
	@Column (name="Nombre",length = 100, unique = true, nullable = false)
	private String nomSucursal;
	@Column (name= "País")
	private String paisSucursal;
	
	
	
	public Long getPk_SucursalId() {
		return pk_SucursalId;
	}
	public void setPk_SucursalId(Long pk_SucursalId) {
		this.pk_SucursalId = pk_SucursalId;
	}
	public String getNomSucursal() {
		return nomSucursal;
	}
	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}
	public String getPaisSucursal() {
		return paisSucursal;
	}
	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}
	
	
	public Sucursal(Long pk_SucursalId, String nomSucursal, String paisSucursal) {
		
		this.pk_SucursalId = pk_SucursalId;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
	}
	public Sucursal() {
		
	}
	
	
}
