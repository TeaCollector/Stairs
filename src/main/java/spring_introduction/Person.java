package spring_introduction;


import org.springframework.beans.factory.annotation.Value;


//@Component("personBean")
//@Scope("prototype")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surName}")
    private String surName;
    @Value("${person.age}")
    private int age;

    public void setSurName(String surName) {
        System.out.println("Set surName is created");
        this.surName = surName;
    }

    public void setAge(int age) {
        System.out.println("Set age is created");
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

//    @Autowired
    public Person( Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created.");
    }

//        public Person() {
//        System.out.println("Person bean is created.");
//    }


    //  pet -> setPet конвертация имени 'pet' в конфиг файле в сеттер

    public void setPet(Pet pet) {
        System.out.println("Pet bean from setter");
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("What I'm the animal? " + pet.getClass().getSimpleName());
        pet.say();
    }
}
