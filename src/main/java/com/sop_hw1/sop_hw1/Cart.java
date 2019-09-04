package com.sop_hw1.sop_hw1;

public class Cart {
        private String id;
        private double total;

        public Cart(String id, String title, double price) {
            super();
        }

        public Cart(String id) {
            super();
            this.id = id;
        }

        public Cart(String id, double total) {
            super();
            id = id;
            this.total = total;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            id = id;
        }


        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        @Override
        public String toString() {
            return "Cart [id=" + id + ", total=" + total + "]";
        }

}
