import math
from itertools import permutations

numChildren = int(input())
childrenAges = list(map(int, input().split()))

def find_permutations(listOfAges):
    for permutation in permutations(listOfAges):
        if all(math.gcd(permutation[i], permutation[i+1]) > 1 for i in range(len(permutation) - 1)):
            print(*permutation)
            return
    print("Neibb")

find_permutations(childrenAges)