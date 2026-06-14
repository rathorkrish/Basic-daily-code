class DestructorDemo {

    protected void finalize() {
        System.out.println("Object is destroyed");
    }

    public static void main(String[] args) {

        DestructorDemo obj = new DestructorDemo();

        obj = null; // Object reference removed

        System.gc(); // Request Garbage Collector
    }
}