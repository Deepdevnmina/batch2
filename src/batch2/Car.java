package batch2;

public class Car implements Comparable<Car> {
	private int cid;
	private String color;
	private int price;
	private String owner;
	private int model;
	public Car() {
	}

	public Car(int cid, String color, int price, String owner, int model) {
		super();
		this.cid = cid;
		this.color = color;
		this.price = price;
		this.owner = owner;
		this.model = model;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", color=" + color + ", price=" + price + ", owner=" + owner + ", model=" + model
				+ "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public int compareTo(Car o) {
		return this.color.compareTo(o.color);
	}
}
