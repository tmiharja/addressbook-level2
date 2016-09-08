package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*;

public class Tagging {
	
	// Two possible states of TagType
	private enum TagType {ADD, REMOVE};
	
	// Prefix strings
	private static final String ADD_SYMBOL = "+";
	private static final String REMOVE_SYMBOL = "-";
	
	private Person person;
	private Tag tag;
	private TagType tType;
	
	// Set the parameters according to the changes made
	public Tagging (boolean add, Person person, Tag tag){
		if (add){
			tType = TagType.ADD;
		} else {
			tType = TagType.REMOVE;
		}
		this.person = person;
		this.tag = tag;
	}
	
	// Compile the strings together
	public String compileString(){
		StringBuilder compiledString = new StringBuilder();
		
		// Firstly, the prefix
		if (tType == TagType.ADD){
			compiledString.append(ADD_SYMBOL);
		} else {
			compiledString.append(REMOVE_SYMBOL);
		}
		
		compiledString.append(" " + person.getName() + " [" + tag.tagName + " ]");
		
		return compiledString.toString();
	}
	
	// Others
	public TagType getType() {
		return tType;
		}
	
	public Person getPerson() {
		return person;
		}
	
	public Tag getTag() {
		return tag;
		}
	
	public void setType(TagType tType) {
		this.tType = tType;
		}
	
	public void setName(Person person) {
		this.person = person;
		}
	
	public void setTag(Tag tag) {
		this.tag = tag;
		}

}
