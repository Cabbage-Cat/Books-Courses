package enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        System.out.print("Enter a size:(S,M,L,Ex)");
        String input = in.next().toUpperCase();

        Size size = Enum.valueOf(Size.class,input);
        System.out.println(size);
        System.out.println(size.getSs());

    }
}

enum Size{
    SMALL("S"),MED("M"),LA("L"),EX("XL");
    private String ss;
    private Size(String ss){
        this.ss = ss;
    }

    public String getSs() {
        return ss;
    }
}