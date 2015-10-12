
public class Client {

	public static void main(String arg[]){
		ScoreOperation operation;
		operation = new OperationAdapter();
		operation.search();
		operation.sort();
	}
}
//注意：相当于适配器类实现了目标接口，然后在适配器类引用其它类的函数，最后在Client中用接口来引用