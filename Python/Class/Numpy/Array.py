import math
import sklearn.metrics as skm
import numpy as np

array = np.array([[1,2,3],[4,5,6],[7,8,9],[4,9,6]])
# print(type(array))
print(np.shape(array))
print(np.reshape(array,(3,4)))
print(np.shape(array))
print(np.eye(3))    # eye is for identity matrix
print(np.trace(array))   #trace for sum of diagonal element
# print(np.arange())

# print(np.array([1, 1]))

actual = [0,1,2,0,3]
predicted = [0.2,0.3,4.5,0.5,1.1]
mse = skm.mean_squared_error(actual,predicted)
rmse = math.sqrt(mse)
print(f"Diffence is {rmse}")