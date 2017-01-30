package com.example.david.masterdetail.dummy;

import com.example.david.masterdetail.Album;
import com.example.david.masterdetail.AlbumListActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {

    }

    public static void rellenarItems(){
        ArrayList<Album> array = AlbumListActivity.arrayAlbumes ;
        ITEMS.clear();
        ITEM_MAP.clear();
        for(int i=0; i<array.size(); i++){
            addItem(new DummyItem(i + "", array.get(i).getArtista(), array.get(i).getNombre(), array.get(i).getAño(), array.get(i).getPortada()));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    /*
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }
    */
    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String nombre, album, portada;
        public final int year;

        public DummyItem(String id, String nombre, String album, int year, String portada) {
            this.id = id;
            this.nombre = nombre;
            this.album = album;
            this.year = year;
            this.portada = portada;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
}