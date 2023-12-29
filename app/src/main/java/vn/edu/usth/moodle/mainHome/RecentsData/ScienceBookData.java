package vn.edu.usth.moodle.mainHome.RecentsData;

public class ScienceBookData {
    String bookName;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ScienceBookData(String bookName, Integer imageUrl) {
        this.bookName = bookName;
        this.imageUrl = imageUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
