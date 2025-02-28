import re
import sys


for line in sys.stdin:
    input = line.strip().split(',')
    sum = 0
    for num in input:
        temp = re.sub(r'\s+', '', num)
        if '.' in temp:
            sum += float(temp)
        else: 
            sum += int(temp)

    print(sum);

    
