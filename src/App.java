public class App {
    public static void main(String[] args) throws Exception {
       Building rituBuilding = new Building("ritu"); // constructing object using constructor
       rituBuilding.getOwner();
       Building rajeshBuilding = new Building("rajesh");  // constructing object using constructor
       rajeshBuilding.getOwner();

       Building ritusBuildingAtHyd = new Building("ritu", "hyd");
    }
}
