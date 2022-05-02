package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SucursalDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long pk_SucursalId;
	private String nomSucursal;
	private String paisSucursal;
	private String tipusSucursal;

	
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

	public String getTipusSucursal() {
		//return tipusSucursal;
		this.tipusSucursal = null;
		
		List<String> lista = new ArrayList<String>(Arrays.asList("Alemania", "Bélgica", "Croacia", "Dinamarca",
				"España", "Francia", "Irlanda", "Letonia", "Luxemburgo", "Países Bajos", "Suecia", "Bulgaria",
				"Eslovaquia", "Estonia", "Grecia", "Malta", "Polonia", "República Checa", "Austria", "Chipre",
				"Eslovenia", "Finlandia", "Hungría", "Italia", "Lituania", "Portugal", "Rumanía"));
		
		boolean existe = lista.contains(paisSucursal);
		if (existe) {
			this.tipusSucursal = "Es europeo.";
		} else {
			this.tipusSucursal = "No es europeo.";
		}
		return this.tipusSucursal;

	
	}

	/*public String setTipusSucursal() {

		this.tipusSucursal = null;
		
		List<String> lista = new ArrayList<String>(Arrays.asList("Alemania", "Bélgica", "Croacia", "Dinamarca",
				"España", "Francia", "Irlanda", "Letonia", "Luxemburgo", "Países Bajos", "Suecia", "Bulgaria",
				"Eslovaquia", "Estonia", "Grecia", "Malta", "Polonia", "República Checa", "Austria", "Chipre",
				"Eslovenia", "Finlandia", "Hungría", "Italia", "Lituania", "Portugal", "Rumanía"));
		
		boolean existe = lista.contains(paisSucursal);
		if (existe) {
			this.tipusSucursal = "Es europeo.";
		} else {
			this.tipusSucursal = "No es europeo.";
		}
		return this.tipusSucursal;

	}*/
}
