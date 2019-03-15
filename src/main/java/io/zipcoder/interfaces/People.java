package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;


public abstract class People<E extends Person> {

    protected List<E> personList;

    public People() {
        this.personList = new ArrayList();
    }

    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(Long id) {
        E result = null;
        for (E person : personList) {
            if (person.getId().equals(id)) {
                result = person;
                break;
            }
        }
        return result;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        personList.remove(findById(id));
    }

    public Integer getCount() {
        return personList.size();
    }

    public abstract Person[] getArray();




    public List<E> getPersonList() {
        return personList;
    }



}



