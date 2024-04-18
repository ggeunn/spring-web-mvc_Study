package com.ohgiraffers.fileupload;

public class FileDTO {

    private String originalFilename;
    private String savedNamd;
    private String filePath;
    private String fileDescription;

    public FileDTO() {}

    public FileDTO(String originalFilename, String fileDescription, String savedNamd, String filePath) {
        this.originalFilename = originalFilename;
        this.fileDescription = fileDescription;
        this.savedNamd = savedNamd;
        this.filePath = filePath;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getSavedNamd() {
        return savedNamd;
    }

    public void setSavedNamd(String savedNamd) {
        this.savedNamd = savedNamd;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Override
    public String toString() {
        return "fileDTO{" +
                "originalFilename='" + originalFilename + '\'' +
                ", savedNamd='" + savedNamd + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileDescription='" + fileDescription + '\'' +
                '}';
    }
}
