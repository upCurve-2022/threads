public class waiter implements Runnable {
    public synchronized void run() {
        for (String[] s : Main.name) {
            String name = s[0];
            String item = s[1];
            System.out.println(name + " your order is ready! Enjoy your " + item);
            System.out.println("___Order "+Main.orderId()+" delivered___");
            try {
                Thread.sleep(520);
            }
            catch (Exception e) {
            }

        }
    }
}
