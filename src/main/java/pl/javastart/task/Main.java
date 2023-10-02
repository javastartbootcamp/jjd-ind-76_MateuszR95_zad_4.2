package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Adam", "Kowalski", 34);
        Person person2 = new Person("Jan", "Nowak", 21);
        Task task1 = new Task("Pranie", "Pranie bawełnianych ubrań", 0, person1);
        Task task2 = new Task("Prasowanie", "Prasowanie koszul", 1, person2);
        Task task3 = new Task("Odkurzanie", "Odkurzanie mieszkania", -1, person2);
        Task task4 = new Task("Zmywanie", "Zmywanie naczyć", 0);
        Task task5 = new Task("Mycie okien", "Mycie okien w domu");

        String task1Priority = task1.printPriorityStatus();
        System.out.println(task1Priority);
        String task2Priority = task2.printPriorityStatus();
        System.out.println(task2Priority);
        String task3Priority = task3.printPriorityStatus();
        System.out.println(task3Priority);
        String task4Priority = task4.printPriorityStatus();
        System.out.println(task4Priority);
        String task5Priority = task5.printPriorityStatus();
        System.out.println(task5Priority);

    }
}
