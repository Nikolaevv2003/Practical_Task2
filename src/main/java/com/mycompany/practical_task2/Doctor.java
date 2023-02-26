public class Doctor {
    private String name;
    private int age;
    private String placeOfWork;

    public Doctor(String name, int age, String placeOfWork) {
        this.name = name;
        this.age = age;
        this.placeOfWork = placeOfWork;
    }

    public void goToJob() {
        System.out.println(name + " пошел на работу.");
    }

    public void goHome() {
        System.out.println(name + " идет домой.");
    }

    public void putOnMedicalGown() {
        System.out.println(name + " одел халат.");
    }

    @Override
    public String toString() {
        return "Доктор " + name + ", Возраст: " + age + ", Место работы: " + placeOfWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
