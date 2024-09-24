import numpy as np

arry1D = np.array([1,2,3,])
print(f"1-D Array:\n{arry1D}")

arry2D = np.array([[1,2,3],[2,5,6]])
print(f"2-D Array:\n{arry2D}")

arry3D = np.array([[[1,2,3],[4,5,6]],[[2,5,8],[9,5,1]]])
print(f"3-D Array:\n{arry3D}")

arryyZero = np.zeros([3, 3])       # craeting th zro array
print(f"Zero Array:\n{arryyZero}")

arryonce = np.ones([3, 3])       # craeting th zro array
print(f"Once Array:\n{arryonce}")

# 3x2 matrices filled with 7
arryFull = np.full((3, 2), 7)
print(f"full Array:\n{arryFull}")

# differce of 2
arryrnge = np.arange(0, 5, 2)
print(f"arange Array:\n{arryrnge}")


linspace_arry = np.linspace(0,1,11)
print(f"linespace Array:\n{linspace_arry}")

#3x3 matrix with random
randArry = np.random.rand(3, 3)
print(f"Random Array:\n{randArry}")

randIntArry = np.random.randint(2,3 )
print(f"Random Array:\n{randIntArry}")

arryIdentity = np.eye(3)
print(f"Identity Array:\n{arryIdentity}")

#diagonal element
arryDiag = np.diag([1,2,3,4])
print(f"Diagonal Array:\n{arryDiag}")

reshapeArry = np.reshape(arry1D, (3,1))
print(f"Reshping Array:\n{reshapeArry}")

emptyArry1D = np.empty(5)
print(f"Empty Array:\n{emptyArry1D}")

emptyArry2D = np.empty((2,2))
print(f"Empty Array:\n{emptyArry2D}")

emptyArry3D = np.empty((2,3,2))
print(f"Empty Array:\n{emptyArry3D}")

#arange
#linspsce- linearly spaced
# random.rand
# random.randint
# np.eye - identity matrix
# np.diag - diagonal matrix
# np.reshape - reshaping the array
# np.empty(2,3) - conatin

# np.savetxt