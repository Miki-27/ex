package jp.co.internous.sample;

public class SampleMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		User user1 = new User();
		
		user1.setFullName("鈴木一郎");
		user1.setTelephoneNo("090-1111-2222");
		
		String fullName = user1.getFullName();
		String telNo = user1.getTelephoneNo();
		
		System.out.println(fullName);
		System.out.println(telNo);
		
		Goods goods = new Goods();
		
		goods.setGoodsName("光る宝石");
		goods.setPrice(100000);
		
		String msg = goods.purchase(goods);
		
		System.out.println(msg);

	}

}
