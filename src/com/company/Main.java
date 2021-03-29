package com.company;
import com.company.binarySearch.BinarySearch;
import com.company.binarySearch.IPAddress;
//import com.company.bubbleSort.BubbleSort;
//import com.company.bubbleSort.*;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static long convert(String address) {
        String[] ipAddress = address.split("\\.");
        long w = 16777216 * Long.parseLong(ipAddress[0]);
        long x = 65536 * Long.parseLong(ipAddress[1]);
        long y = 256 * Long.parseLong(ipAddress[2]);
        long z = Long.parseLong(ipAddress[3]);
        long ipNumber = w + x + y + z;
        return ipNumber;
    }


    public static void main(String[] args) throws IOException {


        // test

        /*
        Bubble Sort on Complex Data
         */

        /*

        IPAddress[] ipAddresses = new IPAddress[100000];

        int i = 0;

        BufferedReader reader = new BufferedReader(new FileReader("src/ipaddresses.csv"));
        while (i < ipAddresses.length) {

            String row = reader.readLine();
            row = row.replace(", ", " ");
            String[] rowSplit = row.split(",");

            ipAddresses[i] = new IPAddress(Long.parseLong(rowSplit[0].substring(1, rowSplit[0].length() - 1)),
                    Long.parseLong(rowSplit[1].substring(1, rowSplit[1].length() - 1)),
                    rowSplit[2].substring(1, rowSplit[2].length() - 1),
                    rowSplit[3].substring(1, rowSplit[3].length() - 1),
                    rowSplit[4].substring(1, rowSplit[4].length() - 1),
                    rowSplit[5].substring(1, rowSplit[5].length() - 1));
            i++;

        }

        reader.close();


        BubbleSort.sort(ipAddresses);

        FileWriter writer = new FileWriter("src/sorted.csv");
        for (int i1 = 0; i1 < ipAddresses.length; i1++) {
            writer.write(ipAddresses[i1].toString() + "\n");
        }
        writer.flush();
        writer.close();


         */

        // test

        /*

        Binary Search on Complex Data

         */

        IPAddress[] ipAddresses = new IPAddress[1000];
        int i = 0;

        BufferedReader reader = new BufferedReader(new FileReader("src/sorted.csv"));
        String row = reader.readLine();

        while (row != null) {

            row = row.replace(", ", " ");
            String[] rowSplit = row.split(",");

            ipAddresses[i] = new IPAddress(Long.parseLong(rowSplit[0].substring(1, rowSplit[0].length()-1)),
                    Long.parseLong(rowSplit[1].substring(1, rowSplit[1].length()-1)),
                    rowSplit[2].substring(1, rowSplit[2].length()-1),
                    rowSplit[3].substring(1, rowSplit[3].length()-1),
                    rowSplit[4].substring(1, rowSplit[4].length()-1),
                    rowSplit[5].substring(1, rowSplit[5].length()-1));
            i++;
            row = reader.readLine();

        }

        reader.close();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter IP address for searching: ");
        String address = scan.nextLine();
        scan.close();

        long number = convert(address);



        // searching ip address
        int result = BinarySearch.search(ipAddresses, number);
        if (result == -1) {
            System.out.println("Not found!");
        }
        else {
            System.out.println("Contry Code: " + ipAddresses[result].countryCode + ", " +
                    "Country Name: " + ipAddresses[result].countryName + ", " +
                    "Region Name: " + ipAddresses[result].regionName + ", " +
                    "City Name: " + ipAddresses[result].cityName);
        }


    }

}

