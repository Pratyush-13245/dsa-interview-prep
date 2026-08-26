## Pattern: Grouping by Derived Key

**Trigger:** "group anagrams," "group by category" — compute a canonical key, bucket items under it.

**Template:**
```java
Map<String, List<String>> groups = new HashMap<>();
for (String s : strs) {
    char[] c = s.toCharArray();
    Arrays.sort(c);
    String key = new String(c);
    groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
}
```

**Problems solved:** (none yet — topic just started)
