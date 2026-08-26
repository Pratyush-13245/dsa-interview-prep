## Pattern: Complement Lookup

**Trigger:** Pair-sum problems (Two Sum style) — need target - current, checked as you go (not after building the full map) so you never reuse the same element twice.

**Template:**
```java
Map<Integer, Integer> valToIndex = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    int need = target - nums[i];
    if (valToIndex.containsKey(need)) return new int[]{valToIndex.get(need), i};
    valToIndex.put(nums[i], i);
}
```

**Problems solved:** (none yet — topic just started)
