package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        for(Room r : rooms){
            System.out.println(r);

        }

        System.out.println("Rooms have 2 checked out:");


        r101.checkIn();
        r102.checkIn();

        for(Room r : rooms){
            System.out.println(r);
        }

        System.out.println("One room checked out");

        r102.checkOut();

        for(Room r : rooms){
            System.out.println(r);
        }

        ArrayList<Reservation> reservations = new ArrayList<>();

        Reservation res1 = new Reservation("king", 2, false);
        Reservation res2 = new Reservation("double", 1, false);
        Reservation res3 = new Reservation("king", 1, false);
        Reservation res4 = new Reservation("king", 1, true);

        reservations.add(res1);
        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);


        for(Reservation r : reservations){
            System.out.println(r);
        }


        //---------------------

        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1, "Matt", "IT", 10, 0);
        Employee emp2 = new Employee(1, "Fred", "Exec", 10, 45);
        Employee emp3 = new Employee(1, "Sarah", "HR", 10, 40);
        Employee emp4 = new Employee(1, "Sam", "HR", 20, 41);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for(Employee e : employees){
            System.out.println(e);
        }

        //---

        emp1.punchIn(8);
        emp1.punchOut( 12);

        emp1.punchIn(13);
        emp1.punchOut(17);

        emp1.punchTimeCard(8, 12);
        emp1.punchTimeCard(13,17);

        emp1.logHours(40);

        emp2.punchIn(8);
        emp2.punchOut();

        System.out.println("after");

        for(Employee e : employees){
            System.out.println(e);
        }

        System.out.println("Hotels:");
        Hotel h1 = new Hotel("Days Inn", 6, 20);
        Hotel h2 = new Hotel("Holiday Inn", 10, 40);

        System.out.println(h1);
        System.out.println(h2);

        System.out.println("Book a room:");
        System.out.println("Book 3 suites");
        System.out.println(h1.bookRoom(3, true));

        System.out.println(h1);

        System.out.println("Book 4 more");
        System.out.println( h1.bookRoom(4, false));

        System.out.println(h1);

    }
}