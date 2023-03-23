package com.Strings;
import java.util.*;
public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path: " + ShortestPath(path) );
    }
    public static float ShortestPath(String path){
        int x = 0, y =0;
        for(int index=0; index < path.length(); index++){
            char direction = path.charAt(index);
            if(direction == 'N'){
                y++;
            }else if (direction == 'S'){
                y--;
            }else if (direction == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int xSqure = x*x;
        int ySqure = y*y;
        return (float) Math.sqrt(xSqure + ySqure);
    }
}
