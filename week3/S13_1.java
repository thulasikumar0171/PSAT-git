import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
 class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> q = new PriorityQueue<>((a, b) -> {

            if (a.cgpa != b.cgpa)
                return Double.compare(b.cgpa, a.cgpa);

            int x = a.name.compareTo(b.name);

            if (x != 0)
                return x;

            return Integer.compare(a.id, b.id);
        });

        for (String e : events) {

            String[] p = e.split(" ");

            if (p[0].equals("ENTER")) {

                q.add(new Student(
                    Integer.parseInt(p[3]),
                    p[1],
                    Double.parseDouble(p[2])
                ));

            } else {
                q.poll();
            }
        }

        List<Student> ans = new ArrayList<>();

        while (!q.isEmpty()) {
            ans.add(q.poll());
        }

        return ans;
    }
}

       

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}


input:
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Output:
Dan
Ashley
Shafaet
Maria
