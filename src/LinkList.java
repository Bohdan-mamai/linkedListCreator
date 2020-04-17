public class LinkList {
    Node first;

    public LinkList() {
        first = null;
    }

    public Node generateList (int[] values) {
        Node tail = null;
        for (int index = values.length - 1; index >= 0; index--) {
            tail = new Node(values[index],tail);
        }
        this.first = tail;
        return tail;
    }

    public Node generateStringList (String [] values) {
        Node tail = null;
        for (int index = values.length - 1; index >= 0; index--) {
            tail = new Node(values[index],tail);
        }
        this.first = tail;
        return tail;
    }

    public int length() {
        int length = 0;
        Node current = first;
    while(current != null){
        length ++; current = current.next;
    }
    return length;
    }



    public Integer getByIndex (int index) {
        int counter = 0;
        Node nodeByIndex = null;
        Node current = first;
        while (current != null) {
            if (counter == index) {
                nodeByIndex = current;
                break;
            } else {
                counter++;
                current = current.next;
            }
        }
        return nodeByIndex.value;
    }

    public String getStringByIndex (int index) {
        int counter = 0;
        Node nodeByIndex = null;
        Node current = first;
        while (current != null) {
            if (counter == index) {
                nodeByIndex = current;
                break;
            } else {
                counter++;
                current = current.next;
            }
        }
        return nodeByIndex.stringValue;
    }


    public void removeByIndex (int index) {
        int counter = 0;
        Node current = first;
        Node previous = null;
        if (index == 0) {
            first = current.next;
        } else {
            while (current != null) {
                if (counter == index) {
                    previous.next = current.next;
                    break;
                } else {
                    counter++;
                    previous = current;
                    current = current.next;
                }
            }
        }
    }

    public void insertFirst (int newValue) {
        Node newFirstValue = new Node(newValue);
        newFirstValue.next = first;
        first = newFirstValue;
    }

    public void insertFirstString (String newValue) {
        Node newFirstValue = new Node(newValue);
        newFirstValue.next = first;
        first = newFirstValue;
    }

    public void insertLast (int newValue) {
        Node current = first;
        if (current == null) {
            Node newLastValue = new Node(newValue);
            newLastValue.next = first;
            first = newLastValue;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            Node newLastValue = new Node(newValue);
            current.next = newLastValue;
            newLastValue.next = null;
        }
    }

    public void insertLastString (String newValue) {
        Node current = first;
        if (current == null) {
            Node newLastValue = new Node(newValue);
            newLastValue.next = first;
            first = newLastValue;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            Node newLastValue = new Node(newValue);
            current.next = newLastValue;
            newLastValue.next = null;
        }
    }

    public Integer findLast () {
        Node current = first;
        Node last;
        if (current == null) {
            System.out.println("The list is empty");
        }
        if (current.next == null) {
            last = current;
        } else  {
            while (current.next != null) {
                current = current.next;
            }
            last = current;
        }
        return last.value;
    }

    public String findLastString () {
        Node current = first;
        Node last;
        if (current == null) {
            System.out.println("The list is empty");
        }
        if (current.next == null) {
            last = current;
        } else  {
            while (current.next != null) {
                current = current.next;
            }
            last = current;
        }
        return last.stringValue;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void displayStringList() {
        Node current = first;
        while (current != null) {
            current.displayStringNode();
            current = current.next;
        }
        System.out.println(" ");
    }

}
