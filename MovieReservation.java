package Bank;

class MovieReservation implements Runnable {
  int ticket=2;
  int t;

  MovieReservation(int t) {
    this.t=t;
  }

  public void run() {
    String name=Thread.currentThread().getName();

    synchronized(this){
      if(t<=ticket)
      {
        System.out.println(name+"Ticket booked");
        ticket=ticket-1;
      }
      else
      {
        System.out.println(name+"ticket not booked");
      }
      try{
        Thread.sleep(1500);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
}

class Synchronization {
  public static void main(String[] args) {
    MovieReservation m=new MovieReservation(1);
    Thread t1=new Thread(m);
    t1.setName("ravi");
    Thread t2=new Thread(m);

    t2.setName("kalyan");
    Thread t3=new Thread(m);
    t3.setName("nina");
    t1.start();
    t2.start();
    t3.start();
  }
}