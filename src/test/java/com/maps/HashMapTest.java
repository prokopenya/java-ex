package com.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

    @Test
    public void should_be_empty_after_init() {
        assertTrue(new HashMap<>().isEmpty());
    }

    @Test
    public void should_init_with_capacity() {
        HashMap map = new HashMap<>(66);

        assertNotNull(map);
    }
    
    @Test
    public void should_change_size() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "igor");
        assertEquals(1, map.size());
    }
    
    @Test
    public void should_contain_key_and_value(){
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "igor");

        assertTrue(map.containsKey("name"));
        assertTrue(map.containsValue("igor"));
    }

    @Test
    public void should_get_value_by_key() {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "igor");
        assertNotNull(map.get("name"));
    }

    @Test
    public void should_get_value_by_not_existing_key() {
        HashMap<String, String> map = new HashMap<>();

        assertNull(map.get("soname"));
    }

    @Test
    public void should_replace_values_on_put() {
        String expectedValue = "dima";
        String key = "name";
        HashMap<String, String> map = new HashMap<>();

        map.put(key, "igor");
        map.put(key, "dima");

        assertEquals(expectedValue, map.get(key));

    }
    @Test
    public void should_put_all_values() {
        HashMap<String, String> inputMap = new HashMap<>();

        inputMap.put("name", "igor");
        inputMap.put("tin", "123456");
        inputMap.put("phone", "543211");

        HashMap<String, String> map = new HashMap<>();
        map.putAll(inputMap);

        assertEquals(3, map.size());
    }

    @Test
    public void should_clear_all_values() {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "igor");
        map.put("tin", "123456");
        map.put("phone", "543211");
        map.clear();

        assertEquals(0, map.size());
    }

    @Test
    public void should_remove_value_by_key() {
        String key = "name";
        HashMap<String, String> map = new HashMap<>();

        map.put(key, "igor");
        map.remove(key);

        assertEquals(0, map.size());
    }

    @Test
    public void should_remove_value_by_key_and_value() {
        String key = "name";
        HashMap<String, String> map = new HashMap<>();

        map.put(key, "name");
        Boolean result = map.remove(key, "name");

        assertEquals(0, map.size());
        assertTrue(result);
    }
}