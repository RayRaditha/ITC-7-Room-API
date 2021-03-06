public class CountriesItem{

	@SerializedName("NewRecovered")
	private int newRecovered;

	@SerializedName("NewDeaths")
	private int newDeaths;

	@SerializedName("TotalRecovered")
	private int totalRecovered;

	@SerializedName("TotalConfirmed")
	private int totalConfirmed;

	@SerializedName("Country")
	private String country;

	@SerializedName("Premium")
	private Premium premium;

	@SerializedName("ID")
	private String iD;

	@SerializedName("CountryCode")
	private String countryCode;

	@SerializedName("Slug")
	private String slug;

	@SerializedName("NewConfirmed")
	private int newConfirmed;

	@SerializedName("TotalDeaths")
	private int totalDeaths;

	@SerializedName("Date")
	private String date;

	public void setNewRecovered(int newRecovered){
		this.newRecovered = newRecovered;
	}

	public int getNewRecovered(){
		return newRecovered;
	}

	public void setNewDeaths(int newDeaths){
		this.newDeaths = newDeaths;
	}

	public int getNewDeaths(){
		return newDeaths;
	}

	public void setTotalRecovered(int totalRecovered){
		this.totalRecovered = totalRecovered;
	}

	public int getTotalRecovered(){
		return totalRecovered;
	}

	public void setTotalConfirmed(int totalConfirmed){
		this.totalConfirmed = totalConfirmed;
	}

	public int getTotalConfirmed(){
		return totalConfirmed;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPremium(Premium premium){
		this.premium = premium;
	}

	public Premium getPremium(){
		return premium;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setNewConfirmed(int newConfirmed){
		this.newConfirmed = newConfirmed;
	}

	public int getNewConfirmed(){
		return newConfirmed;
	}

	public void setTotalDeaths(int totalDeaths){
		this.totalDeaths = totalDeaths;
	}

	public int getTotalDeaths(){
		return totalDeaths;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	@Override
 	public String toString(){
		return 
			"CountriesItem{" + 
			"newRecovered = '" + newRecovered + '\'' + 
			",newDeaths = '" + newDeaths + '\'' + 
			",totalRecovered = '" + totalRecovered + '\'' + 
			",totalConfirmed = '" + totalConfirmed + '\'' + 
			",country = '" + country + '\'' + 
			",premium = '" + premium + '\'' + 
			",iD = '" + iD + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			",slug = '" + slug + '\'' + 
			",newConfirmed = '" + newConfirmed + '\'' + 
			",totalDeaths = '" + totalDeaths + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}
