## Pattern: Running Extremum (one-directional)

**Trigger:** Answer depends only on the best value seen so far from one direction (not a full contiguous-subarray sum problem).

**Key insight:** State variable updates unconditionally every step, no branching needed.

**Template:**
```java
int minSoFar = prices[0], best = 0;
for (int i = 1; i < prices.length; i++) {
    best = Math.max(best, prices[i] - minSoFar);
    minSoFar = Math.min(minSoFar, prices[i]);
}
```

**Problems solved:** LC 121 (Best Time to Buy and Sell Stock)
