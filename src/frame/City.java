/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author Administrator
 */
public class City {
    private long id;
    private String name;

    private String country;
    private long population;
    private int timezone;
    private long sinrise;
    private long sunset;

    public City() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

    public int getTimezone() {
        return timezone;
    }

    public long getSinrise() {
        return sinrise;
    }

    public long getSunset() {
        return sunset;
    }
    
}