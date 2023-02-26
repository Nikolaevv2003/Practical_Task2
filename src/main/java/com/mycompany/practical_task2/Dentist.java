public class Dentist extends Doctor {
    private double pricePerTooth;

    public Dentist(String name, int age, String placeOfWork, double pricePerTooth) {
        super(name, age, placeOfWork);
        this.pricePerTooth = pricePerTooth;
    }

    public void cureThePatient(String patientName) {
        System.out.println("Стоматолог " + getName() + " осмотрел рот пацента " + patientName);
        System.out.println(getName() + " аккуратным движением руки взял сверло и принялся лечить зуб.");
        System.out.println("Зуб вылечен. Пациент " + patientName + " заплатил " + pricePerTooth + " рублей.");
    }

    @Override
    public String toString() {
        return "Стоматолог " + getName() + ", Возраст: " + getAge() + ", Место работы: " + getPlaceOfWork() + ", Цена за зуб: " + pricePerTooth + " рублей";
    }

    public double getPricePerTooth() {
        return pricePerTooth;
    }

    public void setPricePerTooth(double pricePerTooth) {
        if (pricePerTooth < 0) {
            this.pricePerTooth = 0;
        } else {
            this.pricePerTooth = pricePerTooth;
        }
    }
}
