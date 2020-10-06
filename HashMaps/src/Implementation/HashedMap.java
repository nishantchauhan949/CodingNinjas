package Implementation;

import java.util.ArrayList;

public class HashedMap<K, V> {
    ArrayList<MapNode<K, V>> bucketArray;
    int size;
    int numBuckets;

    public HashedMap() {
        numBuckets = 20;
        bucketArray = new ArrayList<>();
        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public double loadFactor() {
        return (size * 1.0) / numBuckets;
    }

    private int hashedCode(K key) {
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }

    public void insert(K key, V value) {
        int bucketIndex = hashedCode(key);
        MapNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucketArray.get(bucketIndex);
        MapNode<K, V> newEntry = new MapNode<>(key, value);
        newEntry.next = head;
        bucketArray.set(bucketIndex, newEntry);
        size++;

        double loadFactor = loadFactor();
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
//        System.out.println("Rehasing: buckets->" + numBuckets + " size->" + size);
        ArrayList<MapNode<K, V>> temp = bucketArray;
        bucketArray = new ArrayList<>();
        for (int i = 0; i < numBuckets * 2; i++) {
            bucketArray.add(null);
        }
        size = 0;
        numBuckets = numBuckets * 2;

        for (MapNode<K, V> head : temp) {
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public V search(K key) {
        int bucketIndex = hashedCode(key);
        MapNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V delete(K key) {
        int bucketIndex = hashedCode(key);
        MapNode<K, V> prev = null, head = bucketArray.get(bucketIndex), nextThanHead = head.next;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    bucketArray.set(bucketIndex, nextThanHead);
                } else {
                    prev.next = nextThanHead;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = nextThanHead;
            nextThanHead = nextThanHead.next;
        }
        return null;
    }
}
