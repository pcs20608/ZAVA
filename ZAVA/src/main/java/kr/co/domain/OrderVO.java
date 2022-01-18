package kr.co.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class OrderVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String oid;
	private String pid;
	private String mid;
	private Date odate;
	private int ostatus;
	private int amount;
	private String address1;
	private String address2;
	private String address3;
	private String oname;
	private String ophone;
	
	public OrderVO() {}

	public OrderVO(String oid, String pid, String mid, Date odate, int ostatus, int amount, String address1,
			String address2, String address3, String oname, String ophone) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.mid = mid;
		this.odate = odate;
		this.ostatus = ostatus;
		this.amount = amount;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.oname = oname;
		this.ophone = ophone;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public Date getOdate() {
		return odate;
	}

	public void setOdate(Date odate) {
		this.odate = odate;
	}

	public int getOstatus() {
		return ostatus;
	}

	public void setOstatus(int ostatus) {
		this.ostatus = ostatus;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getOphone() {
		return ophone;
	}

	public void setOphone(String ophone) {
		this.ophone = ophone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mid, oid, oname, ophone, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderVO other = (OrderVO) obj;
		return Objects.equals(mid, other.mid) && Objects.equals(oid, other.oid) && Objects.equals(oname, other.oname)
				&& Objects.equals(ophone, other.ophone) && Objects.equals(pid, other.pid);
	}

	@Override
	public String toString() {
		return "OrderVO [oid=" + oid + ", pid=" + pid + ", mid=" + mid + ", odate=" + odate + ", ostatus=" + ostatus
				+ ", amount=" + amount + ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3
				+ ", oname=" + oname + ", ophone=" + ophone + "]";
	}
}