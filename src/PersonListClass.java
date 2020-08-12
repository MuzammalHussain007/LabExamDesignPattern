import java.util.LinkedList;

public class PersonListClass implements PersonList {
    public PersonListClass(LinkedList<Person> linkedList) {
        this.linkedList = linkedList;
    }

    LinkedList <Person> linkedList;
    @Override
    public PersonIterator getIterator() {
        return new PersonIteratorClass();
    }

    private class PersonIteratorClass implements PersonIterator {
       int position=0;
        @Override
        public boolean hasNext() {
            if (position >= linkedList.size())
            {
                return false;
            }
            return true;
        }

        @Override
        public Person next() {
           if (this.hasNext())
           {
               return linkedList.get(position++);
           }
            return null;
        }
    }
}
