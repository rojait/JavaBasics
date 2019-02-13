package Constructor;

public class Name {
        private String girlName;
        
        public Name(String name)
        {
        	girlName=name;
        }
        
        public void setName(String name)
        {
        	girlName=name;
        }
        public String getName()
        {
        	return girlName;
        }
        
        public void Saying()
        {
        	System.out.printf("Your name is %s\n", getName());
        }
}
