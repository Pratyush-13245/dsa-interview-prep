class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
        {
            return stones[0];
        }
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<stones.length;i++)
        {
            maxH.add(stones[i]);
        }

        while(maxH.size()>1)
        {
            int p1 = maxH.poll();
            int p2 = maxH.poll();

            if(p1-p2>0)
            {
                maxH.add(p1-p2);
            }
        }
        return maxH.size() == 0 ? 0 : maxH.peek();
        


    }
}
