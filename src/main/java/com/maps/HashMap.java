package com.maps;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class HashMap<K, V> implements Map<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private final Bucket<K, V>[] buckets;

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity) {
        this.buckets = new Bucket[capacity];

        for(int i = 0; i < capacity; i++){
            this.buckets[i] = new Bucket<>(new LinkedList<>());
        }

        //stream(buckets)
         //       .map(bucket -> new Bucket<>(new LinkedList<>()))
         //       .collect(Collectors.toList());
    }

    @Override
    public int size() {
        return stream(buckets)
                .map(bucket -> bucket.getEntryList().size())
                .reduce((a, b) -> a + b)
                .orElse(0);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return keySet().contains(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return values().contains(value);
    }

    @Override
    public V get(Object key) {
        Optional<Entry<K, V>> matchingEntry = getEntry(key);
        return matchingEntry.isPresent() ? matchingEntry.get().getValue() : null;
    }

    private Optional<Entry<K, V>> getEntry(Object key) {
        Bucket<K, V> bucket = findBucketForKey(key);

        return bucket.getEntryList()
                .stream()
                .filter(entry -> key.equals(entry.getKey()))
                .findFirst();
    }

    private Bucket<K,V> findBucketForKey(Object key) {
        int bucketNumber = key.hashCode() % buckets.length;
        return buckets[bucketNumber];
    }

    @Override
    public V put(K key, V value) {
        Optional<Entry<K, V>> matchingEntry = getEntry(key);

        if (!matchingEntry.isPresent()) {
            Bucket<K, V> bucket = findBucketForKey(key);
            bucket.getEntryList().add(new EntryModel<>(key, value));
            return null;
        }

        V oldVal = matchingEntry.get().getValue();
        matchingEntry.get().setValue(value);
        return oldVal;
    }

    @Override
    public boolean remove(Object key, Object value) {
        Optional<Entry<K, V>> entry = getEntry(key);
        if (!entry.isPresent()) {
            return false;
        }

        if (value != entry.get().getValue()) {
            return false;
        }
        return removeEntry(entry.get());
    }

    @Override
    public V remove(Object key) {
        Optional<Entry<K, V>> entry = getEntry(key);
        if (!entry.isPresent()) {
            return null;
        }

        V oldValue = entry.get().getValue();
        removeEntry(entry.get());
        return oldValue;
    }

    private boolean removeEntry(Entry entry) {
        Bucket<K, V> bucket = findBucketForKey(entry.getKey());
        return bucket.getEntryList().remove(entry);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        m.entrySet().forEach(entry -> put(entry.getKey(), entry.getValue()));
    }

    @Override
    public void clear() {
        stream(buckets)
                .map(Bucket::getEntryList)
                .forEach(List::clear);
    }

    @Override
    public Set<K> keySet() {
        return entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    @Override
    public Collection<V> values() {
        return entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(Objects::nonNull)
                .collect(toList());
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return stream(buckets)
                .map(Bucket::getEntryList)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }
}
