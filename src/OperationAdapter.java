
public class OperationAdapter implements ScoreOperation{

	QuickSort quickSort; 
	BinarySearch binarySearch;
	
	public OperationAdapter(){
		this.quickSort = new QuickSort();
		this.binarySearch = new BinarySearch();
	}
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		quickSort.quickSort();
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		binarySearch.binarySearch();
	}

}
