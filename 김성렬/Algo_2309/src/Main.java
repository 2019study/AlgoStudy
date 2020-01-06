import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dwarf = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++)
            dwarf.add(sc.nextInt());
        Collections.sort(dwarf);
        int sum = 0;
        for (int i = 0; i < 9; i++)
            sum += dwarf.get(i);
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if ((sum - (dwarf.get(i) + dwarf.get(j))) == 100) {
                    int temp = dwarf.get(i);
                    int temp2 = dwarf.get(j);
                    dwarf.remove((Object)temp);
                    dwarf.remove((Object)temp2);
                    for (int k = 0; k < 7; k++) {
                        System.out.println(dwarf.get(k));
                    }
                    return;
                }
            }
        }

    }
}