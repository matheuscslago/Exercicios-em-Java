package com.github.matheuscslago.topicos.poo.basicos;

public class Associacao {
    static void main(String[] args) {
        Engine motor1 = new Engine("2.0 Turbo", 250);
        Engine motorV8 = new Engine("5.0 V8", 450);

        Car carro1 = new Car("RX-7", motor1);
        Car carro2 = new Car("Mustang", motorV8);

        carro1.testAccelerator();

        System.out.println("\n--- Swapping the Engine ---");
        carro1.replaceEngine(motorV8);
        carro1.testAccelerator();

        Garage garagem = new Garage("Matheus");
        garagem.save(carro1);
        garagem.save(carro2);

        garagem.viewGarage();
    }
}

class Engine {
    private int hp;
    private String specification;

    public Engine(String specification, int hp) {
        this.hp = hp;
        this.specification = specification;
    }

    public int getHp() {
        return hp;
    }

    public String getSpecification() {
        return specification;
    }

    public void engineRoar() {
        System.out.print("Vruum! ( " + this.hp + " hp )\n");
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void replaceEngine(Engine newEngine) {
        this.engine = newEngine;
    }

    public void testAccelerator() {
        System.out.println("Car model: " + this.model);
        engine.engineRoar();
    }

    public String getModel() {
        if (this.model != null) {
            return this.model;
        }
        else {return "no model";}
    }

    public Engine getEngine() {
        return engine;
    }
}

class Garage {
    private String owner;
    private Car[] vacancies;
    private int numberCars = 0;

    public Garage(String owner) {
        this.owner = owner;
        this.vacancies = new Car[3];
    }

    public void save(Car car) {
        if (numberCars < vacancies.length) {
            vacancies[numberCars] = car;
            System.out.println("\n"+car.getModel() + " was parked!");
            numberCars++;
        } else {
            System.out.println("There are no parking spaces available!\n");
        }
    }

    public void viewGarage() {
        System.out.println("--------------------------");
        System.out.println("Owner: " + owner);
        System.out.println("--------------------------");
        for (int i = 0; i < numberCars; i++) {
            System.out.println("Model: " + vacancies[i].getModel());
            System.out.println("Engine: " + vacancies[i].getEngine().getSpecification() + " (" + vacancies[i].getEngine().getHp() + " hp)");
            System.out.println("--------------------------");
        }
    }

}
