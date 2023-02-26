public class Veterinarian extends Doctor {
    private String typeOfAnimals;

    public Veterinarian(String name, int age, String placeOfWork, String typeOfAnimals) {
        super(name, age, placeOfWork);
        this.typeOfAnimals = typeOfAnimals;
    }

    public void examineTheAnimal(String animal) {
        System.out.println("Ветеринар " + getName() + " начал осматривать животное " + animal);
        System.out.println(getName() + " сделал заключение и дал рекомендации.");
    }

    @Override
    public String toString() {
        return "Ветеринар " + getName() + ", Возраст: " + getAge() + ", Место работы: " + getPlaceOfWork() + ", Тип животных: " + typeOfAnimals;
    }

    public String getTypeOfAnimals() {
        return typeOfAnimals;
    }

    public void setTypeOfAnimals(String typeOfAnimals) {
        this.typeOfAnimals = typeOfAnimals;
    }
}
