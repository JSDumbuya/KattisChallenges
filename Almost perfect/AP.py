import sys
import math

for line in sys.stdin:
    p = int(line)

    if p == 1:
        print(p, " not perfect")
    else:
        total = 1
        sqrt_p = int(math.sqrt(p))

        for d in range(2, sqrt_p + 1):
            if p % d == 0:
                total += d
                if d != p // d:
                    total += p // d
                
        if total == p:
            print(p, " perfect")
        elif abs(total - p) <= 2:
            print(p, " almost perfect")
        else:
            print(p, " not perfect")




    


