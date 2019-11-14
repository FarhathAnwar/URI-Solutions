line = input().split(' ')
attackers = int(line[0])
defenders = int(line[1])
#print(attackers,defenders)

while (attackers!=0 and defenders!=0):
    dis_attack = []
    dis_defense = []
    
    a_line = input().split(' ')
    d_line = input().split(' ')
    
    for x in range(len(a_line)):
        dis_attack.append( int(a_line[x]) )
    
    for x in range(len(d_line)):
        dis_defense.append( int(d_line[x]) )
    
    dis_attack.sort()
    last_attacker = dis_attack[0]
    #print('last_attacker=',last_attacker)
    
    dis_defense.sort()
    if len(dis_defense)>0: 
        last_defender = dis_defense[0]
        #print('last defender=',last_defender)
        if len(dis_defense)>1:
            second_last_defender = dis_defense[1]
            #print('second last defender=',second_last_defender)
            offside = True
            if last_attacker>=second_last_defender:
                #print('inside main if')
                offside = False
            elif last_attacker == last_defender and last_attacker==second_last_defender:
                offside=False
            
            if(offside):
                print('Y')
            else:
                print('N')
        else:
            offside=True
            if last_attacker == last_defender:
                offside=False
            
            if(offside):
                print('Y')
            else:
                print('N')
    
    line = input().split(' ')
    attackers = int(line[0])
    defenders = int(line[1])
    
    
