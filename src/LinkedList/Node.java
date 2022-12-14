package LinkedList;

public class Node <E>{
        private Node <E> next;
        private Node <E> prev;
        private E data;

        // constructor

        public Node() {}

    //Getters and setters
        public Node (E data) {
            this.data = data;
        }

        public Node <E> getNext() {
            return next;
        }

        public void setNext(Node <E> next) {
            this.next = next;
        }

        public Node <E> getPrev() {
            return prev;
        }

        public void setPrev(Node <E> prev) {
            this.prev = prev;
        }

        public Object getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

