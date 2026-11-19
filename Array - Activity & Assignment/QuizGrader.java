public class QuizGrader{ // QuizGrader ang pangalan ng class kaya 'eto rin ang ilalagay sa public class.
    public static void main (String[] args){ // Dito inilalagay ang mga argument, paggawa ng mga code, o pagsisimula ng program.

        char[] answerKey = {'A','C','B','D','A','C','C','B','A','D'};
        // Char ang gagamitin dahil isang letra lamang ang kailangan, answerKey ang pangalan ng variable para sa mga tamang sagot.

        char[] studentsAnswers = {'A','B','B','D','C','C','C','B','A','A'};
        // studentsAnswers naman para sa mga sagot ng mga estudnyante.

        int correctCount = 0;
        // integer ang ginamit dahil ang input ay numero. 0 ang inilagay dahil hindi pa nasisimulan ng program.

        for(int i = 0; i < answerKey.length; i++){
            /* ginamit ang for loops para kapag nakakuha ng tamang sagot ay mada-dagdagan ito, hanngang sa maubos ang elements sa
            loob ng arrays. */

            if (Character.toUpperCase(studentsAnswers[i]) == answerKey[i]){ correctCount++;
            /* Sa linyang ito ay gagamit tayo ng conditions na if-else. "if" ang gagamitin kung tama o "true" ang isang condition,
             toUpperCase naman ay mapalitan ang mga maliit na titik na sagot sa malalaking titik. Sa correcrCount naman ay gagamit
              tayo ng increment para kapag tama ang sagot ay madadagdagan ito, kapag mali naman ay hindi madadagdagan. */

            }else {
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered: " + studentsAnswers[i] +
                        ", the correct answer is: " + answerKey[i] + "'");
                // Ang linyang ito ay para naman makita ang mga mali sa studentsAnswers, at ipapakita nito ang tamang sagot.

            }} // Dito nagtatapos ang loops at conditions.

        double scorePercentage = ((double)correctCount/10) * 100;
            /* Dito ay kukunin na 'tin ang percentage at original score. Dahil may decimal, gagamit tayo ng double. Dahil
            integer ang correctCount, maglalagay tayo ulit ng "(double)" loob para ma-convert ito sa decimal. Para naman
            makuha ang percentage ay multiply na 'tin ito sa 100. */

        System.out.println("The correct answers are: " + correctCount + "/10");
        // Dito ipapakita ng console ang correct answers mo na iyong original score.

        System.out.println("Score: " + scorePercentage + "%"); // Dito naman ipapakita ang iyong grado na nakuha mo.

        if (scorePercentage >= 70.0){ // Gagamit tayo ng "if" para malaman kung nakapasa ka ba o hindi.
            System.out.println("PASS"); // Kapag nasuri ng console na na-meet mo ang condition, ibig sabihin ay nakapasa ka.
        }else System.out.println("FAIL"); // Kapag naman hindi, ay hindi ka nakapasa.

    } // Pag-sasara ng buong main kung nasaan ang program
} // Pag-sasara ng buong QuizGrader class.
