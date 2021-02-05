/*
Gaynor Erwan
CSC 112
Main.java
 */


import java.util.ArrayList;


public class Main {

        // create Store
        private static ArrayList<myItem> Store;

        public static void main(String[] args) {

            Store = new ArrayList<myItem>(); // creates ArrayList Store, then adds 10 items to the list
                                                // and their respective prices
            Store.add(new myItem("racket", 145.00));
            Store.add(new myItem("grip", 8.99));
            Store.add(new myItem("shoes", 120.00));
            Store.add(new myItem("bag", 85.00));
            Store.add(new myItem("string", 25.00));
            Store.add(new myItem("snack", 4.25));
            Store.add(new myItem("hat", 12.00));
            Store.add(new myItem("sunglasses", 3.50));
            Store.add(new myItem("shirt", 22.00));
            Store.add(new myItem("short", 15.00));



            int mySpecialValue = 0;
            double price = 0;  // creates subtotal variable
            for (int index = 0; index < args.length; index++){   // for loop used to iterate through the
                // arguments



                try {
                    System.out.print("args[" + index + "] " + args[index]);
                    mySpecialValue = Integer.parseInt(args[index]);
                    System.out.println("  " + Store.get(mySpecialValue).toString());   // prints the
                                        // item corresponding to the argument
                    price = price + Store.get(mySpecialValue).getItemPrice();    // adds each argument's
                                        // price to the subtotal
                }
                catch (NumberFormatException e) {
                    System.out.println("     ** Illegal input <" + args[index] + ">");
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("     ** Illegal Store index <" + mySpecialValue + ">");
                }



            }
            System.out.println("");

            System.out.println("Your subtotal is: " + price);

            double tax = price * 0.05; //  tax represents 5% of the subtotal
            System.out.printf("Your tax (5%%) is: %.2f", tax);
            System.out.println("");

            double total = price * 1.05; // total is 105% of the subtotal
            System.out.printf("Your total is: %.2f", total);





        }
}




