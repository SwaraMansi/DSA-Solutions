// LeetCode 253: Meeting Rooms II (Sorting + Min-Heap)
import java.util.*;
public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // end times
        for (int[] it : intervals) {
            if (!pq.isEmpty() && pq.peek() <= it[0]) pq.poll();
            pq.offer(it[1]);
        }
        return pq.size();
    }
    public static void main(String[] args) {
        MeetingRoomsII s = new MeetingRoomsII();
        System.out.println(s.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}})); // 2
        System.out.println(s.minMeetingRooms(new int[][]{{7,10},{2,4}})); // 1
    }
}
