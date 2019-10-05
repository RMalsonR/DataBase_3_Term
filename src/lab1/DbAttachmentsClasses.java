package lab1;

import java.nio.file.Path;

abstract class Attachments{
    private Path file;

    Path getFile() {
        return file;
    }

    void setFile(Path file) {
        this.file = file;
    }
}

class ThemeAttachments extends Attachments{
    private Theme theme;

    public ThemeAttachments(Path file, Theme theme) {
        this.setFile(file);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "ThemeAttachments{" +
                "file=" + this.toString() + '\'' +
                ", theme=" + theme +
                '}';
    }

    public Path getThemeFile(){
        return this.getFile();
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}

class CommentAttachments extends Attachments{
    private Comment comment;

    public CommentAttachments(Path file, Comment comment) {
        this.setFile(file);
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CommentAttachments{" +
                "file='" + this.getFile() + '\'' +
                ", comment=" + comment +
                '}';
    }

    public Path getThemeFile(){
        return this.getFile();
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}

