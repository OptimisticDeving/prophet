package dev.optimistic.prophet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final class Allahfy {
  private static final Map<String, String> TRANSLATIONS;

  static {
    final Gson gson = new Gson();
    TRANSLATIONS = new HashMap<>(gson.fromJson(new InputStreamReader(Allahfy.class.getClassLoader().getResourceAsStream("lang.json")), new TypeToken<Map<String, String>>(){}));
  }

  private Allahfy() {

  }

  public static String allahfy(String key) {
    return TRANSLATIONS.getOrDefault(key, key);
  }
}
