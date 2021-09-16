public class CoronaResponses{

	@SerializedName("Message")
	private String message;

	@SerializedName("Countries")
	private List<CountriesItem> countries;

	@SerializedName("ID")
	private String iD;

	@SerializedName("Global")
	private Global global;

	@SerializedName("Date")
	private String date;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setCountries(List<CountriesItem> countries){
		this.countries = countries;
	}

	public List<CountriesItem> getCountries(){
		return countries;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setGlobal(Global global){
		this.global = global;
	}

	public Global getGlobal(){
		return global;
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
			"CoronaResponses{" + 
			"message = '" + message + '\'' + 
			",countries = '" + countries + '\'' + 
			",iD = '" + iD + '\'' + 
			",global = '" + global + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}
