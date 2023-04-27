package sg.edu.nus.iss;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        
        // instantiate shopping cart object
        ShoppingCartDB shoppingCart = new ShoppingCartDB();
        
        // create directory path at startup
        shoppingCart.directory(args);
        
        // welcome message
        System.out.println("Welcome to your shopping cart in the " + shoppingCart.getDirPath() + " directory.");
        System.out.println("Please type a command. You may type 'help' if you need a list of commands.");
        
        // terminal input
        String input = "";
        Scanner scan = new Scanner(System.in);


        // end function
        while (!input.startsWith("end")) {
            input = scan.nextLine();
            // System.out.println(input);

            // help function
            if (input.startsWith("help")) {
                shoppingCart.help();
            }
            
            // login function
            if (input.startsWith("login")) {
                shoppingCart.login(input);
            }

            // list function
            if (input.startsWith("list")) {
                shoppingCart.list();
            }

/*
            // save function
            if (input.equals("save")) {
                if (loggedIn == true) {
                    System.out.println("Your cart has been saved");

                    // overwrite shopping cart
                    String dirPathFileName = dirPath + File.separator + user + ".txt";
                    FileWriter fw = new FileWriter(dirPathFileName, false);
                    BufferedWriter bw = new BufferedWriter(fw);

                    if (shoppingList.size() > 0) {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            bw.append(shoppingList.get(i) + "\n");
                        }
                    }

                    bw.flush();
                    bw.close();
                    fw.close();
                } else {
                    System.out.println("Please login in first before saving");
                }
            }
                */
            

            /*
            // add function
            if (input.equals("add")) {
                Scanner itemInput = new Scanner(System.in);
                String items = itemInput.nextLine();
                itemInput.close();

                // use add method with items as an argument
                shoppingCart.add(items);
            }
            // delete function
            if (input.equals("delete")) {

                try {
                    Integer index = Integer.parseInt(scan.next());

                    // if list is empty
                    if (shoppingList.isEmpty()) {
                        System.out.println("Your cart is empty");

                        // if incorrect index provided
                        // index bigger than list size
                        // index is less or equal to 0
                    } else if (index > shoppingList.size() || index <= 0) {
                        System.out.println("Incorrect item index");

                        // if correct index provided
                    } else {
                        System.out.println(shoppingList.get(index - 1) + " removed from cart");
                        shoppingList.remove(index - 1);
                    }

                } catch (NumberFormatException nfe) {
                    System.out.println("Please input a number to delete e.g. delete 1");
                    // System.out.println(nfe);
                }

            }

            // users function
            if (input.equals("users")) {
                
                // if cartdb exists, list out files in cart db
                File cartdbPath = new File("cartdb");
                if (cartdbPath.exists()) {
                    String[] fileList = cartdbPath.list();

                    // only print names if they are text files
                    for (String file:fileList) {
                        if (file.endsWith(".txt")) {
                            file = file.replace(".txt", "");
                            System.out.println(file);
                        }
                    }
                }

                // if db exists, list out files in db
                File dbPath = new File("db");
                if (dbPath.exists()) {
                    String[] fileList = dbPath.list();

                    // only print names if they are text files
                    for (String file:fileList) {
                        if (file.endsWith(".txt")) {
                            file = file.replace(".txt", "");
                            System.out.println(file);
                        }
                    }
                }
            }
            */

        }

        scan.close();
        System.out.println("Thanks for shopping with us. Bye bye!");

    }
}
