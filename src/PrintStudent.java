public class PrintStudent {
    public void print(Grifindor[] grifindors) {
        for (int i = 0; i < grifindors.length; i++) {
            Grifindor grifindor = grifindors[i];
            System.out.println(grifindor.getName() + " Мощность заклинаний " + grifindor.getPowerMagic() +
                    " Трансегрессия " + grifindor.getTrans() + " Благородство "
                    + grifindor.getRoyal() + " Честь " + grifindor.getHonest()
                    + " Смелость " + grifindor.getBrave());
        }
    }

    public void print(Slyzerin[] slyzerins) {
        for (int i = 0; i < slyzerins.length; i++) {
            Slyzerin slyzerin = slyzerins[i];
            System.out.println(slyzerin.getName() + " Мощность заклинаний " + slyzerin.getPowerMagic()
                    + " Трансегрессия " + slyzerin.getTrans() + " Хитрость " + slyzerin.getCunning()
                    + " Решительность " + slyzerin.getDetermition() + " Амбиции " + slyzerin.getAmbition()
                    + " Находчивость " + slyzerin.getResourcefulness() + " Жажда власти " + slyzerin.getLustForPower());
        }
    }

    public void print(Pufendui[] pufenduis) {
        for (int i = 0; i < pufenduis.length; i++) {
            Pufendui pufendui = pufenduis[i];
            System.out.println(pufendui.getName() + " Мощность заклинаний " + pufendui.getPowerMagic() + " Трансегрессия "
                    + pufendui.getTrans() + " Трудолюбивы " + pufendui.getIndustrious() + " Верны " + pufendui.getFaithful()
                    + " Честны " + pufendui.getHonesty());
        }
    }

    public void print(Kogtevran[] kogtevrans) {
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println(kogtevran.getName() + " Мощность заклинаний " + kogtevran.getPowerMagic() + " Трансегрессия "
                    + kogtevran.getTrans() + " Умны " + kogtevran.getSmart() + " Мудры " + kogtevran.getWise()
                    + " Остроумны  " + kogtevran.getWitty() + " Полны творчества" + kogtevran.getFullOfCreativity());
        }
    }

    public void comparisonStudentOnGrifindor(Grifindor grifindor1, Grifindor grifindor2) {
        int sum1 = grifindor1.getRoyal() + grifindor1.getHonest() + grifindor1.getBrave();
        int sum2 = grifindor2.getRoyal() + grifindor2.getHonest() + grifindor2.getBrave();
        if (sum1 > sum2) {
            System.out.println(grifindor1.getName() + " лучший Гриффиндорец, чем " + grifindor2.getName());
        } else {
            System.out.println(grifindor2.getName() + " лучший Гриффиндорец, чем " + grifindor1.getName());
        }
    }

    public void comparisonStudentOnSlyzerin(Slyzerin slyzerin1, Slyzerin slyzerin2) {
        int sum1 = slyzerin1.getCunning() + slyzerin1.getAmbition() + slyzerin1.getResourcefulness()
                + slyzerin1.getResourcefulness() + slyzerin1.getLustForPower();
        int sum2 = slyzerin2.getCunning() + slyzerin2.getAmbition() + slyzerin2.getResourcefulness()
                + slyzerin2.getResourcefulness() + slyzerin2.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(slyzerin1.getName() + " лучший Слизеринец, чем " + slyzerin2.getName());
        } else {
            System.out.println(slyzerin2.getName() + " лучший Слизеринец, чем " + slyzerin1.getName());
        }
    }

    public void comparisonStudentOnPufenduis(Pufendui pufendui1, Pufendui pufendui2) {
        int sum1 = pufendui1.getFaithful() + pufendui1.getHonesty() + pufendui1.getIndustrious();
        int sum2 = pufendui2.getFaithful() + pufendui2.getHonesty() + pufendui2.getIndustrious();
        if (sum1 > sum2) {
            System.out.println(pufendui1.getName() + " лучший Пуфендуец, чем " + pufendui2.getName());
        } else {
            System.out.println(pufendui2.getName() + " лучший Пуфендуец, чем " + pufendui1.getName());
        }
    }

    public void comparisonStudentOnKogtevran(Kogtevran kogtevran1, Kogtevran kogtevran2) {
        int sum1 = kogtevran1.getSmart() + kogtevran1.getWise() + kogtevran1.getWitty() + kogtevran1.getFullOfCreativity();
        int sum2 = kogtevran2.getSmart() + kogtevran2.getWise() + kogtevran2.getWitty() + kogtevran2.getFullOfCreativity();
        if (sum1 > sum2) {
            System.out.println(kogtevran1.getName() + " лучший Когтевранец, чем " + kogtevran2.getName());
        } else {
            System.out.println(kogtevran2.getName() + " лучший Когтевранец, чем " + kogtevran1.getName());
        }
    }

    public void comparisionStudentOnHogwarts(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.getPowerMagic() + student1.getTrans();
        int sum2 = student2.getPowerMagic() + student2.getTrans();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучше в магии и трансгрессии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше в магии и трансгрессии, чем " + student1.getName());
        }
    }
}
