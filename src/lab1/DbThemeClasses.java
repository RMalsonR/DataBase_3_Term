package lab1;

import java.nio.file.Path;
import java.util.Collection;


class Topic{
    private String title;

    public Topic(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle(User user) {
        if(user.getRole().equals("MODERATOR_ROLE"))
            return title;
        else return null;
    }

    public void setTitle(String title, User user) {
        if(user.getRole().equals("MODERATOR_ROLE"))
            this.title = title;
    }
}

class Theme{
    private User themeAuthor;
    private Topic topicTitle;
    private Collection<ThemeAttachments> attachments;
    private String text;

    public Theme(User themeAuthor, Topic topicTitle, Collection<ThemeAttachments> attachments, String text) {
        this.themeAuthor = themeAuthor;
        this.topicTitle = topicTitle;
        this.attachments = attachments;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "themeAuthor=" + themeAuthor +
                ", topicTitle=" + topicTitle +
                ", attachments=" + attachments +
                ", text='" + text + '\'' +
                '}';
    }

    public User getThemeAuthor() {
        return themeAuthor;
    }

    public void setThemeAuthor(User themeAuthor) {
        this.themeAuthor = themeAuthor;
    }

    public Topic getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(Topic topicTitle) {
        this.topicTitle = topicTitle;
    }

    public Collection<ThemeAttachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(Collection<ThemeAttachments> attachments) {
        this.attachments = attachments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class Comment{
    private User commentAuthor;
    private Theme theme;
    private Collection<CommentAttachments> attachments;
    private String text;

    public Comment(User commentAuthor, Theme theme, Collection<CommentAttachments> attachments, String text) {
        this.commentAuthor = commentAuthor;
        this.theme = theme;
        this.attachments = attachments;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentAuthor=" + commentAuthor +
                ", theme=" + theme +
                ", attachments=" + attachments +
                ", text='" + text + '\'' +
                '}';
    }

    public User getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(User commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Collection<CommentAttachments> getAttachments() {
        return attachments;
    }

    public void setAttachments(Collection<CommentAttachments> attachments) {
        this.attachments = attachments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
