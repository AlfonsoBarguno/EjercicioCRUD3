package cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bargunyo.alfonso.s05.t01.n01a.model.entity.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository <Sucursal, Long>{

}
