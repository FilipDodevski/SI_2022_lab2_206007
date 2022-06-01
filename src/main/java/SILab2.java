import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {
        if (list.size() <= 0) {  //1
            throw new IllegalArgumentException("List length should be greater than 0");  //2
        }
        int n = list.size();  //3
        int rootOfN = (int) Math.sqrt(n);  //3

        if (rootOfN * rootOfN != n) {  //4
            throw new IllegalArgumentException("List length should be a perfect square");  //5
        }
        List<String> numMines = new ArrayList<>();  //6

        for (int i = 0; i < n; i++) {  //7
            if (!list.get(i).equals("#")) {  //8
                int num = 0;  //9
                if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) {  //10
                    if ((i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#"))) {  //11
                        num += 2;  //12
                    } else {
                        num += 1;  //13
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")) {  //14
                    num++;    //15
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")) {  //16
                    num++;  //17
                }
                numMines.add(String.valueOf(num));  //18
            } else {
                numMines.add(list.get(i));  //19
            }
        }
        return numMines;  //20
    }  //21
}

