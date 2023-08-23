package org.hsbc.question5.storagelayer;

public class StorageFactory {
    public StorageImpl getStorage() {
        return new StorageImpl();
    }
}
