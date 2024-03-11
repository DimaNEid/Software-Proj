package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);

    static Scanner menuIn = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static Scanner scanner3 = new Scanner(System.in);
    static Scanner scanner5 = new Scanner(System.in);









    protected static final List<House> houses = new ArrayList<>();
    static House hh = new House();


    public static void main(String[] args) {


        logger.info("\n Welcome to SakaNcom Application!");
        logger.info(" 1. Log In ");
        logger.info(" 2. Sign Up");


        logger.info("Enter Registration");
            int choiceReg = scanner.nextInt();


            if (choiceReg == 1) {



                logger.info("Log In Page");

                logger.info("\n-- Log In As --");
                logger.info("  1. Owner  ");
                logger.info("  2. Admin  ");
                logger.info("  3. Tenant ");


                logger.info("Enter Your Choice");
                    int logUser = scanner.nextInt();

                    if (logUser == 1) {

                        logger.info("Enter Your Username");
                        String u = scanner1.nextLine();
                        logger.info("Enter Your Password");

                        String p = scanner1.nextLine();

                       // boolean loginStatus = (UserMethodReg.userLoginCheck(u, p));




                                    logger.info("Welcome Owner!");
                                    logger.info("Please choose one of the following: ");

                                    logger.info("1. Add Your Information.");
                                    logger.info("2. Add Residence.");
                                    logger.info("3. View All Residences.");
                                    logger.info("4. Add House.");
                                    logger.info("5. View All House.");
                                    logger.info("6. Control Panel.");
                                    logger.info("7. Update House Information.");
                                    logger.info("8. Check Number Of Communication");


                                    int choice = menuIn.nextInt();
                                    menuIn.nextLine();

                                    if(choice == 1) {

                                        logger.info("Add Owner ID");
                                        String oii1 = scanner2.nextLine();


                                        logger.info("Add Owner Name");
                                        String oii2 = scanner2.nextLine();

                                        logger.info("Add Owner Phone");
                                        String oii3 = scanner2.nextLine();

                                        logger.info("Add Owner Address");
                                        String oii4 = scanner2.nextLine();

                                        PersonsMethod.addOwner(oii1,oii2,oii3,oii4);


                                    }

                                        else if (choice == 2) {




                                        logger.info("Add Resident ID");
                                        String input1 = scanner3.nextLine();


                                        logger.info("Add your ID");
                                        String input2 = scanner3.nextLine();

                                        logger.info("Add The resident location");
                                        String input3 = scanner3.nextLine();

                                        logger.info("Add The service you offer");
                                        String input4 = scanner3.nextLine();

                                        logger.info("Add The Number Of Floors");
                                        Integer input5 = scanner3.nextInt();

                                        logger.info("Add The Number Of Houses");
                                        Integer input6 = scanner3.nextInt();

                                         ServiceMethod.addResidence(input1, input2, input3, input5, input4, input6);


                                        } else if (choice == 3) {

                                        logger.info("All your Residences: ");
                                         ServiceMethod.viewResidences();


                                        } else if (choice == 4) {

                                        logger.info("Add the House ID");
                                        String input1 = scanner5.nextLine();

                                        logger.info("Add The Resident ID that the house is located");
                                        String input2 = scanner5.nextLine();

                                        logger.info("Add The Floor ID that the house is located");
                                        String input3 = scanner5.nextLine();

                                        logger.info("Add The Monthly Rent");
                                        String input4 = scanner5.nextLine();

                                        logger.info("Add number of bathrooms ");
                                        String input5 = scanner5.nextLine();

                                        logger.info("Add number of bedrooms");
                                        Integer input6 = scanner5.nextInt();

                                        logger.info("Add if there is a balcony");
                                        Integer input7 = scanner5.nextInt();


                                            ServiceMethod.addHouse(input1, input2, input3, input4, input5, input6, input7);


                                        } else if (choice == 5) {

                                        logger.info("All your Houses: ");
                                        ServiceMethod.viewHouses();



                                        } else if (choice == 6) {

                                        logger.info("If You Would Like To Check The Control Panel");
                                        ServiceMethod.viewResidences();


                                        logger.info("Enter The Resident ID That You Would Like To See Its Details");
                                         String s = scanner.nextLine();


                                        logger.info("Enter The Floor ID That You Would Like To See Its house");
                                        String ss = scanner.nextLine();

                                        for (House house : houses) {
                                            if (s.equals(house.getResidenceId()) && ss.equals(house.getFloorId())) {
                                                logger.info(house.getHouseId());
                                            }else{logger.info("enter again") ;}

                                            logger.info("Enter The House ID That You Would Like To See Its Details");
                                            String sss = scanner.nextLine();
                                            if (sss.equals(house.getHouseId())) {
                                                logger.info(house.toString());
                                            }else{logger.info("wrong input");}


                                        }


                                        } else if (choice == 7) {


                                        logger.info("Enter The house Id That You Would Like To Edit Its Information");
                                        String i1 = scanner.nextLine();

                                        for (int i = 0 ;i<houses.size();i++){
                                        if (i1.equals(houses.get(i).getHouseId())) {

                                            int x = scanner.nextInt();

                                            logger.info("Choose Which Information You Want To Edit.");

                                            logger.info("1. Residence Id.");
                                            logger.info("2. Floor Number.");
                                            logger.info("3. Monthly Rent.");
                                            logger.info("4. Balcony.");
                                            logger.info("5. Bathrooms.");
                                            logger.info("6. Bedrooms");

                                            if (x == 1) {
                                                logger.info("Enter New House Id.");
                                                String i2 = scanner.nextLine();
                                                hh.setHouseId(i2);
                                                houses.add(hh);
                                            } else if (x == 2) {
                                                logger.info("Enter New Floor Number.");
                                                String i3 = scanner.nextLine();
                                                hh.setFloorId(i3);
                                                houses.add(hh);

                                            } else if (x == 3) {
                                                logger.info("Enter New Monthly Rent.");
                                                String i4 = scanner.nextLine();
                                                hh.setMonthlyRent(i4);
                                                houses.add(hh);
                                            } else if (x == 4) {
                                                logger.info("Enter New Balcony.");
                                                String i5 = scanner.nextLine();
                                                hh.setBalcony(i5);
                                                houses.add(hh);

                                            } else if (x == 5) {
                                                logger.info("Enter New Balcony Number.");
                                                String i5 = scanner.nextLine();
                                                hh.setBalcony(i5);
                                                houses.add(hh);

                                            } else if (x == 6) {
                                                logger.info("Enter New Bathrooms Number.");
                                                String i6 = scanner.nextLine();
                                                hh.setBathroomsNum(Integer.valueOf(i6));
                                                houses.add(hh);

                                            } else if (x == 7) {
                                                logger.info("Enter New Bedrooms Number.");
                                                String i7 = scanner.nextLine();
                                                hh.setBedroomsNum(Integer.valueOf(i7));
                                                houses.add(hh);
                                            }


                                        }
                                    }





                                        }   else {
                                        logger.info("Invalid Input Try One Of The Valid Choices 1,2,3,4,5,6,7");
                                        }






                    }


                    else {    logger.info("Enter Valid Input 1,2,3");}



            }
            else if (choiceReg == 2) {


                logger.info("Sign Up As: ");

                logger.info("\n-- Sign Up Page --");
                logger.info("  1. Owner   Account ");
                logger.info("  2. Admin   Account ");
                logger.info("  3. Tenant  Account ");

                logger.info("Enter Your Account");
                    int signUser = scanner.nextInt();

                    if (signUser == 1) {

                        logger.info("Enter Your username");
                        String in1 = scanner.nextLine();

                        logger.info("Enter Your password");
                        String in2 = scanner.nextLine();

                        UserMethodReg.userSignUpCheck(in1,in2);
                       }

                    else {    logger.info("Enter Valid Input 1,2,3");}


            }


        }

    }

