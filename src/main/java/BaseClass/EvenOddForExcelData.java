package BaseClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class EvenOddForExcelData {
			
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
				
				int row = 0;
				for( ; ; )
				{
					try {
						String fetched= ExcelUtility.getData("EvenOdd",row, 0);
						
						if(fetched!=" ")
						{
							checkEvenOdd((int)Double.parseDouble(fetched));
							row++;
						}else {
							break;
						}
					}catch(NullPointerException n)
					{
						break;
					}
				}
			}
			
			public static void checkEvenOdd(int num)
			{
				if(num%2==0)
				{
					System.out.println("Even : "+num);
					System.out.println();
				}else {
					System.out.println("Odd : "+num);
					System.out.println();
				}
			}
		}


