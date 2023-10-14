package user;

import java.util.Objects;

public class UserDto {
    private int age;
    private int number;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto)) return false;
        UserDto userDto = (UserDto) o;
        return age == userDto.age && number == userDto.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, number);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "age=" + age +
                ", number=" + number +
                '}';
    }
}
