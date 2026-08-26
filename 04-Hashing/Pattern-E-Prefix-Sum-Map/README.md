## Pattern: Prefix Sum + Hashmap

**Trigger:** "count subarrays with sum equal to K," "continuous subarray sum" — need to count subarrays with a target property, not just find one.

**Template:**
```java
Map<Integer, Integer> prefixCount = new HashMap<>();
prefixCount.put(0, 1); // empty prefix
int sum = 0, count = 0;
for (int x : arr) {
    sum += x;
    count += prefixCount.getOrDefault(sum - k, 0);
    prefixCount.merge(sum, 1, Integer::sum);
}
```

**Problems solved:** (none yet — topic just started)
