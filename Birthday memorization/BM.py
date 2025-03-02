
amountOfFriends = int(input())

best_friends = {}
birthdate_set = set()

for _ in range(amountOfFriends):
    line = input().split(" ")
    name = line[0]
    score = int(line[1]) 
    birthdate = line[2]

    if birthdate in birthdate_set:
        if score > best_friends[birthdate]["score"]:
            best_friends[birthdate] = {"name": name, "score": score}
    else:
        best_friends[birthdate] = {"name": name, "score": score}
        birthdate_set.add(birthdate)

sorted_friends = sorted([friend["name"] for friend in best_friends.values()])

print(len(sorted_friends))
print("\n".join(sorted_friends))


