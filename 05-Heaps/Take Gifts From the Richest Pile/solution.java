class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int g : gifts) pq.add(g);

        for (int i = 0; i < k; i++) {
            int x = pq.poll();
            pq.add((int) Math.sqrt(x));
        }

        long ans = 0;
        for (int num : pq) ans += num;
        return ans;
    }
}
