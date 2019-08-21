package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangqw
 * @date 2019/8/19 15:08
 */
public class BeerExpert {
    public List getBrands(String color) {
        List<String> brands = new ArrayList<>();
        String amber = "amber";
        if (amber.equals(color)) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
