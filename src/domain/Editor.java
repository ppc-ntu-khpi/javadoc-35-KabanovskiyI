package domain;

/**
 * Клас Editor представляє редактора, який є художником з додатковими параметрами редагування.
 * Наслідує клас {@link Artist}.
 */
public class Editor extends Artist {

    /**
     * Вказує, чи використовує редактор електронне редагування (true — електронне, false — паперове).
     */
    private boolean electronicEditing;

    /**
     * Конструктор, який ініціалізує всі поля редактора.
     *
     * @param electronicEditing вказує тип редагування (електронне або паперове)
     * @param skiils масив навичок
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор, який ініціалізує тип редагування та навички.
     *
     * @param electronicEditing вказує тип редагування
     * @param skiils масив навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор, який ініціалізує лише тип редагування.
     *
     * @param electronicEditing вказує тип редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор за замовчуванням.
     * Встановлює тип редагування як електронне.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстове представлення об'єкта Editor, включаючи інформацію про тип редагування.
     *
     * @return рядок з описом об'єкта
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає поточне налаштування редагування.
     *
     * @return true, якщо редагування електронне; false — якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic true для електронного редагування, false — для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
