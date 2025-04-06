import sys

input = sys.stdin.readline

numPackageTypes, numStores = map(int, input().split())

numTypePerStore = list(map(int, input().split()))

latestVersions = {}

for _ in range(numPackageTypes):
    packageName, version = input().split()
    latestVersions[packageName] = int(version)

for store in range(numStores):
    sumOfUpdates = 0

    for _ in range(numTypePerStore[store]):
        packageName, version = input().split()
        version = int(version)
        if latestVersions[packageName] > version:
            latest = latestVersions[packageName]
            update = latest - version
            sumOfUpdates += update
        
    print(sumOfUpdates)
