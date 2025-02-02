def print_triangle(n):
    
    for i in range(n):
        print("*"*(i+1))    
print_triangle(5)

n=5
for i in range(n):
        print("*"*(i+1))

n=4
for i in range(n):
    print(i*" ", n*"*")

n=4
for i in range(n):
   print(n*"*")
a=20
b=10
diff=a-b
k = (diff >> 31)&1
print(k)

print((10>>31)&1)