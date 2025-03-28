
numbers = map(int, input().split())
order_input = input()

sorted_numbers = sorted(numbers)

first = sorted_numbers["ABC".index(order_input[0])]
second = sorted_numbers["ABC".index(order_input[1])]
third = sorted_numbers["ABC".index(order_input[2])]

print(first, second, third)