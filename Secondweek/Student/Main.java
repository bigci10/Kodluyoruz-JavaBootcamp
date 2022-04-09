/*
 * 10 kişilik bir sinif var.
 * Sınıftaki kişilerin numaraları ve cinsiyetlerini biliyorum.
 * bu sınıftaki kızların ve erkeklerin numalarını ayrı ayrı ekrana yazdıran program.
 */


class Main {
    public static void main(String[] args) {

        Student student = new Student("5403633123","Bilal","Man");
        Student student1 = new Student("5079705123","Fatih","Man");
        Student student2 = new Student("5424363123","Gizem","Woman");
        Student student3 = new Student("5414322123","Büşra","Woman");
        Student student4 = new Student("5403633123","Ahmet","Man");
        Student student5 = new Student("5079705123","Mustafa","Man");
        Student student6 = new Student("5424363123","Merve","Woman");
        Student student7 = new Student("5414322123","Ceyda","Woman");
        Student student8 = new Student("5414322123","Çiğdem","Woman");
        Student student9 = new Student("5414322123","Zeynep","Woman");

        student.getPersonByGender("Man");
        student.getPersonByGender("Woman");
    }
}
