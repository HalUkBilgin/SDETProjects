package PROJECTS.Proje_Selenium_Free;
/*
IHTIYAC DUYULABILECEK METHOD VE JAVASCRIPT ISLEMLERI
Asagidaki maddeler en sonda verilmistir
    - screenshot alan method,
    - elemente kadar scroll yapan kod parcasi,
    - verilen pixel miktarinca ekran kaydirmak icin kod parcasi ve
    - JavaScript ile bir elemente tiklama kod parcasi verilmistir


YAPILACAK ISLEMLER
---------------------------------------------------------------------
1.  https://www.seleniumeasy.com/test/basic-first-form-demo.html
    a.  Single Input Field
            inputbox'a isminizi giriniz
            "Show Message" butonuna tiklayiniz
    b.  Two Input Fields
            "Two Input Fields" yazisina kadar ekrani kaydiriniz
            "Enter a" ve "Enter b" inputbox larina sayi giriniz
            "Get Total" butonuna tiklayiniz
    c.  Two Input Fields
            "Enter a" ve "Enter b" alanlarini clear() ediniz
            "Enter a" input box'ina .sendKeys((int)(1000 + Math.random()*9000)); ile sayi yazin
            Actions ile "Enter a" input box'ina yazdiginiz random sayiyi kopyalayip "Enter b" alanina yazdirin
            "Enter a" ve "Enter b" inputbox larinin getAttribute ile value lerini alin
            Bu iki degeri Assert ile kontrol edin
            ekran kaydi aliniz

---------------------------------------------------------------------
2.  https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    a.  Single Checkbox Demo
        checkbox
        checkbox'a tiklayiniz
    b.  Multiple Checkbox Demo
        "Multiple Checkbox Demo" yazisina kadar scrol yapiniz
        tüm checkbox'lari check yapiniz
        tüm checkbox'lari uncheck yapiniz
        random bir adet checkbox check yapiniz
        ekran kaydi aliniz

---------------------------------------------------------------------
3.  https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
    a.  Radio Button Demo
        Male secip, "Get Checked Value" tiklayiniz
        Female secip, "Get Checked Value" tiklayiniz
    b.  Group Radio Buttons Demo
        "Group Radio Buttons Demo" yazisina kadar ekrani kaydiriniz
        Actions kullanarak
            Female, 5-15 secip "Get Values" e tiklatin, altta verinin gelisini bekleyin
            Male, 0-5 secip "Get Values" e tiklatin, altta verinin gelisini bekleyin
        ekrankaydi aliniz

---------------------------------------------------------------------
4.  https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
    a.  Select List Demo
        Value "Friday" secin
        GörünürText "Monday" secin
        options sayisini consola yazdirin
        random olarak bir index ile bir secim yapin
        random olarak bir value ile bir secim yapin
        random olarak bir GörünürText ile bir secim yapin

    b.  Multi Select List Demo
        options sayisini consola yazdirin
        random bir eleman secin (index, value veya text)
        bu secimi kaldirin
        ilk 3 elemani secin
        secimleri kaldirin
        tek sayidaki elemanlari secin (1,3,5,7)
        ekrankaydi aliniz

---------------------------------------------------------------------
5.  https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html
    Dual List Box Example
    - Soldaki ve sagdaki elemanlarin listesini bulun
    - Tüm elemanlari bulup consola yazdirin (ayni olanlar 1 kez yazilacak)
    - Fakli elemanlari bulup consola yazdirin
    - Ortak elemanlari bulup consola yazdirin
    - Sayfa üzerinde ayni olanlari sol listede, farkli olanlari sag listeye tasiyin.

---------------------------------------------------------------------
6.  https://www.seleniumeasy.com/test/table-data-download-demo.html
    Tabloya ait istatistikler, asagidakileri consola yazdiriniz
    - Satir ve sütun sayisi
    - Kac farkli ofis mevcuttur ve isimleri
    - Age ve Salari ortalamasi

---------------------------------------------------------------------
7.  MERAKLISINA PROJE
    1.  "https://www.snapdeal.com/" sitesine gidin
    2.  div[class="push-container"] cikarsa id="pushDenied" edin
        bazan cikan web elementleri icin belirli bekleme süresi olan ve
        beklenen sürede cikarsa islem yapan cikmaz ise devam eden bir method yaziniz
    3.  watch" arattirin
    4.  "Men's Watches" a tiklayin
    5.  div[class^='filter-price-slider']  ya da  div[data-name='Price']>div[class^='filter-price-slider']
        sliderin fiyat araligini
        sol handle      -> a[class*='price-slider-scroll left-handle'] ile  7000 civarina
        right handle    -> a[class*='price-slider-scroll right-handle'] ile 20000 civarina getirin
    6.  "Strap Material" dan "enabled" olanlardan random bir tanesini secin
    7.  "Strap Color" dan enabled olanlardan en cok sayida olan iki taneden birini secin
    8.  "Dial Color" dan enabled olanlardan en az sayida olan 3 taneden birini secin
    9.  kac ürün ciktiginin ekran görünrüsünü alin
    10. ürünün hemen üzerindeki div[class='filters']  den "Dial Color" filtresini silin
    11. cikan ürünlerden random birisini secin, ismini, fiyatini, ekran görüntüsünü alin ve tiklatin
    12. Acilan window da ayni ürünün bilgilerini alaran isim ve fiyat assert edin, ekran görüntüsü alin.
    13. Ürün resmi yanindaki kücük resimlerden ikincisinin secin
    14. büyük resmin üzerinde mause ile dolasin arada en az 3 ekran görüntüsü alin

----------------------------------------------------------------------------------------------
    // screenshot alan method
    static void getScreenshot(){
        String directoryPath = "screenShots/resimler/";
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdir();
        }

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss"));
        String filePath = directoryPath + Thread.currentThread().getName() + "_" + dt + ".png";
        try {
            FileUtils.copyFile(file, new File(filePath));
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    // element görünür hale gelinceye kadar scroll yapan code parcasi
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    // 100px asagi scroll yapan code parcasi, (window.scrollBy(xPixels, yPixels);)
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100);");

    // JavaScript ile elemente tiklama
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

 */
public class ProjeFree_01 {
}
