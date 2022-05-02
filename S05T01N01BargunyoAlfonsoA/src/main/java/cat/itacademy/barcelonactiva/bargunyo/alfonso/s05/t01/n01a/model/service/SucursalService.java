package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.converter.SucursalConverter;
import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.dto.SucursalDto;
import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.entity.Sucursal;
import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.repository.SucursalRepository;

@Service
public class SucursalService implements ISucursalService {

	@Autowired
	SucursalRepository sucursalRepository;

	@Autowired(required=true)
	SucursalConverter converter;

	@Override
	@Transactional
	public List<SucursalDto> findAll() {

		List<SucursalDto> resultado = new ArrayList<SucursalDto>();

		List<Sucursal> listDto = sucursalRepository.findAll();

		resultado = converter.entityToDto(listDto);

		return resultado;
	}

	@Override
	@Transactional
	public SucursalDto findById(Long id) {

		SucursalDto resultado = new SucursalDto();

		Optional<Sucursal> sucursal = sucursalRepository.findById(id);

		if (sucursal.isPresent()) {

			resultado = converter.entityToDto(sucursal.get());
		}

		return resultado;
	}

	@Override
	@Transactional
	public Long save(SucursalDto dto) {

		Sucursal sc = converter.dtoToEntity(dto);

		sc = sucursalRepository.save(sc);

		return sc.getPk_SucursalId();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {

		sucursalRepository.deleteById(id);
	}

	/*
	 * @Override public Page<SucursalDto> findAll(Pageable pageable) {
	 * 
	 * 
	 * 
	 * return sucursalRepository.findAll(converter.entityToDto(pageable)); }
	 */

}
