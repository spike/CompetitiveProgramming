class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        d = { "": 0}
        for y in range(len(grid)):
            key = "-".join(str(grid[y]))
            d.setdefault(key, 0)    
            d[key] += 1
        count = 0
        for x in range(len(grid[0])):
            col = []
            for y in range(len(grid)):
                col.append(grid[y][x])
            key = "-".join(str(col))
            if key in d:
                count += d[key]
        return count
                
        