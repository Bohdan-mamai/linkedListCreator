public class Node {
    public Integer value;
    public String stringValue;
    public Node next;

    public Node (Integer value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node (String stringValue, Node next) {
        this.stringValue = stringValue;
        this.next = next;
    }

    public Node (Integer value) {
        this.value = value;
    }
    public Node (String stringValue) {
        this.stringValue = stringValue;
    }

    public void displayNode() { System.out.print(" {" + value + "} ");
    }
    public void displayStringNode() {
        System.out.print(" {" + stringValue + "} ");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Node element = (Node) obj;
        return value == element.value  || (value != null &&value.equals(element.value));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
