class SY2022bit008
{
    public static void main(String args[]) 
    {
        int a = 32, b = 4,c,d,e,f,g;
        c=addn(a, b);
        System.out.println(a + "+" + b + "=" + c);
        d=subt(a, b);
        System.out.println(a + "-" + b + "=" + d);
        e=mul(a, b);
        System.out.println(a + "*" + b + "=" + e);
        f=divn(a, b);
        System.out.println(a + "/" + b + "=" + f);
        g=rem(a, b);
        System.out.println(a + "%" + b + "=" + g);
        
    }
    static int addn(int a, int b) 
    {
        return a + b;
    }

    static int subt(int a, int b) 
    {
        return a - b;
    }

    static int mul(int a, int b) 
    {
        return a * b;
    }

    static int divn(int a, int b) 
    {
        return a / b;
    }

    static int rem(int a, int b) 
    {
        return a % b;
    }
}

