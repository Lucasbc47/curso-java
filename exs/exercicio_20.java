<<<<<<< HEAD
public class exercicio_20 {
   public static void main(String[] args){

       String primeira_str = "xxxy";
       String segunda_str = "1212";

       String[] primeira_arr = primeira_str.split("");
       String[] segunda_arr = segunda_str.split("");

       boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r;

       a = primeira_arr[0].equals(primeira_arr[1]);
       b = primeira_arr[0].equals(primeira_arr[2]);

       c = primeira_arr[0].equals(primeira_arr[3]);
       d = primeira_arr[1].equals(primeira_arr[2]);

       e = primeira_arr[1].equals(primeira_arr[3]);
       f = primeira_arr[2].equals(primeira_arr[3]);

       g = segunda_arr[0].equals(segunda_arr[1]);
       h = segunda_arr[0].equals(segunda_arr[2]);

       i = segunda_arr[0].equals(segunda_arr[3]);
       j = segunda_arr[1].equals(segunda_arr[2]);

       k = segunda_arr[1].equals(segunda_arr[3]);
       l = segunda_arr[2].equals(segunda_arr[3]);

       m = a == g;
       n = b == h;
       o = c == i;
       p = d == j;
       q = e == k;
       r = f == l;

       if (m && n && o && p && q && r){
           System.out.println("verdadeiro");
       }
       else {
           System.out.println("falso");
       }

   }
}
