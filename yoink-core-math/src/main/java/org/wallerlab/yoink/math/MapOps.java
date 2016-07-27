package org.wallerlab.yoink.math;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

/**
 * This class is to sort a map
 * 
 *
 */
public class MapOps {

	/**
	 * This method is to sort a map by its value in ascending way.
	 * 
	 * @param <K>
	 *            - the data type of Key of a Map
	 * @param <V>
	 *            - the data type of Value of a Map
	 * @param map
	 *            - {@link java.util.Map}
	 * @return a map - {@link java.util.Map}
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(
			Map<K, V> map) {
		Map<K, V> result = new LinkedHashMap<>();
		Stream<Entry<K, V>> st = map.entrySet().stream();
		st.sorted(Comparator.comparing(e -> e.getValue())).forEach(
				e -> result.put(e.getKey(), e.getValue()));
		return result;
	}

	/**
	 * this method is to get the difference between map1 and map2. the result is
	 * to remove the same elements between map1 and map2 in map1
	 *
	 * @param <K>
	 *            - the data type of Key of a Map
	 * @param <V>
	 *            - the data type of Value of a Map
	 * @param map1
	 *            - {@link Map}
	 * @param map2
	 *            - {@link Map}
	 * @return map -- {@link Map}
	 */
	public static <K, V> Map<K, V> diff(Map<? extends K, ? extends V> map1,
			Map<? extends K, ? extends V> map2) {
		Map<K, V> result = new HashMap<>();
		result.putAll(map1);
		result.putAll(map2);
		result.entrySet().removeAll(map2.entrySet());
		return result;
	}
}