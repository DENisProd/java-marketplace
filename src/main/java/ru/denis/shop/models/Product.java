package ru.denis.shop.models;

import lombok.Data;
import ru.denis.shop.models.products.Computer;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String image;
    private String description;
    //private Set<String> photos = new HashSet<String>();
}
