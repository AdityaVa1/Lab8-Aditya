package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    private City city;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    public City MockCity(){
        city = new City("Seol", "SK");
        return city;
    }

    /**
     * get the size of the list
     * increase the size by adding 1 city
     * check if the size has increased by 1
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        city = MockCity();
        list = MockCityList();
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }
}
