package campos.zulema.domain.weather.models;

public class Coordinate {
    private Double lon;
    private Double lat;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
