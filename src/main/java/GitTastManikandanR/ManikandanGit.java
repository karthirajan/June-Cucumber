package GitTastManikandanR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ManikandanGit {
public static void main(String[] args) throws Exception {
	File f2 = new File("C:\\Users\\DD\\Desktop\\sam1.xlsx");
	FileInputStream f1 = new FileInputStream(f2);
	Workbook w = new XSSFWorkbook(f1);
	Sheet s2 = w.createSheet("1234h567");
	List<String> str = new ArrayList<String>();
	str.add("mani");
	str.add("guna");
	str.add("nithi");
	str.add("raja");
	str.add("selvi");
	str.add("durai");
	str.add("mani");
	str.add("guna");
	str.add("nithi");
	str.add("raja");
	for (int m =0 ; m<=2;m++){
		Row r2 =s2.createRow(m);
	for( int n = 0 ; n<=9;n++){
			Cell c4 =r2.createCell(n);
		if(m==0){	
				c4.setCellValue(n);}
		if(m==1){
					c4.setCellValue(str.get(n));}
		if(m==2){
						c4.setCellValue(n+20);
		}}}
	Sheet s = w.getSheet("Sheet1");
	System.out.println("hi");
	int sum =0 ;
	for (int i = 0 ; i<s.getPhysicalNumberOfRows(); i++)
	{
		Row r = s.getRow(i);
		for(int j = 0 ; j<r.getPhysicalNumberOfCells();j++){
			Cell c = r.getCell(j);
			System.out.println(c+"  ");
			if (j>=1){
			String scv = c.getStringCellValue();
			if(scv.equals("karthi")){
				c.setCellValue("manu");
			}}		}
		Cell c1 = r.getCell(0);
		int s1 =(int) c1.getNumericCellValue();
		
		sum=sum+s1;
		System.out.println();
	}
	System.out.println(sum);
	FileOutputStream v = new FileOutputStream(f2);
	w.write(v);
	/*	File f = new File("C:\\Users\\DD\\Desktop\\m.txt");
	f.createNewFile();
	
	FileWriter f1 = new FileWriter(f);
	f1.write("welcome Java"+"/n");
	f1.write("BYe");
f1.close();

*/}}
