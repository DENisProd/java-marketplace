package ru.denis.shop.models.products;

import lombok.Data;
import ru.denis.shop.models.Product;

import javax.persistence.*;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "computerId")
public class Computer extends Product{
    private String CPU;
    private String GPU;
    private String RAM;
}
