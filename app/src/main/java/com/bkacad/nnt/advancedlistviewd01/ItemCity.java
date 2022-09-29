package com.bkacad.nnt.advancedlistviewd01;

public class ItemCity {
    private int id;
    private String name;
    private String weather;
    private String imgWeatherURL;
    private double temperature;

    public ItemCity(int id, String name, String weather, String imgWeatherURL, double temperature) {
        this.id = id;
        this.name = name;
        this.weather = weather;
        this.imgWeatherURL = imgWeatherURL;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getImgWeatherURL() {
        return imgWeatherURL;
    }

    public void setImgWeatherURL(String imgWeatherURL) {
        this.imgWeatherURL = imgWeatherURL;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "ItemCity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weather='" + weather + '\'' +
                ", imgWeatherURL='" + imgWeatherURL + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
