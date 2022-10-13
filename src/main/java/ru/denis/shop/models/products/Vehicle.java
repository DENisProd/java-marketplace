package ru.denis.shop.models.products;

import lombok.Data;
import ru.denis.shop.models.Product;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "vehicleId")
public class Vehicle extends Product {
    private String brand;
    private String engine;
    private String gearbox;
    private String color;
}
