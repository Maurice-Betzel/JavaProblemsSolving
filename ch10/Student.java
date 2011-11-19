public class Student implements Cloneable {
  
  public Student(String ID, String firstName, String lastName, String streetAddress, String state, String city, String country, String postalCode, String telephone, float GPA, int totalCredits) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.streetAddress = streetAddress;
    this.state = state;
    this.city = city;
    this.country = country;
    this.postalCode = postalCode;
    this.telephone = telephone;
    this.GPA = GPA;
    this.totalCredits = totalCredits;
  }
  
  public Student(String ID, String firstName, String lastName, String streetAddress, String state, String city, String country, String postalCode, String telephone, float GPA) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.streetAddress = streetAddress;
    this.state = state;
    this.city = city;
    this.country = country;
    this.postalCode = postalCode;
    this.telephone = telephone;
    this.GPA = GPA;
  }
  
  public Student(String ID, String firstName, String lastName, String streetAddress, String state, String city, String country, String postalCode, String telephone, int totalCredits) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.streetAddress = streetAddress;
    this.state = state;
    this.city = city;
    this.country = country;
    this.postalCode = postalCode;
    this.telephone = telephone;
    this.totalCredits = totalCredits;
  }
  
  public Student(String ID, String firstName, String lastName, String streetAddress, String state, String city, String country, String postalCode, String telephone) {
    this.ID = ID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.streetAddress = streetAddress;
    this.state = state;
    this.city = city;
    this.country = country;
    this.postalCode = postalCode;
    this.telephone = telephone;
  }
  
  public Object clone()
      throws CloneNotSupportedException {
    return super.clone();
  }
  
  public boolean equals(Object other) {
    if ((other != null) && (other instanceof Student)) {
      Student o = (Student) other;
      if (totalCredits != o.totalCredits) 
        return false;
      if (GPA != o.GPA) 
        return false;
      if ((telephone == null && o.telephone != null) || (telephone != null) && (!(telephone.equals(o.telephone)))) 
        return false;
      if ((postalCode == null && o.postalCode != null) || (postalCode != null) && (!(postalCode.equals(o.postalCode)))) 
        return false;
      if ((country == null && o.country != null) || (country != null) && (!(country.equals(o.country)))) 
        return false;
      if ((city == null && o.city != null) || (city != null) && (!(city.equals(o.city)))) 
        return false;
      if ((state == null && o.state != null) || (state != null) && (!(state.equals(o.state)))) 
        return false;
      if ((streetAddress == null && o.streetAddress != null) || (streetAddress != null) && (!(streetAddress.equals(o.streetAddress)))) 
        return false;
      if ((lastName == null && o.lastName != null) || (lastName != null) && (!(lastName.equals(o.lastName)))) 
        return false;
      if ((firstName == null && o.firstName != null) || (firstName != null) && (!(firstName.equals(o.firstName)))) 
        return false;
      if ((ID == null && o.ID != null) || (ID != null) && (!(ID.equals(o.ID)))) 
        return false;
      return true;
    } else {
      return false;
    }
  }
  
  public String getCity() {
    return city;
  }
  
  public String getCountry() {
    return country;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public float getGPA() {
    return GPA;
  }
  
  public String getID() {
    return ID;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getPostalCode() {
    return postalCode;
  }
  
  public String getState() {
    return state;
  }
  
  public String getStreetAddress() {
    return streetAddress;
  }
  
  public String getTelephone() {
    return telephone;
  }
  
  public int getTotalCredits() {
    return totalCredits;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setGPA(float GPA) {
    this.GPA = GPA;
  }
  
  public void setID(String ID) {
    this.ID = ID;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }
  
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  
  public void setTotalCredits(int totalCredits) {
    this.totalCredits = totalCredits;
  }
  
  public String toString() {
    StringBuffer s = new StringBuffer();
    s.append("Student [");
    s.append("totalCredits=");
    s.append(totalCredits);
    s.append("; ");
    s.append("GPA=");
    s.append(GPA);
    s.append("; ");
    s.append("telephone=");
    s.append(telephone);
    s.append("; ");
    s.append("postalCode=");
    s.append(postalCode);
    s.append("; ");
    s.append("country=");
    s.append(country);
    s.append("; ");
    s.append("city=");
    s.append(city);
    s.append("; ");
    s.append("state=");
    s.append(state);
    s.append("; ");
    s.append("streetAddress=");
    s.append(streetAddress);
    s.append("; ");
    s.append("lastName=");
    s.append(lastName);
    s.append("; ");
    s.append("firstName=");
    s.append(firstName);
    s.append("; ");
    s.append("ID=");
    s.append(ID);
    s.append("]");
    return s.toString();
  }
  
  protected int totalCredits;
  
  protected float GPA;
  
  protected String telephone;
  
  protected String postalCode;
  
  protected String country;
  
  protected String city;
  
  protected String state;
  
  protected String streetAddress;
  
  /** The last name of the student */
  protected String lastName;
  
  /** The first name of the student */
  protected String firstName;
  
  /** The ID of the student */
  protected String ID;
  
  
}
