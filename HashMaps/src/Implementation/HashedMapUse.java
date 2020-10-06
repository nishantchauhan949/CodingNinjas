package Implementation;

public class HashedMapUse {
    public static void main(String[] args) {
        HashedMap<String, Integer> stringIntegerHashedMap = new HashedMap<>();
        for (int i = 0; i < 20; i++){
            stringIntegerHashedMap.insert("abc" + i, 1 + i);
            System.out.println("i = " + i + " LoadFactor = " + stringIntegerHashedMap.loadFactor());
        }

        stringIntegerHashedMap.delete("abc8");
        stringIntegerHashedMap.delete("abc1");

        for (int i = 0; i < 20; i++){
            System.out.println("abc" + i + ":" + stringIntegerHashedMap.search("abc" + i));
        }
    }
}
