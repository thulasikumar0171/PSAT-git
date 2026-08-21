
import java.util.*;

class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer, Long> last = new HashMap<>();
        long day = 0;

        for (int task : tasks) {
            day++;

            if (last.containsKey(task) && day <= last.get(task) + space) {
                day = last.get(task) + space + 1;
            }

            last.put(task, day);
        }

        return day;
    }
}


