package utils;

public class Math {
  public static long factorial (long num) {
    if(num == 0) return 1;
    return num * factorial(--num);
  }
  public static long factorialLoop (long num){
    long fact = 1;
    for(int i = num; i > 0; i--) {
      fact *= i;
    }
    if(num == 0) return 1;
    return fact;
  }
}