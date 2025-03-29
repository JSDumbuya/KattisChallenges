numCases = int(input())

for _ in range(numCases):
    case = list(map(int, input().split()))
    numStudents = case[0]
    grades = case[1:]
    #[start:end:step]
    average = sum(grades)/numStudents
    aboveAverage = list(filter(lambda x: x > average, grades))
    numAbove = (len(aboveAverage)/numStudents)*100
    print(f"{numAbove:.3f}%")
