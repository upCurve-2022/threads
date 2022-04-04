public class chef implements Runnable {
    public synchronized void run() {

        for (String[] s : Main.name) {
            if (s.length == 0) {
                try {
                    wait();
                } catch (Exception e) {
                }
            } else {
                String name = s[0];
                System.out.println(name + "'s order is cooked");
                try{
                    Thread.sleep(500);
                }catch(Exception e){}
            }
            notifyAll();
        }
    }
}
