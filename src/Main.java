public class Main {
    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.name = "Лайка";
      dog.age = 3;
      dog.shine = "кара";
      dog.behavior = "тиштебейт акылдуу ";
        System.out.println("Аты:" +dog.name+ "" +"\n"+"Жашы:" +dog.age+" "+ "\n" +"Тусу:" +dog.shine+ " \n" +"Мунозу:" +dog.behavior );






        Cat cat = new Cat();
        cat.name = "Мурька";
        cat.age = 2;
        cat.shine = "Ак";
        cat.behavior = "аймайт";
      System.out.println("\n"+"Аты:" +cat.name+ "  " +"\n" +"Жашы: " +cat.age+" " + "\n" + "Тусу:" +cat.shine+" " +"\n" + "Мунозу:" + cat.behavior );




      Student student = new Student();
      student.name = "Айкен";
      student.age = 17;
      student.floor = "Жен.";
      student.behavior ="тихая";
      System.out.println("\n"+ "Аты:" +student.name+ "  " +"\n" +"Жашы: " +student.age+" " + "\n" + "Пол:" +student.floor+" " +"\n" + "Мунозу:" + student.behavior);




      Auto auto = new Auto();
      auto.brand = "BMW";
      auto.year = 2012;
      auto.information = "тез журот";
      System.out.println("\n"+ "Бренд:" +auto.brand+ "  " +"\n" +"Жылы: " +auto.year+" " + "\n" + "Малымат:" +auto.information);
      }
    }
