package com.o1neday20.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.o1neday20.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
