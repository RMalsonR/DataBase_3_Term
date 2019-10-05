package lab1;

abstract class Mark{
    private User markAuthor;

    User getMarkAuthor() {
        return markAuthor;
    }

    void setMarkAuthor(User markAuthor) {
        this.markAuthor = markAuthor;
    }
}


class CommentMark extends Mark{
    private Comment comment;
    private Boolean mark;

    public CommentMark(User user, Comment comment, Boolean mark) {
        this.setMarkAuthor(user);
        this.comment = comment;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "CommentMark{" +
                "author=" + this.getMarkAuthor() +
                ", comment=" + comment +
                ", mark=" + mark +
                '}';
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Boolean getMark() {
        return mark;
    }

    public void setMark(Boolean mark) {
        this.mark = mark;
    }
}

class ThemeMark extends Mark{
    private Theme theme;
    private Boolean mark;

    public ThemeMark(User user, Theme theme, Boolean mark) {
        this.setMarkAuthor(user);
        this.theme = theme;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "CommentMark{" +
                "author=" + this.getMarkAuthor() +
                ", theme=" + theme +
                ", mark=" + mark +
                '}';
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Boolean getMark() {
        return mark;
    }

    public void setMark(Boolean mark) {
        this.mark = mark;
    }
}