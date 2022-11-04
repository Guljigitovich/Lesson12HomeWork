public class Main {
    public static void main(String[] args) {
     School school = new School();
         school.setName("Nurgaziev");
         school.setCityName("Toktogul");
         school.setNumberOfStudents(300);

        School school1 = new School();
        school1.setName("Bilimkana");
        school1.setCityName("Bishkek");
        school1.setNumberOfStudents(500);

        School school2 = new School();
        school2.setName("Kut bilim");
        school2.setCityName("Osh");
        school2.setNumberOfStudents(600);


        School [] schools = {school,school1,school2};
        for (School massive:schools) {
            System.out.println("School name: "+massive.getName());
            System.out.println("City of the school: "+massive.getCityName());
            System.out.println("Number of students: "+massive.getNumberOfStudents());
            //System.out.println("~~~~~~~~~~~~~~~~~");
        }
        System.out.println("--------------------- ");


        University university = new University();
        university.setName("Ala-Too");
        university.setCountryName("Turkey");
        university.setRaiting(1);

        University university1 = new University();
        university1.setName("AUSA");
        university1.setCountryName("USA");
        university1.setRaiting(2);

        University university2 = new University();
        university2.setName("KRSU");
        university2.setCountryName("Russia");
        university2.setRaiting(3);

        University [] universities = {university,university1,university2};
        for (University massive:universities) {
            System.out.println("University name: "+massive.getName());
            System.out.println("Country university: "+massive.getCountryName());
            System.out.println("Raiting: "+massive.getRaiting());
            //System.out.println("~~~~~~~~~~~~~~~~~");

        }System.out.println("--------------------- ");

        Person person = new Person();
        person.setPersonName("Aktan");
        person.setSurname("Kalubekov");
        person.setAge(20);

        Person person1 = new Person();
        person1.setPersonName("Akulai");
        person1.setSurname("Samatova");
        person1.setAge(25);

        Person person2 = new Person();
        person2.setPersonName("Beksultan");
        person2.setSurname("Belekov");
        person2.setAge(22);

        Person [] people = {person,person1,person2};
        for (Person massive:people) {
            System.out.println("Person name: "+massive.getPersonName());
            System.out.println("Person surname: "+massive.getSurname());
            System.out.println("Person age: "+massive.getAge());
           // System.out.println("~~~~~~~~~~~~~~~~~");
        }System.out.println("--------------------- ");

        Car car = new Car();
        car.setCarName("BMW");
        car.setCountryName("Germany");
        car.setSpeed(320);

        Car car1 = new Car();
        car1.setCarName("Honda");
        car1.setCountryName("Japan");
        car1.setSpeed(360);

        Car car2 = new Car();
        car2.setCarName("Chevrolet");
        car2.setCountryName("USA");
        car2.setSpeed(360);

        Car [] cars = {car,car1,car2};
        for (Car massive:cars) {
            System.out.println("Car name :"+massive.getCarName());
            System.out.println("Country manifacturing car: "+massive.getCountryName());
            System.out.println("Speed car: "+massive.getSpeed());

        }

    }
}