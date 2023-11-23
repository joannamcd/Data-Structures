
def printParents(node, adj, parent):
    #curr node is root, so no parent
    if(parent == 0):
        print(node, "->Root")
    else:
        print(node, "->", parent)
    
    #using Depth first search
    for item in adj[node]:
        if(item != parent):
            printParents(item, adj, node)
            
def printChildren(Root, adj):
    #Queue for the Breadth first search
    q = []
    
    q.append(Root)
    
    visited = [0]*len(adj)
    
    #BFS
    while(len(q)>0):
        node = q[0]
        q.pop(0)
        visited[node] = 1
        print(node, "->", end=" ")
        for item in adj[node]:
            if(visited[item]==0):
                print(item, " ", end=" ")
                q.append(item)
        print("\n")
        
def printLeafNodes(Root, adj):
    #leaf nodes have only one edge and are not the root
    for i in range(0, len(adj)):
        if(len(adj[i]) == 1 and i != Root):
            print(i, end=" ")
    print("\n")
    
def printDegrees(Root, adj):
    for i in range(1, len(adj)):
        print(i, ": ", end=" ")
        #root has no parents, so degree = to the edges it is connected to
        if(i==Root):
            print(len(adj[i]))
        else:
            print(len(adj[i])-1)
                
                
N = 7
Root = 1
adj = []
for i in range(0, N+1):
    adj.append([])

# Creating the tree
adj[1].append(2)
adj[2].append(1)

adj[1].append(3)
adj[3].append(1)

adj[1].append(4)
adj[4].append(1)

adj[2].append(5)
adj[5].append(2)

adj[2].append(6)
adj[6].append(2)

adj[4].append(7)
adj[7].append(4)

# Printing the parents of each node
print("The parents of each node are:")
printParents(Root, adj, 0)

# Printing the children of each node
print("The children of each node are:")
printChildren(Root, adj)

# Printing the leaf nodes in the tree
print("The leaf nodes of the tree are:")
printLeafNodes(Root, adj)

# Printing the degrees of each node
print("The degrees of each node are:")
printDegrees(Root, adj)