package com.gw.RealEstate.Entity;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="propertydetails")
@Proxy(lazy=false)
public class PropertyDetails {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="propid")
	private int propId;
	@Column(name="title")
	private String title;
	@Column(name="propStatus")
	private String propStatus;
	@Column(name="type")
	private String type;
	@Column(name="price")
	private int price;
	@Column(name="area")
	private int area;
	@Column(name="rooms")
	private int rooms;
	@Column(name="bathroom")
	private int bathroom;
	@Column(name="address")
	private String address;
	@Column(name="postalcode")
	private int postalcode;
	@Column(name="info")
	private String info;
	@Column(name="location")
	private String location;
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="propertyStat")
	private String propertyStat;
	
	public String getPropertyStat() {
		return propertyStat;
	}



	public void setPropertyStat(String propertyStat) {
		this.propertyStat = propertyStat;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name="phone")
	private long phone;
	
	@Column(name="parking")
	private boolean parking;
	
	@Column(name="ac")
	private boolean ac;
	
	@Column(name="balcony")
	private boolean balcony;
	
	@Column(name="pool")
	private boolean pool;
	
	@Column(name="storage")
	private boolean storage;
	
	@Column(name="gaspipe")
	private boolean gaspipe;
	
	@Column(name="laundry")
	private boolean laundry;
	
	@Column(name="alarm")
	private boolean alarm;
	
	@Column(name="pooja")
	private boolean pooja;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="buildingage")
	private String buildingage;
	
	@Column(name="floor")
	private String floor;
	
	@Column(name="noofparking")
	private String noofparking;
	
	@Column(name="furnished")
	private String furnished;
	
	@Column(name="view")
	private String view;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="userid")
	private PersonalDetails pd;
	
	public PropertyDetails() {
		
	}
	
	

	public PropertyDetails(String title, String propStatus, String type, int price, int area, int rooms, int bathroom,
			String address, int postalcode, String info, String name, String email, long phone, boolean parking,
			boolean ac, boolean balcony, boolean pool, boolean storage, boolean gaspipe, boolean laundry, boolean alarm,
			boolean pooja, String city, String state, String buildingage, String floor, String noofparking,
			String furnished, String view, PersonalDetails pd) {
		super();
		this.title = title;
		this.propStatus = propStatus;
		this.type = type;
		this.price = price;
		this.area = area;
		this.rooms = rooms;
		this.bathroom = bathroom;
		this.address = address;
		this.postalcode = postalcode;
		this.info = info;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.parking = parking;
		this.ac = ac;
		this.balcony = balcony;
		this.pool = pool;
		this.storage = storage;
		this.gaspipe = gaspipe;
		this.laundry = laundry;
		this.alarm = alarm;
		this.pooja = pooja;
		this.city = city;
		this.state = state;
		this.buildingage = buildingage;
		this.floor = floor;
		this.noofparking = noofparking;
		this.furnished = furnished;
		this.view = view;
		this.pd = pd;
	}



	public int getPropId() {
		return propId;
	}

	public void setPropId(int propId) {
		this.propId = propId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPropStatus() {
		return propStatus;
	}

	public void setPropStatus(String propStatus) {
		this.propStatus = propStatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isStorage() {
		return storage;
	}

	public void setStorage(boolean storage) {
		this.storage = storage;
	}

	public boolean isGaspipe() {
		return gaspipe;
	}

	public void setGaspipe(boolean gaspipe) {
		this.gaspipe = gaspipe;
	}

	public boolean isLaundry() {
		return laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}

	public boolean isPooja() {
		return pooja;
	}

	public void setPooja(boolean pooja) {
		this.pooja = pooja;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBuildingage() {
		return buildingage;
	}

	public void setBuildingage(String buildingage) {
		this.buildingage = buildingage;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getNoofparking() {
		return noofparking;
	}

	public void setNoofparking(String noofparking) {
		this.noofparking = noofparking;
	}

	public String getFurnished() {
		return furnished;
	}

	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public PersonalDetails getPd() {
		return pd;
	}

	public void setPd(PersonalDetails pd) {
		this.pd = pd;
	}
	
	
	
}
