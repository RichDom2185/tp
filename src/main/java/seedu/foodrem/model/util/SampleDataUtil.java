/* @@author */
package seedu.foodrem.model.util;

import java.util.HashSet;
import java.util.List;

import seedu.foodrem.model.FoodRem;
import seedu.foodrem.model.ReadOnlyFoodRem;
import seedu.foodrem.model.item.Item;
import seedu.foodrem.model.item.ItemBoughtDate;
import seedu.foodrem.model.item.ItemExpiryDate;
import seedu.foodrem.model.item.ItemName;
import seedu.foodrem.model.item.ItemPrice;
import seedu.foodrem.model.item.ItemQuantity;
import seedu.foodrem.model.item.ItemRemark;
import seedu.foodrem.model.item.ItemUnit;
import seedu.foodrem.model.tag.Tag;

/**
 * Contains utility methods for populating {@code FoodRem} with sample data.
 */
public class SampleDataUtil {
    public static Item[] getSampleItems() {
        return new Item[]{
            new Item(new ItemName("Milk"),
                     new ItemQuantity("2"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("18-03-2022"),
                     ItemExpiryDate.of("28-04-2022"),
                     new ItemPrice("3.40"),
                     new ItemRemark("For party"),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Bread"),
                     new ItemQuantity("3"),
                     new ItemUnit("loaves"),
                     ItemBoughtDate.of("28-03-2022"),
                     ItemExpiryDate.of("20-05-2022"),
                     new ItemPrice("2.40"),
                     new ItemRemark("For seasonal meal"),
                     new HashSet<>()),
            new Item(new ItemName("Eggs"),
                     new ItemQuantity("10"),
                     new ItemUnit("trays"),
                     ItemBoughtDate.of("28-01-2022"),
                     ItemExpiryDate.of("25-02-2022"),
                     new ItemPrice("3.30"),
                     new ItemRemark("For seasonal meal"),
                     new HashSet<>()),
            new Item(new ItemName("Local Cheese"),
                     new ItemQuantity("2"),
                     new ItemUnit(""),
                     ItemBoughtDate.of("17-04-2022"),
                     ItemExpiryDate.of("28-10-2022"),
                     new ItemPrice("25"),
                     new ItemRemark(""),
                     new HashSet<>()),
            new Item(new ItemName("Water"),
                     new ItemQuantity("10"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("13-05-2022"),
                     ItemExpiryDate.of("13-06-2022"),
                     new ItemPrice("1.40"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Wine"),
                     new ItemQuantity("2"),
                     new ItemUnit("bottles"),
                     ItemBoughtDate.of("21-06-2022"),
                     ItemExpiryDate.of("21-12-2022"),
                     new ItemPrice("30"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Domestic Beer"),
                     new ItemQuantity("100"),
                     new ItemUnit("cans"),
                     ItemBoughtDate.of("22-09-2022"),
                     ItemExpiryDate.of("21-11-2022"),
                     new ItemPrice("5.00"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Imported Beer"),
                     new ItemQuantity("100"),
                     new ItemUnit("cans"),
                     ItemBoughtDate.of("24-06-2022"),
                     ItemExpiryDate.of("23-12-2022"),
                     new ItemPrice("5.90"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Chicken breasts"),
                     new ItemQuantity("10.8"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("24-03-2022"),
                     ItemExpiryDate.of("16-12-2022"),
                     new ItemPrice("11"),
                     new ItemRemark("Try new recipe"),
                     new HashSet<>(List.of(new Tag("Meat"), new Tag("Freezer")))),
            new Item(new ItemName("Apples"),
                     new ItemQuantity("3.4"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("14-01-2022"),
                     ItemExpiryDate.of("15-11-2022"),
                     new ItemPrice("4.80"),
                     new ItemRemark("Try new recipe"),
                     new HashSet<>(List.of(new Tag("Fruits")))),
            new Item(new ItemName("Oranges"),
                     new ItemQuantity("2.8"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("18-03-2022"),
                     ItemExpiryDate.of("10-04-2022"),
                     new ItemPrice("4.40"),
                     new ItemRemark("For seasonal meal"),
                     new HashSet<>(List.of(new Tag("Fruits")))),
            new Item(new ItemName("Potatoes"),
                     new ItemQuantity("9.3"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("14-10-2022"),
                     ItemExpiryDate.of("24-12-2022"),
                     new ItemPrice("2.80"),
                     new ItemRemark("For seasonal meal"),
                     new HashSet<>(List.of(new Tag("Vegetables")))),
            new Item(new ItemName("Lettuce"),
                     new ItemQuantity("1.2"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("28-05-2022"),
                     ItemExpiryDate.of("14-07-2022"),
                     new ItemPrice("2.20"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Vegetables")))),
            new Item(new ItemName("Rice"),
                     new ItemQuantity("10"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("18-01-2022"),
                     ItemExpiryDate.of("12-05-2022"),
                     new ItemPrice("3.20"),
                     new ItemRemark(""),
                     new HashSet<>()),
            new Item(new ItemName("Tomato"),
                     new ItemQuantity("1.6"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("22-01-2022"),
                     ItemExpiryDate.of("10-07-2022"),
                     new ItemPrice("3.60"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Fruits")))),
            new Item(new ItemName("Bananas"),
                     new ItemQuantity("10"),
                     new ItemUnit("Bunch"),
                     ItemBoughtDate.of("13-05-2022"),
                     ItemExpiryDate.of("10-12-2022"),
                     new ItemPrice("3.30"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Fruits")))),
            new Item(new ItemName("Onions"),
                     new ItemQuantity("1.9"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("21-03-2022"),
                     ItemExpiryDate.of("11-06-2022"),
                     new ItemPrice("2.80"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Fruits")))),
            new Item(new ItemName("Beef Round"),
                     new ItemQuantity("10"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("22-06-2022"),
                     ItemExpiryDate.of("19-07-2022"),
                     new ItemPrice("28"),
                     new ItemRemark("Try new recipe"),
                     new HashSet<>(List.of(new Tag("Meat"), new Tag("Freezer")))),
            new Item(new ItemName("Pears"),
                     new ItemQuantity("2"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("24-07-2022"),
                     ItemExpiryDate.of("17-10-2022"),
                     new ItemPrice("5.80"),
                     new ItemRemark("Try new recipe"),
                     new HashSet<>(List.of(new Tag("Fruits")))),
            new Item(new ItemName("Cucumber"),
                     new ItemQuantity("4"),
                     new ItemUnit("Kg"),
                     ItemBoughtDate.of("21-07-2022"),
                     ItemExpiryDate.of("19-08-2022"),
                     new ItemPrice("2.00"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Vegetables")))),
            new Item(new ItemName("Perrier Water"),
                     new ItemQuantity("5.8"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("27-07-2022"),
                     ItemExpiryDate.of("20-09-2022"),
                     new ItemPrice("0.78"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Sausages"),
                     new ItemQuantity("3"),
                     new ItemUnit("kg"),
                     ItemBoughtDate.of("10-05-2022"),
                     ItemExpiryDate.of("17-09-2022"),
                     new ItemPrice("38"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Meat"), new Tag("Freezer")))),
            new Item(new ItemName("Cottage cheese"),
                     new ItemQuantity("2"),
                     new ItemUnit("kg"),
                     ItemBoughtDate.of("10-02-2022"),
                     ItemExpiryDate.of("18-03-2022"),
                     new ItemPrice("20"),
                     new ItemRemark(""),
                     new HashSet<>(List.of(new Tag("Vegetables")))),
            new Item(new ItemName("Whisky"),
                     new ItemQuantity("10"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("15-10-2022"),
                     ItemExpiryDate.of("14-11-2022"),
                     new ItemPrice("58"),
                     new ItemRemark("For party"),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Rum"),
                     new ItemQuantity("2.4"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("13-04-2022"),
                     ItemExpiryDate.of("17-06-2022"),
                     new ItemPrice("58"),
                     new ItemRemark("For party"),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Vodka"),
                     new ItemQuantity("4.8"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("18-03-2022"),
                     ItemExpiryDate.of("11-04-2022"),
                     new ItemPrice("58"),
                     new ItemRemark("For party"),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
            new Item(new ItemName("Gin"),
                     new ItemQuantity("3"),
                     new ItemUnit("litres"),
                     ItemBoughtDate.of("28-06-2022"),
                     ItemExpiryDate.of("26-07-2022"),
                     new ItemPrice("58"),
                     new ItemRemark("For party"),
                     new HashSet<>(List.of(new Tag("Drinks"), new Tag("Fridge")))),
        };
    }

    public static ReadOnlyFoodRem getSampleFoodRem() {
        FoodRem sampleFoodRem = new FoodRem();
        for (Item sampleItem : getSampleItems()) {
            sampleFoodRem.addItem(sampleItem);
            for (Tag tag : sampleItem.getTagSet()) {
                if (!sampleFoodRem.hasTag(tag)) {
                    sampleFoodRem.addTag(tag);
                }
            }
        }
        return sampleFoodRem;
    }
}
