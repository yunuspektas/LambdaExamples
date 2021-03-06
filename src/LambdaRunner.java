import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaRunner {
    public static void main(String[] args) throws IOException {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, 5, 7, 3));

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
        characterIsBigger7(menu);
        System.out.println("\nDay3 Task7 :  ******");
        startsW(menu);
        System.out.println("\nDay3 Task8 :  ******");
        endWithX(menu);
        System.out.println("\nDay3 Task9 :  ******");
        bigElement(menu);
        System.out.println("\nDay3 Task10 :  ******");
        lastCharacterExamptFirst(menu);
        System.out.println("\nDay4 Task1 :  ******");
        System.out.println(fingBg74NotORT(unv));
        System.out.println("\nDay4 Task2 :  ******");
        System.out.println(ogrncSayiByk110(unv));
        System.out.println("\nDay4 Task3 :  ******");
        System.out.println(metametikVarM??(unv));
        System.out.println("\nDay4 Task4 :  ******");
        sortUnvByNumberOfStudent(unv);
        System.out.println("\nDay4 Task5 :  ******");
        sortByNotAverage(unv);
        System.out.println("\nDay4 Task6 :  ******");
        printSecondAtleastNumberOfStudent(unv);
        System.out.println("\nDay4 Task7 :  ******");
        getSumNumberOfStudentBigger63(unv);
        System.out.println("\nDay4 Task8 :  ******");
        findAverageOf333(unv);
        System.out.println("\nDay4 Task9 :  ******");
        System.out.println("printMath(unv) = " + printMath(unv));
        System.out.println("\nDay4 Task10:  ******");
        System.out.println("findAverageNote(unv) = " + findAverageNote(unv));
        System.out.println("\nDay4 Task11:  ******");
        findMinNot(unv);
        System.out.println("\nDay5 Task1 :  ******");
        System.out.println("structuredSumNumbers(5) = " + structuredSumNumbers(5));
        System.out.println("functionalSumNumbers(5) = " + functionalSumNumbers(5));
        System.out.println("\nDay5 Task2 :  ******");
        System.out.println("sumEvenNumbers(5) = " + sumEvenNumbers(5));
        System.out.println("\nDay5 Task3 :  ******");
        sumFirstPositive(3);
        System.out.println("\nDay5 Task4 :  ******");
        System.out.println("sumFirstOddNumbers(3) = " + sumFirstOddNumbers(3));
        System.out.println("\nDay5 Task5 :  ******");
        System.out.println("\nDay5 Task6 :  ******");
        System.out.println("\nDay5 Task7 :  ******");
        System.out.println("findFacto(4) = " + findFacto(4));
        System.out.println("\nDay6 Task1 :  ******");
        readTxt();
        System.out.println("\nDay6 Task2 :  ******");
        readUpperCaseTxt();
        System.out.println("\nDay6 Task3 :  ******");
        readFirstLine();
        System.out.println("\nDay6 Task4 :  ******");
        countBasari();
        System.out.println("\nDay6 Task5 :  ******");
        printDiffSentence();
        System.out.println("\nDay6 Task6 :  ******");
        System.out.println("\nDay6 Task7 :  ******");
        System.out.println("\nDay6 Task8 :  ******");
        System.out.println("\nDay6 Task9 :  ******");
        System.out.println("\nDay6 Task10:  ******");
        System.out.println("\nDay6 Task11:  ******");
        System.out.println("\nDay6 Task12:  ******");

    }

    public static void printIntWithLambda(int number) { // utility method
        System.out.print(number + " ");
    }

    public static boolean findEvenElements(int number) {
        return number % 2 == 0;
    }

    //   Day-1

    //Task : "Structured Programming" kullanarak list elemanlar??n?? ayn?? satirda aralar??nda bosluk olacak sekilde print ediniz.
    public static void elemanSameLinePrintWithBraceStructured(List<Integer> sayi) {
        for (int w : sayi) {
            System.out.print(w + " ");
        }
    }

    //Task : "functional Programming" kullanarak list elemanlar??n?? ayn?? satirda aralar??nda bosluk olacak sekilde print ediniz.
    public static void elemanSameLinePrintWithBraceFunctional(List<Integer> sayi) {
        sayi.
                forEach(t -> System.out.print(t + " "));
    }

    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printEven(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0).
                forEach(LambdaRunner::printIntWithLambda);
    }

    //Task :functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void kck34CiftPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> (t < 34) && (t % 2 == 0)).
                forEach(LambdaRunner::printIntWithLambda);
    }

    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void byk34OrEvenPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> (t > 34) || (t % 2 == 0)).
                forEach(LambdaRunner::printIntWithLambda);
    }

    //   Day-2

    //   List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk b??rakarak print ediniz
    public static void evenSquarePrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                map(t -> t * t).
                forEach(LambdaRunner::printIntWithLambda);
        //
    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void oddKupBirFazlaPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> (t % 2) == 1).
                map(t -> (t * t * t) + 1).
                forEach(LambdaRunner::printIntWithLambda);
    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void evenElementsSquarePrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                map(Math::sqrt).
                forEach(t -> System.out.println(t + " "));
    }

    // Task : list'in en buyuk elemanini yazdiriniz
    public static Optional<Integer> findMax(List<Integer> sayi) {
        return sayi.
                stream().
                reduce(Math::max);
    }

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static Optional<Integer> evenKareMax(List<Integer> sayi) {
        return sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                map(t -> t * t).
                reduce(Math::max);
    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    public static void sumPrint(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                reduce(0, Integer::sum));
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void evenMultplyPrint(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                filter(LambdaRunner::findEvenElements).
                reduce(1, (a, b) -> (a * b)));
    }

    // Task : List'teki elemanlardan en kucugunu 4 farkl?? yontem ile print ediniz.
    public static void findMin(List<Integer> sayi) {
        System.out.println(sayi.
                stream().
                reduce(Integer::min));
    }

    // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void byk5KckOdd(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> (t > 5) && (t % 2 == 1)).reduce(Integer::min));
    }

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void evenKareFromKckToByk(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().toList());
    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void oddKareBykKck(List<Integer> sayi) {
        System.out.println("son" + sayi.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t).sorted(Comparator.reverseOrder()).toList());
    }

    //  Day-3


    static List<String> menu = new ArrayList<>(Arrays.asList("k????leme", "adana", "trile??e", "havucDilim", "buryan",
            "yaglama", "kokare??", "arabA????", "g??ve??", "waffle", "welemen", "cacix"));


    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alphabeticUppercaseDistincPrint(List<String> menu) {
        menu.
                stream().
                map(String::toUpperCase).
                distinct().
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void characterNumberBykKckDistinct(List<String> menu) {
        menu.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(t -> System.out.print(t + " "));
    }

    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void characteNumberKckBykPrint(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(t -> System.out.print(t + " "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void lastCharacterReversedOrder(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.
                        comparing(t -> t.toString().
                                charAt(t.toString().length() - 1)).
                        reversed()).
                forEach(t -> System.out.println(t + " "));
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void characterIsBigger7(List<String> menu) {
        System.out.println(menu.
                stream().
                allMatch(t -> t.length() <= 7) ?
                "list elemanlar?? 7 ve daha az harften olusuyor" :
                "list elemanlar?? 7 harften  buyuk");
    }

    // Task : List elelmanlarinin "W" ile baslamas??n?? kontrol ediniz.
    public static void startsW(List<String> menu) {
        menu.stream().allMatch(t -> t.startsWith("w"));
    }

    // Task : List elelmanlarinin "x" ile biten en az bir eleman?? kontrol ediniz.
    public static void endWithX(List<String> menu) {
        menu.stream().anyMatch(t -> t.endsWith("x"));
    }

    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void bigElement(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.
                        comparing(t -> t.toString().length()).
                        reversed()).
                limit(1).
                forEach(t -> System.out.println(t));
    }

    // Task : list elemanlarini son harfine g??re siralay??p ilk eleman hari?? kalan elemanlari print ediniz.
    public static void lastCharacterExamptFirst(List<String> menu) {
        menu.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                skip(1).
                forEach(t -> System.out.print(t + " "));
    }

    //  Day-4


    /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method i??inde 5 farkl?? obj'den List create ediniz.
     */
    static Universite u01 = new Universite("bogazici", "matematik", 571, 93);
    static Universite u02 = new Universite("istanbul teknik", "matematik", 622, 81);
    static Universite u03 = new Universite("istanbul", "hukuk", 1453, 71);
    static Universite u04 = new Universite("marmara", "bilgisayar muh", 1071, 77);
    static Universite u05 = new Universite("y??ld??z teknik", "gemi", 333, 74);
    static List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean fingBg74NotORT(List<Universite> unv) {
        return unv.stream().allMatch(t -> t.getNotOrt() > 74);
    }

    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean ogrncSayiByk110(List<Universite> unv) {
        return unv.stream().allMatch(t -> t.getOgrcSayisi() > 110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean metametikVarM??(List<Universite> unv) {
        return unv.stream().anyMatch(t -> t.getBolum().toLowerCase() == "matematik");

    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static void sortUnvByNumberOfStudent(List<Universite> unv) {
        unv.stream().
                sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                forEach(t -> System.out.print(t.getUniversite() + " "));
    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void sortByNotAverage(List<Universite> unv) {
        unv.stream().
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
                limit(3).
                forEach(t -> System.out.print(t.getUniversite() + " "));

    }

    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static void printSecondAtleastNumberOfStudent(List<Universite> unv) {
        unv.stream().
                sorted(Comparator.comparing(Universite::getOgrcSayisi)).
                skip(1).limit(1).
                forEach(t -> System.out.println(t.getUniversite()));

    }

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static void getSumNumberOfStudentBigger63(List<Universite> unv) {
        System.out.println(unv.stream().
                filter(t -> t.getOgrcSayisi() > 63).
                map(t -> t.getOgrcSayisi()).
                reduce(0, (t, u) -> t + u));
    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static void findAverageOf333(List<Universite> unv) {
        System.out.println(unv.stream().
                filter(t -> t.getOgrcSayisi() > 333).
                mapToDouble(t -> t.getNotOrt()).
                average());
    }

    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static long printMath(List<Universite> unv) {
        return unv.stream().
                filter(t -> t.getBolum().contains("mat")).
                count();
    }

    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static Optional<Integer> findAverageNote(List<Universite> unv) {
        return unv.stream().
                filter(t -> t.getOgrcSayisi() > 571).
                map(t -> t.getNotOrt()).
                reduce(Math::max);

    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static void findMinNot(List<Universite> unv) {
        System.out.println(unv.stream().
                filter(t -> t.getOgrcSayisi() < 1071).
                map(t -> t.getNotOrt()).
                reduce(Math::min));
    }

    //Day-5

    //TASK 01 --> Structured Programming ve Functional Programming ile
    // 1'den x'e kadar tamsayilari toplayan bir program create ediniz.
    public static int structuredSumNumbers(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }

    public static OptionalInt functionalSumNumbers(int x) {
        return IntStream.range(1, x + 1).reduce(Math::addExact);
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int sumEvenNumbers(int x) {
        return IntStream.range(1, x + 1).filter(t -> t % 2 == 0).sum();
    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static void sumFirstPositive(int x) {
        System.out.println(IntStream.range(2, (2 * x + 1)).filter(LambdaRunner::findEvenElements).sum());
        // 2.yol :
        IntStream.iterate(2, t -> t + 2).
                limit(x).
                sum();
    }

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int sumFirstOddNumbers(int x) {
        return IntStream.iterate(1, t -> t + 2).
                limit(x).
                sum();
    }

    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int findFacto(int x) {
        return IntStream.range(2, x + 1).reduce(1, (t, u) -> t * u);
    }

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static void findKuvvet(int istenenSayi, int x) {

    }


    //Day-6
    static Path haluk = Path.of("GithubProjects/LambdaExamples/src/haluk.txt");
    static Stream<String> akis;

    static {
        try {
            akis = Files.lines(haluk);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a print ediniz.)
    public static void readTxt() throws IOException {

        Files.lines(haluk).forEach(System.out::println);
    }

    //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
    public static void readUpperCaseTxt() throws IOException {

        Files.lines(haluk).map(String::toUpperCase).forEach(System.out::println);
    }

    //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
    public static void readFirstLine() {
        akis.map(String::toLowerCase).limit(1).forEach(System.out::println);
    }
    //TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
    public static void countBasari() throws IOException {
        System.out.println(Files.lines(haluk).map(String::toLowerCase).filter(t -> t.contains("basari")).count());
    }
    //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
    public static void printDiffSentence() throws IOException {
        System.out.println(Files.lines(haluk).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList()));
    }

/*
   Stream.flatMap, ad??yla tahmin edilebilece??i gibi, bir map ve flat i??leminin birle??imidir. Bu, ilk ??nce elemanlar??n??za bir
   fonksiyon uygulad??????n??z ve daha sonra d??zle??tirdi??iniz anlam??na gelir.
   Stream.map yaln??zca ak?????? d??zle??tirmeden bir i??levi uygular.
   Bir ak??????n d??zle??tirme'in neyi i??erdi??ini anlamak i??in, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yap?? d??????n??n.
   Bunun d??zle??tirilmesi, "bir seviye" yap??s??nda d??n????t??r??lmesi anlam??na gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap y??ntemi, bir ak??????n her bir de??erini ba??ka bir ak????la de??i??tirmenizi sa??lar
   ve ard??ndan olu??turulan t??m ak????lar?? tek bir ak????a birle??tirir.
 */


    //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
    //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bag??ms??z print ediniz.
    //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
    //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
    //TASK 10 --> haluk.txt dosyasinda kac /farkl?? harf kullanildigini print ediniz.
    //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
    //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz
}

