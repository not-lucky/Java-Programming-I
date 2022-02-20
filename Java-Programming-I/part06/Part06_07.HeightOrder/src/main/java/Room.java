import java.util.*;

public class Room {
	private ArrayList<Person> persons;

	public Room() {
		this.persons = new ArrayList<>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	public boolean isEmpty() {
		return this.persons.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return this.persons;
	}

	public Person shortest() {
		if (this.isEmpty()) {
			return null;
		}

		Person personShortest = this.persons.get(0);

		for (Person person: persons) {
			if (person.getHeight() < personShortest.getHeight()) {
				personShortest = person;
			}
		}

		return personShortest;
	}

	public Person take() {
		if (this.isEmpty()) {
			return null;
		}

		Person shortest = this.shortest();

		persons.remove(shortest);
		return shortest;
	}
}