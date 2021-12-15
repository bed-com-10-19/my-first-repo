class Area{ // creating a class

   private double length; // data field
   private double breadth; // data field
    
    // No argument constructor
       Area(){
       } 

       // A consructor with arguments
       Area(double length, double breadth){
           this.length = length;
           this.breadth = breadth;
       }
       
       // create a getter method to return area
       public double getArea(){
           double area = length * breadth;
           return area;
       }

        // Create a Setter method
       public void setArea(double length, double breadth){
           this.length = length;
           this.breadth = breadth;
       }

}