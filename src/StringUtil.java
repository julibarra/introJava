
public class StringUtil
{
    public static void main(String[] args) {

        String cad=replicate('0',4);
        System.out.println(cad);
        System.out.println(lpad("5",3,'0'));
        System.out.println(lpad("55",3,'0'));
        System.out.println(lpad("555",3,'0'));
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        String[] aux= new String[arr.length];
        aux= toStringArray(arr);
        lNormalize(aux,'0');
        for(int i=0; i<aux.length;i++){
            System.out.println(aux[i]);
        }


    }
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String ret="";
    for (int i=0; i<n; i++){
        ret+=String.valueOf(c);
    }
        return ret;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
       if(s.length()<n){
           String zeros="";
           String aux="";
           zeros= replicate(c,n-s.length());
           aux=zeros+s;
           return aux;
       }
       return s;

    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int array[])
    {
        String [] ret= new String[array.length];
        for (int i=0; i<array.length; i++){
            ret[i]=String.valueOf(array[i]);
        }
        return ret;

    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String array[])
    {
        int [] ret= new int[array.length];
        for (int i=0; i<array.length; i++){
            ret[i]=Integer.parseInt(array[i]);
        }
        return ret;

    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String array[])
    {
        int max=array[0].length();
        for (int i=0; i<array.length; i++){
            if (max < array[i].length()) {
                max=array[i].length();
            }
        }
        return max;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String array[], char c)
    {
        // agrega cerros a los elementos del array
        int maxLen=maxLength(array);
        String aux="";
        for (int i=0; i<array.length; i++){
            if (array[i].length()<maxLen){
                array[i]=lpad(array[i],maxLen,c);

            }
        }
    }
}
