//without parameter without return
class Methods{
   public void add()
   {
       System.out.println(10+20);
   }
   static public void main(String[] args)
   {
       Methods m=new Methods();
       m.add();
   }
} 
//without parameter with return
class Methods {
    public int sub() {
        return 10 - 20;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int result = m.sub(); 
        System.out.println(result); 
    }
}

//with parameter with return
class Methods {
    public int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int result = m.mul(10, 20);  
        System.out.println(result);  
    }
}
//with parameter without return
class Methods {
    public void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.div(200, 20);  // Output: 30
    }
}

