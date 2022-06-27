package Design;

public class MyHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        map.get(1);
        map.get(3);
        map.put(2,1);
        map.get(2);
    }


    int map[];
    public MyHashMap() {
        map=new int[1000000+1];
    }

    public void put(int key, int value) {
        map[key]=value+1;
    }

    public int get(int key) {
        return map[key]-1;
    }

    public void remove(int key) {
        map[key]=0;
    }
}
