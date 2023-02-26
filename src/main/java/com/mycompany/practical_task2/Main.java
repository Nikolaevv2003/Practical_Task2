import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, placeOfWork, typeOfAnimals;
        int age, a;
        double pricePerTooth;
        System.out.println("Николаев Александр Сергеевич");
        System.out.println("Группа РИБО-01-21");
        System.out.println();
        System.out.println("Выберите тип доктора (введите число):");
        System.out.println("1 - Ветеринар");
        System.out.println("2 - Окулист");
        System.out.println("3 - Стоматолог");
        a = Integer.parseInt(scan());
        switch (a) {
            case 1:
                System.out.println("Введите имя ветеринара:");
                name = scan();
                System.out.println("Укажите возраст:");
                age = Integer.parseInt(scan());
                if (age < 0) {
                    System.out.println("Ошибка! Возраст не может быть отрицательным.");
                    return;
                }
                System.out.println("Укажите место работы:");
                placeOfWork = scan();
                System.out.println("Укажите тип животных, с которыми работает ветеринар:");
                typeOfAnimals = scan();
                Veterinarian veterinarian = new Veterinarian(name, age, placeOfWork, typeOfAnimals);
                System.out.println("Ветеринар создан!");
                System.out.println(veterinarian);
                break;
            case 2:
                System.out.println("Введите имя окулиста:");
                name = scan();
                System.out.println("Укажите возраст:");
                age = Integer.parseInt(scan());
                if (age < 0) {
                    System.out.println("Ошибка! Возраст не может быть отрицательным.");
                    return;
                }
                System.out.println("Укажите место работы:");
                placeOfWork = scan();
                Ophthalmologist ophthalmologist = new Ophthalmologist(name, age, placeOfWork);
                System.out.println("Окулист создан!");
                System.out.println(ophthalmologist);
                break;
            case 3:
                System.out.println("Введите имя стоматолога:");
                name = scan();
                System.out.println("Укажите возраст:");
                age = Integer.parseInt(scan());
                if (age < 0) {
                    System.out.println("Ошибка! Возраст не может быть отрицательным.");
                    return;
                }
                System.out.println("Укажите место работы:");
                placeOfWork = scan();
                System.out.println("Укажите стоимость за зуб (в рублях):");
                pricePerTooth = Double.parseDouble(scan());
                if (pricePerTooth < 0) {
                    System.out.println("Ошибка! Стоимость не может быть отрицательной.");
                    return;
                }
                Dentist dentist = new Dentist(name, age, placeOfWork, pricePerTooth);
                System.out.println("Стоматолог создан!");
                System.out.println(dentist);
                break;
            default:
                System.out.println("Ошибка! Необходимо ввести число от 1 до 3");
        }
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}