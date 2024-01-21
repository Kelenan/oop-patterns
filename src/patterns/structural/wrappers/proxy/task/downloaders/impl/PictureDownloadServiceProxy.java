package patterns.structural.wrappers.proxy.task.downloaders.impl;

import patterns.structural.wrappers.proxy.task.downloaders.validators.PictureComparator;

public class PictureDownloadServiceProxy implements Proxyable {
    private final PictureComparator comparator = new PictureComparator();
    private final PictureDownloadService pictureDownloadService = new PictureDownloadService();

    @Override
    public void download(String path, String filename) {
        if(comparator.arePictureEqual(path)){
            System.err.println("Start download");
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            System.err.printf("Load finished with time %s %s%n", (endTime - startTime) / 1000, "seconds");
        }
        else {
            pictureDownloadService.download(path, filename);
        }

    }
}
