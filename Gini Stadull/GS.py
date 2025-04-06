
import sys


input = sys.stdin.readline
numPeople = int(input())
incomes = [int(input()) for _ in range(numPeople)]

incomes.sort()
totalIncome = sum(incomes)
weightedSum = sum((i + 1) * income for i, income in enumerate(incomes))
 
giniCo = (2 * weightedSum) / (numPeople * totalIncome) - (numPeople + 1) / numPeople

print (giniCo)