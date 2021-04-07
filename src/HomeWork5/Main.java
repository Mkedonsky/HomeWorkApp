package HomeWork5;

public class Main {

    public static void main(String[] args) {
        /*
        в виде лонга сделал телефн для разнообразия
         */
        Person p1 = new Person("Иванов Алексей","Пекарь",
                "ivanov@mail.ru",67, 89688553929L);
        Person p2 = new Person("Петров Сергей","Дворник",
                "petrov@mail.ru",54, 89867576767L);
        Person p3 = new Person("Жиглов Дмитрий","Слесарь",
                "jiglov@mail.ru",23, 89696996969L);
        Person p4 = new Person("Пушкин Александр","Пекарь",
                "pushkin@mail.ru",57, 89676868555L);
        Person p5 = new Person("Сидоров Сергей","Пекарь",
                "sidorov@mail.ru",22, 89623445222L);



        Person[] pArray = {p1,p2,p3,p4,p5};

        for (Person person:pArray ){
            if (person.age < 40){
                person.preseter();
            }
        }


    }
}
