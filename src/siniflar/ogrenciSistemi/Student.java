package siniflar.ogrenciSistemi;
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matExam, int matSozlu, int fizikExam, int fizikSozlu,
                                int kimyaExam, int kimyaSozlu) {

        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.note1 = matSozlu;
        }
        if (matExam >= 0 && matExam <= 100) {
            this.mat.note2 = matExam;
        }

        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.note1 = fizikSozlu;
        }
        if (fizikExam >= 0 && fizikExam <= 100) {
            this.fizik.note2 = fizikExam;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.note1 = kimyaSozlu;
        }
        if (kimyaExam >= 0 && kimyaExam <= 100) {
            this.kimya.note2 = kimyaExam;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizik.note = (this.fizik.note1*0.8+this.fizik.note2*0.2);
        this.kimya.note = (this.kimya.note1*0.8+this.kimya.note2*0.2);
        this.mat.note = (this.mat.note1*0.8+this.mat.note2*0.2);

        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}