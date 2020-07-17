# LinkedList

A Linkedkist is a data structure that represents a sequence of nodes. In a singly linked list, each node points to next node. A doubly linked list has pointer to both previous and next node.

Unlike array, the Linkedist does not have constant access time. But the benefit is that add and remove operations is constant time.

### Creating and deleting a node from a linked list

```
class LinkedList{

    Node head;
    class Node{
        Node next = null;
        int val;

        public Node(int val){
            this.val = val;
        }

        LinkedList appendToTail(LinkedList list,int data){
            Node newNode = new Node(val);
            newNode.next = null;
            if(list.head==null){
                head = newNode;
            }else{
                Node n = list.head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = newNode;
            }
            return list;
        }

        LinkedList deleteNode(LinkedList list, int data){
            Node n = list.head;
            if(n.val==data){
                return head.next;
            }

            while(n.next != null){
                if(n.next.data == d){
                    n.next = n.next.next;
                    return head;
                }
                n = n.next;
            }
            return head;
        }
        

    }
}

```
### Runner Technique

The runner technique is used to iterate the linkedlist with two pointers, one faster than the other.

fast -> node.next.next;

slow -> slow.next;