/*
Add honor code statement here ...
*/

public class Node {
        private double amt;
        private Node next;
        protected Node(){} // default constructor
        protected Node(double amt) {
            this.amt = amt;
            this.next = null;
        }
        protected double getAmount(){
            return this.amt;
        }
        protected Node getNext(){
            return this.next;
        }
        protected void setAmount(double amt){
            this.amt = amt;
        }
        protected void setNext(Node next){
            this.next = next;
        }

}