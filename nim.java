import java.util.*;

class nim{

public static void main(String []args){	
Scanner input=new Scanner(System.in);
Scanner bner=new Scanner(System.in);
String nama,grade,matkul;
float uas,uts,quiz,absen,tugas,hasilabsen,hasilquiz,hasiltugas,hasiluas,hasiluts,nilai;
int nim;

System.out.print("Nama Mahasiswa : ");
nama=input.nextLine();

System.out.print("Matakuliah : ");
matkul=input.nextLine();

System.out.print("Nim : ");
nim=input.nextInt();


do{
System.out.print("Nilai UAS : ");
uas=input.nextFloat();
float a=35/100f;
hasiluas=uas*a;
}while(uas>100 || uas<0);
do{
System.out.print("Nilai UTS : ");
uts=input.nextFloat();
float b=25/100f;
hasiluts=uts*b;
}while(uts>100 || uts<0);
do{
System.out.print("Nilai ABSEN : ");
absen=input.nextFloat();
float c=20/100f;
hasilabsen=absen*c;
}while(absen>100 || absen<0);
do{
System.out.print("Nilai TUGAS : ");
tugas=input.nextFloat();
float d=10/100f;
hasiltugas=tugas*d;
}while(tugas>100 || tugas<0);
do{
System.out.print("Nilai QUIZ : ");
quiz=input.nextFloat();
float e=10/100f;
hasilquiz=quiz*e;
}while(quiz>100 || quiz<0);

nilai=hasiluas+hasiluts+hasilabsen+hasiltugas+hasilquiz;

grade="A, A-, B+, B-, C, D";

if(nilai>=80 && nilai<=100){
	grade="A";
	}
	else if(nilai>=77 && nilai<80){
		grade="A-";
	}
	else if(nilai>=74 && nilai<77){
		grade="B+";
	}
	else if(nilai>=70 && nilai<74){
		grade="B";
	}
	else if(nilai>=66 && nilai<70){
		grade="B-";
	}
	else if(nilai>=60 && nilai<66){
		grade="C";
	}
	else if(nilai>=55 && nilai<60){
		grade="D";
	}
	else if(nilai<=55){
		grade="E";
	}
	else{
		System.out.println("E");
	}
	System.out.println("======================================");
	System.out.println("Nama Mahasiswa : " + nama);
	System.out.println("Nim : " + nim);
	System.out.println("MataKuliah : " + matkul);
	System.out.println("Nilaiakhir : " + grade);
	System.out.println("======================================");
	
}	
}