package main;

public class SortTest {

	public static void main(String[] args){
        testBucketSort();
    }
    //±í±Æ§Ç
    private static void testBucketSort(){
    	
        int[] array = {5,9,1,9,5,3,7,6,1};
        BucketSort bucketSort = new BucketSort(11,array);
        bucketSort.sort();
        bucketSort.print();
    }

}
