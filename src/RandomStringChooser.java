//YOUR CODE HERE
public class RandomStringChooser {
    private String arrayStr[];
    public RandomStringChooser(String string[]) {
        arrayStr = string;
    }


    public String getNext() {
        int count = 0;
        do {
            int random = (int) (Math.random() * arrayStr.length);
            if (arrayStr[random].equals("NONE")) {
                count += 1;
            }else {
                String temp = arrayStr[random];
                String s = temp;
                arrayStr[random] = "NONE";
                return s;
            }

            return "NONE";
        }while(count < 100);
    }

}
