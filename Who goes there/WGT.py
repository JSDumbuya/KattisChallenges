import heapq

siteCapacity, numSchools = map(int, input().split())

teamsPerSchool = []
accepted = [0] * numSchools
queue = []

for _ in range(numSchools):
    teams = int(input())
    teamsPerSchool.append(teams)

capacity = siteCapacity

for i in range(numSchools):
    if teamsPerSchool[i] > 0:
        heapq.heappush(queue, (1, i))

while capacity > 0 and queue:
    wave, i = heapq.heappop(queue)
    if accepted[i] < teamsPerSchool[i]:
        accepted[i] += 1
        capacity -= 1
        heapq.heappush(queue, (wave + 1, i))

for i in range(numSchools):
    print(accepted[i])