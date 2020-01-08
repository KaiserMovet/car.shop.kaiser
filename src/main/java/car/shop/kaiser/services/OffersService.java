package car.shop.kaiser.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import car.shop.kaiser.myObj.CarManufacturer;
import car.shop.kaiser.myObj.CarModel;

@Service
public class OffersService {
    @PersistenceContext
    private EntityManager em;

    public CarManufacturer getCarManufacturer(int id) {
        return em.find(CarManufacturer.class, id);
    }

    public CarModel getCarModel(int id) {
        return em.find(CarModel.class, id);
    }
}