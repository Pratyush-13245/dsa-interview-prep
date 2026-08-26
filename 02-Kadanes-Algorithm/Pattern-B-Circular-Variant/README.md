## Pattern: Circular Subarray (Kadane variant)

**Trigger:** Same as core Kadane's, but the array wraps around (circular).

**Key insight:** max circular subarray = `total - minKadane` (the wrap-around case is total minus the minimum contiguous subarray). Edge case: if `minKadane == total` (all-negative array), the wrap formula gives an invalid empty result — guard with `if (maxNormal < 0) return maxNormal`.

**Problems solved:** LC 918 (Maximum Sum Circular Subarray)
