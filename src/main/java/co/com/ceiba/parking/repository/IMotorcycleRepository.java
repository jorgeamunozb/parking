package co.com.ceiba.parking.repository;

import co.com.ceiba.parking.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMotorcycleRepository extends JpaRepository<Motorcycle, String> {

}
