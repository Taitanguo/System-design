public class Memcache {
    int curtTime;
    int key, value, ttl;
    public Memcache() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    }

    public int get(int curtTime, int key) {

    }

    public void set(int curtTime, int key, int value, int ttl) {
        map.put(key, value);
    }

    public void delete(int curtTime, int key) {

    }

    public int incr(int curtTime, int key, int delta) {

    }

    public int decr(int curtTime, int key, int delta) {

    }
}