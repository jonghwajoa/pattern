package pattern.builder;


public class FileVO {

  private String originName;
  private String encodeName;
  private int fileSize;
  private String serverPath;
  private String extension;

  public FileVO(String originName, String encodeName, int fileSize, String serverPath, String extension) {
    this.originName = originName;
    this.encodeName = encodeName;
    this.fileSize = fileSize;
    this.serverPath = serverPath;
    this.extension = extension;
  }

  @Override
  public String toString() {
    return "FileVO{" +
            "originName='" + originName + '\'' +
            ", encodeName='" + encodeName + '\'' +
            ", fileSize=" + fileSize +
            ", serverPath='" + serverPath + '\'' +
            ", extension='" + extension + '\'' +
            '}';
  }

  public static FileVO.FileVOBuilder builder() {
    return new FileVO.FileVOBuilder();
  }

  public static class FileVOBuilder {
    private String originName;
    private String encodeName;
    private int fileSize;
    private String serverPath;
    private String extension;

    private FileVOBuilder() {

    }

    public FileVO.FileVOBuilder originName(final String originName) {
      this.originName = originName;
      return this;
    }

    public FileVO.FileVOBuilder encodeName(final String encodeName) {
      this.encodeName = encodeName;
      return this;
    }

    public FileVO.FileVOBuilder fileSize(final int fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    public FileVO.FileVOBuilder serverPath(final String serverPath) {
      this.serverPath = serverPath;
      return this;
    }

    public FileVO.FileVOBuilder extension(final String extension) {
      this.extension = extension;
      return this;
    }

    public FileVO build() {
      return new FileVO(originName, encodeName, fileSize, serverPath, encodeName);
    }

  }
}
