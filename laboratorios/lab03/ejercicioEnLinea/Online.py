#!/usr/bin/python

def start_end(str):
    """
    This function reorders the string, correcting the errors caused by
    the expressions '[' and ']' that symbolize the
    "start" and "end" keys on a conventional keyboard.

    Args:
        str (str): any text to reorder
    returns:
        nstr (str): The text reordered
    """
    start = True
    index = 0
    lstr  = []
    nstr  = ""
    for char in str:
        if char == '[':
            start = True
            index = 0
            continue
        elif char == ']':
            start = False
            continue
        elif char != '[' and char != ']':
            if start:
                lstr.insert(index , char)
                index += 1
            else:
                lstr.append(char)
    for letter in lstr:
        nstr += letter
    return nstr
