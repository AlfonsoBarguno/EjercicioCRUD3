package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.service;

import java.util.List;


import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.dto.SucursalDto;


public interface ISucursalService {
	
    public List<SucursalDto> findAll();
	
	//public Page<SucursalDto> findAll(Pageable pageable);
	
	public SucursalDto findById (Long id);
	
	public Long save(SucursalDto sucursalDto);
	
	public void deleteById (Long id);
}
