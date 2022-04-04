public class counter implements Runnable {
    public synchronized void run() {
        try {
            //taking the order
            Main.setName();
            for (String[] s : Main.name) {
                if (s.length == 0) {
                    wait();
                } else {
                    String name = s[0];
                    String item = s[1];
                    System.out.println(name + " ordered for " + item);
                }
            }
        }catch (Exception e) {}
        notify();
    }
}
