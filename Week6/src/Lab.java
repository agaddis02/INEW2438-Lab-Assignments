
 
public class Lab {
 
    public static double[] doSelectionSort(double[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            double smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] =  smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        double[] arr1 = {3.4,5,3,3.5,2.2,1.9,2};
        double[] arr2 = doSelectionSort(arr1);
        for(double i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}