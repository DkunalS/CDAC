import numpy as np


def describeArray(arry):
    print(f"\nNumber of dimension: {arry.ndim}")
    print(f"Shape of Array: {arry.shape}")
    print(f"Size of Array: {arry.size}")
    print(f"Size of Array: {arry.dtype}")


arry1D = np.array([1,2,3])
arry2D = np.array([[1,2,3],[2,5,6]])
arry3D = np.array([[[1,2,3],[4,5,6]],[[2,5,8],[9,5,1]]])


describeArray(arry1D)
describeArray(arry2D)
describeArray(arry3D)
