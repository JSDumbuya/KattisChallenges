
line = input()

def new_alphabet(character):
    lowercase_char = character.lower()
    translation_map = {
        'a': '@', 'b': '8', 'c': '(', 'd': '|)', 'e': '3', 'f': '#', 'g': '6',
        'h': '[-]', 'i': '|', 'j': '_|', 'k': '|<', 'l': '1', 'm': r'[]\/[]', 
        'n': r'[]\[]', 'o': '0', 'p': '|D', 'q': '(,)', 'r': '|Z', 's': '$', 
        't': "']['", 'u': '|_|', 'v': r'\/', 'w': r'\/\/', 'x': "}{", 'y': '`/', 
        'z': '2'
    }
    translated = translation_map.get(lowercase_char, character)
    return translated

translated_line = ''.join(new_alphabet(char) for char in line)

print(translated_line)

