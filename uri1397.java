i = int(input())
while i != 0:
	line = input().split(' ')
	marry=0
	john=0
	for c in range(i):
		if line[c] == '0':
			marry += 1
		else:
			john += 1
	print('Mary won',marry,'times and John won',john,'times')
	i=int(input())

