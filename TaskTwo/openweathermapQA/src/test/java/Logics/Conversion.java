package Logics;

import java.util.ArrayList;


public class Conversion {

    ArrayList<Integer> arrayListC;
    ArrayList<Integer> arrayListF;

    public Conversion() {
        arrayListC = new ArrayList<>();
        arrayListF = new ArrayList<>();
    }

    public void conversionCF(String c) {

        String celsius = "°C";
        String Farenheit = "°F";
        String DivisionSign = "/";
        String y;

        if (c.contains(celsius)) {
            if (c.contains(DivisionSign)) {
                y = c.substring(0, c.indexOf(" "));
                c = c.substring(c.lastIndexOf(' ') + 1);
                int z = Integer.valueOf(y);
                arrayListC.add(z);
            }
            c = c.replaceAll(celsius, "");
            int j = Integer.valueOf(c);
            arrayListC.add(j);

        } else if (c.contains(Farenheit)) {
            if (c.contains(DivisionSign)) {
                y = c.substring(0, c.indexOf(" "));
                c = c.substring(c.lastIndexOf(' ') + 1);
                int z = Integer.valueOf(y);
                arrayListF.add(z);
            }
            c = c.replaceAll(Farenheit, "");
            int j = Integer.valueOf(c);
            arrayListF.add(j);
        }
    }

    public boolean СorrectСonversion() {

        int resultcorrect = 0;
        if (arrayListC.size() != arrayListF.size()){
            ClearList();
            return false;
        }
        if (arrayListC.size() == 0) {
            return false;
        }
        if (arrayListF.size() == 0) {
            return false;
        }
        for (int i = 0; i < arrayListC.size(); i++) {
            int value1 = arrayListC.get(i);
            int value2 = arrayListF.get(i);
            if (value2 == Math.round((value1 * 1.8) + 32)) {
                resultcorrect++;
                //System.out.println("C=" + value1 + " = F=" + value2);
                if (resultcorrect == arrayListC.size()) {
                    ClearList();
                    return true;
                }
            }
            //else {
            //    System.out.println("C=" + value1 + " != F=" + value2 + " неккоректная конвертация");
           // }
        }
        ClearList();
        return false;
    }

    public void ClearList() {
        arrayListC.clear();
        arrayListF.clear();
    }
}

