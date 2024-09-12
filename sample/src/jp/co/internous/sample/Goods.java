package jp.co.internous.sample;

public class Goods {
	
	private String goodsName;
	private int price;
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String purchase(Goods goods) {
		
		String msg = goods.getGoodsName() + "を" + goods.getPrice() + "円で購入";
		
		return msg;
	}

}
