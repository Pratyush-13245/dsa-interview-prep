## Pattern: Frequency Counting

**Trigger:** "top K frequent," "valid anagram," "majority element" — need counts, not just existence.

**Template:**
```java
Map<Integer, Integer> freq = new HashMap<>();
for (int x : arr) freq.put(x, freq.getOrDefault(x, 0) + 1);
```

**Problems solved:** (none yet — topic just started)
