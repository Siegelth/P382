import java.util.*;

public class TreeMapPratice {

        public static void main(String[] args) {
            System.out.println("PRICE LIST：");
            TreeMap<KEY, String> list = new TreeMap<>(new MyComparator1());

            list.put(new KEY("32G", 64), "1");
            list.put(new KEY("16G", 39), "2");
            list.put(new KEY("64G", 89), "3");
            list.put(new KEY("8G", 59), "4");
            list.put(new KEY("16G", 49), "5");
            list.put(new KEY("32G", 99), "6");
            list.put(new KEY("64G", 119), "7");
            list.put(new KEY("32G", 159), "8");
            list.put(new KEY("16G", 69), "9");
            list.put(new KEY("64G", 216), "10");

            Set<Map.Entry<KEY, String>> entrySet = list.entrySet(); 
            for (Map.Entry<KEY, String> next : entrySet) {
                KEY key = next.getKey();
                String value = next.getValue();
                System.out.println(key + "NUMBER" + value );
            }
            System.out.println();
            System.out.println("SPACE LIST:");
            TreeMap<KEY, String> up2 = new TreeMap<>(new MyComparator2());
            up2.put(new KEY("32G", 64), "1");
            up2.put(new KEY("16G", 39), "2");
            up2.put(new KEY("64G", 89), "3");
            up2.put(new KEY("08G", 59), "4");
            up2.put(new KEY("16G", 49), "5");
            up2.put(new KEY("32G", 99), "6");
            up2.put(new KEY("64G", 119), "7");
            up2.put(new KEY("32G", 159), "8");
            up2.put(new KEY("16G", 69), "9");
            up2.put(new KEY("64G", 216), "10");

            Set<Map.Entry<KEY, String>> entrySet2 = up2.entrySet(); 

            Iterator<Map.Entry<KEY, String>> it2 = entrySet2.iterator();

            while (it2.hasNext()) {
                Map.Entry<KEY, String> next = it2.next();
                KEY key = next.getKey();
                String value = next.getValue();
                System.out.println(key + " NUMBER " + value);
            }
        }
    }

    class MyComparator1 implements Comparator<KEY> {
        @Override
        public int compare(KEY p1, KEY p2) {
            if (p1.getPrice() > p2.getPrice()) {
                return -1;
            } else if (p1.getPrice() < p2.getPrice()) {
                return 1;
            }
            return 0;
        }
    }

    class MyComparator2 implements Comparator<KEY> {
    @Override
    public int compare(KEY p1, KEY p2) {
        if (p1.getCapacity().compareTo(p2.getCapacity())>0) {
            return -1;
        } else if (p1.getCapacity().compareTo(p2.getCapacity())<=0) {
            return 1;
        }
        return 0;
    }
    }

    class KEY implements Comparable<KEY> {
        private String capacity;
        private int price;

        public String getCapacity() {
            return capacity;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public int compareTo(KEY p) {
            if (this.capacity.compareTo(p.capacity)>0) {
                return 1;
            } else if (this.capacity.compareTo(p.capacity)<=0) {
                return -1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "UP{" +
                    "SPACE:'" + capacity +
                    " PRICE:" + price +
                    '}';
        }

        public KEY(String capacity, int price) {
            this.capacity = capacity;
            this.price = price;
        }
    }
