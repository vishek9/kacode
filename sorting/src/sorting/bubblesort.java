package sorting;

public class bubblesort {
public static void main(String[] args) {
	int arr[]={54,85,76,95,4};
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
						arr[j+1]=temp;
			}
		}
	}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
}
}
