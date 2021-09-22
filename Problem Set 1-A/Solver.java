class Solver{
    public static void main(String[] args){
        quadratic(1,5,6);
        slope(0,0,2,3);
        midpoint(0,0,2,3);
        series(1,5,1);
        geom(3,3,2);
    }
    
    static void quadratic(double a,double b,double c){
        double quad=((b*-1)+Math.pow(Math.pow(b,2)-(4*a*c),0.5))/(2*a);
        double quad2=((b*-1)-Math.pow(Math.pow(b,2)-(4*a*c),0.5))/(2*a);
        System.out.println("The solutions for "+(int)a+"x^2 + "+(int)b+"x + "+(int)c+" are "+quad2+" and "+quad+".");
    }
    static void slope(double x1,double y1,double x2,double y2){
        double slp=(y2-y1)/(x2-x1);
        System.out.println("A line connecting the points ("+(int)x1+","+(int)y1+") and ("+(int)x2+","+(int)y2+") has a slope of "+slp);
    }
    static void midpoint(double x1,double y1,double x2,double y2){
        double midx=(x2+x1)/2;
        double midy=(y2+y1)/2;
        System.out.println("The midpoint between ("+(int)x1+","+(int)y1+") and ("+(int)x2+","+(int)y2+") is ("+midx+","+midy+")");
    }
    static void series(double a1, double n, double d){
        double sum=(n/2)*(n+1);
        System.out.println("The sum of the first "+(int)n+" terms of an arithmetic series that starts with "+a1+" and increases by "+d+" is "+sum);
    }
    static void geom(double a1,double n,double r){
        double sum=n*(1-Math.pow(r,n)/1-r);
        System.out.println("The sum of the first "+(int)n+" terms of a finite geometric series that starts with "+a1+" and increases by a rate of "+r+" is "+sum);
    }
}