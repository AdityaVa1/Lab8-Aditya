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
        city = MockCity();
        int listSize = list.getCount();
        list.add(city);
        assertEquals(list.getCount(), listSize+1);
    }
    /**
     * check if the city is in the list
     */
    @Test
    public void hasCityTest(){
        city = MockCity();
        list = MockCityList();
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }
    /**
     * check if the city is removed from the list
     */
    @Test
    public void removeCityTest(){
        list = MockCityList();
        city = MockCity();
        list.addCity(city);
        int listSize = list.getCount();
        list.removeCity(city);
        assertEquals(list.getCount(), listSize-1);
    }

    /**
     * tests the number of cities in list is correct
     */
    @Test
    public void countCityTest(){
        list = MockCityList();
        city = MockCity();
        // 6 cities added in MockCity, check if len returned is 6
        int listSize = list.countCities();
        assertEquals(list.getCount(), listSize);
    }
}
