import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Pasirasau kokie bus kintamieji
        int skaiciusPirmas, skaiciusAntras;

        // a priskiriam kad veiktu while loop ir matytu kad jame kaskas yra, gali pakeisti kokia nori raide
        char aritmetiniaiOperatoriai = 'a';


        System.out.println("Iveskite du sveikuosius skaicius su kuriasi norite atlikti aritmetinka");

        //Uztenka susikurti viena scanner ir priskirti kintamiesiams skaiciusPirmas,SkaiciusAntras ir aritmetiniaiOperatoriai ivedimams
        Scanner S = new Scanner(System.in);
        skaiciusPirmas = S.nextInt();
        skaiciusAntras = S.nextInt();

        // opreratoriai (||) reiskias (ar) ir ziuri  aritmetiniaiOperatoriai nelygus * (ar) nelygus / (ar) nelygus + (ar) nelygus -
        // opreratoriai (&&) reiskias (ir) tai kad while nustotu loopinti turi buti false visi ar keli palyginimai
        // aritmetiniaiOperatoriai nelygus '*' (ir) aritmetiniaiOperatoriai nelygus '/' (ir) aritmetiniaiOperatoriai != '+' && aritmetiniaiOperatoriai != '-'
        // toki pat while gali padaryti kad butu ivesti tik sveikieji skaiciai ir nemestu error
        while (aritmetiniaiOperatoriai != '*' && aritmetiniaiOperatoriai != '/' && aritmetiniaiOperatoriai != '+' && aritmetiniaiOperatoriai != '-') {

            // Ivedimas turi buti vidui while loop kad nepakeistu priskirtos a raides pries atliekant while loop
            System.out.println("Iveskite operacijos zenkla (*, /, +, -, )");
            aritmetiniaiOperatoriai = S.next().charAt(0);

            //Tikrina taipat kaip while loop (&& ir),(|| ar)
            if (aritmetiniaiOperatoriai == '*' || aritmetiniaiOperatoriai == '/' || aritmetiniaiOperatoriai == '+' || aritmetiniaiOperatoriai == '-') {
                //Jei ivede teisinga operatoriu galima ziureti char ir pagal ji isvesti atsakyma naudojant switch panasus i if else

                //Isidedi i switch kintamaji aritmetiniaiOperatoriai kuris dabar lygus pasirinktam operatoriui
                switch (aritmetiniaiOperatoriai){
                    // Jei case atitiks aritmetiniaiOperatoriai operatoriu ta eilute ir printins
                    case '/':
                        System.out.println(skaiciusPirmas + " / " + skaiciusAntras + " = " + ((double)skaiciusPirmas / skaiciusAntras));
                        // brake reikalingas kad iseitu is cade bloko ir toliau nebeziuretu, veikia ir be jo,nenaudoja labiau kai gali buti keli isvedimai
                        break;
                    case '*':
                        // Likusius case pabaigsi pati ;)
                        break;
                    case '-':


                    case '+':

                }
            }
        }
    }
}