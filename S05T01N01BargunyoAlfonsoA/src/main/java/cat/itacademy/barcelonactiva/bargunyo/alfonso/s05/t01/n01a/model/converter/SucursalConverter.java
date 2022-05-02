package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.dto.SucursalDto;
import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.entity.Sucursal;

@Component
public class SucursalConverter {

public SucursalDto entityToDto (Sucursal sucursal) {
		
		SucursalDto dto = new SucursalDto();
		dto.setPk_SucursalId(sucursal.getPk_SucursalId());
		dto.setNomSucursal(sucursal.getNomSucursal());
		dto.setPaisSucursal(sucursal.getPaisSucursal());
		//dto.setTipusSucursal();
		
		return dto;
	}
	
	public List<SucursalDto> entityToDto (List<Sucursal> sucursal){
		
		return sucursal.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Sucursal dtoToEntity (SucursalDto dto) {
		
		Sucursal sc = new Sucursal();
		sc.setNomSucursal(dto.getNomSucursal());
		sc.setPk_SucursalId(dto.getPk_SucursalId());
		sc.setPaisSucursal(dto.getPaisSucursal());
		//dto.setTipusSucursal();
		
		
		return sc;
	}
	
	public List<Sucursal> dtoToEntity (List<SucursalDto> dto){
		
		return dto.stream().map(x-> dtoToEntity(x)).collect(Collectors.toList());
	}

	
}
