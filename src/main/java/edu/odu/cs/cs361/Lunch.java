package edu.odu.cs.cs361;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Lunch {

    private int nRooms;

    public class Room {
        List<Integer> doorsLeadTo;

        public Room() {
            doorsLeadTo = new ArrayList<>();
        }
    }

    private Room[] rooms;

    /**
     * Create a lunchroom map.
     * @param numRooms How many rooms in the map.
     */
    public Lunch(int numRooms) {
        nRooms = numRooms;
        rooms = new Room[numRooms];
        for (int i = 0; i < numRooms; ++i) {
            rooms[i] = new Room();
        }
    }

    /**
     * Add a one-way door from one room to another.
     * @param fromRoom
     * @param toRoom
     */
    public void addDoor(int fromRoom, int toRoom) {
        rooms[fromRoom - 1].doorsLeadTo.add(toRoom - 1);
    }

    /**
     * Compute the length of the shortest path from one room to another.
     * @param start starting room
     * @param dest destination room
     * @return
     */
    public int findShortestPathBetween(int start, int dest) {
        //* Your code here
            return -1;
    }

    public static void solve(Scanner in) {
        int nRooms = in.nextInt();
        int nDoors = in.nextInt();
        Lunch lunch = new Lunch(nRooms);

        int start = in.nextInt();
        int stop = in.nextInt();

        for (int i = 0; i < nDoors; ++i) {
            int source = in.nextInt();
            int dest = in.nextInt();
            lunch.addDoor(source, dest);
        }

        int length = lunch.findShortestPathBetween(start, stop);
        System.out.println("" + length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in;
        if (args.length > 0) {
            in = new BufferedReader(new FileReader(args[0]));
        } else {
            in = new BufferedReader(new InputStreamReader(System.in));
        }
        Scanner input = new Scanner(in);
        solve(input);
        in.close();
    }

}