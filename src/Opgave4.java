public class Opgave4 {

    //globale erklæringer/variable
    int[] numbers = {45, 67, 23, 89, 34, 56, 78};


    //metoder

    double calculateAverage(){
        int sum = findSum(numbers);
        int count = numberCounter(numbers);

        return (double)sum / count;

    }

    int findMin(int numbers[]){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    int findMax(int numbers[]){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    int numberCounter(int[] numbers){
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            count++;
        }
        return count;
    }

    int findSum(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    int aboveAverage(int[] numbers){
        int overAverageCounter = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > calculateAverage()){
                overAverageCounter++;
            }
        }
        return overAverageCounter;
    }

    void printAllStats(){
        System.out.println("======STATS======");
        System.out.println("Minimum number in array is: " + findMin(numbers));
        System.out.println("Maximum number in array is: " + findMax(numbers));
        System.out.println("There are " + numberCounter(numbers) + " numbers in the array.");
        System.out.println("The sum of the array is: " + findSum(numbers));
        System.out.println("The average of the array is: " + calculateAverage());
        System.out.println("There are " + aboveAverage(numbers) + " numbers which are over average");
        System.out.println("=======END=======");
    }


    void main(){


        printAllStats();

    }

}
