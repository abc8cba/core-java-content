package project.session1;

import java.util.Scanner;

public class Dashboard {

	public static void main(String[] args) {
		partialCode();
		//finalCode();
	}
	
	private static void partialCode() {
		Scanner s = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("Welcome to Dashboard\n=====================================");
			System.out.println(
					"1. Select 1 for User\n2. Select 2 for Product\n3. Select 3 for Cart\n4. Select 4 for Order\n5. Select 5 for Exit");
			option = s.nextInt();
			switch (option) {
			case 1:
				System.out.println("Case 1 Executed...");
				break;
			case 2:
				System.out.println("Case 2 Executed...");
				break;
			case 3:
				System.out.println("Case 3 Executed...");
				break;

			case 4:
				System.out.println("Case 4 Executed...");
				break;
			case 5:
				System.out.println("Case 5 Executed...");
				System.out.println("Exited Successfully...");
				s.close();
				System.exit(0);
				break;
			}
		} while (option != 5);
		
	}

	private static void finalCode() {
        Scanner s = new Scanner(System.in);
        int option = 0,optionUser = 0,optionProduct = 0,optionCart = 0, optionOrder = 0;
        do{
            System.out.println("Welcome to Dashboard\n=====================================");
            System.out.println("1. Select 1 for User\n2. Select 2 for Product\n3. Select 3 for Cart\n4. Select 4 for Order\n5. Select 5 for Exit");
            option = s.nextInt();
            switch(option){
                case 1:
                    do{
                        System.out.println("1. Select 1 Add User\n2. Select 2 Delete User\n3. Select 3 Update User" +
                                "\n4. Select 4 to Show All User\n5. Select 5 to Show Any User\n6. Select 6 for Exit");
                        optionUser = s.nextInt();
                        switch(optionUser) {
                            case 1:
                                System.out.println("Add User...");
                                break;
                            case 2:
                                System.out.println("Delete User...");
                                break;
                            case 3:
                                System.out.println("Update User...");
                                break;
                            case 4:
                                System.out.println("Show All User...");
                                break;
                            case 5:
                                System.out.println("Show Any User...");
                                break;
                            case 6:
                                System.out.println("Exited from User Section Successfully...");
                                break;
                        }
                    }while(optionUser != 6);
                    break;
                case 2:
                    do{
                        System.out.println("1. Select 1 Add Product\n2. Select 2 Delete Product\n3. Select 3 Update Product" +
                                "\n4. Select 4 to Show All Product\n5. Select 5 to Show Any Product\n6. Select 6 for Exit");
                        optionProduct = s.nextInt();
                        switch(optionProduct) {
                            case 1:
                                System.out.println("Add Product...");
                                break;
                            case 2:
                                System.out.println("Delete Product...");
                                break;
                            case 3:
                                System.out.println("Update Product...");
                                break;
                            case 4:
                                System.out.println("Show All Product...");
                                break;
                            case 5:
                                System.out.println("Show Any Product...");
                                break;
                            case 6:
                                System.out.println("Exited from Product Section Successfully...");
                                break;
                        }
                    }while(optionProduct != 6);
                    break;
                case 3:
                    do{
                        System.out.println("1. Select 1 Add to Cart\n2. Select 2 Delete From Cart\n3. Select 3 for Exit\"");
                        optionCart = s.nextInt();
                        switch(optionCart) {
                            case 1:
                                System.out.println("Add to Cart...");
                                break;
                            case 2:
                                System.out.println("Delete From Cart...");
                                break;
                            case 3:
                                System.out.println("Exited from Cart Section Successfully...");
                                break;
                        }
                    }while(optionCart != 3);
                    break;
                case 4:
                    do{
                        System.out.println("1. Select 1 to Book an Order\n2. Select 2 to Book an Order\n3. Select 3 for Exit\"");
                        optionOrder = s.nextInt();
                        switch(optionOrder) {
                            case 1:
                                System.out.println("Book an Order...");
                                break;
                            case 2:
                                System.out.println("Cancel the Order...");
                                break;
                            case 3:
                                System.out.println("Exited from Order Section Successfully...");
                                break;
                        }
                    }while(optionOrder != 3);
                    break;
                case 5:
                    System.out.println("Case 5 Executed...");
                    System.out.println("Exited Successfully...");
                    s.close();
                    System.exit(0);
                    break;
            }
        }while(option != 5);
    }

}
