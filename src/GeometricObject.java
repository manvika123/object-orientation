import java.util.Date;

public class GeometricObject
    {
        private String color= "white";
        private boolean filled;
        private java.util.Date dateCreated;

        //default constructor for GeometricObject

    public GeometricObject() {
    dateCreated= new java.util.Date();
    }
    //construct GeometricObject with specified color and filled value

        public GeometricObject(String color, boolean filled)
        {
            this.color=color;
            this.filled=filled;
            dateCreated= new java.util.Date();
        }
        //return color
        public String getColor() {
            return color;
        }
        //set new color
        public void setColor(String color) {
            this.color = color;
        }
        //get filled
        public boolean isFilled() {
            return filled;
        }
        //set new filled
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        //get date created


        public java.util.Date getDateCreated() {
            return dateCreated;
        }
        //return the string representation of this object
        public String toString() {
            return "created on "+dateCreated+ "\ncolor: "+color+ " and filled: "+filled;
        }
    }