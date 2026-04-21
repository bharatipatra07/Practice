public class ProducerConsumer{
    public static void main(String[] args) {
       SharedResource resource=new SharedResource();
       Thread t1=new Thread(()->{
        try{
             for(int i=1;i<=200;i++){
            resource.increment();
        }
        }catch(Exception e){}
       
       }) ;
       Thread t2=new Thread(()->{
        try {
          for(int i=1;i<=200;i++){
            resource.increment();
        }  
        } catch (Exception e) {}
       });
       t1.start();
       t2.start(); 
       try{
         t1.join();
         t2.join();
       }catch(Exception e){

       }
       System.out.println(resource.get());
    }
}