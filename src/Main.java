public class Main {
    public static void main(String[] args) {
//        /*1*/ int x=3;
//        /*2*/ int y;
//        /*3*/ System.out.println(x++); // =3 (4 w pamięci)
//        /*4*/ System.out.println(++x); // =5
//        /*5*/ System.out.println(x); // =5
//        /*6*/ y = x++; // y = 5 (6 w pamięci)
//        /*7*/ System.out.println (y); // = 5
//        /*8*/ y = ++x; // = 7
//        /*9*/ System.out.println (y); // = 7
//        /*10*/ System.out.println (++y); // = 8

        int[] tablicaCyfr = new int[5];
        tablicaCyfr = new int[]{1,2,3,4,5}; // 0,1,2,3,4
        System.out.println(tablicaCyfr[2]);

        String [] tablicaPieskow = new String[4];
        tablicaPieskow = new String[] {"Azor", "Boss", "King", "Kudłaty"};
        System.out.println(tablicaPieskow[2]);

        for (int i = 0; i < tablicaPieskow.length ; i++) {
            System.out.println(tablicaPieskow[i]);
        }


    }
}