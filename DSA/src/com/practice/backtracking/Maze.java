package DSA.src.com.practice.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    static void main(String[] args) {
        // path("", 3, 3);
        // System.out.println(pathRetDiagonal("", 3, 3));

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };


        //  pathRestrinction("", maze, 0, 0);
      //  allPath("", maze, 0, 0);
        int[][] path=new int[maze.length][maze[0].length];
        allPathPrint("",maze,0,0,path,1);
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c));
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r, c - 1));
        }
        return list;
    }


    static void pathRestrinction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrinction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrinction(p + 'R', maze, r, c + 1);
        }
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }

        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;

    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
