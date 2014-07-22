Linked List


Question1: Insert in a Singly Linked List (SLL)

	1. Insert First:
		Insert at the start of the list

	2. Insert Last:
		Insert at the end of the list 

	3. Insert After:
		Insert after a key

	4. Insert Before
		insert before a key. Use previous pointer here. Boundary condition: insert before first node.

	Node.java, LinkedList.java and LinkedListMain.java

Question2: Delete a node in Singly Linked List (SLL)

	 Use previous pointer to keep track of the previous node. For deleting without previous pointer, I can compare the data with current.next so that I am pointing to the previous element of the element to be deleted. Boundary condition is deleting the first node.

	Node.java, LinkedList.java and LinkedListMain.java

Question3: Find m to the last element in a SLL
	 Use slow and fast pointer method. Check for boundary condition that # of elements greater than m.

Question4: Flattening a linked list.
	 The SLL is flattened by pointing the child of a node at the end of the list and changing the tail pointer correspondingly. 
	In FlattenList folder.
