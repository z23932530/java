import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

    public static Product[] ReadProducts(){
    	//Manages data for shop assistants and products from CSV files
    	Product[] products = new Product[90]; 

        String path = "src/products.csv";
        String line;
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                Product product = new Product(Integer.parseInt(values[0]), values[1], Float.parseFloat(values[2].replace(",", ".")));
                products[i] = product;
                i++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
        
       
	public static ShopAssistant[] ReadShopAssistants(){
		ShopAssistant[] ShopAssistants = new ShopAssistant[100];
		int i = 0;
		String path1 = "src/shopAssistants.csv";{
			String line2 = "";
		try {
		    BufferedReader br = new BufferedReader(new FileReader(path1));
		    while ((line2 = br.readLine()) != null) {
		    	String[] Assistants = line2.split(";");
		    	ShopAssistant shopAssistant = new ShopAssistant(Integer.parseInt(Assistants[0]),Assistants[1], Assistants[2], Assistants[3]);
		    	ShopAssistants[i] = shopAssistant;
		    	i++;
		}
		br.close();

		}catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
		return ShopAssistants;
		
		}
	}

}
