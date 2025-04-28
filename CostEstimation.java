package casestudy.realconstructor;

public class CostEstimation extends ConstructionMaterial {
    public CostEstimation(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);

    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimateCost() {
        double costperton;

        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costperton = 200000;

        } else if (materialQuantity > 15) {
            costperton = 180000;
        } else {
            System.out.println("Error: Minimum quantity of cost estimation is 5 tons and maximum is 15 tons.");
            return;
        }
        double totalCost = materialQuantity * costperton;

        System.out.println("The total cost of the material is " + totalCost);
        System.out.println("The contractor id is: " + contractorId);
        System.out.println("The contractor name is: " + contractorName);
        System.out.println("The quantity used: " + materialQuantity + " tons");
        System.out.println("The cost per ton is: " + String.format("%,.0f", costperton));
        System.out.println("Total cost of materials used: " + String.format("%,.0f", totalCost));
        System.out.println("The estimated cost of the material is successfully recorded.");

    }

}
