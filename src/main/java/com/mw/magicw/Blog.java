package com.mw.magicw;

import java.time.LocalDate;

public record  Blog(int id, LocalDate date,int time, String author, String blog) {

}
