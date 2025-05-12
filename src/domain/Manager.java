package domain;

/**
 * Клас {@code Manager} є підкласом {@link Employee} і представляє менеджера, 
 * який керує групою інших працівників.
 * <p>
 * Менеджер зберігає список працівників типу {@code Employee}, якими він керує.
 */
public class Manager extends Employee {

    /**
     * Масив працівників, якими керує менеджер.
     */
    private Employee[] employees;

    /**
     * Конструктор, який створює менеджера з вказаним списком працівників 
     * і параметрами працівника.
     *
     * @param employees масив підлеглих працівників
     * @param name ім’я менеджера
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор, який створює менеджера з вказаним списком працівників.
     *
     * @param employees масив підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор без параметрів. Створює менеджера з масивом на 10 працівників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає рядкове представлення менеджера, включаючи перелік імен підлеглих.
     *
     * @return рядок з інформацією про менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees(); 
    }

    /**
     * Повертає список імен підлеглих у вигляді одного рядка.
     *
     * @return перелік імен працівників, розділених комами
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих працівників.
     *
     * @param employees масив працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих працівників.
     *
     * @return масив {@code Employee}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
