package domain;

/**
 * Клас Employee представляє базового працівника з полями і методами для управління основною інформацією.
 */
public class Employee {

    /**
     * Ім'я працівника.
     */
    private String name;

    /**
     * Назва посади.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікатор працівника (генерується випадково).
     */
    private int ID;

    /**
     * Рівень працівника (1–3).
     */
    private int level;

    /**
     * Відділ, у якому працює працівник.
     */
    private String dept;

    /**
     * Конструктор з параметрами для створення нового працівника.
     *
     * @param name     ім'я працівника
     * @param jobTitle назва посади
     * @param level    рівень працівника (1, 2 або 3; у випадку некоректного значення встановлюється 1)
     * @param dept     відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням, генерує випадковий ID для працівника.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job назва посади
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає назву посади.
     *
     * @return посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника (допустимі значення — 1, 2 або 3).
     * У разі недопустимого значення рівень встановлюється як 1.
     *
     * @param level рівень
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву відділу.
     *
     * @return відділ
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює назву відділу.
     *
     * @param dept відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім’я працівника з перевіркою коректності.
     * Якщо ім’я не відповідає шаблону (містить цифри або некоректні символи), буде встановлено "John Doe".
     *
     * @param name ім’я
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }

    /**
     * Повертає текстове представлення працівника.
     *
     * @return рядок з інформацією про працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
}
