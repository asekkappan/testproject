package alamelu;

public class Person {
	  private String name="Bala"; // private = restricted access
      private int id;
	  // Getter
	  public String getitem() {
	    return name;
	  }
	  
	  public void setitem(String str) {
		  this.name=str;
		  
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}
