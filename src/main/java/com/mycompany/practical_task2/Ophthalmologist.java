public class Ophthalmologist extends Doctor {

    public Ophthalmologist(String name, int age, String placeOfWork) {
        super(name, age, placeOfWork);
    }

    public void checkThePatientsVision(String patientName) {
        System.out.println("Окулсит " + getName() + " проверил зрение у " + patientName);
        System.out.println("Сделал заключение и дал рекомендации.");
    }

    @Override
    public String toString() {
        return "Окулист " + getName() + ", Возраст: " + getAge() + ", Место работы: " + getPlaceOfWork();
    }
}
