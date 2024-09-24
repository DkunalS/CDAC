
fruits = {1,2,3,4,5,7}
vegetable = {2,3,7,8,9}
grains = {3,7,8,10,11,12}

fr_veg = fruits & vegetable
veg_gra = vegetable & grains
fr_gra = fruits & grains
fr_veg_gra = vegetable & fruits & grains
uni = (fruits.union(vegetable)).union(grains)

print(fr_veg)
print(veg_gra)
print(fr_gra)
print(fr_veg_gra)
print(uni)

print(((uni).symmetric_difference(fr_veg)).symmetric_difference(veg_gra).symmetric_difference(fr_gra))

