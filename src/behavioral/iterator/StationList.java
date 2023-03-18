package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StationList implements Iterable<RadioStation> {

    private ArrayList<RadioStation> stations = new ArrayList<>();
    private int counter = 0;

    public void addStation(RadioStation station) {
        stations.add(station);
    }

    public void removeStation(RadioStation toRemove) {
        double toRemoveFrequency = toRemove.frequency();
        stations.removeIf(radioStation -> radioStation.frequency() == toRemoveFrequency);
    }

    public int size() {
        return stations.size();
    }

    public RadioStation get(int index) {
        return stations.get(index);
    }

    @Override
    public Iterator<RadioStation> iterator() {
        return new StationListIterator();
    }

    private class StationListIterator implements Iterator<RadioStation> {

        @Override
        public boolean hasNext() {
            return counter < stations.size();
        }

        @Override
        public RadioStation next() {
            RadioStation currentStation = stations.get(counter);
            counter++;
            return currentStation;
        }

        @Override
        public void remove() {
            stations.remove(counter);
        }
    }
}
