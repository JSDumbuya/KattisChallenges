
amountOfPeople, events = map(int, input().split())

person_wealth = {}
globalWealth = 0

for _ in range(events):
    event = input().split()

    if event[0] == "SET":
        person = int(event[1])
        new_wealth = int(event[2])
        person_wealth[person] = new_wealth

    elif event[0] == "RESTART":
        new_wealth = int(event[1])
        globalWealth = new_wealth
        person_wealth.clear()
        
    elif event[0] == "PRINT":
        person = int(event[1])
        if person in person_wealth:
            print(person_wealth[person])
        else:
            print(globalWealth)