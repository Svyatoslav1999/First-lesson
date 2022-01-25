package Animals;

abstract class Animal {
    private int year;
    private String name;

    public Animal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > 30) {
            System.out.println("Year is invalid");
        } else {
            this.year = year;
        }
    }
    }


