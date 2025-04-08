#input = sys.stdin.readline() 

numSurnames = int(input())
surnames = []

for _ in range(numSurnames):
    fullSurname = input()
    surnames.append(fullSurname)

def dutch_rule_key(surname):
    for i, ch in enumerate(surname):
        if ch.isupper():
            return surname[i:]

sorted_surnames = sorted(surnames, key=dutch_rule_key)

for surname in sorted_surnames:
    print(surname)
