import java.util.*;

public class LambdaRunner {
    public static void main(String[] args) {
        //List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11,5, 7, 3));

        System.out.println("\nDay1 Task1 :  ******");
        elemanSameLinePrintWithBraceStructured(sayi);
        System.out.println("\nDay1 Task2 :  ******");
        elemanSameLinePrintWithBraceFunctional(sayi);
        System.out.println("\nDay1 Task3 :  ******");
        printEven(sayi);
        System.out.println("\nDay1 Task4 :  ******");
        kck34CiftPrint(sayi);
        System.out.println("\nDay1 Task5 :  ******");
        byk34OrEvenPrint(sayi);
        System.out.println("\nDay2 Task1 :  ******");
        evenSquarePrint(sayi);
        System.out.println("\nDay2 Task2 :  ******");
        oddKupBirFazlaPrint(sayi);
        System.out.println("\nDay2 Task3 :  ******");
        evenElementsSquarePrint(sayi);
        System.out.println("\nDay2 Task4 :  ******");
        System.out.println(findMax(sayi));
        System.out.println("\nDay2 Task5 :  ******");
        evenKareMax(sayi);
        System.out.println("\nDay2 Task6 :  ******");
        sumPrint(sayi);
        System.out.println("\nDay2 Task7 :  ******");
        evenMultplyPrint(sayi);
        System.out.println("\nDay2 Task8 :  ******");
        findMin(sayi);
        System.out.println("\nDay2 Task9 :  ******");
        byk5KckOdd(sayi);
        System.out.println("\nDay2 Task10 :  ******");
        evenKareFromKckToByk(sayi);
        System.out.println("\nDay2 Task11 :  ******");
        oddKareBykKck(sayi);
        System.out.println("\nDay3 Task1 :  ******");
        alphabeticUppercaseDistincPrint(menu);
        System.out.println("\nDay3 Task2 :  ******");
        characterNumberBykKckDistinct(menu);
        System.out.println("\nDay3 Task3 :  ******");
        characteNumberKckBykPrint(menu);
        System.out.println("\nDay3 Task4 :  ******");
        lastCharacterReversedOrder(menu);
        System.out.println("\nDay3 Task5 :  ******");
        System.out.println("\nDay3 Task6 :  ******");
        System.out.println("\nDay3 Task7 :  ******");
        System.out.println("\nDay3 Task8 :  ******");


    }

    public static void printIntWithLambda(int number) { // utility method
        System.out.print(number + " ");
    }

    public static boolean findEvenElements(int number) {
        return number%2==0 ;
    }

    //Day-1

    //Task : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void elemanSameLinePrintWithBraceStructured(List<Integer> sayi) {
        for (int w : sayi) {
            System.out.print(w + " ");
        }
    }

    //Task : "functional Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void elemanSameLinePrintWithBraceFunctional(List<Integer> sayi) {
        sayi.
                stream().
                forEach(t -> System.out.print(t + " "));
    }
    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printEven (List<Integer> sayi){
        sayi.
                stream().
                filter(t->t%2==0).
                forEach(LambdaRunner::printIntWithLambda);
    }
    //Task :functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void kck34CiftPrint(List<Integer> sayi){
        sayi.
                stream().
                filter(t->(t<34) && (t%2==0) ).
                forEach(LambdaRunner::printIntWithLambda);
    }
    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void byk34OrEvenPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(t-> (t>34) || (t%2==0)).
                forEach(LambdaRunner::printIntWithLambda);
    }

    //Day-2

    //   List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void evenSquarePrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                map(t->t*t).
                forEach(LambdaRunner::printIntWithLambda);
        //
    }
    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void oddKupBirFazlaPrint(List<Integer> sayi){
        sayi.
                stream().
                filter(t->(t%2)==1).
                map(t->(t*t*t)+1).
                forEach(LambdaRunner::printIntWithLambda);
    }
    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void evenElementsSquarePrint(List<Integer> sayi){
        sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                map(Math::sqrt).
                forEach(t-> System.out.println(t + " "));
    }
    // Task : list'in en buyuk elemanini yazdiriniz
    public static Optional<Integer> findMax(List<Integer> sayi){
        return sayi.
                stream().
                reduce(Math::max);
    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static Optional<Integer> evenKareMax(List<Integer> sayi){
       return sayi.
               stream().
               filter(LambdaRunner::findEvenElements).
               map(t->t*t).
               reduce(Math::max);
    }
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    public static void sumPrint(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                reduce(0, Integer::sum));
    }
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void evenMultplyPrint(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                reduce(1, (a, b) -> (a * b)));
    }
    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    public static void findMin(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                reduce(Integer::min));
    }
    // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void byk5KckOdd(List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> (t > 5) && (t % 2 == 1)).reduce(Integer::min));
    }
    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void evenKareFromKckToByk(List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().toList());
    }
    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void oddKareBykKck(List<Integer> sayi){
        System.out.println("son" + sayi.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t).sorted(Comparator.reverseOrder()).toList());
    }

    //Day-3


    static List<String> menu = new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havucDilim", "buryan",
          "yaglama", "kokareç", "arabAşı", "güveç", "waffle", "welemen", "cacix"));


    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alphabeticUppercaseDistincPrint(List<String> menu) {
        menu.
                stream().
                map(String::toUpperCase).
                distinct().
                sorted().
                forEach(t-> System.out.print(t + " ")) ;
    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void characterNumberBykKckDistinct(List<String> menu){
        menu.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(t-> System.out.print(t + " "));
    }
    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void characteNumberKckBykPrint(List<String> menu){
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(t-> System.out.print(t + " "));
    }
    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void lastCharacterReversedOrder(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.
                        comparing(t->t.toString().
                                charAt(t.toString().length()-1)).
                                reversed()).
                forEach(t-> System.out.println(t + " "));
    }
    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

    //Day-4


    /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.



        Universite u01 = new Universite("bogazici", "matematik", 571, 93);
        Universite u02 = new Universite("istanbul teknik", "matematik", 622, 81);
        Universite u03 = new Universite("istanbul", "hukuk", 1453, 71);
        Universite u04 = new Universite("marmara", "bilgisayar muh", 1071, 77);
        Universite u05 = new Universite("yıldız teknik", "gemi", 333, 74);
        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

     */

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

    //Day-5

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.


}

