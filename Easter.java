// Ernest Dedregosa Delserieys
// this program can calculate the date easeer falls on a given year 
public class Easter{
    public static void main(String[] args) {      
    }
double year = 2026;
double a;
double b; 
double c;
double d;
double e;
double f;
double h;
double i;
double k;
double r;
double m;
double month;
double p;
double day;
    double a = year mod 19;
    double b = year / 100;
    double c = year mod 100; 
    double d = b / 4;
    double e = b mod 4;
    double f = (b + 8) / 25;
    double g = (b - f +  1) / 3;
    double h = (19 * a + b - d - g + 15) mod 30;
    double i = c / 4;
    double k = c mod 4;
    double r = ( 32 + 2 * e + 2 * i - h - k) mod 7;
    double m = (a + 11 * h + 22 * r) / 451;
    double month = ( h + r - 7 * m + 114) / 31
    double p = ( h + r - 7 * m + 114) mod 31
    double day = p + 1
    System.out.println("

}