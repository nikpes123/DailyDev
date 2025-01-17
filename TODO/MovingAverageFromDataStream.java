package TODO;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageFromDataStream {
    // Leet Code Question 346
    public float findAverage(int[] data_streams, int window_size){
        Deque<Integer> queue = new ArrayDeque<>(window_size);
        int total = 0;
        for(int num: data_streams){
            if (queue.size() < window_size){
                queue.addLast(num);
                total += num;
            }else {
                int first = queue.removeFirst();
                total -= first;
                queue.addLast(num);
                total += num;   
            }
        }
        return (float) total / queue.size();
    }
}
