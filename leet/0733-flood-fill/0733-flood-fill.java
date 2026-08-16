class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        // Edge case: same color
        if (original == color) return image;

        dfs(image, sr, sc, original, color);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int original, int color) 
    {
        // Boundary + color check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length)
            return;

        if (image[r][c] != original)
            return;

        // Paint
        image[r][c] = color;

        // 4 directions
        dfs(image, r + 1, c, original, color);
        dfs(image, r - 1, c, original, color);
        dfs(image, r, c + 1, original, color);
        dfs(image, r, c - 1, original, color);
    }
}