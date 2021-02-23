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

        int max=StringUtil.maxLength(string);
        //String[] aux= new String[string.length];

        for (int i= max; i>0; i--){
            HashMap<Integer, ArrayList<String>> listas = getIntegerArrayListHashMap();
            addToList(string,listas,i);

            string=listsToArray(listas);
        }
        array=StringUtil.toIntArray(string);


    }

    private static String[] listsToArray( HashMap<Integer, ArrayList<String>> listas){
        ArrayList<String> aux=new ArrayList<>();
        for (int i=0; i<10; i++){
            if (!listas.get(i).isEmpty()){
                for (int j=0 ; j<listas.get(i).size(); j++){
                    aux.add(listas.get(i).get(j));

                }
            }
        }
        return aux.toArray(new String[0]);
    }


    private static HashMap<Integer, ArrayList<String>> getIntegerArrayListHashMap() {
        HashMap<Integer, ArrayList<String>> listas= new HashMap();
        for (int i=0; i<10; i++){
            listas.put(i, new ArrayList<>());
        }
        return listas;
    }

    static void addToList(String[] array,HashMap<Integer, ArrayList<String>> listas,int  index){
        for (int i=0; i<array.length; i++){
            int pos= Integer.parseInt(String.valueOf(array[i].charAt(index-1)));
            listas.get(pos).add(array[i]);
        }
    }

}
