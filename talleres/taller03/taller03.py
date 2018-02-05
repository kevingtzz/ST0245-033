#!/usr/bin/python

def hanoi(topN, a = "Tower1", b = "Tower2", c = "Tower3"):
    if (topN == 1):
        print "move " + a + " to " + c
    else:
        hanoi(topN - 1, a, c, b)
        print "move " + a + " to " + c
        hanoi(topN - 1, b, a, c)

def subset(s, base = ""):
    if len(s) == 0:
        print base
    else:
        subset(s[1:], base + s[0])
        subset(s[1:], base)

def permutations(base, str):
    if len(str) == 0:
        print base
    else:
        i = 0
        while i < len(str):
            permutations(base + str[i], str[0:i] + str[i+1:])
            i = i + 1
