class IncrementoperatorDemo{
public static void main(String[] args){
int p=10;
int q=20;
int r=p++;


System.out.println((r++)+(++q)*(--p));
System.out.println((p++)+(--q)/(--r));

}
}