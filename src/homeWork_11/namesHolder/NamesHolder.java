package homeWork_11.namesHolder;

public class NamesHolder {

    private String[] names;

    public NamesHolder(int size) {
        this.names = new String[size];
    }

    public void add(String name) {
        int iterator = 0;
        for (String aName : names) {
            if (!(name == null)) {
                if (aName == null) {
                    names[iterator] = name;
                    break;
                } else if (aName.equals(name)) {
                    throw new IllegalArgumentException();
                } else {
                    iterator++;
                }
            } else {
                throw new NullPointerException();
            }
        }
    }

    public boolean contains(String name) {
        for (String aName : names) {
            if (aName.equals(name)) {
                return true;
            } else if (name == null) {
                throw new IllegalArgumentException();
            }
            return false;
        }
        return false;

    }

    public int size() {
        int count = 0;
        for (String name : names) {
            if (name != null) {
                count++;
            }
        }
        return count;
    }

}
