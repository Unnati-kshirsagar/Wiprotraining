package com.wipro.hibernatedemo.entity;


import java.util.List;
import java.util.Scanner;
import com.wipro.hibernatedemo.entity.PanCard;
import com.wipro.pan.repo.PanRepo;

public class AppPan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- PAN Management Menu ---");
            System.out.println("1. Create PAN Record");
            System.out.println("2. Find PAN by ID");
            System.out.println("3. Update PAN Record");
            System.out.println("4. Delete PAN by ID");
            System.out.println("5. Find All PAN Records");
            System.out.println("6. Find All PAN Holder Names");
            System.out.println("7. Find PAN by PAN Number");
            System.out.println("9. Exit");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter holder name:");
                    String name = sc.nextLine();
                    System.out.println("Enter PAN number:");
                    String pan = sc.nextLine();
                    PanRepo.createPan(new PanCard(name, pan));
                    break;

                case 2:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    System.out.println(PanRepo.findById(id));
                    break;

                case 3:
                    System.out.println("Enter ID to update:");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.println("Enter new name:");
                    String uname = sc.nextLine();
                    System.out.println("Enter new PAN number:");
                    String upan = sc.nextLine();
                    PanRepo.updatePan(new PanCard(uid, uname, upan));
                    break;

                case 4:
                    System.out.println("Enter ID to delete:");
                    int did = sc.nextInt();
                    PanRepo.deleteById(did);
                    break;

                case 5:
                    List<PanCard> all = PanRepo.findAll();
                    all.forEach(System.out::println);
                    break;

                case 6:
                    List<String> names = PanRepo.findAllHolderNames();
                    names.forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Enter PAN number:");
                    String searchPan = sc.nextLine();
                    List<PanCard> list = PanRepo.findByPanNumber(searchPan);
                    list.forEach(System.out::println);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 9);

        sc.close();
    }
}
