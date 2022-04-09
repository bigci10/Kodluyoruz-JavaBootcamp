import java.util.*;

class Student {
    final String name;
    final String gender;
    final String number;

    static Map<String, List<Student>> genderMap = new HashMap<>();

    Student(String number, String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.number = number;

        List<Student> studentsForThisGender = genderMap.get(gender); //List for gender
        if (studentsForThisGender == null) {
            genderMap.put(gender, studentsForThisGender = new ArrayList<>());
        }
        studentsForThisGender.add(this);
    }

    static void getPersonByGender(String gender) {
        Student[] liste = genderMap.get(gender).toArray(new Student[0]);
        for (Student student : liste) {
            System.out.println(student.name + "\t<------>\t" + student.number);
        }
    }


}
