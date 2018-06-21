package ch5_pp;

public class Book {
    private String title, author, publisher, copyRightDate;

    public Book(String title, String author, String publisher, String copyRightDate){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyRightDate = copyRightDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getCopyRightDate() {
        return copyRightDate;
    }

    public void setCopyRightDate(String copyRightDate) {
        this.copyRightDate = copyRightDate;
    }

    @Override
    public String toString() {
        return "Title : " + getTitle() +
        "\nAuthor : " + getAuthor() +
        "\nPublisher : " + getPublisher() +
        "\nCopyright date : " + copyRightDate;
    }
}
