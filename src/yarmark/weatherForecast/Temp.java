package yarmark.weatherForecast;

public class Temp {
	private double day;
	private double min;
	private double max;
	private double night;
	private double eve;
	private double morn;
	
	public String getDay() {
		return String.valueOf(day);
	}
	public String getMin() {
		return String.valueOf(min);
	}
	public String getMax() {
		return String.valueOf(max);
	}
	public String getNight() {
		return String.valueOf(night);
	}
	public String getEve() {
		return String.valueOf(eve);
	}
	public String getMorn() {
		return String.valueOf(morn);
	}
}
