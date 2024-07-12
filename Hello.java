public class Hello {
        void assign(int...list)
        {
            for(int i:list)
            {
                System.out.println(i);
            }
        }
        public static void main(String[] args) {
            Hello h=new Hello();
            h.assign(5,10);
            h.assign(15,20,34,56);
    
    
        }
    }
