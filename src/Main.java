public class Main {
    public static void main(String[] args) {
        Hogwarts[] student = {
                new Hogwarts("Гарри Поттер",  85, 90,"Грифиндор"),
                new Hogwarts("Гермиона Грейнджен", 99, 82,"Грифиндор"),
                new Hogwarts("Рон Уизли",  69,60,"Грифиндор"),
                new Hogwarts("Драко Малфой", 82, 69,"Слизерин"),
                new Hogwarts("Грэхэм Монтегю", 42, 30,"Слизерин"),
                new Hogwarts("Грегори Гойл", 30, 42, "Слизерин"),
                new Hogwarts("Захария Смит", 60,78,"Пуфендуй"),
                new Hogwarts("Седрик Диггори",75,80,"Пуфендуй"),
                new Hogwarts("Джастин Финч-Флетчли", 56,82,"Пуфендуй"),
                new Hogwarts("Чжоу Чанг", 60,61,"Когтевран"),
                new Hogwarts("Падма Патил", 79,85,"Когтевран"),
                new Hogwarts("Маркус Белби",84,79,"Когтевран")
        };
        Grifindor[] grifindors={
                new Grifindor("Гарри Поттер","Грифиндор", 85, 90, 100, 98, 100),
                new Grifindor("Гермиона Грейнджен", "Грифиндор", 99, 82, 97, 99, 98),
                new Grifindor("Рон Уизли", "Грифиндор", 69, 60, 90, 100, 78),
        };
        Slyzerin[] slyzerins={
                new Slyzerin("Драко Малфой", "Слизерин", 69, 99,99, 90, 85,20, 21),
                new Slyzerin("Грэхэм Монтегю", "Слизерин",42, 30,10, 5,4,2,1),
                new Slyzerin("Грегори Гойл", "Слизерин",30, 42,2,42,12,11,10),
        };
        Pufendui[] pufenduis={
                new Pufendui("Захария Смит", "Пуфендуй",60,78, 90,54,99),
                new Pufendui("Седрик Диггори","Пуфендуй",75,80,87,28,76),
                new Pufendui("Джастин Финч-Флетчли","Пуфендуй", 56,82,98,28,48),
        };
        Kogtevran[] kogtevrans={
                new Kogtevran("Чжоу Чанг","Когтевран", 60,61,42,22,41,42),
                new Kogtevran("Падма Патил","Когтевран", 79,85,80,82,43,75),
                new Kogtevran("Маркус Белби","Когтевран",84,79,87,90,21,22)
        };
        PrintStudent printStudent = new PrintStudent();
        printStudent.print(grifindors);
        printStudent.print(pufenduis);
        printStudent.print(kogtevrans);
        printStudent.print(slyzerins);
        printStudent.comparisonStudentOnGrifindor(grifindors[1], grifindors[0]);
        printStudent.comparisonStudentOnPufenduis(pufenduis[1], pufenduis[0]);
        printStudent.comparisonStudentOnKogtevran(kogtevrans[1], kogtevrans[0]);
        printStudent.comparisonStudentOnSlyzerin(slyzerins[1], slyzerins[0]);
        printStudent.comparisionStudentOnHogwarts(student[3],student[10]);
    }
}