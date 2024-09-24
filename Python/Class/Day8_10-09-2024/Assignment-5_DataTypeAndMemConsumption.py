import numpy as np

arryDataInt = np.array([1,2,3,4])
arryDataFloat = np.array([1.1,2.1,3.3,4.2])
arryDataBoolean = np.array([True, False, False,True])

print(arryDataInt.itemsize)
print(arryDataInt.nbytes)

print(arryDataFloat.itemsize)
print(arryDataFloat.nbytes)

print(arryDataBoolean.itemsize)
print(arryDataBoolean.nbytes)