package com.maruf.womenbeauty;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Products extends AppCompatActivity {

    GridView gridView;

    HashMap<String, Object> hashMap = new HashMap<>();

    ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_products);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gridView = findViewById(R.id.gridview);

        String Category = getIntent().getStringExtra("category");
        if ("clothing".equals(Category)) {

            HashMap<String, Object> hashmap;

            hashmap = new HashMap<>();
            hashmap.put("name", "Summer Dress");
            hashmap.put("price", "$49");
            hashmap.put("image", R.drawable.summer_dress);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Casual T-Shirt");
            hashmap.put("price", "$19");
            hashmap.put("image", R.drawable.casual_tshirt);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Skinny Jeans");
            hashmap.put("price", "$39");
            hashmap.put("image", R.drawable.skinny_jeans);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Maxi Skirt");
            hashmap.put("price", "$34");
            hashmap.put("image", R.drawable.maxi_skirt);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Formal Blouse");
            hashmap.put("price", "$29");
            hashmap.put("image", R.drawable.formal_blouse);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Jacket Elegant");
            hashmap.put("price", "$59");
            hashmap.put("image", R.drawable.jacket_elegant);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Denim Jacket");
            hashmap.put("price", "$65");
            hashmap.put("image", R.drawable.denim_jacket);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Floral Frock");
            hashmap.put("price", "$45");
            hashmap.put("image", R.drawable.floral_frock);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Winter Coat");
            hashmap.put("price", "$120");
            hashmap.put("image", R.drawable.winter_coat);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Silk Saree");
            hashmap.put("price", "$150");
            hashmap.put("image", R.drawable.silk_saree);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Cotton Kurti");
            hashmap.put("price", "$25");
            hashmap.put("image", R.drawable.cotton_kurti);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Hoodie Pink");
            hashmap.put("price", "$40");
            hashmap.put("image", R.drawable.hoodie_pink);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Party Gown");
            hashmap.put("price", "$199");
            hashmap.put("image", R.drawable.party_gown);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Yoga Pants");
            hashmap.put("price", "$30");
            hashmap.put("image", R.drawable.yoga_pants);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Leather Vest");
            hashmap.put("price", "$75");
            hashmap.put("image", R.drawable.leather_vest);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Woolen Sweater");
            hashmap.put("price", "$55");
            hashmap.put("image", R.drawable.woolen_sweater);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Office Trousers");
            hashmap.put("price", "$45");
            hashmap.put("image", R.drawable.office_trousers);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Crop Top");
            hashmap.put("price", "$22");
            hashmap.put("image", R.drawable.crop_top);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Boho Kimono");
            hashmap.put("price", "$38");
            hashmap.put("image", R.drawable.boho_kimono);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Velvet Dress");
            hashmap.put("price", "$85");
            hashmap.put("image", R.drawable.velvet_dress);
            arrayList.add(hashmap);

        } else if ("jewelry".equals(Category)) {
            HashMap<String, Object> hashmap;

            hashmap = new HashMap<>();
            hashmap.put("name", "Gold Pendant");
            hashmap.put("price", "$79");
            hashmap.put("image", R.drawable.gold_pendant);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Diamond Earrings");
            hashmap.put("price", "$129");
            hashmap.put("image", R.drawable.diamond_earrings);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Silver Bracelet");
            hashmap.put("price", "$49");
            hashmap.put("image", R.drawable.silver_bracelet);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Pearl Necklace");
            hashmap.put("price", "$99");
            hashmap.put("image", R.drawable.pearl_necklace);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Fashion Ring");
            hashmap.put("price", "$39");
            hashmap.put("image", R.drawable.fashion_ring);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Charm Anklet");
            hashmap.put("price", "$29");
            hashmap.put("image", R.drawable.charm_anklet);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Ruby Ring");
            hashmap.put("price", "$250");
            hashmap.put("image", R.drawable.ruby_ring);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Gold Bangles");
            hashmap.put("price", "$500");
            hashmap.put("image", R.drawable.gold_bangles);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Choker Necklace");
            hashmap.put("price", "$55");
            hashmap.put("image", R.drawable.choker_necklace);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Nose Pin Gold");
            hashmap.put("price", "$25");
            hashmap.put("image", R.drawable.nose_pin_gold);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Tassel Earrings");
            hashmap.put("price", "$15");
            hashmap.put("image", R.drawable.tassel_earrings);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Crystal Brooch");
            hashmap.put("price", "$45");
            hashmap.put("image", R.drawable.crystal_brooch);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Platinum Band");
            hashmap.put("price", "$350");
            hashmap.put("image", R.drawable.platinum_band);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Hoop Earrings");
            hashmap.put("price", "$20");
            hashmap.put("image", R.drawable.hoop_earrings);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Beaded Bracelet");
            hashmap.put("price", "$12");
            hashmap.put("image", R.drawable.beaded_bracelet);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Emerald Studs");
            hashmap.put("price", "$180");
            hashmap.put("image", R.drawable.emerald_studs);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Layered Chain");
            hashmap.put("price", "$35");
            hashmap.put("image", R.drawable.layered_chain);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Antique Jhumka");
            hashmap.put("price", "$85");
            hashmap.put("image", R.drawable.antique_jhumka);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Cuff Bracelet");
            hashmap.put("price", "$40");
            hashmap.put("image", R.drawable.cuff_bracelet);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Tiara Bridal");
            hashmap.put("price", "$150");
            hashmap.put("image", R.drawable.tiara_bridal);
            arrayList.add(hashmap);

        } else if ("shoes".equals(Category)) {
            HashMap<String, Object> hashmap;

            hashmap = new HashMap<>();
            hashmap.put("name", "Elegant Heels");
            hashmap.put("price", "$79");
            hashmap.put("image", R.drawable.elegant_heels);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Casual Sneakers");
            hashmap.put("price", "$49");
            hashmap.put("image", R.drawable.casual_sneakers);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Classic Flats");
            hashmap.put("price", "$39");
            hashmap.put("image", R.drawable.classic_flats);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Party Sandals");
            hashmap.put("price", "$59");
            hashmap.put("image", R.drawable.party_sandals);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Leather Boots");
            hashmap.put("price", "$99");
            hashmap.put("image", R.drawable.leather_boots);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Summer Wedges");
            hashmap.put("price", "$69");
            hashmap.put("image", R.drawable.summer_wedges);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Running Shoes");
            hashmap.put("price", "$85");
            hashmap.put("image", R.drawable.running_shoes);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Stiletto Red");
            hashmap.put("price", "$120");
            hashmap.put("image", R.drawable.stiletto_red);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Ankle Boots");
            hashmap.put("price", "$95");
            hashmap.put("image", R.drawable.ankle_boots);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Canvas Shoes");
            hashmap.put("price", "$35");
            hashmap.put("image", R.drawable.canvas_shoes);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Flip Flops");
            hashmap.put("price", "$15");
            hashmap.put("image", R.drawable.flip_flops);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Platform Heels");
            hashmap.put("price", "$88");
            hashmap.put("image", R.drawable.platform_heels);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Loafers Women");
            hashmap.put("price", "$55");
            hashmap.put("image", R.drawable.loafers_women);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Ballet Slippers");
            hashmap.put("price", "$25");
            hashmap.put("image", R.drawable.ballet_slippers);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Combat Boots");
            hashmap.put("price", "$110");
            hashmap.put("image", R.drawable.combat_boots);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Gladiator Sandals");
            hashmap.put("price", "$45");
            hashmap.put("image", R.drawable.gladiator_sandals);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Hiking Boots");
            hashmap.put("price", "$130");
            hashmap.put("image", R.drawable.hiking_boots);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Mules Classic");
            hashmap.put("price", "$50");
            hashmap.put("image", R.drawable.mules_classic);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Rain Boots");
            hashmap.put("price", "$40");
            hashmap.put("image", R.drawable.rain_boots);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Espadrilles");
            hashmap.put("price", "$38");
            hashmap.put("image", R.drawable.espadrilles);
            arrayList.add(hashmap);

        } else if ("makeup".equals(Category)) {
            HashMap<String, Object> hashmap;

            hashmap = new HashMap<>();
            hashmap.put("name", "Matte Lipstick");
            hashmap.put("price", "$19");
            hashmap.put("image", R.drawable.matte_lipstick);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Liquid Foundation");
            hashmap.put("price", "$29");
            hashmap.put("image", R.drawable.liquid_foundation);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Eyeliner Pencil");
            hashmap.put("price", "$14");
            hashmap.put("image", R.drawable.eyeliner_pencil);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Blush Palette");
            hashmap.put("price", "$25");
            hashmap.put("image", R.drawable.blush_palette);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Eyeshadow Set");
            hashmap.put("price", "$35");
            hashmap.put("image", R.drawable.eyeshadow_set);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Mascara Ultra");
            hashmap.put("price", "$22");
            hashmap.put("image", R.drawable.mascara_ultra);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Setting Spray");
            hashmap.put("price", "$18");
            hashmap.put("image", R.drawable.setting_spray);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Face Primer");
            hashmap.put("price", "$24");
            hashmap.put("image", R.drawable.face_primer);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Concealer Stick");
            hashmap.put("price", "$16");
            hashmap.put("image", R.drawable.concealer_stick);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Highlighter Glow");
            hashmap.put("price", "$20");
            hashmap.put("image", R.drawable.highlighter_glow);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Lip Gloss Pink");
            hashmap.put("price", "$12");
            hashmap.put("image", R.drawable.lip_gloss_pink);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Eyebrow Gel");
            hashmap.put("price", "$15");
            hashmap.put("image", R.drawable.eyebrow_gel);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Contour Kit");
            hashmap.put("price", "$30");
            hashmap.put("image", R.drawable.contour_kit);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Makeup Sponge");
            hashmap.put("price", "$8");
            hashmap.put("image", R.drawable.makeup_sponge);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Nail Polish");
            hashmap.put("price", "$10");
            hashmap.put("image", R.drawable.nail_polish);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Makeup Brushes");
            hashmap.put("price", "$45");
            hashmap.put("image", R.drawable.makeup_brushes);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Cleansing Oil");
            hashmap.put("price", "$22");
            hashmap.put("image", R.drawable.cleansing_oil);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Compact Powder");
            hashmap.put("price", "$18");
            hashmap.put("image", R.drawable.compact_powder);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Fake Lashes");
            hashmap.put("price", "$12");
            hashmap.put("image", R.drawable.fake_lashes);
            arrayList.add(hashmap);

            hashmap = new HashMap<>();
            hashmap.put("name", "Liquid Eyeliner");
            hashmap.put("price", "$16");
            hashmap.put("image", R.drawable.liquid_eyeliner);
            arrayList.add(hashmap);
        }

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);

    }

    //********************************************************************************************
    //*******************************************************************************************
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {

            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {

            return null;
        }

        @Override
        public long getItemId(int position) {

            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater;
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview = layoutInflater.inflate(R.layout.item, parent, false);

            TextView producttitle;
            TextView productprice;
            ImageView productimage;

            producttitle = myview.findViewById(R.id.producttitle);
            productprice = myview.findViewById(R.id.productprice);
            productimage = myview.findViewById(R.id.productimage);

            HashMap<String, Object> hashMap = arrayList.get(position);

            producttitle.setText(hashMap.get("name").toString());
            productprice.setText(hashMap.get("price").toString());
            productimage.setImageResource((int) hashMap.get("image"));

            return myview;
        }

    }

    //******************************************************************************************
    //******************************************************************************************

}