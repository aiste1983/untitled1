import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        String name = " Aiste";
        System.out.println(name);
        String surname;
        surname = "Rimkuviene";
        System.out.println(surname);


        String birthyear = " 1983";
        System.out.println(birthyear);

        String year = "2023";
        System.out.println(year);


        System.out.println("Metai" + (2023 - 1983));

        System.out.println(" Aš " + " esu " + " Aistė " + " Rimkuvienė ");

        System.out.println(" Man " + " yra " + (2023 - 1983) + " metų ");
/*
Naudokite funkcija Math.random().
Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random()
jiems priskirkite atsitiktines reikšmes nuo 0 iki 4.
Didesnę reikšmę padalinkite iš mažesnės.
Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

 */

        int num21 = 0;
        int num22 = 4;

        num21 = (int) Math.round(Math.random() * 4);
        num22 = (int) Math.round(Math.random() * 4);

        System.out.println(" num21 yra" + num21 + " num22 yra " + num22);

        if (num22 > num21) {
            System.out.println("num22 yra daugiau nei num21");
            System.out.println((double) num22 / num21);
        } else {
            System.out.println("num22 NERA daugiau nei num21");
            System.out.println((double) (num22 / num21));
        }
        System.out.println("Dalyba is nulio negalima");

/*
Naudokite funkcija Math.random().Sukurkite tris kintamuosius ir naudodamiesi
funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25.
Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.


 */


        int num31 = (int) Math.round(Math.random() * 25); //2
        int num32 = (int) Math.round(Math.random() * 25); //9
        int num33 = (int) Math.round(Math.random() * 25); //14

        System.out.println(" num31 yra" + num31 + " num32 yra" + num32 + " num33 yra" + num33);
        //     2 >  9   IR      9 < 14
        if (num31 > num32 && num31 < num33) {
            System.out.println(" num31 yra vidurinis " + num31);
        }
        if (num31 <= num32 && num31 >= num33) {
            System.out.println(" num31 yra vidurinis " + num31);
        }

        if (num32 < num33 && num32 > num31) {
            System.out.println(" num32 yra vidurinis " + num32);
        }
        if (num32 >= num33 && num32 <= num31) {
            System.out.println(" num32 yra vidurinis " + num32);
        }

        if (num33 < num32 && num33 > num31) {
            System.out.println(" num33 yra vidurinis " + num33);
        }
        if (num33 >= num32 && num33 <= num31) {
            System.out.println(" num33 yra vidurinis " + num33);
        }

        System.out.println("vidurinis yra " + num31);




/*
Įvedami skaičiai -a, b, c –kraštinių ilgiai,
trys kintamieji (naudojame int) (naudokite "Math.random()"
funkcija nuo 1 iki 10). Parašykite Java programą, kuri nustatytų,
ar galima sudaryti trikampį ir atsakymą atspausdintų.

 */


        //int min4= 1;
        //int max4= 10;

        //int result= min + (int) Math.round(Math.random() * (max-min));

        int num41 = 1 + (int) Math.round(Math.random() * (10 - 1));
        int num42 = 1 + (int) Math.round(Math.random() * (10 - 1));
        int num43 = 1 + (int) Math.round(Math.random() * (10 - 1));


        System.out.println("num41" + num41 + " num42" + num42 + " num43" + num43);

        if (num41 + num42 > num43 && num42 + num43 > num41 && num41 + num43 > num42) {

            System.out.println("trikampis gaunasi");

        }




/*
Sukurkite keturis kintamuosius ir ​Math.random()​ funkcija sugeneruokite jiems
reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).

 */


        int num51 = (int) Math.round(Math.random() * 2);
        int num52 = (int) Math.round(Math.random() * 2);
        int num53 = (int) Math.round(Math.random() * 2);
        int num54 = (int) Math.round(Math.random() * 2);


        //System.out.println(".................");

        //int zero=0;
        //System.out.Printl(zero);
        // zeros= zeros+1;
        // zeros= zeros+1;
        //zeros= zeros+1;


        if (num51 == 0) {
            System.out.println("nulis" + 1);
        }
        if (num51 == 1) {
            System.out.println("vienetas" + 1);
        }
        if (num51 == 2) {

            System.out.println("dvejetai" + 1);
        }
        if (num52 == 0) {
            System.out.println("nulis" + 1);
        }
        if (num52 == 1) {
            System.out.println("vienetas" + 1);
        }
        if (num52 == 2) {

            System.out.println("dvejetai" + 1);
        }
        if (num53 == 0) {
            System.out.println("nulis" + 1);
        }
        if (num53 == 1) {
            System.out.println("vienetas" + 1);
        }
        if (num53 == 2) {

            System.out.println("dvejetai" + 1);
        }
        if (num54 == 0) {
            System.out.println("nulis" + 1);
        }
        if (num54 == 1) {
            System.out.println("vienetas" + 1);
        }
        if (num54 == 2) {

            System.out.println("dvejetai" + 1);
        }

/*
 Naudokite funkcija Math.random().
 Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
 Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (),
 didesni už 0 {}.

 */

  int max6=10;
  int min6=-10;

    int num61= min6+(int)Math.round(Math.random()*(max6-min6));
    int num62= min6+(int)Math.round(Math.random()*(max6-min6));
    int num63= min6+(int)Math.round(Math.random()*(max6-min6));

    if (num61 < 0){
        System.out.println("["+ num61 + "]");
    }
    if (num61 == 0){
        System.out.println("("+ num61 + ")");
    }
    if (num61>0){
        System.out.println("{"+num61+"}");
    }

    if (num62 < 0){
        System.out.println("["+ num61 + "]");
    }
    if (num62 == 0){
        System.out.println("("+ num61 + ")");
    }
    if (num62>0){
        System.out.println("{"+num61+"}");
    }
    if (num63 < 0){
        System.out.println("["+ num61 + "]");
    }
    if (num63 == 0){
        System.out.println("("+ num61 + ")");
    }
    if (num63 > 0){
        System.out.println("{"+num61+"}");
    }



    /*
    Įmonė parduoda žvakes po 1 EUR.
    Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida, daugiau kaip 2000 vienetų- 4 % nuolaida.
    Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama.
    Žvakių kiekį generuokite ​Math.random()​ funkcija nuo 5 iki 3000.

     */
//int min7;
//nt max7;

//min7=5;
//max7=3000;

//int result= min7+(int)Math.round(Math.random()*(max7-min7));

//iki x <999 "be nuolaidos"
        // x <1000 "3 proc."
        //x <2000 "4 proc"


        git config --global user.name "aiste1983"
        git config --global user.email "aiste.rimkuviene@gmail.com"


















    }

    }