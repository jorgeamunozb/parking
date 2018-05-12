package co.com.ceiba.parking.service;

import co.com.ceiba.parking.model.Motorcycle;
import co.com.ceiba.parking.repository.IMotorcycleRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.*;

public class ParkingServiceTest {

    @InjectMocks
    private ParkingService parkingService;

    @Mock
    private IMotorcycleRepository motorcycleRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void saveMotorcycleTest() {
        //Arrange
        String plate = "XYZ123";
        Integer displacement = 150;
        Date dateIngress = new Date();
        Motorcycle motorcycle = new Motorcycle(plate, displacement, dateIngress);

        //Act
        doAnswer(Answers.CALLS_REAL_METHODS).when(mock(ParkingService.class)).saveMotorcycle(anyString(), anyInt());
        parkingService.saveMotorcycle(plate, displacement);

        when(parkingService.getMotorcycles()).thenReturn(Collections.singletonList(motorcycle));
        List<Motorcycle> motorcycleList = parkingService.getMotorcycles();

        //Assert
        Assert.assertEquals(motorcycleList.get(0).getPlate(), plate);
    }

    @Test
    public void saveMotorcyclePlateEmptyTest() {
        //Arrange
        String plate = " ";
        Integer displacement = 150;

        //Act
        doAnswer(Answers.CALLS_REAL_METHODS).when(mock(ParkingService.class)).saveMotorcycle(anyString(), anyInt());
        parkingService.saveMotorcycle(plate, displacement);

        when(parkingService.getMotorcycles()).thenReturn(Collections.emptyList());
        List<Motorcycle> motorcycleList = parkingService.getMotorcycles();

        //Assert
        Assert.assertTrue(motorcycleList.isEmpty());
    }

    @Test
    public void saveMotorcyclePlateNullTest() {
        //Arrange
        String plate = null;
        Integer displacement = 150;

        //Act
        doAnswer(Answers.CALLS_REAL_METHODS).when(mock(ParkingService.class)).saveMotorcycle(anyString(), anyInt());
        parkingService.saveMotorcycle(plate, displacement);

        when(parkingService.getMotorcycles()).thenReturn(Collections.emptyList());
        List<Motorcycle> motorcycleList = parkingService.getMotorcycles();

        //Assert
        Assert.assertTrue(motorcycleList.isEmpty());
    }

    @Test
    public void saveMotorcycleDisplacementZeroTest() {
        //Arrange
        String plate = "XYZ123";
        Integer displacement = 0;

        //Act
        doAnswer(Answers.CALLS_REAL_METHODS).when(mock(ParkingService.class)).saveMotorcycle(anyString(), anyInt());
        parkingService.saveMotorcycle(plate, displacement);

        when(parkingService.getMotorcycles()).thenReturn(Collections.emptyList());
        List<Motorcycle> motorcycleList = parkingService.getMotorcycles();

        //Assert
        Assert.assertTrue(motorcycleList.isEmpty());
    }

}
