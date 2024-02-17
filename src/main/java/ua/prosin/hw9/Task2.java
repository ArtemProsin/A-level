package ua.prosin.hw9;

public class Task2 {
    public void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("F exception");
        }
    }

    public void g() throws Exception {
        throw new Exception("G exception");
    }
}

class Main {
    public static void main(String[] args) {
        Task2 task = new Task2();
        try {
            task.f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

