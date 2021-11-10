public class Archive {
	private String id;
	private String name;

	public Archive(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;
        return this.id.equals(comparedArchive.id);

    }

	public String toString() {
		return this.getId() + ": " + this.getName();
	}
}