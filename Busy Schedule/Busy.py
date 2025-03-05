

def convert_to_24(hour, minute, am_pm):
    if am_pm == "a.m.":
        if hour == 12:
            hour = 0
    elif am_pm == "p.m.":
        if hour != 12:
            hour+=12
    return hour * 60 + minute


while True:

    num_of_appointments = int(input())

    if num_of_appointments == 0:
        break

    appointments = []

    for _ in range(num_of_appointments):
        timestamp = input()
        
        hour_minute, am_pm = timestamp.split()
        hour, minute = map(int, hour_minute.split(":"))

        time_in_min = convert_to_24(hour, minute, am_pm)

        appointments.append((hour_minute, am_pm, time_in_min))
    
    appointments.sort(key=lambda x: x[2])

    for appointment in appointments:
        print(appointment[0], " ", appointment[1])
    
    print()


        
        