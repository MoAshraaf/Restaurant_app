package Restaurant;

import java.util.List;
import java.util.Scanner;

public class Order {
    public static double value;
    public static double totalPrice;
    public static List<String> ordered;
    //number of items
    public static int i;
    public static int a,b,c,d,e,f,g,h,j;

    public static void Order()
    {
        System.out.println("Would you like to place an order ?");
        Scanner sc = new Scanner(System.in);
        String response = sc.next().toLowerCase();
        switch (response)
        {
            case "yes":
            {
                choice();
                break;
            }
            case"no":
            {
                System.out.println("Thanks for visiting");
                break;
            }
            default:
            {
                System.out.println("please select a valid response");
                break;
            }

        }

    }
    public static void Choose()
    {
        System.out.println("would you like to order something else ?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch (str)
        {
            case "yes":
            {
                choice();
                break;
            }
            case"no":
            {
                CheckOut();
                break;
            }
            default:
            {
                System.out.println("please select a valid response");
                break;
            }

        }
    }
    public static void NewOrder()
    {
        System.out.println("please select one of the following categories ");
        System.out.println("note you only need to write the number of the category :) ");
        System.out.println("1. Appetizers");
        System.out.println("2. Main Dish");
        System.out.println("3. Desert");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
            {
                Appetizers();
                break;
            }
            case 2:
            {
                MainDish();
                break;
            }
            case 3:
            {
                Desert();
                break;
            }
            default:
            {
                System.out.println("please select a valid number");
                NewOrder();
                break;
            }}
    }
    public static void Appetizers()
    {
        System.out.println("please select the appetizer from the following list");
        System.out.println("note you only need to write the number of the item :) ");
        System.out.println("");
        System.out.println("1.Mozzarella sticks (3$)");
        System.out.println("2.Onion rings (4$)");
        System.out.println("3.Cream soup (6$)");
        System.out.println("4.back to categories");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i= sc.nextInt();
                a = i*3;
                value = value + (i*3);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*3);
                ordered.add("Mozzarella sticks. "+i);
                Instructions();
                Choose();
                break;
            }
            case 2:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                b = i*4;
                value = value + (i*4);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*4);
                ordered.add("Onion rings. "+i);
                Instructions();
                Choose();
                break;
            }
            case 3:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                c = i*6;
                value = value + (i*6);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*6);
                ordered.add("Cream soup. "+i);
                Instructions();
                Choose();
                break;
            }
            case 4:
            {
                NewOrder();
                break;
            }
            default:
            {
                System.out.println("please select a valid value");
                Appetizers();
                break;
            }
        }
    }
    public static void MainDish()
    {
        System.out.println("please select the MainDish from the following list");
        System.out.println("note you only need to write the number of the item :) ");
        System.out.println("");
        System.out.println("1.Smoked House BBQ (23$)");
        System.out.println("2.Mushroom Ranch (27$)");
        System.out.println("3.Beef Buster (28$)");
        System.out.println("4.back to categories");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                d = i*23;
                value = value + (i*23);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*23);
                ordered.add("Smoked House BBQ. "+i);
                Instructions();
                Choose();
                break;
            }
            case 2:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                e = i*27;
                value = value + (i*27);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*27);
                ordered.add("Mushroom Ranch. "+i);
                Instructions();
                Choose();
                break;
            }
            case 3:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                f = i*28;
                value = value + (i*28);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*28);
                ordered.add("Beef Buster. "+i);
                Instructions();
                Choose();
                break;
            }
            case 4:
            {
                NewOrder();
                break;
            }
            default:
            {
                System.out.println("please select a valid value");
                MainDish();
                break;
            }
        }
    }
    public static void Desert()
    {
        System.out.println("please select the Desert from the following list");
        System.out.println("note you only need to write the number of the item :) ");
        System.out.println("");
        System.out.println("1.Decadent Chocolate Lava Cake (12$)");
        System.out.println("2.MSummer Berry Panna Cotta (13$)");
        System.out.println("3.Classic New York-Style Cheesecake (17$)");
        System.out.println("4.back to categories");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                g = i*12;
                value = value + (i*12);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*12);
                ordered.add("Decadent Chocolate Lava Cake. "+i);
                Instructions();
                Choose();
                break;
            }
            case 2:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                h = i*13;
                value = value + (i*13);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*13);
                ordered.add("MSummer Berry Panna Cotta. "+i);
                Instructions();
                Choose();
                break;
            }
            case 3:
            {
                System.out.println("please mention the number of items");
                System.out.println("please do not add more than 5 items");
                i = sc.nextInt();
                j = i*17;
                value = value + (i*17);
                System.out.println("current receipt = "+value);
                totalPrice = totalPrice + (i*17);
                ordered.add("Classic New York-Style Cheesecake. "+i);
                Instructions();
                Choose();
                break;
            }
            case 4:
            {
                NewOrder();
                break;
            }
            default:
            {
                System.out.println("please select a valid value");
                Desert();
                break;
            }
        }
    }

    public static void Instructions()
    {
        System.out.println("Do you want to add instructions ?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch (str)
        {
            case "yes":
            {
                System.out.println("Please add your instructions..");
                String str2 = sc.next();
                break;
            }
            case "no":
            {
                break;
            }
            default:
            {
                System.out.println("please select yes or no");
                Instructions();
            }

        }
    }
    public static void choice()
    {
        System.out.println("Would you like to search for an item ?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch (str)
        {
            case "yes":
            {
                Search();
                break;
            }
            case "no":
            {
                NewOrder();
                break;
            }
            default:
            {
                System.out.println("Please select yes or no");
                choice();
            }
        }
    }
    public static void Search()
    {
        System.out.println("please type the item");
        System.out.println("you can just write the first name");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch(str)
        {
            case"mozzarella":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i= sc.nextInt();
            a = i*3;
            value = value + (i*3);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*3);
            ordered.add("mozzarella sticks. "+i);
            Instructions();
            Choose();
            break;
        }
            case"onion":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            b = i*4;
            value = value + (i*4);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*4);
            ordered.add("Onion rings. "+i);
            Instructions();
            Choose();
            break;
        }
            case"cream":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            c = i*6;
            value = value + (i*6);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*6);
            ordered.add("Cream soup. "+i);
            Instructions();
            Choose();
            break;
        }
            case"smoked":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            d = i*23;
            value = value + (i*23);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*23);
            ordered.add("Smoked House BBQ. "+i);
            Instructions();
            Choose();
            break;
        }
            case"mushroom":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            e = i*27;
            value = value + (i*27);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*27);
            ordered.add("Mushroom Ranch. "+i);
            Instructions();
            Choose();
            break;
        }
            case"beef":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            f = i*28;
            value = value + (i*28);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*28);
            ordered.add("Beef Buster. "+i);
            Instructions();
            Choose();
            break;
        }
            case"decadent":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            g = i*12;
            value = value + (i*12);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*12);
            ordered.add("Decadent Chocolate Lava Cake. "+i);
            Instructions();
            Choose();
            break;
        }
            case"summer":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            h = i*13;
            value = value + (i*13);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*13);
            ordered.add("MSummer Berry Panna Cotta. "+i);
            Instructions();
            Choose();
            break;
        }
            case"classic":
        {
            System.out.println("please mention the number of items");
            System.out.println("please do not add more than 5 items");
            i = sc.nextInt();
            j = i*17;
            value = value + (i*17);
            System.out.println("current receipt = "+value);
            totalPrice = totalPrice + (i*17);
            ordered.add("Classic New York-Style Cheesecake. "+i);
            Instructions();
            Choose();
            break;
        }
            default:
            {
            System.out.println("Do you want to go to the main page ?");
            String str2 = sc.next().toLowerCase();
            switch (str2) {
                case "yes": {
                    Order();
                    break;
                }
                case "no": {
                    System.out.println("Thank you for using our Restaurant");
                    break;
                }
                default: {
                    System.out.println("please enter yes or no");
                    break;
                }
            }
        }
        }
    }
    public static void Update()
    {
        System.out.println("What would you like to update in your order");
        System.out.println("1. add");
        System.out.println("2. remove");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
            {
                NewOrder();
                break;
            }
            case 2:
            {
                RemoveItem();
                break;
            }
            default:
            {
                System.out.println("please select 1 or 2");
                Update();
            }
        }
    }
    public static void RemoveItem()
    {
        System.out.println("please select the number of item you want to remove");
        System.out.println("1.Appetizers");
        System.out.println("2.Main Dish");
        System.out.println("3.Dessert");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

            switch (x) {
                case 1: {
                    if (ordered.get(0).toLowerCase().contains("sticks")) {
                        totalPrice = totalPrice - a;
                        value = value - a;

                    }
                    if (ordered.get(0).toLowerCase().contains("rings")) {
                        totalPrice = totalPrice - b;
                        value = value - b;

                    }
                    if (ordered.get(0).toLowerCase().contains("soup")) {
                        totalPrice = totalPrice - c;
                        value = value - c;

                    }
                    ordered.remove(0);
                    System.out.println("Current value : " + totalPrice);
                    break;
                }
                case 2: {
                    if (ordered.get(1).toLowerCase().contains("smoked")) {
                        totalPrice = totalPrice - d;
                        value = value - d;

                    }
                    if (ordered.get(1).toLowerCase().contains("ranch")) {
                        totalPrice = totalPrice - e;
                        value = value - e;

                    }
                    if (ordered.get(1).toLowerCase().contains("buster")) {
                        totalPrice = totalPrice - f;
                        value = value - f;

                    }
                    ordered.remove(1);
                    System.out.println("Current value : " + totalPrice);
                    break;
                }
                case 3: {
                    if (ordered.get(2).toLowerCase().contains("lava")) {
                        totalPrice = totalPrice - g;
                        value = value - g;

                    }
                    if (ordered.get(2).toLowerCase().contains("panna")) {
                        totalPrice = totalPrice - h;
                        value = value - h;
                    }
                    if (ordered.get(2).toLowerCase().contains("classic")) {
                        totalPrice = totalPrice - j;
                        value = value - j;

                    }
                    ordered.remove(2);
                    System.out.println("Current value : " + totalPrice);
                    break;
                }
                default: {
                    System.out.println("please select a value between 1 and 3");
                    RemoveItem();
                }
            }

        CheckOut();
    }
    public static void CheckOut()
    {
        System.out.println("Here is your order:");
        for (String item : ordered)
        {
            System.out.println(item);
        }
        System.out.println("Do you want to proceed?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch (str)
        {
            case "yes":
            {
                Proceed();
                break;
            }
            case "no":
            {
                Update();
                break;
            }
            default:
                System.out.println("please answer with yes or no :)");
                CheckOut();

        }
    }
    public static void Proceed()
    {
        System.out.println("do you have a promo code ?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch (str)
        {
            case"yes": {
                PromosDiscounts();
                break;
            }
            case "no":
            {
                ConfirmPay();
                break;
            }
            default:
            {
                System.out.println("please enter a valid response");
                Proceed();

            }
        }

    }
    public static void PromosDiscounts()
    {
        System.out.println("please enter the code: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch (str) {
            case"123abc":
            {
                totalPrice = totalPrice - (totalPrice * 0.2);
                value = value - (value * 0.2);
                System.out.println("current Value = " + value);
                ConfirmPay();
                break;
            }
            case"456def":
            {
                totalPrice = totalPrice - (totalPrice * 0.14);
                value = value - (value * 0.2);
                System.out.println("current Value = " + value);
                ConfirmPay();
                break;
            }
            case"789hij":
            {
                totalPrice = totalPrice - (totalPrice * 0.18);
                value = value - (value * 0.2);
                System.out.println("current Value = " + value);
                ConfirmPay();
                break;
            }
            default:{
                System.out.println("Invalid Promo code");
                Proceed();
                break;
            }
        }
    }
    public static void ConfirmPay()
    {
        totalPrice = totalPrice + (totalPrice*0.12) + (totalPrice*0.14);
        System.out.println("total value after taxes and service is : "+ totalPrice);
        System.out.println("Do you want to confirm ? ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        switch (str)
        {
            case "yes":
            {
                Finalizing();
                break;
            }
            case "no":
            {
                CheckOut();
                break;
            }
            default:
            {
                System.out.println("please enter a valid response");
                ConfirmPay();

            }
        }
    }
    public static void Finalizing()
    {
        System.out.println("Cash/Credit");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        if(str.equals("cash")||str.equals("credit"))
        {
            System.out.println("Delivery/reservation");
            String str2 =sc.next().toLowerCase();
            if(str2.equals("delivery")||str2.equals("reservation"))
            {
                System.out.println("Order is placed Thank you for Choosing our restaurant");
            }
            else {
                System.out.println("please enter delivery or reservation");
                Finalizing();
            }
        }
        else {

            System.out.println("please enter cash or credit");
            Finalizing();
        }
    }

}
