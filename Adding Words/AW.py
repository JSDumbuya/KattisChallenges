import sys

name_int = {}
int_name = {}

for line in sys.stdin:
    commands = line.split(" ")

    if commands[0] == "def":
        name, value = commands[1], int(commands[2])
        #Remove outdated mapping in int_name, to ensure one value maps to only one key e.g. avoid 3 foo, 5 foo
        if name in name_int:
            old_value = name_int[name]
            del int_name[old_value]
        name_int[name] = value
        int_name[value] = name

    elif commands[0] == "calc":
        expression = commands[1:-1]
        result = 0
        valid = True
        operator = 1

        for token in expression:
            if token == "+":
                operator = 1
            elif token == "-":
                operator = -1
            elif token in name_int:
                result += operator * name_int[token]
            else:
                valid = False
                break

        if valid and result in int_name:
            result_var = int_name[result]
        else:
            result_var = "unknown"
        expression_str = " ".join(expression)
        print (f"{expression_str} = {result_var}")

    else:
        name_int.clear()
        int_name.clear()


