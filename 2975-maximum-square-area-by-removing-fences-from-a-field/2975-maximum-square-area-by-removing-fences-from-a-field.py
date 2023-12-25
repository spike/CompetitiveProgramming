class Solution:
    def maximizeSquareArea(self, m: int, n: int, h_fences: List[int], v_fences: List[int]) -> int:
        h = sorted(h_fences + [1, m])
        v = sorted(v_fences + [1, n])
        dh = {h[i] - h[j] for i in range(len(h) - 1, 0, -1) for j in range(i)}
        dv = [v[i] - v[j] for i in range(len(v) - 1, 0, -1) for j in range(i)]
        ans = next((x for x in sorted(dv, reverse=True) if x in dh), -1)
        return ans ** 2 % (10**9 + 7) if ans != -1 else -1