package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.dto.SucursalDto;
import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.service.ISucursalService;



@Controller
public class SucursalController {

	@Autowired
	private ISucursalService sucursalService;

	private final String DATA_SUCURSALESDTO_LISTA = "DATA_SucursalesDtoLista";
	private final String DATA_SUCURSALESDTO_FORMULARIO = "DATA_SucursalesDtoFormulario";

	private final String VISTA_LISTA_SUCURSALES = "Sucursales";
	private final String VISTA_CONSULTA_SUCURSALES = "ConsultaSucursal";
	private final String VISTA_EDITA_SUCURSAL = "EditaSucursal";
	
	
	@GetMapping("/ListaSucursales")
	public ModelAndView listaSucursales() {
		ModelAndView mv = new ModelAndView();
		List<SucursalDto> SucursalesDto = sucursalService.findAll();
		mv.addObject(DATA_SUCURSALESDTO_LISTA, SucursalesDto);
		mv.setViewName(VISTA_LISTA_SUCURSALES);
		return mv;
	}
	
	@GetMapping("/NuevaSucursal")
	public ModelAndView formularioNuevaSucursal() {
		SucursalDto sucursalDto = new SucursalDto();
		sucursalDto.setNomSucursal(" ");
		//sucursalDto.setPaisSucursal(" ");
		return formularioSucursalDTO(sucursalDto, VISTA_EDITA_SUCURSAL);

	}
	
	@GetMapping("/ModificaSucursal/{id}")
	public ModelAndView formularioModificaSucursal(@PathVariable("id") Long id) {
		SucursalDto sucursalDto = sucursalService.findById(id);
		return formularioSucursalDTO(sucursalDto, VISTA_EDITA_SUCURSAL);
	}
	
	@GetMapping("/ConsultaSucursal/{id}")
	public ModelAndView formulariConsultaSucursal(@PathVariable("id") Long id) {
		SucursalDto sucursalDto = sucursalService.findById(id);
		return formularioSucursalDTO(sucursalDto, VISTA_CONSULTA_SUCURSALES);

	}

	@GetMapping("EliminaSucursal/{id}")
	public ModelAndView eliminaSucursal(@PathVariable("id") Long id) {
		sucursalService.deleteById(id);
		return new ModelAndView("redirect:/ListaSucursales");
	}

	@PostMapping("/GuardarSucursal")
	public ModelAndView guardarSucursal(@ModelAttribute(DATA_SUCURSALESDTO_FORMULARIO) SucursalDto sucursalDto) {
		sucursalService.save(sucursalDto);
		return new ModelAndView("redirect:/ListaSucursales");
	}
	
	private ModelAndView formularioSucursalDTO(SucursalDto sucursalDto, String nombreVista) {
		ModelAndView mv = new ModelAndView();
		mv.addObject(DATA_SUCURSALESDTO_FORMULARIO, sucursalDto);
		mv.setViewName(nombreVista);
		return mv;
	}


	
}
