/**
 * Created by cameronkent on 1/09/2016.
 */
public class DemoItemsAndPets {

    public static void main(String[] args) {

        //Item population
        ItemSold first = new ItemSold();
        first.setInvoiceNo(first.getInvoiceNo());
        first.setDescription(first.getDescription());
        first.setPrice(first.getPrice());

        //Pet population increases price for vaccination, neutering or housebroken
        PetSold fluffy = new PetSold();
        fluffy.setInvoiceNo(fluffy.getInvoiceNo());
        fluffy.setDescription(fluffy.getDescription());
        fluffy.setPrice(fluffy.getPrice());
        fluffy.setVaccinated(fluffy.getVaccinated());
        if (fluffy.vaccinated ==true) { fluffy.price = (fluffy.price + 45); }
        fluffy.setNeutered(fluffy.getNeutered());
        if (fluffy.neutered ==true) { fluffy.price = (fluffy.price + 35); }
        fluffy.setHouseBroken(fluffy.getHousebroken());
        if (fluffy.housebroken ==true) { fluffy.price = (fluffy.price+ 50); }

        //display objects
        System.out.println("Item Details:");
        System.out.println("Invoice No: " + first.invoiceNo);
        System.out.println("Item Description: " + first.description);
        System.out.println("Item Price : $" + first.price);

        System.out.println("Pet Details:");
        System.out.println("Invoice No: " + fluffy.invoiceNo);
        System.out.println("Item Description: " + fluffy.description);
        System.out.println("Vaccinated: " + fluffy.vaccinated);
        System.out.println("Neutered: " + fluffy.neutered);
        System.out.println("Housebroken: " + fluffy.housebroken);
        System.out.println("Item Price : $" + fluffy.price);

    }
}
