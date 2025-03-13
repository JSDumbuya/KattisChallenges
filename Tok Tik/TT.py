
cases = int(input())
people_views = {}

for _ in range(cases):
    person, views = input().split()
    people_views[person] = people_views.get(person, 0) + int(views)

sorted_people_by_views = sorted(people_views.items(), key=lambda item: item[1], reverse=True)

if sorted_people_by_views:
    print(sorted_people_by_views[0][0])