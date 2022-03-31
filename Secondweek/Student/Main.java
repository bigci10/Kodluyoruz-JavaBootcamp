/*
 * 10 kişilik bir sinif var.
 * Sınıftaki kişilerin numaraları ve cinsiyetlerini biliyorum.
 * bu sınıftaki kızların ve erkeklerin numalarını ayrı ayrı ekrana yazdıran program.
 */


class Main {
    public static void main(String[] args) {

        Student student = new Apple("5403633123","Bilal","Man");
        Student student1 = new Apple("5079705123","Fatih","Man");
        Student student2 = new Apple("5424363123","Gizem","Woman");
        Student student3 = new Apple("5414322123","Büşra","Woman");
        Student student4 = new Apple("5403633123","Ahmet","Man");
        Student student5 = new Apple("5079705123","Mustafa","Man");
        Student student6 = new Apple("5424363123","Merve","Woman");
        Student student7 = new Apple("5414322123","Ceyda","Woman");
        Student student8 = new Apple("5414322123","Çiğdem","Woman");
        Student student9 = new Apple("5414322123","Zeynep","Woman");

        student.getPersonByGender("Man");
        student.getPersonByGender("Woman");
    }
}
