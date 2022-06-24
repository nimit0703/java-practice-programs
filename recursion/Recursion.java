class Recursion{
    static void sum(int i,int n,int sum){
        if(i==10){
            sum +=n;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        sum(i+1,n,sum);
      
    }
    
    static int fact(int i){
        if(i==1||i==0){
            return 1;
        }
        int pre=fact(i-1);
        int fact_i=i*pre;
        return fact_i;

    }

    static void febo(int first,int second,int c){
        if(c==0){
            return;
        }
        int third = first +second;
        System.out.print(" "+third);
        febo(second,third,c-1);
    }
    static int pov(int x, int n){
        if(n==0){
            return 1;
            
        }
        if(x==0){
            return 0;
        }
        int pre=pov(x,n-1);
        int ans=x*pre;
        return ans;
    }


    public static void main(String[] args) {
        // print sum of first n intigers using recursion
        sum(1,10,0);

        // print factorial of number
        System.out.println(fact(5));

        // print febolacii series
        System.out.print(0+" "+1);
        febo(0,1,5);

        System.out.println(" ");
        // print 2**5
        // pov(2,3);
        System.out.println(pov(2,5));
        
        
        
    }
}