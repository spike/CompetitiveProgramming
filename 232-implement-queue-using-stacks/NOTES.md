#### Key Insight to Remember
Imagine you're a next-generation Doordash robot with a stack of meals to deliver. Only, you must deliver the meals in a FIFO (first in first out) queuing sequence and you don't have a pen and the meals don't have labels on them.
​

And when the meals are given to you by the random restaurants, they're loaded into the back of your truck bed by other robots in a LIFO (last in first out) stack sequence. We'll call that stack in your truck the **truckBedStack**. The restaurant robots are only able to push meals onto your truckBedStack in a sequential manner.
​

However, your mandate is to make sure that the oldest meal is the one that gets delivered first. So every time you need to deliver a meal to someone, you need to restack the meals in the reverse order on the side of the road. We'll call that stack **sideOfTheRoadStack**. Ok? Keep that metaphor in mind when coding.


Actually, may be I implemented the wrong solution. My solution is not really designed for multi-threading/multi-processing.
https://leetcode.com/problems/implement-queue-using-stacks/discuss/64284/Do-you-know-when-we-should-use-two-stacks-to-implement-a-queue
