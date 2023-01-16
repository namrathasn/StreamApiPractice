package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("namratha", 101, 73823999999l, 'f', 10));
        studentList.add(new Student("mayur", 102, 7382388999l, 'm', 7));
        studentList.add(new Student("mandira", 103, 738238899999l, 'f', 5));

        List<Student> collects = studentList.stream().collect(Collectors.toList());
        System.out.println("collects = " + collects);
        List<Student> collect = studentList.stream().filter(x -> x.getGender() == 'f').collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
