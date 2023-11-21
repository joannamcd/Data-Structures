#MAPS IN PYTHON

#map() returns a map object of the results 
# after applying the given fn to each item of a given iterable (list, tuple, etc.)
# map(function, iterable)

#creating a map
d = {'key1': 'value1', 'key2': 'value2', 'key3' : 'value3'}

#adding a new key-value pair
d['key4'] = 'value4'

#retrieving the value associated with a key
print(d['key2']) 

#updating the value associated with a key
d['key2'] = 'new_value2'

#removing a key-value pair
del d['key3']

#iterating over the key-value pairs in the map
for key, value in d.items():
    print(key,value)