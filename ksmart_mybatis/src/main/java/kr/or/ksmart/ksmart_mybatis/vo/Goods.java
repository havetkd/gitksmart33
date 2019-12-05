package kr.or.ksmart.ksmart_mybatis.vo;

public class Goods {

	private String goodscode;
	private String goodsId;
	private String goodsName;
	private String goodscate;
	private String goodsprice;
	private String goodscolor;
	private String goodsbrand;
	private String goodssize;
	private String goodsgender;
	private String goodsdate;
	
	
	public String getGoodscode() {
		return goodscode;
	}
	public void setGoodscode(String goodscode) {
		this.goodscode = goodscode;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodscate() {
		return goodscate;
	}
	public void setGoodscate(String goodscate) {
		this.goodscate = goodscate;
	}
	public String getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getGoodscolor() {
		return goodscolor;
	}
	public void setGoodscolor(String goodscolor) {
		this.goodscolor = goodscolor;
	}
	public String getGoodsbrand() {
		return goodsbrand;
	}
	public void setGoodsbrand(String goodsbrand) {
		this.goodsbrand = goodsbrand;
	}
	public String getGoodssize() {
		return goodssize;
	}
	public void setGoodssize(String goodssize) {
		this.goodssize = goodssize;
	}
	public String getGoodsgender() {
		return goodsgender;
	}
	public void setGoodsgender(String goodsgender) {
		this.goodsgender = goodsgender;
	}
	public String getGoodsdate() {
		return goodsdate;
	}
	public void setGoodsdate(String goodsdate) {
		this.goodsdate = goodsdate;
	}
	@Override
	public String toString() {
		return "Goods [goodscode=" + goodscode + ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodscate="
				+ goodscate + ", goodsprice=" + goodsprice + ", goodscolor=" + goodscolor + ", goodsbrand=" + goodsbrand
				+ ", goodssize=" + goodssize + ", goodsgender=" + goodsgender + ", goodsdate=" + goodsdate + "]";
	}
	
	
	
}
