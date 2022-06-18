public class Array2d {
    public static void main(String[] args) {
        //int n = 3;

        //so 2D arrays can be used this way 
        String[][] cars ={  {"honda","tata","verna"},
                            {"hyundai","ford","ferarri"},
                            {"lamborghini","bmw","java"}
                         };
        // Or maybe this way
     //cars[0][0] = "honda";
     //cars[0][1] = "tata";
     //cars[0][2] = "verna";
     //cars[1][0] = "hyundai";
     //cars[1][1] = "ford";
     //cars[1][2] = "ferarri";
     //cars[2][0] = "lamborghini";
     //cars[2][1] = "bmw";
     //cars[2][2] = "java";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for(int j=0;j<cars.length;j++){
                System.out.print(cars[i][j].toUpperCase()+"\t");
            }
        }
    }
    // another way is also there where we can allocate memory dynamically and also take input but i am just lazy for that right now so maybe some other day......





}
