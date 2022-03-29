import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random randomNumber = new Random(); 
    int  num1  = randomNumber.nextInt(4)+1;
    int  num2  = randomNumber.nextInt(4)+1;
    int row, col, catchCount = 0;
    System.out.print("\033\143");
    String[][] foodPlace = {  {" "},
                              {" ","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~",},
                              {" ","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~",},
                              {" ","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~",},
                              {" ","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~",},
                              {" ","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~","~~~~~~~"}};
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    num1  = randomNumber.nextInt(4)+1;
    num2  = randomNumber.nextInt(4)+1;
    foodPlace[num1][num2]="\uD83C\uDF72";
    String[][] game = { {"  ","   1    ","    2    ","    3    ","    4    ","    5   "},
                        {"1"," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "},
                        {"2"," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "},
                        {"3"," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "},
                        {"4"," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "},
                        {"5"," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "," ~~~~~~~ "}};

    //start the game
     while(catchCount<3){
          System.out.println("There are differnt resturants all over town, try to find a good place to eat!");

    //print out pond
    for(int i = 0;i < 6;i++){
      for(int j = 0;j < 6;j++){
        System.out.print(game[i][j]);
      }
      System.out.println();
    }

    //let them make a guess
    System.out.println("Where would you like to look for good food at?");
    System.out.print("Coloum: ");
    col = input.nextInt();
    System.out.print("Row:");
    row = input.nextInt();
       System.out.print("\033\143");
    if(foodPlace[row][col].equals("\uD83C\uDF72")){
      System.out.println("You found a new amazing place to eat!");
      game[row][col]=" \uD83C\uDF72"+"\uD83C\uDF72"+"\uD83C\uDF72"+"\uD83C\uDF72";
      catchCount++;
        if(catchCount==1){
      System.out.println("Now try searching for some more resturants. You have 2 more to find.");
          }else if(catchCount==2){
      System.out.println("Now try searching for some more resturants. You have 1 more to find.");
    }}else if(foodPlace[row][col].equals("~~~~~~~")){
      System.out.println("There wasn't anything to eat around.");
      game[row][col]=" \u26D4"+"\u26D4"+"\u26D4"+"\u26D4";
        if(catchCount==0){
      System.out.print("You should still go looking for food. You have 3 more restaurants to find.");
        }else if(catchCount==1){
      System.out.println("You should still go looking for food. You have 2 more restaurants to find.");
        }else if(catchCount==2){
      System.out.println("You should still go looking for food. You have 1 more restaurants to find.");
      }
    }
  }
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(foodPlace[i+1][j+1].equals("~~~~~~~")){
          game[i+1][j+1]=" \u26D4"+"\u26D4"+"\u26D4"+"\u26D4";
        }else if(foodPlace[i+1][j+1].equals("\uD83C\uDF72")){
          game[i+1][j+1]=" \uD83C\uDF72"+"\uD83C\uDF72"+"\uD83C\uDF72"+"\uD83C\uDF72";
        }
      }
    }
  for(int i = 0;i < 6;i++){
    for(int j = 0;j < 6;j++){
      System.out.print(game[i][j]);
    }
    System.out.println();
  }
  System.out.println("You have gotten full from all of the food that you ate.");
  }
}