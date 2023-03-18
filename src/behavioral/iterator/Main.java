package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        StationList stationList = new StationList();

        stationList.addStation(new RadioStation(89.9));
        stationList.addStation(new RadioStation(105.6));
        stationList.addStation(new RadioStation(98.8));
        stationList.addStation(new RadioStation(103.2));

        stationList.removeStation(new RadioStation(98.8));

        for (RadioStation station : stationList) {
            System.out.println(station.frequency());
        }
    }
}
