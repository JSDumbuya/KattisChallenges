
def numerical_encoding(classes):
    rankings = {"upper": -3, "middle": -2, "lower": -1}
    encoded_classes = [rankings[cls] for cls in reversed(classes)]
    while len(encoded_classes) < 10:
        encoded_classes.append(-2)
    return encoded_classes

amountOfCases = int(input())

for case in range(amountOfCases):
    amountOfPeople = int(input())
    peopleAndClasses = {}
    for _ in range(amountOfPeople):
        line = input().split(": ")
        name = line[0]
        classes = line[1].replace(" class", "").split("-")
        peopleAndClasses[name] = numerical_encoding(classes)
    ranked = sorted(peopleAndClasses.items(),key=lambda item: (item[1], item[0]))
    for person in ranked:
        print(person[0])
    print("==============================")
    