class Node:
    def __init__(self, data):
        self.data= data
        self.next= None

class Linkedlist():
    def __init__(self):
        self.head= None

    def print_list(self):
        temp= self.head
        while(temp):
            print(temp.data)
            temp=temp.next

    def addnode(self,new_data):
        new_node= Node(new_data)
        new_node.next= self.head
        self.head=new_node



    def deletenode(self,n):
        #if there is no head value return none
        if self.head==None:
            return None
        #fast and slow pointers
        slow=self.head
        fast=self.head
        #counter set to 1
        count=1

        while count <= n:
            #node equals next node then increase counter by 1
            fast = fast.next
            count += 1

        if fast is None:
            self.head.value = self.head.next.value
            self.head.next = self.head.next.next
            return
        #changes the nodes to next node
        while fast.next is not None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next




def main():
    list1= Linkedlist()
    list1.head=Node(50)
    second=Node(11)
    third=Node(33)
    fourth=Node(21)
    Fifth=Node(40)
    sixth=Node(71)

    list1.head.next=second
    second.next=third
    third.next=fourth
    fourth.next=Fifth
    Fifth.next=sixth

    list1.print_list()
    print("original")
    list1.deletenode(3)
    list1.print_list()

if __name__ == '__main__':
    main()