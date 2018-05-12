package co.com.ceiba.parking.service;

import co.com.ceiba.parking.model.Motorcycle;
import co.com.ceiba.parking.repository.ICarRepository;
import co.com.ceiba.parking.repository.IMotorcycleRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ParkingService {

    @Autowired
    private IMotorcycleRepository motorcycleRepository;
    @Autowired
    private ICarRepository carRepository;

    public ßßvoid saveMotorcycle(String plate, Integer displacement) {
        if (StringUtils.isNotBlank(plate) && displacement > 0) {
            Motorcycle motorcycle = new Motorcycle(plate, displacement, new Date());
            motorcycleRepository.save(motorcycle);
        }
    }

    public List<Motorcycle> getMotorcycles() {
        return motorcycleRepository.findAll();
    }

}
