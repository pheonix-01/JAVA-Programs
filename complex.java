class Complex
{
    static String compAdd(String c1,String c2)
    {
        Integer real1=Integer.parseInt(c1.substring(0,c1.indexOf('+')));
        Integer imag1=Integer.parseInt(c1.substring(c1.indexOf('+'),c1.indexOf('i')));
        Integer real2=Integer.parseInt(c2.substring(0,c2.indexOf('+')));
        Integer imag2=Integer.parseInt(c2.substring(c2.indexOf('+'),c1.indexOf('i')));
        
        return (real1+real2) + " + " + (imag1+imag2) + "i";
    }
    static String compSub(String c1, String c2)
    {
        Integer real1=Integer.parseInt(c1.substring(0,c1.indexOf('+')));
        Integer imag1=Integer.parseInt(c1.substring(c1.indexOf('+'),c1.indexOf('i')));
        Integer real2=Integer.parseInt(c2.substring(0,c2.indexOf('+')));
        Integer imag2=Integer.parseInt(c2.substring(c2.indexOf('+'),c1.indexOf('i')));
        
        return (real1-real2) + " + " + (imag1-imag2) + "i";
    }
    static String compMul(String c1, String c2)
    {
        Integer real1=Integer.parseInt(c1.substring(0,c1.indexOf('+')));
        Integer imag1=Integer.parseInt(c1.substring(c1.indexOf('+'),c1.indexOf('i')));
        Integer real2=Integer.parseInt(c2.substring(0,c2.indexOf('+')));
        Integer imag2=Integer.parseInt(c2.substring(c2.indexOf('+'),c1.indexOf('i')));
        
        return ((real1*real2)-(imag1*imag2)) + "+" + ((real1*imag2)-(imag1*real2)) + "i" ;
    }
    static String compDiv(String c1, String c2)
    {
        Integer real1=Integer.parseInt(c1.substring(0,c1.indexOf('+')));
        Integer imag1=Integer.parseInt(c1.substring(c1.indexOf('+'),c1.indexOf('i')));
        Integer real2=Integer.parseInt(c2.substring(0,c2.indexOf('+')));
        Integer imag2=Integer.parseInt(c2.substring(c2.indexOf('+'),c1.indexOf('i')));
        
        try
        {
            return (((real1+real2)+(imag1+imag2))/((imag1*imag1)+(imag2*imag2))) + "+" + (((imag1*real2)-(real1*imag2))/((imag1*imag1)+(imag2*imag2))) + "i" ;
        }
        catch(Exception e)
        {
            return "Number not allowed";
        }
    }
    public static void main(String args[])
    {
        System.out.println("Addition:" + compAdd("5+2i", "4+6i"));
        System.out.println("Subtraction:" + compSub("5+2i", "4+6i"));
        System.out.println("Multiplication:" + compMul("5+2i", "4+6i"));
        System.out.println("Division:" + compDiv("13+4i", "10+6i"));
    }
}
