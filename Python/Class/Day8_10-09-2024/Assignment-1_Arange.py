import numpy as np

arryrnge = np.arange(0, 20)
print(f"arange Array:\n{arryrnge}")

arry1D = np.array([1,2,3,4,5])
print(f"1-D Array:\n{arry1D}")
reshaped = np.reshape(arryrnge, (4, 5))
print(f"Reshaped Array:\n{reshaped}")

randIntArry = np.random.randint(1,10,(3, 3))
print(f"Random Matrix:\n{randIntArry}")

tranposeArry = np.transpose(randIntArry)
print(f"Transpose Matrix:\n{tranposeArry}")


