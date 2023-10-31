public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float temperatureSum = 0;
    private int numReadings = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics: Avg/Max/Min temperature = "
                + (temperatureSum / numReadings) + "/"
                + maxTemperature + "/"
                + minTemperature);
    }
}
