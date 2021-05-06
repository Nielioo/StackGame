/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Aprillio
 */
public class Chemistry {

    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;
    int lastScore1, lastScore2, lastScore3, lastScore4, lastScore5;

    public void run() {
        Scanner d = new Scanner(System.in);

        int solved = 0;
        int path = 0;

        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s3 = new Stack();
        Stack s4 = new Stack();
        Stack s5 = new Stack();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        System.out.println("=================");
        System.out.println("CHEMISTRY SORT-UP");
        System.out.println("=================");

        randomize(s1, s2, s3, list1, list2, list3);

        do {
            solved = 0;
            lastScore1 = winSystemReset1(s1);
            lastScore2 = winSystemReset2(s2);
            lastScore3 = winSystemReset3(s3);
            lastScore4 = winSystemReset4(s4);
            lastScore5 = winSystemReset5(s5);
            solved = lastScore1 + lastScore2 + lastScore3 + lastScore4 + lastScore5;

            System.out.println("\nHomogenous Tube: " + solved);

            check(s1, s2, s3, s4, s5, list1, list2, list3, list4, list5);

            if (solved == 3) {
                System.out.println("\n!! You Win !!\n");
                path = -1;
                System.exit(0);
            }

            System.out.print("Move from : ");
            int moveFrom = d.nextInt();
            System.out.print("Move To: ");
            int moveTo = d.nextInt();

            int tmp = 8;

            switch (moveFrom) {
            case 1:
                tmp = moveFrom(s1, list1);
                break;
            case 2:
                tmp = moveFrom(s2, list2);
                break;
            case 3:
                tmp = moveFrom(s3, list3);
                break;
            case 4:
                tmp = moveFrom(s4, list4);
                break;
            case 5:
                tmp = moveFrom(s5, list5);
                break;

            default:
                System.err.println("Invalid Option !! There are only 5 Tubes !!\n");
                path = 0;
                return;
            }

            switch (moveTo) {
            case 1:
                if (s1.getSize() == 0) {
                    moveTo(tmp, s1, list1);
                } else if (s1.getSize() < 4 && s1.peek() == tmp) {
                    moveTo(tmp, s1, list1);
                } else if (s1.getSize() < 4 && s1.peek() != tmp) {
                    System.err.println("\nCannot move the item. Item Mismatches !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                } else if (s1.getSize() >= 4) {
                    System.err.println("\nCannot move the item. Tube is full !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                }
                break;
            case 2:
                if (s2.getSize() == 0) {
                    moveTo(tmp, s2, list2);
                } else if (s2.getSize() < 4 && s2.peek() == tmp) {
                    moveTo(tmp, s1, list1);
                } else if (s2.getSize() < 4 && s2.peek() != tmp) {
                    System.err.println("\nCannot move the item. Item Mismatches !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                } else if (s2.getSize() >= 4) {
                    System.err.println("\nCannot move the item. Tube is full !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                }
                break;
            case 3:
                if (s3.getSize() == 0) {
                    moveTo(tmp, s3, list3);
                } else if (s3.getSize() < 4 && s3.peek() == tmp) {
                    moveTo(tmp, s3, list3);
                } else if (s3.getSize() < 4 && s3.peek() != tmp) {
                    System.err.println("\nCannot move the item. Item Mismatches !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                } else if (s3.getSize() >= 4) {
                    System.err.println("\nCannot move the item. Tube is full !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                }
                break;
            case 4:
                if (s4.getSize() == 0) {
                    moveTo(tmp, s4, list4);
                } else if (s4.getSize() < 4 && s4.peek() == tmp) {
                    moveTo(tmp, s4, list4);
                } else if (s4.getSize() < 4 && s4.peek() != tmp) {
                    System.err.println("\nCannot move the item. Item Mismatches !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                } else if (s4.getSize() >= 4) {
                    System.err.println("\nCannot move the item. Tube is full !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                }
                break;
            case 5:
                if (s5.getSize() == 0) {
                    moveTo(tmp, s5, list5);
                } else if (s5.getSize() < 4 && s5.peek() == tmp) {
                    moveTo(tmp, s5, list5);
                } else if (s5.getSize() < 4 && s5.peek() != tmp) {
                    System.err.println("\nCannot move the item. Item Mismatches !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                } else if (s5.getSize() >= 4) {
                    System.err.println("\nCannot move the item. Tube is full !!");
                    switch (moveFrom) {
                    case 1:
                        moveTo(tmp, s1, list1);
                        break;
                    case 2:
                        moveTo(tmp, s2, list2);
                        break;
                    case 3:
                        moveTo(tmp, s3, list3);
                        break;
                    case 4:
                        moveTo(tmp, s4, list4);
                        break;
                    case 5:
                        moveTo(tmp, s5, list5);
                        break;
                    }
                    path = 0;
                }
                break;

            default:
                System.err.println("Invalid Option !! There are only 5 Tubes !!");
                switch (moveFrom) {
                case 1:
                    moveTo(tmp, s1, list1);
                    break;
                case 2:
                    moveTo(tmp, s2, list2);
                    break;
                case 3:
                    moveTo(tmp, s3, list3);
                    break;
                case 4:
                    moveTo(tmp, s4, list4);
                    break;
                case 5:
                    moveTo(tmp, s5, list5);
                    break;
                }
                path = 0;
                break;
            }

        } while (path == 0);

    }

    private void copyStackToArray(Stack s, ArrayList<Integer> list) {
        if (s.isEmpty()) {
            return;
        }

        int tmp = s.peek();
        s.pop();

        copyStackToArray(s, list);

        list.add(tmp);
        s.push(tmp);
    }

    // private void addRandom(Stack s, ArrayList<Integer> list) {
    // for (int i = 0; i <= 3; i++) {
    // int random = (int) (Math.random() * 3);
    // s.push(random);
    // }
    // copyStackToArray(s, list);
    // }

    private void randomize(Stack s1, Stack s2, Stack s3, ArrayList<Integer> list1, ArrayList<Integer> list2,
            ArrayList<Integer> list3) {

        int[] count = { 0, 0, 0 };
        ArrayList<Integer> tmpList = new ArrayList<>();

        while (tmpList.size() != 12) {
            int random = (int) (Math.random() * 3);

            if (count[random] != 4) {
                tmpList.add(random);
                count[random]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            s1.push(tmpList.get(i));
        }
        for (int i = 4; i < 8; i++) {
            s2.push(tmpList.get(i));
        }
        for (int i = 8; i < 12; i++) {
            s3.push(tmpList.get(i));
        }

        copyStackToArray(s1, list1);
        copyStackToArray(s2, list2);
        copyStackToArray(s3, list3);
    }

    private int moveFrom(Stack s, ArrayList<Integer> list) {
        int tmp;
        tmp = s.peek();
        s.pop();
        list.remove(s.getSize());

        return tmp;
    }

    private void moveTo(int tmp, Stack s, ArrayList<Integer> list) {
        list.add(tmp);
        s.push(tmp);
    }

    //check tube 1
    private int winSystemReset1(Stack s) {
        score1 = 0;
        return winSystem1(s);
    }

    private int winSystem1(Stack s) {
        if (s.isEmpty()) {
            return 0;
        }

        int tmp = s.peek();
        s.pop();

        if (s.isEmpty()) {
            s.push(tmp);
            return 0;
        }
        if (tmp == s.peek()) {
            score1++;
        }
        winSystem1(s);

        if (score1 == 3) {
            lastScore1 = 1;
            if(lastScore1 >= 1){
                lastScore1 = 1;
            }
        } else {
            lastScore1 = 0;
        }

        s.push(tmp);

        return lastScore1;
    }

    //check tube 2
    private int winSystemReset2(Stack s) {
        score2 = 0;
        return winSystem2(s);
    }

    private int winSystem2(Stack s) {
        if (s.isEmpty()) {
            return 0;
        }

        int tmp = s.peek();
        s.pop();

        if (s.isEmpty()) {
            s.push(tmp);
            return 0;
        }
        if (tmp == s.peek()) {
            score2++;
        }
        winSystem2(s);

        if (score2 == 3) {
            lastScore2 = 1;
            if(lastScore2 >= 1){
                lastScore2 = 1;
            }
        } else {
            lastScore2 = 0;
        }

        s.push(tmp);

        return lastScore2;
    }

    //check tube 3
    private int winSystemReset3(Stack s) {
        score3 = 0;
        return winSystem3(s);
    }

    private int winSystem3(Stack s) {
        if (s.isEmpty()) {
            return 0;
        }

        int tmp = s.peek();
        s.pop();

        if (s.isEmpty()) {
            s.push(tmp);
            return 0;
        }
        if (tmp == s.peek()) {
            score3++;
        }
        winSystem3(s);

        if (score3 == 3) {
            lastScore3 = 1;
            if(lastScore3 >= 1){
                lastScore3 = 1;
            }
        } else {
            lastScore3 = 0;
        }

        s.push(tmp);

        return lastScore3;
    }

    //check tube 4
    private int winSystemReset4(Stack s) {
        score4 = 0;
        return winSystem4(s);
    }

    private int winSystem4(Stack s) {
        if (s.isEmpty()) {
            return 0;
        }

        int tmp = s.peek();
        s.pop();

        if (s.isEmpty()) {
            s.push(tmp);
            return 0;
        }
        if (tmp == s.peek()) {
            score4++;
        }
        winSystem4(s);

        if (score4 == 3) {
            lastScore4 = 1;
            if(lastScore4 >= 1){
                lastScore4 = 1;
            }
        } else {
            lastScore4 = 0;
        }

        s.push(tmp);

        return lastScore4;
    }

    //check tube 5
    private int winSystemReset5(Stack s) {
        score5 = 0;
        return winSystem5(s);
    }

    private int winSystem5(Stack s) {
        if (s.isEmpty()) {
            return 0;
        }

        int tmp = s.peek();
        s.pop();

        if (s.isEmpty()) {
            s.push(tmp);
            return 0;
        }
        if (tmp == s.peek()) {
            score5++;
        }
        winSystem5(s);

        if (score5 == 3) {
            lastScore5 = 1;
            if(lastScore5 >= 1){
                lastScore5 = 1;
            }
        } else {
            lastScore5 = 0;
        }

        s.push(tmp);

        return lastScore5;
    }

    private void check(Stack s1, Stack s2, Stack s3, Stack s4, Stack s5, ArrayList<Integer> list1,
            ArrayList<Integer> list2, ArrayList<Integer> list3, ArrayList<Integer> list4, ArrayList<Integer> list5) {

        for (int i = 3; i >= 0; i--) {

            if (!s1.isEmpty() && s1.getSize() > i) {
                System.out.print("|" + list1.get(i) + "|");
            } else {
                System.out.print("| |");
            }

            if (!s2.isEmpty() && s2.getSize() > i) {
                System.out.print("\t|" + list2.get(i) + "|");
            } else {
                System.out.print("\t| |");
            }

            if (!s3.isEmpty() && s3.getSize() > i) {
                System.out.print("\t|" + list3.get(i) + "|");
            } else {
                System.out.print("\t| |");
            }

            if (!s4.isEmpty() && s4.getSize() > i) {
                System.out.print("\t|" + list4.get(i) + "|");
            } else {
                System.out.print("\t| |");
            }

            if (!s5.isEmpty() && s5.getSize() > i) {
                System.out.print("\t|" + list5.get(i) + "|\n");
            } else {
                System.out.print("\t| |\n");
            }

        }
        System.out.println("-1-" + "\t-2-" + "\t-3-" + "\t-4-" + "\t-5-");
    }
}
