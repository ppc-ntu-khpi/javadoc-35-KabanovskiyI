package domain;

/**
 * Клас Artist представляє працівника, який має певні художні навички.
 * Наслідує базовий клас {@link Employee}.
 */
public class Artist extends Employee {
    /**
     * Масив навичок художника.
     */
    private String[] skiils;

    /**
     * Створює об'єкт Artist з усіма параметрами.
     *
     * @param skiils масив навичок
     * @param name ім'я працівника
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює об'єкт Artist лише з навичками.
     *
     * @param skiils масив навичок
     */
    public Artist(String[] skiils) {
        this.skiils = skiils;
    }

    /**
     * Створює об'єкт Artist з порожнім масивом навичок розміром 10.
     */
    public Artist() {
        this.skiils = new String[10];
    }

    /**
     * Повертає текстове представлення об'єкта Artist.
     *
     * @return рядок, що містить інформацію про працівника та його навички
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + this.getSkills();
    }

    /**
     * Повертає навички художника у вигляді одного рядка, розділеного комами.
     *
     * @return навички у вигляді рядка
     */
    public String getSkills() {
        String s = "";
        String[] var2 = this.skiils;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            String e = var2[var4];
            s = s + e + ", ";
        }

        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив навичок художника.
     *
     * @param skills новий масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return this.skiils;
    }
}
