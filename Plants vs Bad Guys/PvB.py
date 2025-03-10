import heapq

num_rows = int(input())
peashooters = list(map(int, input().split()))
heapq.heapify(peashooters)

min_t = heapq.heappop(peashooters) + 1

print(min_t)