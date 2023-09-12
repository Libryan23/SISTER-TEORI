

class PrintNameThread2 implements Runnable {
    Thread thread;

    PrintNameThread2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}

class TestThread {
    public static void main(String args[]) {
        new PrintNameThread2("A");
        new PrintNameThread2("B");
        new PrintNameThread2("C");
        new PrintNameThread2("D");
    }
}