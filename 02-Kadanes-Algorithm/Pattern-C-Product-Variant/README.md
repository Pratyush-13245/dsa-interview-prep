## Pattern: Product Subarray (Kadane variant)

**Trigger:** Same shape as Kadane's but with product instead of sum — a single running max is insufficient because a large negative product can flip to a strong positive on encountering another negative.

**Key insight:** track BOTH a running max and running min ending at i; a temp variable is needed to avoid overwriting one before both are updated.

**Template:**
```java
int maxEnd = nums[0], minEnd = nums[0], best = nums[0];
for (int i = 1; i < nums.length; i++) {
    int tmp = maxEnd;
    maxEnd = Math.max(nums[i], Math.max(maxEnd * nums[i], minEnd * nums[i]));
    minEnd = Math.min(nums[i], Math.min(tmp * nums[i], minEnd * nums[i]));
    best = Math.max(best, maxEnd);
}
```

**Problems solved:** LC 152 (Maximum Product Subarray)
