import java.util.*;

class Student {
    final String name;
    final String gender;
    final String number;

    static Map<String, List<Apple>> genderMap = new HashMap<>();

    Apple(String number, String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.number = number;

        List<Apple> studentsForThisGender = genderMap.get(gender); //List for gender
        if (studentsForThisGender == null) {
            genderMap.put(gender, studentsForThisGender = new ArrayList<>());
        }
        studentsForThisGender.add(this);
    }

    static void getPersonByGender(String gender) {
        Apple[] liste = genderMap.get(gender).toArray(new Apple[0]);
        for (Apple student : liste) {
            System.out.println(student.name + "\t<------>\t" + student.number);
        }
    }


}
