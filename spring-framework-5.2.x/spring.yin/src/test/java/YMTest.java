import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class YMTest<K,V> {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		Lock lock = new ReentrantLock();
//		linkedHashMap.put()
	}
}
