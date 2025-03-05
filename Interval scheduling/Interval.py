
cases = int(input())
intervals = [tuple(map(int, input().split())) for _ in range(cases)]

sorted_intervals = sorted(intervals, key=lambda x: x[1])

maxTime = 0
chosenIntervals = 0

for startTime, endTime in sorted_intervals:
    if (startTime >= maxTime):
        maxTime = endTime
        chosenIntervals += 1
    

print(chosenIntervals)