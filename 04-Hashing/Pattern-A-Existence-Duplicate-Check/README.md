## Pattern: Existence / Duplicate Check

**Trigger:** "does X exist," "contains duplicate," "longest consecutive sequence" — anything about seen-before / existence.

**Template:**
```java
Set<Integer> seen = new HashSet<>();
for (int x : arr) {
    if (seen.contains(x)) return true; // or whatever the condition needs
    seen.add(x);
}
```

**Problems solved:** (none yet — topic just started)
