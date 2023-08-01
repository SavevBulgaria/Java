package TestReWe;

import java.util.Objects;

class Course {
    private long id;
    private String name;
    private int numberOfCredits;

    Course(long id,String name,int numberOfCredits){
        this.id=id;
        this.name=name;
        this.numberOfCredits=numberOfCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

