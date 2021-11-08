public class TestClass {

    public int testMethod(int value) {

        // Двойная проверка
        if (value == 5) {
            if (value == 5) {
                System.out.println("5");
            }
        }

        String someString = "value";

        //Использование == вместо .equals()
        if (someString == "value")
            System.out.println("Используй .equals()");

        //Использование switch-case без ключевого слова break
        switch (value) {
            case 1:
                System.out.println(1);
                case 2:
                    System.out.println(2);
                    case 3:
                        System.out.println(3);
                        default:
                            System.out.println(5);
        }

        int number = 0;
        while (number != value) {
            System.out.println("БЕСКОНЕЧНЫЙ ЦИКЛ");
        }

        return value;
    }

}
