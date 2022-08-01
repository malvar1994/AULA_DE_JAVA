import java.util.Scanner;

public class Juros{

   public static void main(String args[]){
   
   Scanner value = new Scanner (System.in);
   double JA, FE, MR, AB, MA, JU, JL, AG, ST, OT, NV, DZ, num, val;
   int enter;
   
   System.out.printf("Insira o Valor de investimento: \n");
   num = value.nextDouble();
   
   val = 25.0/100.0;
   JA = num + (val * num);
   FE = JA + (val * JA);
   MR = FE + (val * FE);
   AB = MR + (val * MR);
   MA = AB + (val * AB);
   JU = MA + (val * MA);
   JL = JU + (val * JU);
   AG = JL + (val * JL);
   ST = AG + (val * AG);
   OT = ST + (val * ST);
   NV = OT + (val * OT);
   DZ = NV + (val * NV);
   System.out.printf("\nO Valor revisto em 1 ano e: %5.2f\n", DZ);
   try {Thread.sleep(1500); }catch(Exception erro){}
   System.out.printf("\nDeseja ver um mes expecifico?\nDigite o numero do mes que deseja visualizar: \n");
   enter = value.nextInt();
   
   switch(enter){
   case 1: System.out.printf("\nO Valor revisto em Janeiro e: %5.2f\n", JA);break;
   case 2: System.out.printf("\nO Valor revisto em Fevereiro e: %5.2f\n", FE);break;
   case 3: System.out.printf("\nO Valor revisto em Março e: %5.2f\n", MR);break;
   case 4: System.out.printf("\nO Valor revisto em Abril e: %5.2f\n", AB);break;
   case 5: System.out.printf("\nO Valor revisto em Maio e: %5.2f\n", MA);break;
   case 6: System.out.printf("\nO Valor revisto em Junho e: %5.2f\n", JU);break;
   case 7: System.out.printf("\nO Valor revisto em Julho e: %5.2f\n", JL);break;
   case 8: System.out.printf("\nO Valor revisto em Agosto e: %5.2f\n", AG);break;
   case 9: System.out.printf("\nO Valor revisto em Setembro e: %5.2f\n", ST);break;
   case 10: System.out.printf("\nO Valor revisto em Outubro e: %5.2f\n", OT);break;
   case 11: System.out.printf("\nO Valor revisto em Novembro e: %5.2f\n", NV);break;
   case 12: System.out.printf("\nO Valor revisto em Dezembro e: %5.2f\n", DZ);break;
   default: System.out.printf("\nEste mes não existe\n");break;
   }
   System.exit(0);
   }
}