package web.controller;


public class Car {
    private String name;
    private int series;
    private String body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", series=" + series +
                ", body='" + body + '\'' +
                '}';
    }

    public Car(String name, int series, String body) {
        this.name = name;
        this.series = series;
        this.body = body;
    }
}
