import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class RadixSort {
    public static void main(String[] args) {

        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }

    }
    public static  void radixSort(int []array){


        String[] string=StringUtil.toStringArray(array);

        StringUtil.lNormalize(string,'0');

        HashMap<Integer, ArrayList<String>> listas=new HashMap<>();
        int max=StringUtil.maxLength(string);
        instancesArrayListHashMap(listas);
        //String[] aux= new String[string.length];
/*
        for (int i= max; i>0; i--){
            //HashMap<Integer, ArrayList<String>> listas = getIntegerArrayListHashMap();
            addToList(string,listas,i);

            string=listsToArray(listas);
        }
        array=StringUtil.toIntArray(string);
*/
        for (int i=0; i<string[0].length(); i++){//recorre la longitud de la cadena
            for (String let:  string){
                char [] elem=let.toCharArray();
                int pos=Integer.parseInt(String.valueOf(elem[elem.length-1]));
                listas.get(pos).add(let);
            }
            int cont=0;

            for (int k=0 ; k<listas.keySet().size(); k++){
                for (String let: listas.get(k)){
                    string[cont]=let;
                    cont++;
                }
                listas.get(k).clear();
            }
        }
     for (int i=0; i<string.length; i++){
         array[i]=Integer.parseInt(string[i]);
     }


    }



    private static void instancesArrayListHashMap(HashMap<Integer, ArrayList<String>> listas) {
       // HashMap<Integer, ArrayList<String>> listas= new HashMap();
        for (int i=0; i<10; i++){
            listas.put(i, new ArrayList<>());
        }

    }



}
