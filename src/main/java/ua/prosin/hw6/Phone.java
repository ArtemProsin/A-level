package ua.prosin.hw6;

public class Phone {
        private String number;
        private String model;
        private double weight;
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }
        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }
        public Phone() {
        }
        public void receiveCall(String callerName) {
            System.out.println("Incoming call from " + callerName);
        }

        public String getNumber() {
            return number;
        }

        public static void main(String[] args) {
            Phone phone1 = new Phone("+3803541256", "iPhone", 0.578);
            Phone phone2 = new Phone("+380665781155", "Samsung");
            Phone phone3 = new Phone();

            phone3.number = "+38097645907";
            phone3.model = "Motorola";
            phone3.weight = 0.467;

            System.out.println("Phone 1:");
            System.out.println("Number: " + phone1.number);
            System.out.println("Model: " + phone1.model);
            System.out.println("Weight: " + phone1.weight);
            System.out.println();

            System.out.println("Phone 2:");
            System.out.println("Number: " + phone2.number);
            System.out.println("Model: " + phone2.model);
            System.out.println("Weight: " + phone2.weight);
            System.out.println();

            System.out.println("Phone 3:");
            System.out.println("Number: " + phone3.number);
            System.out.println("Model: " + phone3.model);
            System.out.println("Weight: " + phone3.weight);
            System.out.println();

            phone1.receiveCall("Roma");
            System.out.println("Phone number: " + phone1.getNumber());
            System.out.println();

            phone2.receiveCall("Misha");
            System.out.println("Phone number: " + phone2.getNumber());
            System.out.println();

            phone3.receiveCall("Maria");
            System.out.println("Phone number: " + phone3.getNumber());
        }
    }