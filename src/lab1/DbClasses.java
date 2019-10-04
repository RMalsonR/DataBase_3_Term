package lab1;

import java.nio.file.Path;
import java.util.Collection;

class User{
    String login;
    String password;
    String email;
    String phoneNumber;
    String name;
    String lastName;
    Path avatar;
    int reputation;
    String role;
}

class Ban{
    User admin;
    User user;
    String reason;
}

class Message{
    User userFrom;
    User userTo;
    String text;
}

class Topic{
    String title;
}

class ThemeAttachments{
    Path file;
}

class CommentAttachments{
    Path file;
}

class Theme{
    User themeAuthor;
    Topic topicTitle;
    Collection<ThemeAttachments> attachments;
    String text;
}

class Comment{
    User commentAuthor;
    Theme theme;
    Collection<CommentAttachments> attachments;
    String text;
}

class CommentMark{
    User markAuthor;
    Comment comment;
    Boolean mark;
}

class ThemeMark{
    User markAuthor;
    Theme comment;
    Boolean mark;
}



