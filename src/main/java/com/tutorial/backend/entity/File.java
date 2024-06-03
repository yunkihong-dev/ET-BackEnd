package com.tutorial.backend.entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "tbl_file")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String uuid;
    private String filePath;
    private String fileType;
    private String fileName;
    private int fileSize;
    private String status;

    @OneToMany(mappedBy = "file")
    private List<FileMessage> fileMessages;


}
