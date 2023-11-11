class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val originalColor = image[sr][sc]
        fun dfs(y: Int, x: Int) {
            if (y < 0 || y > image.lastIndex || 
                x < 0 || x > image[0].lastIndex) return
            if (image[y][x] != originalColor ||
                image[y][x] == -1) return
            image[y][x] = -1
            dfs(y-1, x)
            dfs(y+1, x)
            dfs(y, x-1)
            dfs(y, x+1)
            return
        }
        dfs(sr, sc)
        for (y in image.indices) {
            for (x in image[0].indices) {
                if (image[y][x] == -1) {
                    image[y][x] = color
                }
            }
        }
        return image
    }
}
