package edu.century.ch3;

public class ContactArrayBag implements Cloneable {

	private Contact[] contactsBag;
	private int numberOfContacts;
	private final int INITIAL_SIZE = 10;

	public ContactArrayBag() {
		this.contactsBag = new Contact[INITIAL_SIZE];
		this.numberOfContacts = 0;
	}

	public ContactArrayBag(int initialSize) {

		if (initialSize < 0)
			throw new IllegalArgumentException("initialCapacity is negative: "
					+ initialSize);

		this.contactsBag = new Contact[initialSize];
		this.numberOfContacts = 0;
	}

	public void add(Contact contact) {
		if (contact == null) {
			throw new IllegalArgumentException("contact can't be: " + contact);
		}

		if (numberOfContacts == contactsBag.length) {
			ensureCapacity(numberOfContacts * 2 + 1);
		}

		contactsBag[numberOfContacts] = contact;
		numberOfContacts++;
	}

	public int countOccurrences(Contact target) {
		int numberOfOccurrences = 0;
		
		for (Contact contact : contactsBag) {
			if (contact != null && contact.equals(target)) {
				numberOfOccurrences++;
			}
		}
		
		return numberOfOccurrences;
	}
	
	public int getCapacity() {
		return contactsBag.length;
	}
	
	public void trimToSize() {
		
		if (numberOfContacts < contactsBag.length) {
			Contact[] smallerBag = new Contact[numberOfContacts];
			System.arraycopy(contactsBag, 0, smallerBag, 0, numberOfContacts);
			contactsBag = smallerBag;
		}
	}
	
	public boolean remove(Contact target) {
		
		if (target ==  null) {
			throw new IllegalArgumentException("You can do be better! target can't be: " + target);
		}
		
		for (int i = 0; i < contactsBag.length; i++) {
			Contact contact = contactsBag[i];
			
			if (contact != null && contact.equals(target)) {
				contactsBag[i] = contactsBag[numberOfContacts - 1];
				numberOfContacts--;
				
				return true;
			}
		}
		
		return false;
	}
	
	public void ensureCapacity(int newSize) {

		Contact[] biggerArray = null;

		if (newSize < contactsBag.length) {
			throw new IllegalArgumentException(
					"No way! I will never let you lose your data");
		}

		biggerArray = new Contact[newSize];
		System.arraycopy(contactsBag, 0, biggerArray, 0, contactsBag.length);
		contactsBag = biggerArray;

	}

	@Override
	public String toString() {
		String ret = "";
		
		for (Contact contact : contactsBag) {
			if (contact != null)
				ret += contact.toString();
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		
		ContactArrayBag bag1 = new ContactArrayBag(10);

		bag1.add(new Contact("bag1_zak1", 23, 1234));
		bag1.add(new Contact("bag1_zak2", 23, 1234));
		bag1.add(new Contact("bag1_zak3", 23, 1234));
		bag1.add(new Contact("bag1_zak4", 23, 1234));
			

	}

}
