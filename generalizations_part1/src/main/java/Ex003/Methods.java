package Ex003;

import java.util.List;

public class Methods {
    public static <U> U getElementFromUCollection(List<U> col, int index){
        return col.get(index);
    }

    public static <T1, T2> T2 put(T1 arg1, T2 arg2){
        return arg2;
    }
}
