# Heaps — Pattern 1: Basic Heap (Repeatedly take the best element)

## Trigger
> "Repeatedly pick the largest/smallest from a collection that keeps changing."
If you'd have to re-sort after every operation → use a heap.

## The one rule: min-heap or max-heap?
**Put on top the element you'll act on next — whether you're taking it or evicting it.**

| Situation | Question to ask | Heap |
|---|---|---|
| Repeatedly take the best | What do I take out each time? | largest → Max, smallest → Min |
| Keep a group of K (Top-K) | What do I throw away when size > K? | K largest → **Min** (size K), K smallest → **Max** (size K) |

| Problem | Act on | Heap |
|---|---|---|
| Last Stone Weight | take largest | Max |
| Merge k Sorted Lists | take smallest head | Min |
| Kth Largest Element | evict smallest of K | Min (size K) |
| K Closest Points | evict farthest of K | Max (size K) |

## Java PriorityQueue
```java
PriorityQueue<Integer> minH = new PriorityQueue<>();                          // min-heap (default)
PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
PriorityQueue<int[]>   pq   = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
```

| Method | Does | Cost |
|---|---|---|
| `offer` / `add` | insert | O(log n) |
| `poll()` | return top **and remove it** (`null` if empty) | O(log n) |
| `peek()` | return top, don't remove | O(1) |
| `remove(obj)` / `contains(obj)` | linear search | **O(n)** |
| `new PriorityQueue<>(collection)` | heapify | O(n) |

## Gotchas
- `poll()` already removes. Calling `remove(x)` after it deletes a *second* element with the same value.
- Loop condition must match what the body consumes: two `poll()`s → `while (pq.size() > 1)`, otherwise `poll()` returns `null` → NPE when unboxing to `int`.
- `(a, b) -> b - a` can overflow → use `Integer.compare`.
- Iterating/printing a PriorityQueue is **not** sorted order; only repeated `poll()` is.
- TC of "loop until empty": prove termination and bound iterations (Last Stone: each iteration removes ≥ 1 stone → ≤ n−1 iterations).

## Problems Solved
| # | Problem | Difficulty | Key idea | TC | SC |
|---|---|---|---|---|---|
| 1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | Easy | Max-heap, poll two, push back difference if non-zero | O(n log n) | O(n) |
