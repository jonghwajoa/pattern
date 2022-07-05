package pattern.builder;

import java.io.File;

public class Main {

  public static void main(String[] args) {

    FileVO build = FileVO.builder()
            .encodeName("encode")
            .fileSize(3)
            .serverPath("serverPath")
            .extension("extension")
            .originName("originName")
            .build();

    System.out.println("build = " + build.toString());
  }
}
