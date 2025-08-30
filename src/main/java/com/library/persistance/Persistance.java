package com.library.persistance;

import java.util.ArrayList;
import java.util.List;

import com.library.admin.Admin;
import com.library.books.Book;
import com.library.user.User;

public class Persistance<T> implements PersistanceAPI<T> {

    private final List<User> users = new ArrayList<>();
    private final List<Book> books = new ArrayList<>();
    private Admin admin;

    private final Class<T> type;

    public Persistance(Class<T> type) {
        this.type = type;
    }

    @Override
    public boolean add(T obj) {
        if (type == User.class) {
            return users.add((User) obj);
        } else if (type == Book.class) {
            return books.add((Book) obj);
        } else if (type == Admin.class) {
            // Admin cannot be "added" (only updated)
            return false;
        }
        return false;
    }

    @Override
    public boolean update(T obj) {
        if (type == User.class) {
            User user = (User) obj;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUserId() == user.getUserId()) {
                    users.set(i, user);
                    return true;
                }
            }
        } else if (type == Book.class) {
            Book book = (Book) obj;
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getBookId() == book.getBookId()) {
                    books.set(i, book);
                    return true;
                }
            }
        } else if (type == Admin.class) {
            admin = (Admin) obj; // replace admin reference
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (type == User.class) {
          return users.removeIf(u -> u.getUserId() == id);
        } else if (type == Book.class) {
          return books.removeIf(b -> b.getBookId() == id);
        } else if (type == Admin.class) {
            // Admin cannot be deleted
          return false;
        }
        return false;
    }

    @Override
    public T get(int id) {
        if (type == User.class) {
            return (T) users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
        } else if (type == Book.class) {
            return (T) books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
        } else if (type == Admin.class) {
            return (T) admin; // Admin is unique (id ignored here)
        }
        return null;
    }
}
