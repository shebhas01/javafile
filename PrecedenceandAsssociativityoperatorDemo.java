class PrecedenceandAsssociativityoperatorDemo{
public static void main(String[] args){
int i=10;
int j=20;
int k=30;
System.out.println(i+j/k);
System.out.println(i*j/k);
System.out.println((i*j-k)/(k/i));
System.out.println(((++i - j++/--k)==(++k*i))&&(k!=i));

}
}