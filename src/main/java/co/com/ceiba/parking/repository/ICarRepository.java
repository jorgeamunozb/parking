package co.com.ceiba.parking.repository;

import co.com.ceiba.parking.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long> {
}
