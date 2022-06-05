package com.leetcode.Hard;


import java.util.*;

class Interval {
    public int start;
    public int end;

    public Interval() {
    }

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};

class EmployeeInterval {
    Interval interval;
    int employeeIndex;
    int intervalIndex;

    public EmployeeInterval(Interval interval, int empIndex, int intIndex) {
        this.interval = interval;
        this.employeeIndex = empIndex;
        this.intervalIndex = intIndex;
    }
}

// 759. Employee Free Time
public class EmployeeFreeTime {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> res = new ArrayList<>();
        PriorityQueue<EmployeeInterval> minHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.interval.start, b.interval.start));

        for (int i = 0; i < schedule.size(); i++) {
            minHeap.add(new EmployeeInterval(schedule.get(i).get(0), i, 0));
        }

        Interval prevInterval = minHeap.peek().interval;
        while (!minHeap.isEmpty()) {
            EmployeeInterval empInterval = minHeap.poll();
            if (prevInterval.end < empInterval.interval.start) {
                res.add(new Interval(prevInterval.end, empInterval.interval.start));
                prevInterval = empInterval.interval;
            } else {
                if (prevInterval.end < empInterval.interval.end)
                    prevInterval = empInterval.interval;
            }

            List<Interval> empSchedule = schedule.get(empInterval.employeeIndex);
            if (empSchedule.size() > empInterval.intervalIndex + 1) {
                minHeap.add(new EmployeeInterval(empSchedule.get(empInterval.intervalIndex + 1), empInterval.employeeIndex, empInterval.intervalIndex + 1));
            }
        }
        return res;
    }
}
