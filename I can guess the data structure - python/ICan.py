import sys
from collections import deque
import heapq

input = sys.stdin.read().splitlines() 
currentLine = 0

while currentLine < len(input):
    cases = int(input[currentLine])
    currentLine += 1

    stack, queue, pq = [], deque(), []
    is_stack, is_queue, is_pq = True, True, True

    for _ in range(cases):
        operation = input[currentLine].split()
        currentLine += 1

        if operation[0] == '1':
            value = int(operation[1])
            stack.append(value)
            queue.append(value)
            heapq.heappush(pq, -value)

        elif operation[0] == '2':
            expected = int(operation[1])

            if is_stack:
                if not stack or stack.pop() != expected:
                    is_stack = False

            if is_queue:
                if not queue or queue.popleft() != expected:
                    is_queue = False

            if is_pq:
                if not pq or -heapq.heappop(pq) != expected:
                    is_pq = False

    possible = sum([is_stack, is_queue, is_pq])

    if possible > 1:
        print("not sure")
    elif is_stack:
        print("stack")
    elif is_queue:
        print("queue")
    elif is_pq:
        print("priority queue")
    else:
        print("impossible")


        