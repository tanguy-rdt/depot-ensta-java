package genie_logiciel.thermometer;

public class Thermometer {
    private double temperature;
    private double longitude;
    private double latitude;
    public Thermometer(double temperature, double longitude, double latitude){
        this.temperature = temperature;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void printTemperature(){
        System.out.print("temperature: ");
        System.out.println(this.getTemperature());
    }

    public void printLongitude(){
        System.out.print("longitude: ");
        System.out.println(this.getLongitude());
    }

    public void printLatitude(){
        System.out.print("latitude: ");
        System.out.println(this.getLatitude());
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        System.out.println("La température est changé");
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
        System.out.println("La latitude est changé");
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
        System.out.println("La longitude est changé");
    }

    public double getTemperature(){
        return temperature;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }


    public static void main(String[] args){
        Thermometer tmp = new Thermometer(24, 10, 10);
        tmp.printTemperature();
        tmp.printLongitude();
        tmp.printLatitude();

    }
}
