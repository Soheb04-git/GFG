class Solution {

    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> result = new ArrayList<>();

        // Edge case: start blocked
        if (maze[0][0] == 0) return result;

        boolean[][] visited = new boolean[n][n];

        solve(0, 0, maze, n, visited, "", result);

        Collections.sort(result); // for lexicographic order (important)
        return result;
    }

    private void solve(int i, int j, int[][] maze, int n,
                       boolean[][] visited, String path,
                       ArrayList<String> result) {

        // Base case
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

        visited[i][j] = true;

        // DOWN
        if (i + 1 < n && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            solve(i + 1, j, maze, n, visited, path + "D", result);
        }

        // LEFT
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            solve(i, j - 1, maze, n, visited, path + "L", result);
        }

        // RIGHT
        if (j + 1 < n && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            solve(i, j + 1, maze, n, visited, path + "R", result);
        }

        // UP
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            solve(i - 1, j, maze, n, visited, path + "U", result);
        }

        // BACKTRACK
        visited[i][j] = false;
    }
}